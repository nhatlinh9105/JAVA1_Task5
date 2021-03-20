package Task5;

public class TestCar {
    public static void main(String[] args) {
        
        Car a1 = new Car(3200, 155, "Auto");
        System.out.println("Detail about Car1: ");
        System.out.println("Car's plate number is: " + a1.getPlateNumber() +"\nCar's xLocation is: " + a1.getXLocation() +"\nCar's yLocation is: " + a1.getYLocation()
                                            + "\nCar's speed is: " + a1.getSpeed() + "\nCar's accelerate is: " + a1.getAccelerate() + "\nCar's move is: " + a1.getMove() 
                                            + "\nCar's park mode is: " + a1.getPark());
        
        Car a2 = new Car(125, 2, 4, 310.50, 3100, 120, "Auto");
        System.out.println("Detail about Car2: ");
        System.out.println("Car's plate number is: " + a2.getPlateNumber() +"\nCar's xLocation is: " + a2.getXLocation() +"\nCar's yLocation is: " + a2.getYLocation()
        + "\nCar's speed is: " + a2.getSpeed() + "\nCar's accelerate is: " + a2.getAccelerate() + "\nCar's move is: " + a2.getMove() 
        + "\nCar's park mode is: " + a2.getPark());
        
    }
    
}
