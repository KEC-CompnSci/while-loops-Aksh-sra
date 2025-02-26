
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("hello", 3);
      System.out.println(repeated);
      String pyramid = createPyramid(3);
      String FizzBuzz = countTo(3);}
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
       
     
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        

         public static String repeatWord(String word, int times) {
        String result = "";
        int count = 0;
        
        while (count < times) {
            if (count > 0) {
                result += " ";  // Add a space before adding the word (except for the first one)
            }
            result += word;
            count++;
        }
        
        return result;}

    
    
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    
        // Use nested while loops:
        // - Outer loop for each row
        // - Inner loop to repeat the number
        // Use \n for newlines
        

        public static String createPyramid(int maxNumber) {
        StringBuilder result = new StringBuilder();
        int row = 1;
        
        while (row <= maxNumber) {
            int repeat = 1;
            while (repeat <= row) {
                result.append(row);
                repeat++;
            }
            result.append("\n");  // Newline after each row
            row++;
        }
        
        return result.toString();}
    

    
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    
        // TODO: Implement this method
        // Use a while loop
        // Use string concatenation
        // Numbers/words should be separated by spaces
        // No trailing space at the end
        

         public static String countTo(int maxNumber) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        while (count <= maxNumber) {
            if (count > 1) {
                result.append(" ");  // Add a space between numbers and words
            }
            
            if (count % 3 == 0 && count % 5 == 0) {
                result.append("FizzBuzz");
            } else if (count % 3 == 0) {
                result.append("Fizz");
            } else if (count % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(count);
            }
            
            count++;
        }
        
        return result.toString();
    }
}
    
    
  
