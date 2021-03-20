package Task5;

public class Car {
    private int plateNumber, xLocation, yLocation, move;
    private double speed, accelerate;
    private String park;

    public Car() {
        plateNumber = 123;
        xLocation = 1;
        yLocation = 2;
        speed = 300.05;
    }

    public Car(double Accelerate, int Move, String Park) {
        plateNumber = 123;
        xLocation = 1;
        yLocation = 2;
        speed = 300.05;
        move = Move;
        park =Park;
        accelerate = Accelerate;
    }

    public Car(int PlateNumber, int XLocation, int YLocation, double Speed, double Accelerate, int Move, String Park) {
        plateNumber = PlateNumber;
        xLocation = XLocation;
        yLocation = YLocation;
        speed = Speed;
        move = Move;
        park =Park;
        accelerate = Accelerate;
    }

    public int getMove() {
        return move;
    }

    public double getAccelerate() {
        return accelerate;
    }

    public String getPark() {
        return park;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public double getSpeed() {
        return speed;
    }


}
