/**************************
* Author: Randy Guardado
*
* Hangman Main
**************************/
import java.util.Scanner;

public class HangmanMain{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to Hangman");
      System.out.println("Please select a difficulty! 1 for easy, 2 for medium, 3 for hard.");
      int diff = input.nextInt();
      if(diff == 1 || diff == 2 || diff == 3){
         HangmanWordList dictionary = new HangmanWordList();
         dictionary.WordList(diff);
      }
  }
}
