package jeel.weather;

import java.util.*;
public class App {

    public static void main(String[] args) throws Exception {

        Website_Generator a = new Website_Generator();
        a.addcity(new Small_Cities("Rosenheim",1));
        a.addcity(new Big_Cities("Münich",0,List.of("Schwabing","Sendling","Lehel", "Nymphenburg")));
        a.addcity(new Big_Cities("Berlin",2,List.of("Kreuzberg","Charlottenburg","Prenzlauer Berg","Friedrichshain","Neukoelln", "Schoeneberg")));
        a.addcity(new Small_Cities("Erlangen",1));
        a.addcity(new Big_Cities("Stuttgart",2,List.of("Zuffenhausen","Feuerbach and Vaihingen")));
        a.generateWebsite();
    }

}
