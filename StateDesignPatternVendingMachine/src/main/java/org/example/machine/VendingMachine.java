package org.example.machine;

import org.example.states.Idle;
import org.example.states.State;

import java.util.List;
import java.util.Map;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private Map<Coins, Integer> coinBank;

    private List<Order> orders;

    public VendingMachine(Inventory inventory, Map<Coins, Integer> coinBank, List<Order> orders) {
        this.vendingMachineState = new Idle();
        this.inventory = inventory;
        this.coinBank = coinBank;
        this.orders = orders;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map<Coins, Integer> getCoinBank() {
        return coinBank;
    }

    public void setCoinBank(Map<Coins, Integer> coinBank) {
        this.coinBank = coinBank;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
