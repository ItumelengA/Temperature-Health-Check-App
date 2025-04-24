import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int userNum = 5;
        String names[] = new String[userNum];
        double temperature[] = new double[userNum];

        captureDetails(names,temperature);
        displaydetails(names,temperature);
        computerdetails(names,temperature);
    }
    public static void captureDetails(String names[],double temperature[]){

        Scanner input = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i < names.length; i++) {
            System.out.print("User "+ (count) +" enter your name: ");
            names[i] = input.next();
            System.out.print("Temperature: ");
            temperature[i] = input.nextDouble();
            System.out.printf("");
            count++;
        }
        input.close();

    }
    public static void displaydetails(String names[],double temperature[]){
        System.out.println("\n--Users--");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] +" || " + temperature[i] + " ");
            System.out.println();
        }
    }
    public static void computerdetails(String names[],double temperature[]){
        double minTemp = 30;
        System.out.println("\n--Messages--");
        for (int i = 0; i < names.length; i++) {
            if (temperature[i] < minTemp){
                System.out.println(names[i] + " || GOODHEALTH");
            }else {
                System.out.println(names[i] + " || QUARANTINE");
            }
        }
    }
}