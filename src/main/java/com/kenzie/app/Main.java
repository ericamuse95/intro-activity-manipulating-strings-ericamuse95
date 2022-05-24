package com.kenzie.app;
import java.util.Arrays;

public class Main {
    /***********************/
    /* Manipulating Strings        */
    /***********************/

    // ----------------------------------------------------------------------
    // Complete the Following Exercises
    // ----------------------------------------------------------------------

    // Each one should be displayed in this manner:
    // System.out.println("Exercise 0");
    // System.out.println(answer);
    // Result:
    // Exercise 0
    // {this,is,the,answer}


    public static void exerciseOne(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 1");
        // Write code that uses "substring" to return a string with the first 14 characters from "bestThing".
        // Display your result using System.out.println(str);
        // Write Your Code Here
        System.out.println(bestThing.substring(0,14));

    }
    public static void exerciseTwo(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 2");
        // Write code that uses "substring" to return a string with the last 12 characters from "bestThing".
        // Display your result using System.out.println(str);
        // Write Your Code Here
        System.out.println(bestThing.substring(bestThing.length()-12));

    }
    public static void exerciseThree(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 3");
        // Write code that uses "substring" to return a string with the characters between the 3rd and 5th position of "bestThing"
        // (i.e., " b").
        // Display your result using System.out.println(str);
        // Write Your Code Here
        System.out.println(bestThing.substring(3,5));

    }
    public static void exerciseFour(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 4");
        // Write code that uses "substring" to return a string with the characters between the 23rd and 38th position of "bestThing"
        // (i.e., "boolean is even").
        // Display your result using System.out.println(str);
        // Write Your Code Here
        System.out.println(bestThing.substring(23,38));

    }
    public static void exerciseFive(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 5");
        // Write code that returns an array that contains each word in "bestThing"
        // Display your result using the call: Arrays.toString(wordArray);
        // Write Your Code Here
        String[] wordArray = bestThing.split(" ");
        System.out.print(Arrays.toString(wordArray));
        System.out.println();


    }
    public static void exerciseSix(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 6");
        // Write code that finds and returns the index of "only" in "bestThing" once turned into an array
        // Display your result using System.out.println(index);
        // Write Your Code Here
        String[] wordArray = bestThing.split(" ");
        for(int i =0; i < wordArray.length;i++){
            if(wordArray[i].equals("only")){
                System.out.println(i);
            }
        }

    }
    public static void exerciseSeven(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 7");
        // Write code that converts the bestThing string to an array and then finds
        // and returns the index of the last word in "bestThing".
        // Display your result using System.out.println(index);
        // Write Your Code Here
        String[] wordArray = bestThing.split(" ");
        int index = wordArray.length - 1;
        System.out.println(index);


    }
    public static void exerciseEight(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 8");
        // Write code that finds and returns an array with all the words in "bestThing" that start with a "b".
        // Display your result using the call: Arrays.toString(bWordArray);
        // Hint: You will need two loops to do this without hard-coding
        // Write Your Code Here
        String [] wordArray = bestThing.split(" ");
        //figure out size of new bWordArray
        //System.out.println(Arrays.toString(wordArray));
        int sizeOfNewArray  = 0;
        //iterate through  wordArray to find words that begin with "b"
        for(int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].startsWith("b")) {
                sizeOfNewArray++;
            }
        }
            //second loops searches through original array
            String [] bWordArray = new String[sizeOfNewArray];
            int b = 0;
            for(int index = 0; index < wordArray.length; index++){
                //find words that begin with "b"
                if(wordArray[index].startsWith("b")){
                    bWordArray[b] = wordArray[index];
                    b++;
                }
            }
            System.out.println(Arrays.toString(bWordArray));


        }

    public static void exerciseNine(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 9");
        // Write code converts the String "bestThing" into an array of characters. Do not include spaces.
        // Display your result using the call: Arrays.toString(lettersArray);
        // Write Your Code Here
        //new string remove spaces
        String noSpaces = bestThing.replace(" ","");
        char [] characters = noSpaces.toCharArray();
            System.out.println(Arrays.toString(characters));


    }
    public static void exerciseTen(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 10");
        // Write code converts the String "bestThing" into an array of characters with spaces removed and then use for-each to
        // loop through the array and count the number of times the letter "a" appears.
        // Display your result using: System.out.println(count);
        // Write Your Code Here
        //new string no spaces
        String noSpaces = bestThing.replace(" ","");
        char [] characters = noSpaces.toCharArray();
        //set counter for letter a
        int aCounter = 0;
        for(int i = 0; i < characters.length; i++){
            if(characters[i] == 'a'){
                aCounter++;
            }
        }
        System.out.println(aCounter);



    }
    public static void exerciseEleven(){
        String bestThing = "The best thing about a boolean is even if you are wrong you are only off by a bit";
        System.out.println("Exercise 11");
        // Write code converts the String "bestThing" into an array of characters and then use for-each to
        // loop through the array and count the number of times the letter "t" in uppercase or lowercase appears.
        // Display your result using: System.out.println(count);
        // Display your result using: System.out.println(count);
        // Write Your Code Here
        String noSpaces = bestThing.replace(" ","");
        String [] arrayOfCharacters = noSpaces.split("");
        //System.out.println(Arrays.toString(arrayOfCharacters));
        int upperCount = 0;
        int lowerCount = 0;
        for(int i =0; i < arrayOfCharacters.length;i++){
            if(arrayOfCharacters[i].equals("t")){
                lowerCount++;
        }
            if(arrayOfCharacters[i].equals("T")){
                upperCount++;
            }
        }
        System.out.println(lowerCount + upperCount);
        //System.out.println(upperCount);

    }


    public static void main(String[] args) {
        /* To run this assignment, select Run --> Run "Main" from the file menu at the top of IntelliJ IDEA */
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();
        exerciseNine();
        exerciseTen();
        exerciseEleven();
    }

}
