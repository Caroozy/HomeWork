package e1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        MusicSupplier m1=new MusicSupplier(2);
        List<Track>tracks=new ArrayList<>(2);
        tracks.add(new Track("Candy Paint", "Post Malone",20.11,120));
        tracks.add(new Track("Congratulation","Post Malone",19.99,100));
        m1=new MusicSupplier(tracks);
        try {
            for (Track track:m1.getAllBandTracks("Post Malone")){
                System.out.println(track);
            }
            System.out.println("Tracks below the price: "+19+'\n'+m1.getAllTracksBelowPrice(19));
            System.out.println("total Track length by post malone: "+'\n'+m1.getTotalTrackLength("Post Malone"));
            System.out.println(m1.getTrackByName("Candy Paint"));
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }
}