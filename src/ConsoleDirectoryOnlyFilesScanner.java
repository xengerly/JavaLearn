import jdk.jfr.Unsigned;

import java.io.File;

public class ConsoleDirectoryOnlyFilesScanner implements  DirectoryScanner{

    @Override
    public void printSDirectoryFiles(File[] files) {
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }

    @Override
    public File[] getDirectoryFiles(String dirPath) {
        File directory = new File(dirPath);
        File[] filesAndDirs = directory.listFiles();
        int fileCount = 0;
        for (int i = 0; i < filesAndDirs.length; i++) {
            if (filesAndDirs[i].isFile()){
                fileCount++;
            }
        }
        File[] filesOnly = new File[fileCount];
        int lastIndex = 0;
        for (int i = 0; i < filesAndDirs.length; i++) {
            if (filesAndDirs[i].isFile()){
                filesOnly[lastIndex] = filesAndDirs[i];
                lastIndex++;
            }
        }
        return filesOnly;
    }
}
