package org.example;

public class Blackjack implements GamblersGame{
    @Override
    public void play(int sample, int betValue, long initialCash) throws InvalidArgumentException {

        if (sample % 20 != 0)
            throw new InvalidArgumentException("Sample number should be divisible by 20.");

    }
}
