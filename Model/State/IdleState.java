package Model.State;

import Model.PaymentRequest;
import Model.Product;
import Model.Transactions;
import Model.VendingMachine;
import Service.PaymentService;

import java.util.UUID;

public class IdleState implements VendingMachineState {
    PaymentService paymentService;
    @Override
    public Transactions processPayment(VendingMachine vendingMachine, PaymentRequest request) {
        int productAvail = paymentService.checkProductAvailablity(request.getProductId(),
                request.getQuantity());

        if(productAvail == 0) {
            System.out.println("product not available");
            return null;
        }

        Double totalPriceToPay = paymentService.calculatePrice(request.getQuantity());
        Double AmountInserted = paymentService.calculateAmountInserted(request.getDenominations());

        Double amountToReturn = AmountInserted-totalPriceToPay;
        if(totalPriceToPay > AmountInserted) {
            System.out.println("insufficeitn amount");
            return null;
        }

        vendingMachine.setCurrentStatus(new ProcessPaymentState());
        if(amountToReturn > 0 && !paymentService.checkAvailable(amountToReturn)) {
            System.out.println("Unable to return change ");
        }

        Transactions transactions = new Transactions(request.getProductId(),
                vendingMachine.getId());
        transactions.setAmountInserted(AmountInserted);
        transactions.setChangeReturned(amountToReturn);
        transactions.setAmountRequired(totalPriceToPay);
        vendingMachine.setCurrentStatus(new DispensingState());

        paymentService.DecereaseProductCount(request.getProductId(), request.getQuantity());
        vendingMachine.setCurrentStatus(new IdleState());


        return transactions;
    }

    @Override
    public String getStateName() {
        return "Idle State";
    }

    public void cancelPayment(VendingMachine machine , UUID transactionId) {

    }
}
