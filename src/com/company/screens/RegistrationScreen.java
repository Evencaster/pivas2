package com.company.screens;

import com.company.IBudgetManager;
import com.company.Navigator;
import com.company.Route;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationScreen extends Screen {
    JTextField usernameInput = new JTextField();
    JTextField passwordInput = new JPasswordField();
    JButton signUpButton = new JButton("Sign up");

    public RegistrationScreen(IBudgetManager budgetManager) {
        super(budgetManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        signUpButton.addActionListener(new ButtonEventListener());
        this.add(usernameInput);
        this.add(passwordInput);
        this.add(signUpButton);
        this.setVisible(true);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            navigator.go(Route.OPERATIONS);
        }
    }
}