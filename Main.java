interface Main {
    void buy();
    void returnItem();
    void logDetails();
}

class Item implements Main {
    private String itemName;
    private double price;
    private int stock;
    private int sold;

    public Item(String itemName, double price, int stock) {
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
        this.sold = 0;
    }

 
    public void logDetails() {
        System.out.println("\t---------------------------");
        System.out.println("\t GPU AND CPU MARKET");
        System.out.println("\t---------------------------");
        System.out.println("Item : " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Sold : " + sold);
        System.out.println();
    }

    @Override
    public void buy() {
        if (stock > 0) {
            stock--;
            sold++;   
            System.out.println("Successfully bought " + itemName);
        } else {
            System.out.println("Can't buy " + itemName + " — It is out of stock!");
        }
    }

    @Override
    public void returnItem() {
        if (sold > 0) {
            sold--;
            stock++;
            System.out.println("Successfully returned " + itemName);
        } else {
            System.out.println("Can't return " + itemName + "  none sold yet!");
        }
    }

    public static void main(String[] args) {
        Main item1 = new Item("5090", 4000, 3);
        item1.buy();
        item1.buy();
        item1.buy();
        item1.returnItem();
        item1.logDetails();

        Main item2 = new Item("5080", 1250, 3);
        item2.buy();
        item2.buy();
        item2.returnItem();
        item2.returnItem();
        item2.logDetails();

        Main item3 = new Item("RX 9070 XT", 750, 5);
        item3.returnItem();
        item3.returnItem();
        item3.returnItem();
        item3.logDetails();

        Main item4 = new Item("RX 7900XTX", 1000, 1); 
        item4.buy();
        item4.buy();
        item4.logDetails();
    }
}