public class ElonsToyCar {
    
    private int distancia = 0;
    private int bateria = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distancia + " meters";
    }

    public String batteryDisplay() {
        if(bateria == 0){
            return "Battery empty";
        }
        return "Battery at " + bateria + "%";
    }

    public void drive() {
        if(bateria != 0){
        distancia = distancia +20;
        bateria = bateria - 1;
        }
    }
}
