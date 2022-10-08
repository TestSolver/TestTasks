import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (Objects.equals(scan.next(), "next")) {
                try {
                    URL url = new URL("https://api.kanye.rest/text");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.connect();

                    Scanner scanner = new Scanner(url.openStream());
                    String inline = scanner.nextLine() + "\n";
                    scanner.close();
                    File file = new File("quotes.txt");
                    FileOutputStream writer = new FileOutputStream(file, true);

                    writer.write(inline.getBytes());
                    System.out.println(inline);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else break;
        }
    }
}