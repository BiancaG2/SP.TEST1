package entities.base.title_and_size;

import entities.base.title.TitleImpl;

public abstract class TitleAndSizeImpl extends TitleImpl implements TitleAndSize {
    protected final int sizeInKB;

    public TitleAndSizeImpl(String title, int sizeInKB) {
        super(title);
        this.sizeInKB = sizeInKB;
    }

    @Override
    public int getSizeInKB() {
        return sizeInKB;
    }
}
