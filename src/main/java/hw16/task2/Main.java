package hw16.task2;


import java.util.*;


public class Main {
    public static void main ( String[] args ) {
        String text = "Как выучить Джава за час и стать Джава Сеньором-помидором как это сделать?";
        text = text.toLowerCase ( Locale.ROOT );
        text = text.replaceAll ( ", " , "?" );
        String[] split = text.split ( " " );

        LinkedHashMap<String, Integer> map = new LinkedHashMap<> ( );
        for (String word : split) {
            Integer count = map.get ( word );
            if (count == null) {
                count = 0;
            }
            map.put ( word , count + 1 );
        }

            ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<> ( map.entrySet ( ) );
            entries.sort ( Comparator.comparingInt ( Map.Entry::getValue ) );
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println ( entry.getKey ( ) + " " + entry.getValue ( ) );
            }
        }
    }