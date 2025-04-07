public class Game {
    private String homeTeamName;
    private String visitingTeamName;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game (String homeName, String visitingName, int homePoints, int visitingPoints) {
        this.homeTeamName = homeName;
        this.visitingTeamName = visitingName;
        this.homeTeamPoints = homePoints;
        this.visitingTeamPoints = visitingPoints;
    }

    @Override
    public String toString() {
        return "Home team: " + this.homeTeamName + ", Visiting team: " + this.visitingTeamName + ", Home team points: " + this.homeTeamPoints + ", Visiting team points: " + this.visitingTeamPoints;
    }

    /*
    //@returns true if requested target it one of the two teams in the game
    //otherwise false
    */

    public boolean contains(String target) {

        return this.homeTeamName.equals(target) || this.visitingTeamName.equals(target);
    }

    public int gameWins(String teamName) {
        int wins = 0;
        if (this.homeTeamName.equals(teamName)) {
            if (this.homeTeamPoints > this.visitingTeamPoints) {
                wins++;
            }
        } else if (this.visitingTeamName.equals(teamName)) {
            if (this.homeTeamPoints < this.visitingTeamPoints) {
                wins++;
            }
        }

        return wins;
    }

    public int gameLosses(String teamName) {
        int losses = 0;
        if (this.homeTeamName.equals(teamName)) {
            if (this.homeTeamPoints < this.visitingTeamPoints) {
                losses++;
            }
        } else if (this.visitingTeamName.equals(teamName)) {
            if (this.homeTeamPoints > this.visitingTeamPoints) {
                losses++;
            }
        }

        return losses;
    }
}
