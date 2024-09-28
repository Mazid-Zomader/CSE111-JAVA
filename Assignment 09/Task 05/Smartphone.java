public class Smartphone {
    public String name;
    public String[] sector;
    public String[][] feature;
    public int count;
    Smartphone(){
        sector = new String[10];
        feature = new String[10][5];
    }
    Smartphone(String name) {
        this.name = name;
        sector = new String[10];
        feature = new String[10][5];
    }
    public void addFeature(String sector, String feature) {
        if (this.name == null){
            System.out.println("Feature can not be added without phone name");
        }
        else {
            for (int i = 0; i<5; i++){
                if (sector == this.sector[i]){
                    count = i;
                    break;
                }
            }
            this.sector[count] = sector;
            for (int i = 0; i < 5; i++) {
                if (this.feature[count][i] == null){
                    this.feature[count][i] = feature;
                    break;
                }
            }
            count++;
        }
    }
    public void updateName(String name){
        this.name = name;
    }
    public void printDetail(){
        System.out.println("Phone Name: " + name);
        for (int i = 0; i< sector.length; i++){
            if (sector[i] == null){
                break;
            }
            else {
                System.out.print(sector[i]+": ");
                for (int j = 0; j<5; j++){
                    if (feature[i][j] == null){
                        break;
                    }
                    else {
                        if (feature[i][j+1] == null || j == 4){
                            System.out.print(feature[i][j]);
                        }
                        else {
                            System.out.print(feature[i][j]+", ");
                        }
                    }

                }
                System.out.println();
            }
        }
    }

}
