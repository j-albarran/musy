import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Write;

import java.util.*;


public class Song  {

    private int size;
    private Score song;
    private Part part = new Part("whole song");

    Song(String title)
    {
        size = 0;
        this.song = new Score(title);
        song.addPart(part);
    }

    Song()
    {
        size = 0;
        song = new Score();


    }

    public void addPhrase(Phrase phrase)
    {
        song.getPart("whole song").appendPhrase(phrase);
    }

    public void addNoteToPhrase(String title, Note note) throws PhraseNotFoundException
    {

        boolean found = false;
        
        for(int i = 0; i < song.getPart("whole song").getPhraseList().size(); i++)
        {   
            
            if(song.getPart("whole song").getPhrase(i).getTitle().replace(" copy", "").equalsIgnoreCase(title))
            {
                song.getPart("whole song").getPhrase(i).add(note);
                found = true;
            }
        }

        if(!found)
        {
            throw new PhraseNotFoundException("Phrase: "+title+" does not exist");
        }
    }

    public void setTempo(double tempo)
    {
        song.setTempo(tempo);
    }

    public void setTitle(String title)
    {
        song.setTitle(title);
    }

    public String getTitle()
    {
        return song.getTitle();
    }

    public void play()
    {
        Play.midi(this.song);
    }

    public void createFile()
    {
        Write.midi(song, this.getTitle());
    }



}
