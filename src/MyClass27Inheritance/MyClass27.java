package MyClass27Inheritance;

public class MyClass27 {
    public static void main(String[] args) {
        ITunesSong song = new ITunesSong();
        song.trackName = "Billie Jean";
        song.trackCensoredName = "***** ***";
        song.artistName = "Michael Jackson";
        song.previewUrl = "http://itunes.com?billiejean.mp3";
        song.collectionName = "Best of MJ";
        song.printIntroducePreview();
        song.releaseDate = "2020";


        ITunesMovie movie = new ITunesMovie();
        movie.shortDescription = "the best movie ever";
        movie.artistName = "Brad Pitt";
        movie.previewUrl = "http://itunes.com/bradpitt.mp4";
        movie.collectionName = "Best of BP";
        song.releaseDate = "2022";
        movie.printIntroducePreview();

        
    }
}
