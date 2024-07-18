package HaiDuong.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Schedule {


    @Scheduled(initialDelay = 5000, fixedDelay = 840000)
    public void schedule() {

        String urlString = "https://managementsystem-byje.onrender.com"; // Replace with your URL
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("GET request sent successfully");
            } else {
                System.out.println("GET request failed with response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("EVNICT "+now.format(formatter1));
    }
}
