package ru.netology.sqr;

public class SQRservice {

    public int Calc(int lim1, int lim2) {

        int count = 0;

        for (int i = 10; i < 100; i++) {
            int x = i * i;
            if (x >= lim1 && x <= lim2) {
                count++;
            }
        }
    return count;
    }
}

