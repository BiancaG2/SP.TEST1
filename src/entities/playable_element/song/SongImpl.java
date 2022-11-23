package entities.playable_element.song;

import entities.base.base_playable_element.BasePlayableElementImpl;

public class SongImpl extends BasePlayableElementImpl implements Song {
    public SongImpl(String title, int sizeInKB) {
        super(title, sizeInKB);
    }
}
