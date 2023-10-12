package filatov.wrk.pet.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableKafka
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		if (args.length > 0){
			System.out.println("Hello " + args[0] + "!");
		}
	}

	@KafkaListener(topics="msg", groupId = "app")
	public void msgListener(String msg){
		System.out.println("Сообщение: " + msg + " обработано");
	}
}
