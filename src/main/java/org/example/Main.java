package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gambling helper!\n");

        GamblersGame coinFlip = new CoinFlip();
        //coinFlip.play(100, 5000, 2000000);
        coinFlip.play(100, 100, 8030);
    }
}