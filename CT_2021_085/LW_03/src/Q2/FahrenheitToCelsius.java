package Q2;

import Q1.Temperature;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Temperature in fahrenheit: ");

        double fahrenheit=scanner.nextDouble();

        Temperature temp= new Temperature();

        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in celsius: "+temp.toCelsius());

    }
}
