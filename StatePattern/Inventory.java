package StatePattern;

public class Inventory {
    ItemShelf[] inventory = null;

    public Inventory(int itemCount) {
        
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory() { return inventory; }

    public void setInventory(ItemShelf[] inventory) {this.inventory = inventory;}

    public void initialEmptyInventory() {
        int startCode = 101;
        for(int i =0 ;i<inventory.length; i+=1){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {

        for(ItemShelf itemShelf : inventory){
            if(itemShelf.code == codeNumber){
                if(itemShelf.isSoldOut()){
                    itemShelf.item = item;
                    itemShelf.setSoldOut(false);
                } else{
                    throw new Exception ("already item is present, ou can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.code == codeNumber){
                if(!itemShelf.isSoldOut()){
                    return itemShelf.item;
                } else{
                    throw new Exception("Item is sold out");
                }
            }
        }
        throw new Exception("Item not found in inventory");
    }

    public void removeItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.code == codeNumber){
                if(!itemShelf.isSoldOut()){
                    itemShelf.setSoldOut(true);
                    itemShelf.item = null;
                } else{
                    throw new Exception("Item is already sold out");
                }
            }
        }
    }
}