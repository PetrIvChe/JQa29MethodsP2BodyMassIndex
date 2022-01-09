package ru.netology;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMassIndex = service.calculate(1.72, 83);
        String format = String.format("%.1f", bodyMassIndex);
        System.out.println("Your Body Mass Index: " + format);
    }
}
