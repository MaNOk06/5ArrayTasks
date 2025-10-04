/*
Demonstration of Arrays in Java
@author Martha Naa Okailey Afful
*/

public class ListsJava {
    public static void main(String[] args){

        /*
        Main Method
        @param args
        */

        int[] ages = {16,18,17,28,19,21,24,30,17,15};
        int sumOfAges = 0;

        for (int age : ages) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages " + sumOfAges);

        double average = sumOfAges / (double) ages.length;
        System.out.println("Average of ages: " + average);

        // Largest Age
        int largestAge = 0;
        for (int age : ages) {
            if (age > largestAge) {
                largestAge = age;
            }
        }
        System.out.println("The largest age is " + largestAge);

        // Lowest Age
        int lowestAge = ages[0];
        for (int age: ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age is " + lowestAge);
    }
}
