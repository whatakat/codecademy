package com.example.codecademy;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String region, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = region;
        this.wordOrder = wdOrder;

    }
    public void getInfo(){
        System.out.println(name+" is spoken by "+
                numSpeakers+" people maily in "+
                regionSpoken+". "+"The language follows the word order: "+
                wordOrder+".");
    }


    public static void main(String[] args){
        Language lang = new Language("English",2000000,"London","subject-verb-object");
        lang.getInfo();
        Mayan mayan = new Mayan("Ki'che'",2330000);
        mayan.getInfo();

    }
}
