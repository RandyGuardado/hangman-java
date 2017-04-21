/**************************
* Author: Randy Guardado & Steven Espinosa
*
* Hangman Dictionary
**************************/
import java.util.Scanner;
import java.util.Random;

public class HangmanWordList{
   public void WordList(int diff){
      //Arrays allow difficulty selection
      String words[] = new String[4];
      Scanner input = new Scanner(System.in);
      
      switch(diff){
         case 1:
            words[0] = "dog";
            words[1] = "phone";
            words[2] = "shirt";
            words[3] = "cat";
            break;
         case 2:
            words[0] = "jalapeno";
            words[1] = "computer";
            words[2] = "library";
            words[3] = "ukelele";
            break;
         case 3:
            words[0] = "temperature";
            words[1] = "thunderstorm";
            words[2] = "encyclopedia";
            words[3] = "sophisticated";
            break;
      }
      String wordToGuess;
      Random rand = new Random();
      int assignedWord = rand.nextInt(4);
      wordToGuess = words[assignedWord];
      //Move all following code to HangmanPlay
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
