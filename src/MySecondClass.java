import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class MySecondClass {
    public static void main(String[] args) throws IOException {
      String sourceCode = downloadWebPage("https://ya.ru");
       writeToFile(
               sourceCode.replaceAll("не", "")
       );
    }
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        urlConnection.setReadTimeout(5000);
        urlConnection.setConnectTimeout(5000);
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();

    }

    public static void writeToFile(String str) throws IOException{
        String fileName = "C:/Users/Nikita/Desktop/Street.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);

        writer.close();
    }

}










