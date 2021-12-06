package fr.lernejo.logger;

public class LoggerFactory implements Logger{

        public static Logger getLogger( String name ) {
            return new ContextualLogger( name, new FileLogger("./runLogs.log") );
        }

        @Override
        public void log(String message) {
            System.out.println(message);
        }
    }
