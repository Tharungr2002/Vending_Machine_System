package Repository;

import Model.CashBox;

import java.util.Map;
import java.util.UUID;

public class CashBoxRepository {

    Map<UUID, CashBox> cashBoxMap;

    public CashBox getCashBox(UUID id) {
        return cashBoxMap.get(id);
    }
}
