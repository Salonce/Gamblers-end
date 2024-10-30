package org.example;

public interface GamblersGame {
    void play(int sample, int betValue, long initialCash) throws InvalidArgumentException;
}
