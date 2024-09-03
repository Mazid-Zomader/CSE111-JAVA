public class LightController {
    public String status = "OFF";
    public int bright;
    public void showLightStatus (){
        System.out.println("Light status: "+ status);
        System.out.println("Brightness Level: "+ bright);
    }
    public void adjustBrightness(int num){
        if (status == "OFF") {
            System.out.println("Please turn on the light first!");
        }
        else if (bright+num >11){
            System.out.println("Brightness out of range. Set between 0 to 10. ");
        }
        else {
            bright += num ;
            System.out.println("Brightness adjusted");
        }
    }
    public void switchLight(){
        if (status == "OFF"){
        status = "ON";
        bright = 1 ;
        }
        else {
            status = "OFF";
            bright = 0;
        }
        System.out.println("Lights are now "+ status);
    }
    public String resetSettings(){
        status = "ON";
        bright = 1;
        return ("Light setings have been reset.");
    }
}
