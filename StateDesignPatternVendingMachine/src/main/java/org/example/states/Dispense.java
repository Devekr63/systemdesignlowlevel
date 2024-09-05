package org.example.states;

import org.example.machine.Coins;
import org.example.machine.ItemType;
import org.example.machine.Order;
import org.example.machine.VendingMachine;

public class Dispense implements State{
    @Override
    public void selectProduct(VendingMachine vendingMachine, ItemType itemType) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coin) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void cancelOrder(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) throws Exception {
        Order order = vendingMachine.getOrders().get(vendingMachine.getOrders().size()-1);
        System.out.println(order);
    }

    @Override
    public void insertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void buttonSelectProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void getChange(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }
}
