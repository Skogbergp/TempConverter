import java.util.Scanner;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public boolean isExtremeTemperature(double temperature) {
        return temperature > 50 || temperature < -40;
    }
    public double kelvinToCelsius(double kelvin) {
        return kelvin -273.15;
    }
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner input = new Scanner(System.in);
        int choice;
        double temp = 0;
        System.out.println("Welcome to Temperature Converter");
        System.out.println("Please enter your choice");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Kelvin to Celsius");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Please enter the temperature in Fahrenheit: ");
                temp = input.nextDouble();

                System.out.println(converter.fahrenheitToCelsius(temp));
                if(converter.isExtremeTemperature(temp)){
                    System.out.println("Temperature is extreme");
                }else{
                    System.out.println("Temperature is not extreme");
                }
                break;
            case 2:
                System.out.println("Please enter the temperature in Celcius: ");
                temp = input.nextDouble();

                System.out.println(converter.celsiusToFahrenheit(temp));
                if(converter.isExtremeTemperature(temp)){
                    System.out.println("Temperature is extreme");
                }else{
                    System.out.println("Temperature is not extreme");
                }
                break;
            case 3:
                System.out.println("Please enter the temperature in kelvin: ");
                temp = input.nextDouble();

                System.out.println(converter.kelvinToCelsius(temp));
                if(converter.isExtremeTemperature(temp)){
                    System.out.println("Temperature is extreme");
                }else{
                    System.out.println("Temperature is not extreme");
                }
                break;

        }

    }
}

