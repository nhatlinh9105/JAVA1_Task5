package Task5;

public class SoccerPlayer {
    private String name,  xLocation, yLocation;
    private int number, run, kickBall, jump;

    //spell-checker: disable
    public SoccerPlayer(){
        name = "Rabel";
        xLocation = "Manchester";
        yLocation = "Resver";
        number = 1;
        run = 30;
        kickBall = 10;
        jump = 5;
    }

    public SoccerPlayer(String Name, String XLocation, String YLocation, int Number, int Run, int KickBall, int Jump )  {
        name = Name;
        xLocation = XLocation;
        yLocation = YLocation;
        number = Number;
        run = Run;
        kickBall = KickBall;
        jump = Jump;
    }

    public String getName() {
        return name;
    }

    public String getXLocation(){
        return xLocation;
    }

    public String getYLocation() {
        return yLocation;
    }

    public int getNumber(){
        return number;
    }

    public int getRun() {
        return run;
    }

    public int getKickball() {
        return kickBall;
    }

    public int getJump() {
        return jump;
    }
}