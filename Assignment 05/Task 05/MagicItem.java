public class MagicItem {
    public String name;
    public int energy;
    public String[] element;
    public int count = 0;
    public void newCharacter(String name){
        this.name = name;
        this.energy = 0;
        this.element = new String[3];
    }
    public void displayInfo(){
        System.out.println("Character Name: " + name);
        System.out.println("Energy level: " + energy);
        for(int i = 0; i < element.length; i++){
            System.out.println("Item "+(i+1)+": " + element[i]);
        }
    }
    public void findItem(String name){
        if (count >= element.length) {
            System.out.println("All item slots occupied");
        }
        else {
            for (int i = 0; i < element.length; i++) {
                if (element[i] == null) {
                    element[i] = name;
                    count += 1;
                    System.out.println(this.name + " found a " + name);
                    break;
                }
            }
        }


    }
    public void useItem(String index){
        boolean found = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == index) {
                element[i] = null;
                found = true;
                break;
            }
        }
        if (found ) {
            count -= 1;
            System.out.println(this.name + " used a " + index);
            if (index == "Potion") {
                energy += 50;
            } else if (index == "Elixir") {
                energy += 100;
            } else if (index == "Amulet") {
                energy += 200;
            }
            System.out.println("Energy Level after using item:  " + energy);
        }
        else {
            System.out.println("Item not found in inventory.");
        }

    }
}
