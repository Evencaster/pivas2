package com.company;

import com.company.screens.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    static int windowWidth = 700;
    static  int windowHeight = 500;
    public static void main(String[] args) {

        IBudgetManager budgetManager = new BudgetManager();

        JFrame window = new JFrame();

        LoginScreen loginScreen = new LoginScreen(budgetManager);
        RegistrationScreen registrationScreen = new RegistrationScreen(budgetManager);
        RulesScreen rulesScreen = new RulesScreen(budgetManager);
        OperationScreen operationScreen = new OperationScreen(budgetManager);
        BudgetOperationsScreen budgetOperationsScreen = new BudgetOperationsScreen(budgetManager);
        HistoryScreen historyScreen = new HistoryScreen(budgetManager);



        Navigator navigator = new Navigator(loginScreen, registrationScreen, rulesScreen, operationScreen, budgetOperationsScreen, historyScreen);

        loginScreen.setNavigator(navigator);
        registrationScreen.setNavigator(navigator);
        rulesScreen.setNavigator(navigator);
        operationScreen.setNavigator(navigator);
        budgetOperationsScreen.setNavigator(navigator);
        historyScreen.setNavigator(navigator);

        registrationScreen.setVisible(false);
        rulesScreen.setVisible(false);
        operationScreen.setVisible(false);
        budgetOperationsScreen.setVisible(false);
        historyScreen.setVisible(false);

        window.setLayout(new FlowLayout(FlowLayout.CENTER));

        loginScreen.setPreferredSize(new Dimension(300, 100));
        loginScreen.setLayout(new GridLayout(3,1,5,12));

        registrationScreen.setPreferredSize(new Dimension(300,100));
        registrationScreen.setLayout(new GridLayout(3,1,5,12));

        rulesScreen.setPreferredSize(new Dimension(windowWidth,windowHeight));

        operationScreen.setPreferredSize(new Dimension(windowWidth,windowHeight));

        budgetOperationsScreen.setPreferredSize(new Dimension(windowWidth,windowHeight));

        historyScreen.setPreferredSize(new Dimension(windowWidth,windowHeight));


        window.add(loginScreen);
        window.add(registrationScreen);
        window.add(rulesScreen);
        window.add(operationScreen);
        window.add(budgetOperationsScreen);
        window.add(historyScreen);

        window.setPreferredSize(new Dimension(windowWidth, windowHeight));
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}
