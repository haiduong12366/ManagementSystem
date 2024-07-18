package HaiDuong.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Schedule {


    @Scheduled(initialDelay = 5000, fixedDelay = 840000)
    public void schedule() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("EVNICT "+now.format(formatter1));

    }
}
