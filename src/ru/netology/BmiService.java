package ru.netology;

public class BmiService {
    public double calculate(double height, double weight) {
        double bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }
}
