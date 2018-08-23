package sibintek.drondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import sibintek.drondemo.entity.UserData;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class DronDemoApplication implements CommandLineRunner {
    private static boolean inHelmet = false;

    @Autowired
    SimpMessagingTemplate template;

    @Override
    public void run(String... args) throws Exception {
        new Thread(() -> new Timer()
                .schedule(new TimerTask() {

                    @Override
                    public void run() {
                        inHelmet = !inHelmet;

                        template.convertAndSend("/topic/message",
                                new UserData()
                                        .setName("Антон")
                                        .setLastname("Куликов")
                                        .setMidname("Сергеевич")
                                        .setCompany("СИБИНТЕК")
                                        .setPost("Разработчик")
                                        .setInHelmet(inHelmet));
                    }
                }, 0, 2000))
                .start();
    }

    public static void main(String[] args) {
        SpringApplication.run(DronDemoApplication.class, args);
    }
}
