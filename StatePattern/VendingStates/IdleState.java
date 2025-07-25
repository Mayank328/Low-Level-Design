package StatePattern.VendingStates;

import StatePattern.*;
import java.util.ArrayList;

import java.util.List;

public class IdleState implements State {
    
    public IdleState(){ System.out.println("currently Vending machine is in IdleState");};

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new HasMoneyState());
    }
    
    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception{
        throw new Exception("first you need to click on insert coin button");
    }
    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you cannot insert coin in idle state");
    }
    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }
    
    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get the change in idle state");
    }

    @Override
    public Item dispenseProduct() throws Exception {
        throw new Exception("you can not dispense product in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you cannot refund money in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}


