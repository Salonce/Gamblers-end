package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CoinFlip implements GamblersGame{

    private Random rand;

    public CoinFlip(){
        rand = new Random();
    }

    @Override
    public void play(int sample, int betValue, long startingBudget) throws InvalidArgumentException{

        if (sample % 20 != 0)
            throw new InvalidArgumentException("Sample number should be divisible by 20.");

        List<Long> res = new ArrayList<>();
        long flips = 0;
        for (int i = 0; i < sample; i++) {
            flips = 0;
            long money = startingBudget;
            while (money >= 0) {
                flips++;
                int flip = rand.nextInt(2);
                if (flip == 0)
                    money -= betValue;
                else
                    money += betValue;
                if (flips == 100000000)
                    break;
            }
            res.add(flips);
        }

        for (int i = 0; i < sample; i++){
            System.out.print(res.get(i) + ",");
            if (i != 0 && i % 15 == 0) System.out.println();
        }
        System.out.println("\n\nStarting budget: " + startingBudget + ".\nBet value: " + betValue + ".\nNumber of simulations: " + sample);

        Collections.sort(res);
        System.out.println();
        for (int i = 1; i <= 9; i++)
            System.out.println(i + "0% chance to go bankrupt after " + res.get((sample / 10) * i - 1) + " coin flips.");
    }
}



//System.out.println("50% chance to go bankrupt after " + res.get((sample / 10) * 5 - 1) + " coin flips.");
//System.out.println("90% chance to go bankrupt after " + res.get((sample / 10) * 9 - 1) + " coin flips.");