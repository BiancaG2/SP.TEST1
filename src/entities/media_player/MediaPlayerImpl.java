package entities.media_player;

import entities.base.base_playable_element.BasePlayableElement;
import entities.base.title.TitleImpl;
import entities.playable_element.song.SongImpl;
import entities.playable_element.video.VideoImpl;
import entities.playlist.Playlist;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerImpl extends TitleImpl implements MediaPlayer {
    protected final List<Playlist> playlistList;

    public MediaPlayerImpl(String title, Playlist... playlists) {
        super(title);
        playlistList = new ArrayList<>(List.of(playlists));
    }

    public MediaPlayerImpl(String title, List<Playlist> playlistList) {
        super(title);
        this.playlistList = new ArrayList<>(playlistList);
    }

    @Override
    public List<Playlist> getPlaylistList() {
        return playlistList;
    }

    @Override
    public void add(Playlist playlist) {
        playlistList.add(playlist);
    }

    @Override
    public int getCurrentPlaylistSize() {
        try {
            return playlistList.get(0).getSizeInKB();
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }

    @Override
    public void printSizeOfPlayableElements() {
        List<BasePlayableElement> playableElements = playlistList.get(0).getPlayableElements();
        int songs = 0;
        int gifs = 0;
        int videos = 0;
        int elemSize = 0;
        for (BasePlayableElement elem: playableElements) {
            elemSize = elem.getSizeInKB();
            if (elem instanceof SongImpl) {
                songs += elemSize;
            } else if (elem instanceof VideoImpl) {
                videos += elemSize;
            } else {
                gifs += elemSize;
            }
        }

        System.out.println("Videos size: " + videos + "\nSongs size: " + songs + "\nGIFs size: " + gifs);
    }

}
