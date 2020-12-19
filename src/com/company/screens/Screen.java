package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;

import javax.swing.*;

public class Screen extends JPanel {
    IBudgetManager budgetManager;
    Navigator navigator;
    public Screen(IBudgetManager budgetManager) {
        this.budgetManager = budgetManager;
    }
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }
}
