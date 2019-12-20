package eg.edu.alexu.csd.oop.game;

public class Score {
    private int score;
    public Score(){
        score=0;
    }
    public void increase(){

        score++;
        Log.getInstance().getLog().info(" score increased ");

    }
    public void decrease(){
        if(score>0)score--;
        Log.getInstance().getLog().info(" score  Decreased ");

    }
    public int getScore(){
        return score;
    }
}
