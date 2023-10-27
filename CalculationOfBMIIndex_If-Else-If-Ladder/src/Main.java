import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        float heightUser, weightUser, bmiUser;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate your BMI");
        System.out.println("Enter your height in cm: ");
        heightUser = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg: ");
        weightUser = Float.parseFloat(br.readLine());

        bmiUser = (float) (weightUser / Math.pow(heightUser, 2));

        String category;
        if (bmiUser < 16.0) {
            category = "Starvation";
        } else if (bmiUser >= 16.0 && bmiUser <= 16.99) {
            category = "Emaciation";
        } else if (bmiUser >= 17.0 && bmiUser <= 18.49) {
            category = "Underweight";
        } else if (bmiUser >= 18.5 && bmiUser <= 22.99) {
            category = "Normal, low range";
        } else if (bmiUser >= 23.0 && bmiUser <= 24.99) {
            category = "Normal, high range";
        } else if (bmiUser >= 25.0 && bmiUser <= 27.49) {
            category = "Overweight, low range";
        } else if (bmiUser >= 27.5 && bmiUser <= 29.99) {
            category = "Overweight, high range";
        } else if (bmiUser >= 30.0 && bmiUser <= 34.9) {
            category = "1st degree obesity";
        } else if (bmiUser >= 35.0 && bmiUser <= 39.9) {
            category = "2nd degree obesity";
        } else {
            category = "3rd degree obesity";
        }

        System.out.println("Your BMI is " + bmiUser + " which corresponds to: " + category);
    }
}