package entities.playable_element.video;

import entities.base.base_playable_element.BasePlayableElementImpl;

public class VideoImpl extends BasePlayableElementImpl implements Video {
    public VideoImpl(String title, int sizeInKB) {
        super(title, sizeInKB);
    }
}
