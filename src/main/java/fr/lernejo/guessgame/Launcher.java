package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main( String[] args ) {
        HumanPlayer myHumanPlayer = new HumanPlayer();
        Simulation mySimulation = new Simulation( myHumanPlayer );
        SecureRandom random = new SecureRandom();
        Long randomNumber = random.nextLong( 100 );
        mySimulation.initialize(randomNumber);
        mySimulation.loopUntilPlayerSucceed();
    }
}
