package optimedCodes;

import java.util.*;

class ScoreComparator implements Comparator<String> {
    Map<String, Integer> baseMap;
    public ScoreComparator(Map<String, Integer> baseMap) {
        this.baseMap = baseMap;
    }
    @Override
    public int compare(String s1, String s2) {
        int score1 = baseMap.get(s1);
        int score2 = baseMap.get(s2);
        if (score1 != score2) {
            return Integer.compare(score2, score1);
        }
        return s1.compareTo(s2);
    }
}
public class TreeMaps {
    public static void main(String[] args) {
        // Store student names and their scores
        Map<String, Integer> scoreData = new HashMap<>();
        scoreData.put("Alice", 88);
        scoreData.put("Bob", 92);
        scoreData.put("Charlie", 75);
        scoreData.put("David", 92);
        scoreData.put("Eve", 60);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new ScoreComparator(scoreData));
        sortedMap.putAll(scoreData);

        System.out.println(" Student Scores (Descending Order):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("\n Contains Charlie? " + sortedMap.containsKey("Charlie"));
        System.out.println("\n Removing Eve...");
        sortedMap.remove("Eve");
        System.out.println("\n Updated Scores:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
