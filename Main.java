/*
Partners: Jordan Tavernier & Grant Rimstidt
Date: (9/29/20)
*/
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Declare variables
    Scanner s = new Scanner(System.in);
    int guessNum;
    int maxNum;
    int guessTimes;
    guessTimes=0;
    //Start the guessing game
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");
    //Read in maximum number
    maxNum = s.nextInt();
    Random r = new Random();
    int answerNum = r.nextInt(maxNum)+1;
    //Prompt user for their guess
    System.out.println("A random number to guess has been generated");
    System.out.println("Please guess a number between 0 and " + maxNum);
    Scanner g = new Scanner(System.in);
    guessNum = g.nextInt();
    //Check guess, and play game
    int guessCount;
    guessCount = 1;
    while (guessNum != answerNum) {
      guessCount++;
      playGame(guessNum, answerNum);
      guessNum = g.nextInt();
    }
    System.out.println("Great, you win! It took you " + guessCount + " tries.");
  }

  static void playGame(int guess, int answer) {
    if (guess > answer) {
      System.out.println("Guess lower!");
    }
    else if (guess < answer) {
      System.out.println("Guess higher!");
    }
    System.out.println("Enter your new guess:");
  }
}