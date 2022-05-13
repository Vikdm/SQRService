package ru.netology.sqr;

public class Main {

    public void App(int lim1, int lim2) {

        SQRService service = new SQRService();
        int x = service.Calculate(lim1, lim2);
        System.out.println("Tаких чисел = " + x);
    }
}
