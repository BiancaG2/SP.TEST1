package entities.playlist;

import entities.base.base_playable_element.BasePlayableElement;
import entities.base.playlist_element.PlaylistElement;

import java.util.List;

public interface Playlist extends PlaylistElement {
    List<PlaylistElement> getElements();
    void add(PlaylistElement element);
    List<BasePlayableElement> getPlayableElements();
}
