package entities.media_player;

import entities.base.title.Title;
import entities.playlist.Playlist;

import java.util.List;

public interface MediaPlayer extends Title {
    List<Playlist> getPlaylistList();
    void add(Playlist playlist);
    int getCurrentPlaylistSize();
    void printSizeOfPlayableElements();
}
