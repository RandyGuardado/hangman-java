/**************************
* Author: Randy Guardado & Steven Espinosa
*
* Hangman Play
**************************/
import java.util.Scanner;
      
public class HangmanPlay{
   public void Play(){
      int playerGuess = wordToGuess.length();
      int attempts = 10;
      
      char[] blanks = new char[wordToGuess.length()];
      for (int i = 0; i < wordToGuess.length(); i++) {
         blanks[i] = '*';
      }
      System.out.println();
      
      while(playerGuess > 0 && attempts > 0 ){
         System.out.println();
         for ( int i = 0; i < wordToGuess.length(); i++) {
           System.out.print(" " + blanks[i] + " ");
         }
         System.out.println();

         System.out.println("You have " + attempts + " tries to make a guess");
         System.out.println("Please enter your guess: ");

         char guess = input.next().charAt(0);
         boolean iscorrect = false;
         for (int i = 0; i < blanks.length; i++) {
             if(wordToGuess.charAt(i) == guess)
             {
                 blanks[i] = guess;
                 playerGuess--;
                 iscorrect = true;
             }
         }

         if(!iscorrect)
             attempts--;
     }
      if(playerGuess == 0)
         System.out.println("Congratulations you win! Your word was: " + wordToGuess);
         else System.out.println("Loser your word was: " + wordToGuess);   
     }
}
