package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoryScreen extends BaseHomeScreen {
    JComboBox<String> accountSelect = new JComboBox<>();
    JList<String> transactionsList = new JList<>();

    public HistoryScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.add(accountSelect);
        this.add(transactionsList);
        this.setVisible(true);
    }
}