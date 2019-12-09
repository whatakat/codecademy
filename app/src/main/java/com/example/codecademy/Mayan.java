package com.example.codecademy;

public class Mayan extends Language {
    public Mayan(String languageName, int speakers){
        super(languageName, speakers,"Central America", "verb-object-subject");
    }
    @Override
    public void getInfo(){
        System.out.println(this.name+" is spoken by "+
                this.numSpeakers+" people mainly in "+
                this.regionSpoken+". The language follows " +
                "the wold order "+this.wordOrder+" " +
                "Fun fact: "+this.name+" is an ergative language.");
    }
}
