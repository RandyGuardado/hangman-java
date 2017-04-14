/**************************
* Author: Randy Guardado & Steven Espinosa
*
* Hangman Main
**************************/
import java.util.Scanner;

public class HangmanMain{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to Hangman");
      System.out.println("Please select a difficulty!");
      int diff = input.nextInt();
      if(diff == 1 || diff == 2 || diff == 3){
         HangmanWordList dictionary = new HangmanWordList();
         dictionary.Start(diff);
      }
  }
}
