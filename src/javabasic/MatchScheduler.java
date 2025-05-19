package javabasic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchScheduler {

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team A");
        teams.add("Team B");
        teams.add("Team C");
        teams.add("Team D");
        teams.add("Team E");
        teams.add("Team F");

        List<List<String>> matches = scheduleMatches(teams);
        int matchNumber = 1;
        for (List<String> match : matches) {
            System.out.println("Match " + matchNumber++ + ": " + match.get(0) + " vs " + match.get(1));
        }
    }

    public static List<List<String>> scheduleMatches(List<String> teams) {
        List<List<String>> matches = new ArrayList<>();
        List<String> availableTeams = new ArrayList<>(teams);
        Collections.shuffle(availableTeams);

        while (availableTeams.size() > 1) {
            String team1 = availableTeams.remove(0);
            String team2 = availableTeams.remove(0);
            List<String> match = new ArrayList<>();
            match.add(team1);
            match.add(team2);
            matches.add(match);
            availableTeams.add(team1);
            availableTeams.add(team2);
            Collections.shuffle(availableTeams);
        }
        System.out.print(matches);
        return matches;
    }
}
