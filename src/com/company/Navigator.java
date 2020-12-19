package com.company;

import com.company.screens.*;

public class Navigator {
    LoginScreen loginScreen;
    RegistrationScreen registrationScreen;
    RulesScreen rulesScreen;
    OperationScreen operationScreen;
    BudgetOperationsScreen budgetOperationsScreen;
    HistoryScreen historyScreen;

    public Navigator(LoginScreen loginScreen,
                     RegistrationScreen registrationScreen,
                     RulesScreen rulesScreen,
                     OperationScreen operationScreen,
                     BudgetOperationsScreen budgetOperationsScreen,
                     HistoryScreen historyScreen) {
        this.loginScreen = loginScreen;
        this.registrationScreen = registrationScreen;
        this.operationScreen = operationScreen;
        this.budgetOperationsScreen = budgetOperationsScreen;
        this.rulesScreen = rulesScreen;
        this.historyScreen = historyScreen;
    }
    private void hideAll() {
        this.loginScreen.setVisible(false);
        this.registrationScreen.setVisible(false);
        this.operationScreen.setVisible(false);
        this.budgetOperationsScreen.setVisible(false);
        this.rulesScreen.setVisible(false);
        this.historyScreen.setVisible(false);
    }
    public void go(Route route) {
        hideAll();
        switch (route) {
            case LOGIN: this.loginScreen.setVisible(true); break;
            case REGISTRATION: this.registrationScreen.setVisible(true); break;
            case OPERATIONS: this.operationScreen.setVisible(true); break;
            case BUDGET: this.budgetOperationsScreen.setVisible(true); break;
            case RULES: this.rulesScreen.setVisible(true); break;
            case HISTORY: this.historyScreen.setVisible(true); break;
        }
    }
}
