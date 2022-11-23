import entities.media_player.MediaPlayer;
import entities.media_player.MediaPlayerImpl;
import entities.playable_element.gif.GIFImpl;
import entities.playable_element.song.SongImpl;
import entities.playable_element.video.VideoImpl;
import entities.playlist.Playlist;
import entities.playlist.PlaylistImpl;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl("Winamp");
        Playlist playlist = new PlaylistImpl("Chill");

        playlist.add(new SongImpl("BudaBar", 3000));
        playlist.add(new VideoImpl("Waves in Caraibe", 20000));
        playlist.add(new SongImpl("Simple things", 4000));
        playlist.add(new GIFImpl("sunglasses", 500));

        mediaPlayer.add(playlist);

        System.out.println("Dimensiunea playlist-ului curent este: " + mediaPlayer.getCurrentPlaylistSize() + " KB");
        mediaPlayer.printSizeOfPlayableElements();
    }
}