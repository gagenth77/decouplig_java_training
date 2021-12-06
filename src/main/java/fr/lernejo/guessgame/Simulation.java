package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger( "simulation" );
    private final Player player;
    private Long numberToGuess;

    public Simulation( Player player ) {
        this.player = player;
    }

    public void initialize( long numberToGuess ) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        Long inputNumber = player.askNextGuess();
        if ( inputNumber < numberToGuess ) {
            logger.log( "Input number is lower than the number to guess" );
            player.respond( false );
        } else if ( inputNumber > numberToGuess ) {
            logger.log( "Input number is greater than the number to guess" );
            player.respond( true );
        } else if ( inputNumber == numberToGuess ) {
            logger.log( "Input number is equal to the number to guess" );
            return true;
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while ( ! nextRound() ) {
            logger.log( "Failed attempt" );
        }
        logger.log( "Number found" );
    }
}
