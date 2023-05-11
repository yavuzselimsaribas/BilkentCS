
import java.util.ArrayList;
public class Playlist{
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;
    public Playlist()
    {

    }
    public Playlist(String aName,String aCreator,String aGenre,ArrayList<Song> aSongs){
        this.name = aName;
        this.creator = aCreator;
        this.genre = aGenre;
        this.songs = aSongs;                
    }   
    //getters
    public String getName(){return this.name;}
    public String getCreator(){return this.creator;}
    public String getGenre(){return this.genre;}
    public ArrayList<Song> geArrayList(){return this.songs;}
    //setters
    public void setName(String aName){this.name = aName;}
    public void setCreator(String aCreator){this.creator = aCreator;}
    public void setGenre(String aGenre){this.genre= aGenre;}
    public void setSongs(ArrayList<Song> aSongs){this.songs=aSongs;}

    public void addSong(Song aSong){this.songs.add(aSong);}
    public boolean songExists(Song aSong)
    {
        if(this.songs.contains(aSong)){
            return true;
        }else{return false;}
    }
    public void removeSong(int i){this.songs.remove(i);}


    public String toString()
    {
        return "\n"+
        "-".repeat(40)+"\n"+
        "Playlist Name: "+ this.name+"\n"+
        "Creator Name: "+this.creator+"\n"+
        "Genre: "+this.genre+"\n"+
        "-".repeat(40)+"\n"+this.songs.toString().replaceAll("[^a-zA-Z0-9:\\s-*]", "")+"\n";
    
    
    }


}
