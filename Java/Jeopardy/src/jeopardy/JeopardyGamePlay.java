package jeopardy;

import java.util.ArrayList;

/**
 * JeopardyGamePlay
 * methods for running a game of Jeopardy.
 */
public class JeopardyGamePlay {
    private int numTeams;
    private ArrayList<Integer> teamScores;
    private int qCat;
    private int qNum;
    
    /**
     * constructor.
     * pre: teams is a positive integer.
     * post: a JeopardyGamePlay object is created.
     * @param teams 
     */
    public void JeopardyGamePlay(int teams) {
        numTeams = teams;
        teamScores = new ArrayList<>();
        for(int i = 1; i <= numTeams; i++) {
            teamScores.add(i, 0);
        }
    }
    
    /**
     * returns the amount of teams in the game.
     * pre: none
     * post: The number of teams has been returned
     * @return numTeams
     */
    public int getTeams() {
        return(numTeams);
    }
    
    /**
     * Returns the team's score.
     * pre: team is a positive integer.
     * post: the score is returned
     * @param team
     * @return score
     */
    public int getScore(int team) {
        return(teamScores.get(team));
    }
    
    /**
     * returns a string that represents all team scores.
     * pre: none.
     * post: a string representing team scores is returned.
     * @return All scores.
     */
    public String getScoreAll() {
        String scoreString = "The Current Scores are:\n";
        for(int i = 1; i <= numTeams; i++) {
            scoreString = scoreString + "Team " + i + ": "
                    + teamScores.get(i) + "\n";
        }
    }
    
    
}