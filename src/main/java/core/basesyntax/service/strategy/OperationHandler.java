package core.basesyntax.service.strategy;

import core.basesyntax.model.Transaction;

public interface OperationHandler {
    void execute(Transaction transaction);
}
