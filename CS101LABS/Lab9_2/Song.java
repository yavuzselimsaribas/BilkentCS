public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;
    public Song(String aTitle,String anAlbum,int songDuration,int forTimesPlayed)
    {
        title = aTitle;
        album = anAlbum;
        duration = songDuration;
        timesPlayed = forTimesPlayed;


    }

    //getters
    public String getTitle(){return this.title;}
    public String getArtist(){return this.artist;}
    public String getAlbum(){return this.album;}
    public int getDuration(){return this.duration;}
    public int gettimesPlayed(){return this.timesPlayed;}
    //setters
    public void setTitle(String newTitle){this.title=newTitle;}
    public void setArtist(String newArtist){this.artist = newArtist;}
    public void setAlbum(String newAlbum){this.album = newAlbum;}
    public void setDuration(int newDuration){this.duration=newDuration;}
    public void setTimePlayed(int newTimes){this.timesPlayed = newTimes;}
    //other methods
    public int compareTo(Song aSong)
    {
        if(this.duration == aSong.getDuration()){ return 0;}
        else if(this.duration > aSong.getDuration()){return 1;}
        else{return -1;}
    }
    public String toString(){
        return "*".repeat(30)+"\n"+
        "Song Name: "+this.title +"\n"+
        "Artist Name: "+this.artist+"\n"+
        "Album Name: "+this.album+ "\n"+
        "Duration: "+this.duration+"\n"+
        "Times Played: "+this.timesPlayed+"\n";
    
    }
    
}
