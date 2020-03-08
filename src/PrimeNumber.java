/*
Program sprawdza czy podana liczba to liczba pierwsza.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {

  static void isPrimeNumber(int number){
        if (number < 2) System.out.println("Podana liczba nie jest pierwsza.");
        else if (number == 2) System.out.println("Podana liczba jest pierwsza.");
        else
            for(int i = 2; i<number/2; i++) {

                if (number % i == 0) {
                    System.out.println("Podana liczba nie jest pierwsza.");
                    break;
                }
                else {
                    System.out.println("Podana liczba jest pierwsza.");
                    break;
                }
            }
    }

    public static void main(String[] args){

        System.out.print("Podaj liczbe: ");

        Scanner input = new Scanner(System.in);
        int number;
        try {
            number = input.nextInt();
            isPrimeNumber(number);
        }catch(InputMismatchException e){
            System.out.println("Podaj liczbę.");
        }
        }
    }

