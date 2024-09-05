package org.example.states;

import org.example.machine.Coins;
import org.example.machine.ItemType;
import org.example.machine.VendingMachine;

public interface State {
    //States of the machine
    void selectProduct(VendingMachine vendingMachine, ItemType itemType) throws Exception;
    void insertCoin(VendingMachine vendingMachine, Coins coin) throws Exception;
    void cancelOrder(VendingMachine vendingMachine) throws Exception;
    void dispenseItem(VendingMachine vendingMachine) throws Exception;
    void insertCoinButton(VendingMachine vendingMachine) throws Exception;
    void buttonSelectProduct(VendingMachine vendingMachine) throws Exception;
    void getChange(VendingMachine vendingMachine) throws Exception;

}
