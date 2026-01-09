import java.io.File;

public interface DirectoryScanner {
    void printSDirectoryFiles(File[] files);

    default File[] getDirectoryFiles(String dirPath) {
        File directory = new File(dirPath);
        return directory.listFiles();
    }
}


