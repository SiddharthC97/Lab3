
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Part1 {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();

        String[] wordArray = contents.trim().split("\\s+");
        int wordCount = wordArray.length;

        urlScanner.close();
        contents += wordCount;
        return contents;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
             System.out.println(Part1.urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }

}
