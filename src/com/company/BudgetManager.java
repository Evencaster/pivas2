package com.company;

public class BudgetManager implements IBudgetManager {

    public User findUserWithId(String id) {
        return new User();
    }

    public User findUserWithName(String name) {
        return new User();
    }

    public User createAdmin(String name, String password) {
        return new User();
    }

    public User createUser(String name, String password) {
        return new User();
    }

    public Rule[] getUserRules(String userId) {
        return new Rule[]{Rule.ChangeOwnRules};
    }

    public void setUserRules(String userId, Rule[] rules) {

    }

    public TransactionResult withdrawFunds(String amount){
        return new TransactionResult();
    }

    public TransactionResult withdrawFunds(int amount) {
        return new TransactionResult();
    }

    public TransactionResult replenishFunds(String amount) {
        return new TransactionResult();
    }

    public TransactionResult replenishFunds(int amount) {
        return new TransactionResult();
    }

    public TransactionResult transferFunds(Account target, String amount) {
        return new TransactionResult();
    }

    public TransactionResult transferFunds(Account target, int amount) {
        return new TransactionResult();
    }

    public String getUserHistory(String userId) {
        return "Transaction 1\nTransaction 2\nTransaction 3";
    }

    public String getCommonHistory() {
        return "Transaction 1\nTransaction 2\nTransaction 3";
    }

    public String getAllHistory() {
        return "Transaction 1\nTransaction 2\nTransaction 3";
    }
}
