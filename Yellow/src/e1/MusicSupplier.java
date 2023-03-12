package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MusicSupplier {

    private ArrayList<Track> tracks;

    public MusicSupplier(int len) {
        this.tracks = new ArrayList<>(len);
    }

    public MusicSupplier(List<Track> tracks) {
        this.tracks = new ArrayList<>(tracks);
    }

    public Track getTrackByName(String name) throws Exception {
        for (Track track : tracks) {
            if (Objects.equals(track.getName(), name)) {
                return track;
            }
        }
        throw new Exception("e1.Track not found");
    }

    public List<Track> getAllTracksBelowPrice(double price) throws Exception {
        int i = 0;
        List<Track> trackList = new ArrayList<>(i);
        for (Track track : tracks) {
            if (track.getPrice() < price) {
               List<Track> tmp =trackList;
               trackList=new ArrayList<>(++i);
               trackList.addAll(tmp);
               trackList.add(track);
            }
        }
        if (i == 0) {
            throw new Exception("No tracks below " + price);
        }
        return trackList;
    }

    public List<Track> getAllBandTracks(String bandName) throws Exception {
        int i = 0;
        List<Track> trackList = new ArrayList<>(i);
        for (Track track : tracks) {
            if (Objects.equals(track.getBandName(), bandName)) {
                List<Track>tmp=new ArrayList<>(trackList);
                trackList = new ArrayList<>(++i);
                trackList.addAll(tmp);
                trackList.add(track);
            }
        }
        if (i == 0) {
            throw new Exception("No tracks found by this band");
        }
        return trackList;
    }

    public int getTotalTrackLength(String bandName) {
        int i=0;
        try {
            for (Track track : getAllBandTracks(bandName)){
                i+=track.getLengthInSeconds();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return i;
    }
}
