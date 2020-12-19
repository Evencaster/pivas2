package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;
import com.company.Route;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationScreen extends BaseHomeScreen {
    JButton budgetOperationsButton = new JButton("Budget operations");
    JButton getHistoryButton = new JButton("History");
    JButton rulesButton = new JButton("Rules");

    JLabel ownBalance = new JLabel("16$");
    JLabel commonBalance = new JLabel("36$");

    public OperationScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);

        budgetOperationsButton.addActionListener(new ButtonEventListener(Route.BUDGET));
        getHistoryButton.addActionListener(new ButtonEventListener(Route.HISTORY));
        rulesButton.addActionListener(new ButtonEventListener(Route.RULES));

        this.add(budgetOperationsButton);
        this.add(getHistoryButton);
        this.add(rulesButton);
        this.add(ownBalance);
        this.add(commonBalance);
        this.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        Route route;
        public ButtonEventListener(Route route){
            this.route = route;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            navigator.go(this.route);
        }
    }
}