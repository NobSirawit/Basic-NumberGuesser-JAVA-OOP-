//elab-source:Guess.java

public class Guess {
    private int target ;
    public Guess(int target){
        this.target = target ;
    }
    public int getTarget(){
        return target ;
    }
    public int  check(int other) {
        if (this.target > other) {
            //System.out.println("Too low");
            return 1 ;
        } else if (this.target < other) {
            //System.out.println("Too high");
            return 2 ;
        } else {
            //System.out.println("correct");
            return 3 ;
        }
    }

}
