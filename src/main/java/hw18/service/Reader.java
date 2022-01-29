package hw18.service;

import hw18.model.Box;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Reader {
    protected static final Box box = new Box ( );
    private static final ClassLoader classLoader = Thread.currentThread ( ).getContextClassLoader ( );

    protected static BufferedReader createReader ( String string ) {
        return new BufferedReader ( new InputStreamReader ( Objects.requireNonNull ( classLoader.getResourceAsStream ( string ) ) ) );
    }

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "yyyy-MM-dd'T'HH:mm:ss" );
    static Pattern fromPattern;
    static Matcher matcher;
    static String temp;
}
