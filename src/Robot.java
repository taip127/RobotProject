public class Robot {
    int batteryLevel = 100;
    int speed = 0;
    int weight = 50;
    String color = "red";
    String name = "Robo";
    public void displayInfo(){
        System.out.println(name + " has color: " + color + " and it is weight :"+weight+" lbs");
    }
    public void move(){
        speed = 5;
        System.out.println(name + "is moving at speed: " + speed + "mph");
//        System.out.println("%s is moving at speed: %i mph",name,speed);
    }
    public void stop(){
        speed = 0;
        System.out.println(name + " has stopped");
    }
    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(name + " 's battery is fully charged");
    }
    public void checkBatteryLevel(){
        System.out.println(name + "'s current battery level is "+ batteryLevel +"%");
    }



}
