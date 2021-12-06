package fr.lernejo.guessgame;

import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    @Override
    public Long askNextGuess() {
        Scanner scanner = new Scanner( System.in );
        System.out.print("Number:");
        return scanner.nextLong();
    }

    @Override
    public void respond( boolean lowerOrGreater ) {
        LoggerFactory.getLogger( "player" ).log( lowerOrGreater ? "Greater" : "Lower" );
    }
}
