public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    public int getScore()
    {
        return score;
    }

    public void addPlayer()
    {
        players = players + 1;
    }

    public void increaseScore(int increase)
    {
        score = score + increase;
    }

    public double averageScorePerPlayer()
    {
        return (double)score/players;
    }

    public void end()
    {
        gameOver = true;
    }
}


