package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0;

        for(int i = start; i <= end; i++) {
            if(isOdd(i))
                sum += i;
        }
        return sum;
    }

    private boolean isOdd(int x) {
        return x % 2 != 0;
    }
}
