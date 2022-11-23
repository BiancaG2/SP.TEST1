package entities.base.playlist_element;

import entities.base.title_and_size.TitleAndSizeImpl;

public abstract class PlaylistElementImpl extends TitleAndSizeImpl implements PlaylistElement {
    public PlaylistElementImpl(String title, int sizeInKB) {
        super(title, sizeInKB);
    }
}
