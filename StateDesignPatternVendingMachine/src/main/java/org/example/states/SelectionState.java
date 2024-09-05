package org.example.states;

import org.example.machine.Coins;
import org.example.machine.ItemType;
import org.example.machine.Order;
import org.example.machine.VendingMachine;

import java.util.Random;
import java.util.Stack;

public class SelectionState implements State{
    private Order order;
    private int newOrderId;

    private double amountEntered;
    Stack<Coins> enteredCoins;
    Random rand = new Random();

    public SelectionState(Stack<Coins> enteredCoins, double amountEntered) {
        this.amountEntered = amountEntered;
        this.enteredCoins = enteredCoins;
        this.order = new Order();
        newOrderId = rand.nextInt(100000);
        order.setOrderId(newOrderId);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, ItemType itemType) throws Exception {
        order.setItemType(itemType);
        vendingMachine.getOrders().add(order);
    }

    @Override
    public void cancelOrder(VendingMachine vendingMachine) throws Exception {
        vendingMachine.getOrders().removeIf(order -> order.getOrderId() == newOrderId);
        removeCoins(vendingMachine);
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coin) throws Exception {
        throw new Exception("Wait for order to complete or cancel the order.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new Dispense());
    }

    @Override
    public void insertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Select a Product.");
    }

    @Override
    public void buttonSelectProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Select a Product.");
    }

    @Override
    public void getChange(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Select a Product.");
    }

    private void removeCoins(VendingMachine vendingMachine){
        while(!enteredCoins.isEmpty()){
            Coins coin = enteredCoins.pop();
            vendingMachine.getCoinBank()
                    .put(coin, vendingMachine.getCoinBank().get(coin)-1);
        }
    }
}
