// Roulette Game Simulator
//
// Author: Won Yong Ha
//
// Game.java

import java.util.Scanner;

public class Game {

  public static void bettingRule() {
    System.out.println("Betting rule");
    System.out.println("Black : B/b; Red : R/r");
    System.out.println("Even : E/e; Odd : O/o");
    System.out.println("1 - 18 : 1-18; 19 - 36 : 19-36");
    System.out.println("1st 12 : 1/12; 2nd 12 : 2/12; 3rd 12 : 3/12");
    System.out.println("2 to 1 - 1 : 2/11; 2 to 1 - 2 : 2/12; 2 to 1 - 3 : 2/13");
  }
  
  public static void main(String args[]) {

    //Variables
    String yn = "";
    Scanner scan = new Scanner(System.in);

    //First Questions
    System.out.println("Simulator? Y/N");
    yn = scan.nextLine();

    //Check the Yes or No
    while(!(yn.equals("y")) && !(yn.equals("Y")) && !(yn.equals("n")) && !(yn.equals("N"))) {
      System.out.println("Simulator? Y/N");
      yn = scan.nextLine();
    }

    System.out.println(yn + "\n");

    //Simulator
    if(yn.equals("y") || yn.equals("Y")) {
    }

    //Manual
    if(yn.equals("n") || yn.equals("N")) {
      
    }
  }
}