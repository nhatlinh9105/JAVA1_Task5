package Task5;

public class TestSoccerPlayer {

    public static void main(String[] args) {
        //spell-checker: disable
        SoccerPlayer a1 = new SoccerPlayer("Kanze","Tottenham", "Kicker", 2, 40, 10, 9);
        System.out.println("Name of soccer player: " + a1.getName());
        System.out.println("xLocation is: " + a1.getXLocation());
        System.out.println("yLocation is: " + a1.getYLocation());
        System.out.println("Number of soccer player is: " + a1.getNumber());
        System.out.println("Run of soccer player is: " + a1.getRun());
        System.out.println("Kick ball of soccer player is: " + a1.getKickball());
        System.out.println("Jump of soccer player is: " + a1.getJump());
     }
}
