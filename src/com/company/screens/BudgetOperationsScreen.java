package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BudgetOperationsScreen extends BaseHomeScreen {
    JTextField sourceAccountInput = new JTextField();
    JTextField targetAccountInput = new JTextField();
    JTextField amountInput = new JTextField();
    JButton withdrawFundsButton = new JButton("Withdraw funds");
    JButton replenishFundsButton = new JButton("Replenish funds");
    JButton transferFundsButton = new JButton("Transfer funds");

    public BudgetOperationsScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.add(sourceAccountInput);
        this.add(targetAccountInput);
        this.add(amountInput);
        this.add(withdrawFundsButton);
        this.add(replenishFundsButton);
        this.add(transferFundsButton);
        this.setVisible(true);
    }
}