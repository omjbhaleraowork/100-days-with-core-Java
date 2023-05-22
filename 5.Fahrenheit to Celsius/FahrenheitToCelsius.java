import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import javafx.print.PrintColor;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        float temperature;
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter Temperature in Fahrenheit");
        temperature = sc.nextFloat();

        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("Temperature in Celsius=" + temperature);

    }
}
