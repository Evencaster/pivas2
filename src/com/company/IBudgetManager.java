package com.company;

public interface IBudgetManager {
    User findUserWithId(String id);
    User findUserWithName(String name);
    User createAdmin(String name, String password);
    User createUser(String name, String password);
    Rule[] getUserRules(String userId);
    void setUserRules(String userId, Rule[] rules);
    TransactionResult withdrawFunds(String amount);
    TransactionResult withdrawFunds(int amount);
    TransactionResult replenishFunds(String amount);
    TransactionResult replenishFunds(int amount);
    TransactionResult transferFunds(Account target, String amount);
    TransactionResult transferFunds(Account target, int amount);
    String getUserHistory(String userId);
    String getCommonHistory();
    String getAllHistory();
}
