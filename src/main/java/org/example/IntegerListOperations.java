package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerListOperations {
    private List<Integer> integerList; // Original list of integers
    private Set<Integer> integerSet;   // Set to hold unique integers
    private int sum;
    private double avg;
    private int sumOfUniqueIntegers;
    private double avgOfUniqueIntegers;

    //Constructor that initializes list and performs calculations
    public IntegerListOperations(List<Integer> integerList) {
        this.integerList = integerList;
        this.integerSet = new HashSet<>(integerList); // Task 2: Removes dupes
        calculateSumsandAverages();
    }

    // Task 3 + 5 + 6: Method to calculate sums and averages | indexoutofbounds/illegalargumnent/arithmetic exceptions | try/multicatch block
    private void calculateSumsandAverages() {
        sum = 0;
        sumOfUniqueIntegers = 0;
        avg = 0;
        avgOfUniqueIntegers = 0;

        try {
            for (Integer integer : integerList) {
                sum += integer;
            }
            if (integerList.size() == 0) {
                throw new ArithmeticException("Integer list is empty");
            }
            avg = (double) sum / integerList.size();


            // Task 4: calculate the sum of unique integers
            for (int num : integerSet) {
                sumOfUniqueIntegers += num;
            }
            if (integerSet.size() == 0) {
                throw new ArithmeticException("Division by zero - no elements in set");
            }
            avgOfUniqueIntegers = (double) sumOfUniqueIntegers / integerSet.size();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Sum and average calculation completed.");
        }
    }

    // Method to get the sum of integers with duplicates
    public int getSum() {
        return sum;
    }

    // Method to get the average of integers with duplicates
    public double getAvg() {
        return avg;
    }

    // Method to get the sum of unique integers
    public int getSumOfUniqueIntegers() {
        return sumOfUniqueIntegers;
    }

    // Method to get the average of unique integers
    public double getAvgOfUniqueIntegers() {
        return avgOfUniqueIntegers;
    }

    // Method to get the set of unique integers
    public Set<Integer> getUniqueIntegers() {
        return integerSet;
    }
}



