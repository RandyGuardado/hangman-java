/**************************
* Author: Randy Guardado & Steven Espinosa
*
* Hangman Dictionary
**************************/
import java.util.Scanner;
import java.util.Random;

public class HangmanWordList{
   public void Start(int diff){
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
      String word;
      Random rand = new Random();
      int w1 = rand.nextInt(4);
      word = words[w1];
      System.out.println("Your word is: " + word);
   }
}
