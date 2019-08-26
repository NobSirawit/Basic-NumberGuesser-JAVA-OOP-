//elab-source:Main.java
//elab-mainclass:Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x ;
        Scanner  sc  = new Scanner(System.in) ;
        int target = sc.nextInt() ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        Guess guess = new Guess(target) ;
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt() ;
            guess.check(arr[i]) ;
        }
        for(int i =0 ;i<n ;i++){
            if(guess.check(arr[i])==1){
                System.out.println("too low");
            }
            else if(guess.check(arr[i])==2){
                System.out.println("too high");
            }
            else {
                System.out.println("correct");
            }
        }

    }
}
