// Roulette Game Simulator
//
// Author: Won Yong Ha
//
// Game.java

import java.util.Scanner;

public class Game {
  
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

    if(yn.equals("y") || yn.equals("Y")) {

    }

    if(yn.equals("n") || yn.equals("N")) {
      
    }
  }
}