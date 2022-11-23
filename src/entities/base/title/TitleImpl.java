package entities.base.title;

public abstract class TitleImpl implements Title {
    protected final String title;

    public TitleImpl(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
