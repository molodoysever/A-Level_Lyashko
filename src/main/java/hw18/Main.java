package hw18;

import hw18.model.Box;
import hw18.service.ReaderJSON;
import hw18.service.ReaderXML;

public class Main {
    public static void main(String[] args) {
        Box boxXml = ReaderXML.xml("practiseXml.xml");
        System.out.println(boxXml);
        Box boxJson = ReaderJSON.json("practiseJson.json");
        System.out.println(boxJson);
    }
}
