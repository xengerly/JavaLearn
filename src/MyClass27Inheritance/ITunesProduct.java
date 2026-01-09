package MyClass27Inheritance;

public class ITunesProduct {
    String artistName;
    String previewUrl;
    String collectionName;
    String releaseDate;


    void printIntroducePreview(){
        System.out.println(this.artistName + "-" + this.collectionName);
        System.out.println("url to preview " + this. previewUrl);
    }

}
