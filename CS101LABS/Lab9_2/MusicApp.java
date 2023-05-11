
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class MusicApp {
    static ArrayList<Playlist> playlists = new ArrayList<>();
    //static int indexCount = 0;
    //static int playlistCount = 1;
    //static int songCount = 1;

    
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        boolean done = false;
        while(!done){
            System.out.printf("-".repeat(56)+"\n"+"Welcome to Music App! Get Ready to create your playlist!"+"\n"+
        "-".repeat(56)+"\n"+"1 - Create a new Playlist"+"\n"+"2 - Display the Playlist"+"\n"+
        "3 - Sort the Playlist"+"\n"+"4 - Remove song by index from the current Playlist"+"\n"+"5 - Display all Playlists"+"\n"+
        "6 - Exit"+"\n"+"\n"+"*".repeat(25)+"\n");
        
        int decision = input1.nextInt();
        if(decision == 1){
            
            ArrayList<Song> indexCount = new ArrayList<>();
            Playlist playlistCount = new Playlist();
            playlists.add(playlistCount);
            System.out.println("How many songs do you want to add to playlist?:");
            int choice = input1.nextInt();
            for(int i=1; i<=choice; i++)
            {
                
                Song songCount = new Song(null, null, 0, 0);
                System.out.println("Enter artist name for Song"+i+": ");
                input1.nextLine();
                String nameArtist = input1.nextLine();
                songCount.setArtist(nameArtist);
                System.out.println("Enter album name for Song"+i+": ");
                String nameAlbum = input1.nextLine();
                songCount.setAlbum(nameAlbum);
                System.out.println("Enter song name for Song"+i+": ");
                String nameSong = input1.nextLine();
                songCount.setTitle(nameSong);
                System.out.println("Enter song duration for Song"+i+": ");
                int songDuration = input1.nextInt();
                songCount.setDuration(songDuration);
                System.out.println("Enter the times song has been played for Song"+i+": ");
                int timesPlayed = input1.nextInt();
                songCount.setTimePlayed(timesPlayed);
                indexCount.add(songCount);
                //MusicApp.songCount++;

            }
            
            System.out.println("Enter playlist name: ");
            input1.nextLine();
            String playlistName = input1.nextLine();
            playlistCount.setSongs(indexCount);
            playlistCount.setName(playlistName);
            System.out.println("Enter creator of playlist: ");
            String creatorName = input1.nextLine();
            playlistCount.setCreator(creatorName);
            System.out.printf("0-Country \n1-Electronic \n2-Pop Music \n3-Rock Music\n4-Jazz \n5-Classical \n Select genre of playlist: ");
            String[] genres = {"Country","Electronic","Pop Music","Rock Music","Jazz","Classical"};
            int aGenre = input1.nextInt();
            playlistCount.setGenre(genres[aGenre]);
            playlists.add(playlistCount);
            

            


            


        }
        if(decision == 2){
            System.out.println("Displaying the playlist: "+playlists.get(playlists.size()-1).getName());
            System.out.println(playlists.get(playlists.size()-1));
            
        }
        if(decision == 3){
            Collections.sort(playlists.get(playlists.size()-1).geArrayList(),Collections.reverseOrder());       

        }
        if(decision == 4){
            System.out.println("Which song do you want to remove? (Remove by index)");
            int removedIndex = input1.nextInt();
            playlists.get(playlists.size()-1).removeSong(removedIndex);
        }
        if(decision == 5){
            for(int i = 0; i<playlists.size(); i+=2){
                System.out.println(playlists.get(i));
            }
        }
        if(decision == 6){
            done = true;

        }
        

        }

        input1.close();        
        
        
        
        
        


    }
}
    

