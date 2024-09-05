package org.example.states;

import org.example.machine.Coins;
import org.example.machine.ItemType;
import org.example.machine.VendingMachine;

import java.util.Map;
import java.util.Stack;

public class HasMoneyState implements State{

    double amountEntered;

    private Stack<Coins> enteredCoins;

    public HasMoneyState() {
        this.amountEntered = 0.0;
        enteredCoins = new Stack<>();
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coin) {
        Map<Coins, Integer> coinsBank = vendingMachine.getCoinBank();
        coinsBank.put(
                coin, coinsBank.get(coin)+1
        );
        enteredCoins.push(coin);
        amountEntered += getCoinValue(coin);
    }

    @Override
    public void cancelOrder(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new Idle());
    }

    @Override
    public void buttonSelectProduct(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState(enteredCoins, amountEntered);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, ItemType itemType) throws Exception {
        throw new Exception("Insert Money for the item.");
    }




    @Override
    public void dispenseItem(VendingMachine vendingMachine) throws Exception {
        System.out.println("Put coins first.");
    }

    @Override
    public void insertCoinButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("You started the machine just insert coins.");
    }



    @Override
    public void getChange(VendingMachine vendingMachine) throws Exception {
        System.out.println("Insert the coins snd then select product.");
    }

    private double getCoinValue(Coins coin){
        return switch (coin){
            case ONE ->  1.0;
            case TWO -> 2.0;
            case FIVE -> 5.0;
            case TEN -> 10.0;
        };
    }
}
