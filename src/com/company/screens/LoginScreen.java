package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;
import com.company.Route;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends Screen {
    JTextField usernameInput = new JTextField();
    JTextField passwordInput = new JPasswordField();
    JButton loginButton = new JButton("Login");

    public LoginScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        loginButton.addActionListener(new ButtonEventListener());
        this.add(usernameInput);
        this.add(passwordInput);
        this.add(loginButton);
        this.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            navigator.go(Route.OPERATIONS);
        }
    }
}