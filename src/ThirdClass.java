import java.io.*;


public class ThirdClass {
    public static void main(String[] args) throws IOException,InterruptedIOException {
        FileReader fileReader = new FileReader("text_files/book.txt");
      BufferedReader reader = new BufferedReader(fileReader);

        System.out.println(reader.readLine());



    }
}




