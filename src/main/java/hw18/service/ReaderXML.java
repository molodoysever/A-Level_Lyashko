package hw18.service;

import hw18.model.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class ReaderXML extends Reader {
    public static Box xml( String string ) {
        BufferedReader in = createReader( string );
        try {
            while ( ( temp = in.readLine( ) ) != null ) {

                fromPattern = Pattern.compile( ".*from=\"(.*?)\".*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.setFrom( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( ".*material=\"(.*?)\".*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.setMaterial( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( "<color>(.*)<.color>*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.setColor( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( ".*unit=\"(.*?)\".*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.getMaxLiftingCapacity( ).setUnit( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( "<max-lifting-capacity.*>(\\d*)<.max-lifting-capacity>*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.getMaxLiftingCapacity( ).setValue( Integer.parseInt( matcher.group( 1 ) ) );
                }

                fromPattern = Pattern.compile( "<name>(.*)<.name>*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.getCargo( ).setName( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( "<class>(.*)<.class>*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.getCargo( ).setType( matcher.group( 1 ) );
                }

                fromPattern = Pattern.compile( "<delivery-date>(.*)<.delivery-date>*" );
                matcher = fromPattern.matcher( temp );
                while ( matcher.find( ) ) {
                    box.setDeliveryDate( LocalDateTime.parse( matcher.group( 1 ) , formatter ) );
                }
            }
        } catch ( IOException e ) {
            e.printStackTrace( );
        }
        return box;
    }
}
