import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class eSportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();

        System.out.println("File: ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String team = scanner.nextLine();

        readGamesFromFile(file, games);

        int teamGames = searchTeamGames(games, team);
        int teamWins = searchTeamWins(games, team);
        int teamLosses = searchTeamLosses(games, team);

        System.out.println("Games: " + teamGames);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }

    public static ArrayList<Game> readGamesFromFile(String file, ArrayList<Game> games) {

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeamName = parts[0];
                String visitTeamName = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitTeamPoints = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeamName, visitTeamName, homeTeamPoints, visitTeamPoints));
            }
        } catch (Exception error) {
            System.out.println("Error: file " + file + " not found.");
        }

        return games;
    }

    public static int searchTeamGames(ArrayList<Game> games, String team) {
        int teamGames = 0;

        for (Game game : games) {
            if (game.contains(team)) {
                teamGames++;
            }
        }

        return teamGames;
    }

    public static int searchTeamWins(ArrayList<Game> games, String team) {
        int gameWins = 0;

        for (Game game : games) {
            if (game.contains(team)) {
                gameWins += game.gameWins(team);
            }
        }

        return gameWins;
    }

    public static int searchTeamLosses(ArrayList<Game> games, String team) {
        int gameLosses = 0;

        for (Game game : games) {
            if (game.contains(team)) {
                gameLosses += game.gameLosses(team);
            }
        }
        return gameLosses;
    }
}
