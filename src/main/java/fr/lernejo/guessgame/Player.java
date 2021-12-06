package fr.lernejo.guessgame;

public interface Player {
    Long askNextGuess();

    void respond( boolean lowerOrGreater );
}
