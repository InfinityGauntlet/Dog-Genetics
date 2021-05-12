/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doggenetics;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lamarjohnson
 */
public class dogGenetics {

    public static void main(String[] args) {

        Scanner report = new Scanner(System.in);
        Random generator = new Random();

        String dogName;
        String breed;

        System.out.println("What is your dog's name??");
        dogName = report.nextLine();
        String[] dogBreed = {"Beagle", "German Shepherd", "Labrador", "Bulldog",
            "Boxer", "Pug", "Siberian Husky", "Rottweiler", "Akita", "Collie",
            "Chow", "Terrier", "Doberman"};

        String randomString1 = dogBreed[generator.nextInt(dogBreed.length)];
        String randomString2 = dogBreed[generator.nextInt(dogBreed.length)];
        String randomString3 = dogBreed[generator.nextInt(dogBreed.length)];
        String randomString4 = dogBreed[generator.nextInt(dogBreed.length)];
        String randomString5 = dogBreed[generator.nextInt(dogBreed.length)];

        while (true) {
            int firstNumber = generator.nextInt(101);
            int secondNumber = generator.nextInt(101 - firstNumber);
            int thirdNumber = generator.nextInt(101 - firstNumber - secondNumber);
            int fourthNumber = generator.nextInt(101 - firstNumber - secondNumber - thirdNumber);
            int fifthNumber = generator.nextInt(101 - firstNumber - secondNumber - thirdNumber - fourthNumber);

            if (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber == 100) {

                System.out.println("Well then, I have this highly reliable report on"
                        + "" + dogName + "" + "prestigious background right here.");
                System.out.println(dogName + " " + "is:");
                System.out.println(firstNumber + "" + "%" + "" + randomString1);
                System.out.println(secondNumber + "" + "%" + "" + randomString2);
                System.out.println(thirdNumber + "" + "%" + "" + randomString3);
                System.out.println(fourthNumber + "" + "%" + "" + randomString4);
                System.out.println(fifthNumber + "" + "%" + "" + randomString5);

                break;
            }
        }

    }
}

