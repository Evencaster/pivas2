package com.company;

public interface ITransactionManager {
    TransactionResult withdrawFunds(String userId, int amount);
    TransactionResult replenishFunds(String userId, int amount);
    TransactionResult transferFunds(String sourceUserId, String targetUserId, String amount);
}
