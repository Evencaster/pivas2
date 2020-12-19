package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesScreen extends BaseHomeScreen {
    JComboBox<String> userSelect = new JComboBox<>();
    JComboBox<String> rulesSelect = new JComboBox<>();

    public RulesScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.add(userSelect);
        this.add(rulesSelect);
        this.setVisible(true);
    }
}