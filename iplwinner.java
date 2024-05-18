import java.util.Random;

public class iplwinner{

    public static void main(String[] args) {
        String[] iplTeams = {"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore",
                "Kolkata Knight Riders", "Delhi Capitals", "Sunrisers Hyderabad",
                "Rajasthan Royals", "Kings XI Punjab"};

        String winner = selectWinner(iplTeams);
        System.out.println("The winner is: " + winner);
    }

    public static String selectWinner(String[] teams) {
        Random random = new Random();
        int winnerIndex = random.nextInt(teams.length);
        return teams[winnerIndex];
    }
}
