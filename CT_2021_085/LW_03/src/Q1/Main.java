package Q1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double inputCelsius= scanner.nextDouble();

        //create temperature object with user input
        Temperature temp= new Temperature(inputCelsius);

        System.out.println("Temperature in Fahrenheit: "+temp.toFahrenheit());
        }
    }
