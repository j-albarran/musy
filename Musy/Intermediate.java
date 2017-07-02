import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Phrase;

import java.util.HashMap;
import java.util.Stack;

public class Intermediate {

    private static Stack<Song> songs = new Stack<>(); //to manage the songs
    private static HashMap<String, Integer> noteValues = new HashMap<>();

    

    public Intermediate()
    {
        initializeNotes();
    }


    public static void initializeNotes()
    {
        noteValues.put("A0", JMC.A0);
        noteValues.put("A1", JMC.A1);
        noteValues.put("A2", JMC.A2);
        noteValues.put("A3", JMC.A3);
        noteValues.put("A4", JMC.A4);
        noteValues.put("A5", JMC.A5);
        noteValues.put("A6", JMC.A6);
        noteValues.put("A7", JMC.A7);
        noteValues.put("A8", JMC.A8);
        noteValues.put("AS0", JMC.AS0);
        noteValues.put("AS1", JMC.AS1);
        noteValues.put("AS2", JMC.AS2);
        noteValues.put("AS3", JMC.AS3);
        noteValues.put("AS4", JMC.AS4);
        noteValues.put("AS5", JMC.AS5);
        noteValues.put("AS6", JMC.AS6);
        noteValues.put("AS7", JMC.AS7);
        noteValues.put("AS8", JMC.AS8);
        noteValues.put("AF0", JMC.AF0);
        noteValues.put("AF1", JMC.AF1);
        noteValues.put("AF2", JMC.AF2);
        noteValues.put("AF3", JMC.AF3);
        noteValues.put("AF4", JMC.AF4);
        noteValues.put("AF5", JMC.AF5);
        noteValues.put("AF6", JMC.AF6);
        noteValues.put("AF7", JMC.AF7);
        noteValues.put("AF8", JMC.AF8);
        noteValues.put("B0", JMC.B0);
        noteValues.put("B1", JMC.B1);
        noteValues.put("B2", JMC.B2);
        noteValues.put("B3", JMC.B3);
        noteValues.put("B4", JMC.B4);
        noteValues.put("B5", JMC.B5);
        noteValues.put("B6", JMC.B6);
        noteValues.put("B7", JMC.B7);
        noteValues.put("B8", JMC.B8);
        noteValues.put("BS0", JMC.BS0);
        noteValues.put("BS1", JMC.BS1);
        noteValues.put("BS2", JMC.BS2);
        noteValues.put("BS3", JMC.BS3);
        noteValues.put("BS4", JMC.BS4);
        noteValues.put("BS5", JMC.BS5);
        noteValues.put("BS6", JMC.BS6);
        noteValues.put("BS7", JMC.BS7);
        noteValues.put("BS8", JMC.BS8);
        noteValues.put("BF0", JMC.BF0);
        noteValues.put("BF1", JMC.BF1);
        noteValues.put("BF2", JMC.BF2);
        noteValues.put("BF3", JMC.BF3);
        noteValues.put("BF4", JMC.BF4);
        noteValues.put("BF5", JMC.BF5);
        noteValues.put("BF6", JMC.BF6);
        noteValues.put("BF7", JMC.BF7);
        noteValues.put("BF8", JMC.BF8);
        noteValues.put("C0", JMC.C0);
        noteValues.put("C1", JMC.C1);
        noteValues.put("C2", JMC.C2);
        noteValues.put("C3", JMC.C3);
        noteValues.put("C4", JMC.C4);
        noteValues.put("C5", JMC.C5);
        noteValues.put("C6", JMC.C6);
        noteValues.put("C7", JMC.C7);
        noteValues.put("C8", JMC.C8);
        noteValues.put("CS0", JMC.CS0);
        noteValues.put("CS1", JMC.CS1);
        noteValues.put("CS2", JMC.CS2);
        noteValues.put("CS3", JMC.CS3);
        noteValues.put("CS4", JMC.CS4);
        noteValues.put("CS5", JMC.CS5);
        noteValues.put("CS6", JMC.CS6);
        noteValues.put("CS7", JMC.CS7);
        noteValues.put("CS8", JMC.CS8);
        noteValues.put("CF0", JMC.CF0);
        noteValues.put("CF1", JMC.CF1);
        noteValues.put("CF2", JMC.CF2);
        noteValues.put("CF3", JMC.CF3);
        noteValues.put("CF4", JMC.CF4);
        noteValues.put("CF5", JMC.CF5);
        noteValues.put("CF6", JMC.CF6);
        noteValues.put("CF7", JMC.CF7);
        noteValues.put("CF8", JMC.CF8);
        noteValues.put("D0", JMC.D0);
        noteValues.put("D1", JMC.D1);
        noteValues.put("D2", JMC.D2);
        noteValues.put("D3", JMC.D3);
        noteValues.put("D4", JMC.D4);
        noteValues.put("D5", JMC.D5);
        noteValues.put("D6", JMC.D6);
        noteValues.put("D7", JMC.D7);
        noteValues.put("D8", JMC.D8);
        noteValues.put("DS0", JMC.DS0);
        noteValues.put("DS1", JMC.DS1);
        noteValues.put("DS2", JMC.DS2);
        noteValues.put("DS3", JMC.DS3);
        noteValues.put("DS4", JMC.DS4);
        noteValues.put("DS5", JMC.DS5);
        noteValues.put("DS6", JMC.DS6);
        noteValues.put("DS7", JMC.DS7);
        noteValues.put("DS8", JMC.DS8);
        noteValues.put("DF0", JMC.DF0);
        noteValues.put("DF1", JMC.DF1);
        noteValues.put("DF2", JMC.DF2);
        noteValues.put("DF3", JMC.DF3);
        noteValues.put("DF4", JMC.DF4);
        noteValues.put("DF5", JMC.DF5);
        noteValues.put("DF6", JMC.DF6);
        noteValues.put("DF7", JMC.DF7);
        noteValues.put("DF8", JMC.DF8);
        noteValues.put("E0", JMC.E0);
        noteValues.put("E1", JMC.E1);
        noteValues.put("E2", JMC.E2);
        noteValues.put("E3", JMC.E3);
        noteValues.put("E4", JMC.E4);
        noteValues.put("E5", JMC.E5);
        noteValues.put("E6", JMC.E6);
        noteValues.put("E7", JMC.E7);
        noteValues.put("E8", JMC.E8);
        noteValues.put("ES0", JMC.ES0);
        noteValues.put("ES1", JMC.ES1);
        noteValues.put("ES2", JMC.ES2);
        noteValues.put("ES3", JMC.ES3);
        noteValues.put("ES4", JMC.ES4);
        noteValues.put("ES5", JMC.ES5);
        noteValues.put("ES6", JMC.ES6);
        noteValues.put("ES7", JMC.ES7);
        noteValues.put("ES8", JMC.ES8);
        noteValues.put("EF0", JMC.EF0);
        noteValues.put("EF1", JMC.EF1);
        noteValues.put("EF2", JMC.EF2);
        noteValues.put("EF3", JMC.EF3);
        noteValues.put("EF4", JMC.EF4);
        noteValues.put("EF5", JMC.EF5);
        noteValues.put("EF6", JMC.EF6);
        noteValues.put("EF7", JMC.EF7);
        noteValues.put("EF8", JMC.EF8);
        noteValues.put("F0", JMC.F0);
        noteValues.put("F1", JMC.F1);
        noteValues.put("F2", JMC.F2);
        noteValues.put("F3", JMC.F3);
        noteValues.put("F4", JMC.F4);
        noteValues.put("F5", JMC.F5);
        noteValues.put("F6", JMC.F6);
        noteValues.put("F7", JMC.F7);
        noteValues.put("F8", JMC.F8);
        noteValues.put("FS0", JMC.FS0);
        noteValues.put("FS1", JMC.FS1);
        noteValues.put("FS2", JMC.FS2);
        noteValues.put("FS3", JMC.FS3);
        noteValues.put("FS4", JMC.FS4);
        noteValues.put("FS5", JMC.FS5);
        noteValues.put("FS6", JMC.FS6);
        noteValues.put("FS7", JMC.FS7);
        noteValues.put("FS8", JMC.FS8);
        noteValues.put("FF0", JMC.FF0);
        noteValues.put("FF1", JMC.FF1);
        noteValues.put("FF2", JMC.FF2);
        noteValues.put("FF3", JMC.FF3);
        noteValues.put("FF4", JMC.FF4);
        noteValues.put("FF5", JMC.FF5);
        noteValues.put("FF6", JMC.FF6);
        noteValues.put("FF7", JMC.FF7);
        noteValues.put("FF8", JMC.FF8);
        noteValues.put("G0", JMC.G0);
        noteValues.put("G1", JMC.G1);
        noteValues.put("G2", JMC.G2);
        noteValues.put("G3", JMC.G3);
        noteValues.put("G4", JMC.G4);
        noteValues.put("G5", JMC.G5);
        noteValues.put("G6", JMC.G6);
        noteValues.put("G7", JMC.G7);
        noteValues.put("G8", JMC.G8);
        noteValues.put("GS0", JMC.GS0);
        noteValues.put("GS1", JMC.GS1);
        noteValues.put("GS2", JMC.GS2);
        noteValues.put("GS3", JMC.GS3);
        noteValues.put("GS4", JMC.GS4);
        noteValues.put("GS5", JMC.GS5);
        noteValues.put("GS6", JMC.GS6);
        noteValues.put("GS7", JMC.GS7);
        noteValues.put("GS8", JMC.GS8);
        noteValues.put("GF0", JMC.GF0);
        noteValues.put("GF1", JMC.GF1);
        noteValues.put("GF2", JMC.GF2);
        noteValues.put("GF3", JMC.GF3);
        noteValues.put("GF4", JMC.GF4);
        noteValues.put("GF5", JMC.GF5);
        noteValues.put("GF6", JMC.GF6);
        noteValues.put("GF7", JMC.GF7);
        noteValues.put("GF8", JMC.GF8);


    }



    public static void createSong(String title)
    {
        Song song = new Song(title);
        songs.add(song);
    }

    public static void createNote(String tone, String length, String title) //at LEAST 1, no more than 2
    {

//        String tone = noteAttributes[0];
       // System.out.println(tone + length + title);
        int value = noteValues.get(tone);

        Note note;

//        if(noteAttributes.length > 1)
//        {
//            switch (noteAttributes[1])
//            {
//                case "1/1": note = new Note(value, JMC.WHOLE_NOTE);
//                            break;
//                case "1/2": note = new Note(value, JMC.HALF_NOTE);
//                            break;
//                case "1/4": note = new Note(value, JMC.QUARTER_NOTE);
//                            break;
//            }
//        }
//        else
//        {
//            note = new Note(value, JMC.WHOLE_NOTE);
//        }

        switch (title)
        {
            case "1/1": note = new Note(value, JMC.WHOLE_NOTE);
                break;
            case "1/2": note = new Note(value, JMC.HALF_NOTE);
                break;
            case "1/4": note = new Note(value, JMC.QUARTER_NOTE);
                break;
            case "1/8": note = new Note(value, JMC.EIGHTH_NOTE);
                        break;
            default: note = new Note(value, JMC.WHOLE_NOTE);
                    break;
        }

        try {
            songs.peek().addNoteToPhrase(title, note);
        }
        catch (PhraseNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


    }

    public static void setTempo(String tempo)
    {

        try
        {
            songs.peek().setTempo(Double.parseDouble(tempo));
        }
        catch (Exception e)
        {
            System.out.println("Invalid tempo value");
        }
    }

    public static void playSong()
    {
        songs.peek().play();
    }

    public static void exportMidi()
    {
        songs.peek().createFile();
    }

    public static void createPhrase(String title)
    {   
        System.out.println(title);
        songs.peek().addPhrase(new Phrase(title));
    }

    public static void displaySong()
    {
        songs.peek().display();
    }



}
