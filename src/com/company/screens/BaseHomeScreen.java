package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;
import com.company.Route;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseHomeScreen extends Screen {
    JButton backButton = new JButton("Back");
    JLabel usernameLabel = new JLabel("username");

    public BaseHomeScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);

        backButton.setBounds(0,0, 100, 50);
        usernameLabel.setBounds(640, 0, 100, 50);

        backButton.addActionListener(new ButtonEventListener());
        this.add(usernameLabel);
        this.add(backButton);
        this.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            navigator.go(Route.OPERATIONS);
        }
    }
}
