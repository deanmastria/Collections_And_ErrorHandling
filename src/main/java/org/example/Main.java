package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task 1: Define a List with at least one set of duplicates
        List<Integer> integerList = new ArrayList<>(1,2,3,4,5,6,7,8,9,9);

        // Instance of the IntegerListOperations class and passing the integerList as an argument to its constructor
        IntegerListOperations operations = new IntegerListOperations(integerList);

        // Task 3: Sum and Average with dupes
        System.out.printf("Sum" + operations.getSum());
        System.out.println("Average" + operations.getAverage());

        // Task 4: Sum, Average and List of integers without dupes
        System.out.printf("Sum of unique integers" + operations.getSumOfUniqueIntegers());
        System.out.printf("Avg of unique integers" + operations.getAverageOfUniqueIntegers());
        System.out.printf("List of unique integers" + operations.getUniqueIntegers());
        }
    }
