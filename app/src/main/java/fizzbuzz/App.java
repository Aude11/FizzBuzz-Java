/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzbuzz;

public class App {
    public static void fizzbuzz() {
        System.out.println("Welcome to Fezz Buzz!"); // Display the string.
        int fizz = 3;
        int buzz = 5;
        int bang = 7;
        String wordToAdd;
        String bangWord = "Bang";
        for (int counter = 0; counter <= 1000; counter++) {
            wordToAdd = addWord(bang, counter, bangWord);
            if (isaDivider(fizz, counter) && isaDivider(buzz, counter)) {
                System.out.println("FizzBuzz"+ wordToAdd);
            } else if (isaDivider(fizz, counter) && !isaDivider(buzz, counter)) {
                System.out.println("Fizz"+ wordToAdd);
            } else if (!isaDivider(fizz, counter) && isaDivider(buzz, counter)) {
                System.out.println("Buzz"+ wordToAdd);
            } else {
                System.out.println(counter);
            }
          }
    }
    public static Boolean isaDivider(int divider, int numberToCheck){
        return numberToCheck % divider == 0;
    }
    public static String addWord(int divider, int numberToCheck, String wordToAdd){
        if (isaDivider(divider, numberToCheck)){
            return wordToAdd;
        } else{
            return "";
        }
    }
    public static void main(String[] args) {
        fizzbuzz();
    }
}
