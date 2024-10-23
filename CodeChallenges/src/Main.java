import challenges.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Challenge1
        System.out.println(" Challenge 1: FizzBuzz ------------------------------------");
        Challenge1 challenge1 = new Challenge1();
        challenge1.solve();

        // Challenge 21
        System.out.println(" Challenge 21: reverse string ----------------------------");
        System.out.println(Challenge21.reverseString("hello"));

        // Challenge 22
        System.out.println(" Challenge 22: reverse string ----------------------------");
        System.out.println(Challenge22.reverseString("hello"));

        // Challenge 23
        System.out.println(" Challenge 23: reverse string ----------------------------");
        System.out.println(Challenge23.reverseString("hello"));

        // Challenge 3
        System.out.println(" Challenge 3: find max value ----------------------------");
        int[] inputArray = {4, 1, 6, 8, 2};
        System.out.println(Challenge3.findMaxValue(inputArray));

        // Challenge 4
        System.out.println(" Challenge 4: unique elements ----------------------------");
        int[] inputArray2 = {4, 1, 2, 6, 5,  6, 8, 2};
        System.out.println(Arrays.toString(Challenge4.unique(inputArray2)));

        // Challenge 5
        System.out.println(" Challenge 5: same elements ----------------------------");
        int[] inputArray3 = {4, 1, 8, 3};
        int[] inputArray4 = {1, 4, 8, 3};
        System.out.println(Challenge5.haveSameElements(inputArray3, inputArray4));

        // Challenge 61
        System.out.println(" Challenge 61: palindrome (using index pointers ) ----------------------------");
        System.out.println(Challenge61.isPalindrome("madam"));

        // Challenge 62
        System.out.println(" Challenge 62: palindrome (with recursive function) ----------------------------");
        System.out.println(Challenge62.isPalindrome("madam"));

        // Challenge 7
        System.out.println(" Challenge 7: anagram  ----------------------------");
        System.out.println(Challenge7.isAnagram("anna", "nana"));

        // Challenge 81
        System.out.println(" Challenge 81: caeser cipher (com String Builder e ciclo for ----------------------------");
        System.out.println(Challenge81.caeserCipher("hello", 3));

        // Challenge 82
        System.out.println(" Challenge 82: caeser cipher (com Map e ciclo for) ----------------------------");
        System.out.println(Challenge82.caeserCipher("hello", 3));

        // Challenge 9
        System.out.println(" Challenge 9: binary search ----------------------------");
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Challenge9.binarySearch(array, 3));

        // Challenge 10
        System.out.println(" Challenge 10: merge sort ----------------------------");
        int[] array2 = {5, 2, 8, 3, 1};
        System.out.println(Arrays.toString(Challenge10.mergeSort(array2)));

        // Challenge 11
        System.out.println(" Challenge 11: find first duplicate ----------------------------");
        int[] array3 = {1, 2, 3, 4, 5, 2};
        System.out.println(Challenge11.findFirstDuplicate(array3));

        // Challenge 12
        System.out.println(" Challenge 12: validate IP adress ----------------------------");
        System.out.println("192.168.0.1" + " é: " + Challenge12.validateIPAddress("192.168.0.1"));
        System.out.println("256.100.50.0" + " é: " + Challenge12.validateIPAddress("256.100.50.0"));
        System.out.println("192.168.01.1" + " é: " + Challenge12.validateIPAddress("192.168.01.1"));
        System.out.println("123.45.67" + " é: " + Challenge12.validateIPAddress("123.45.67"));

        // Challenge 13
        System.out.println(" Challenge 13: binary gap ----------------------------");
        System.out.println("O binary gap de 1041 é: " + Challenge13.binaryGap(1041));

        // Challenge 14
        System.out.println(" Challenge 14: string1 is substring of string2 ----------------------------");
        System.out.println("abc" + " é substring de: " + "ahbgdc" + ": " + Challenge14.isSubstring("abc", "ahbgdc"));
        System.out.println("axc" + " é substring de: " + "ahbgdc" + ": " + Challenge14.isSubstring("axc", "ahbgdc"));
    }
}