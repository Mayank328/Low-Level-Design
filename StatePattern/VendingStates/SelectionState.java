package StatePattern.VendingStates;

import java.util.List;
import StatePattern.*;

public class SelectionState implements State {

    public SelectionState(){ 
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert coin button in SelectionState");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coin in SelectionState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        
        Item item = machine.getInventory().getItem(codeNumber);

        int paidByUser = 0;
        for(Coin coin : machine.getCoinList()){
            paidByUser+=coin.value;
        }

        if(paidByUser < item.getPrice()) {
            throw new Exception("You have not paid enough money for the product");
        }else if(paidByUser >= item.getPrice()) {
            if(paidByUser > item.getPrice()){
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {

        System.out.println("Returned the change in the coin dispense tray " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct() throws Exception {
        throw new Exception("You cannot dispense product in SelectionState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception{
        throw new Exception("Inventory cannot be updated in selection state");
    }
}