import java.util.Arrays;
public class ChickenBurger {
    public String bun = "Sesame";
    public int price = 200 ;
    public String sauceOption = "Less";
    public String spiceLevel = "Not Set";
    public String serveBurger(){
        if (spiceLevel == "Not Set") {
            return "Cannot serve now. Customize Spice Level first.";
        }
        return "The burger is being served:-\nBun Type: "+ bun+ "\nPrice: "+price+"\nSauce option: "+sauceOption+"\nSpicy Level: "+spiceLevel;
    }
    public void customizeSpiceLevel(String level) {
        String[] arr = {"Mild", "Spicy","Naga", "Extreme"};
        boolean flag = Arrays.asList(arr). contains(level);
        if (flag){
            spiceLevel = level;
            System.out.println("Spice level set to "+ spiceLevel+".");
        }
        else {
            System.out.println("This spice level is unavailable.");
        }
    }
}
