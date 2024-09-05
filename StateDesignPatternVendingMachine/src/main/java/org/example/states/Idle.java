package org.example.states;

import org.example.machine.Coins;
import org.example.machine.ItemType;
import org.example.machine.VendingMachine;

public class Idle implements State{

    public Idle(){
        System.out.println("Press start button to start inserting the coins..");
    }

    @Override
    public void insertCoinButton(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coin) throws Exception {
        throw new Exception("Press start button.");
    }
    @Override
    public void selectProduct(VendingMachine vendingMachine, ItemType itemType) throws Exception {
        throw new Exception("You cannot select the product without inserting the coins.");
    }


    @Override
    public void cancelOrder(VendingMachine vendingMachine) throws Exception {
        throw new Exception("No item is purchased.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) throws Exception {
        throw new Exception("No item is purchased.");
    }


    @Override
    public void buttonSelectProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Press start button.");
    }

    @Override
    public void getChange(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Press start button.");
    }
}
