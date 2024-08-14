public class Cart {
    public int store = 3;
    public int count = 0;
    public double discount = 0;
    public int name ;
    double total = 0;
    public String[] items = new String[store];
    public double[] prices = new double[store];
    public void create_cart(int num) {
        name = num;
    }
    public void addItem(String item, double price) {
        if(count < store) {
            items[count] = item;
            prices[count] = price;
            count += 1;
            System.out.println(item+ " added to cart "+ name+".");
            System.out.println("You have "+ count +" item(s) in your cart now.");
        }
        else {
            System.out.println("You already have "+ count +" item(s) in your cart now.");
        }
    }
    public void cartDetails(){
        total = 0;
        System.out.println("Your cart (c"+name+")  :");
        for(int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]+" - "+prices[i]);
                total += prices[i];
            }
        }
        System.out.println("Discount Applied: "+discount+"%");
        System.out.println("Total Price: "+(total-(total*(discount/100.0))));
    }
    public void giveDiscount(double amount){
        discount += amount;
    }
}
