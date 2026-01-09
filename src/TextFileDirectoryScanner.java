import java.io.*;

public class TextFileDirectoryScanner implements DirectoryScanner {
    @Override
    public void printSDirectoryFiles(File[] files) {
        try {
            FileWriter fileWriter = new FileWriter("dir.txx");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < files.length; i++) {
                bufferedWriter.write(files[i].getName() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
           e.printStackTrace();
        }

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }

}
