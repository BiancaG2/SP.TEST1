package entities.base.base_playable_element;

import entities.base.playlist_element.PlaylistElementImpl;

public abstract class BasePlayableElementImpl extends PlaylistElementImpl implements BasePlayableElement {
    public BasePlayableElementImpl(String title, int sizeInKB) {
        super(title, sizeInKB);
    }
}
