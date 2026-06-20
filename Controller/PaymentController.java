package Controller;

import Model.PaymentRequest;
import Model.Transactions;
import Service.PaymentService;

import java.util.UUID;

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Transactions processPayment(PaymentRequest request, UUID vendingMachineId) {
        return paymentService.processPayment(request,vendingMachineId);
    }

    public void cancelPayment(UUID transactionId, UUID machineId) {
        paymentService.cancelPayment(transactionId, machineId);
    }
}
