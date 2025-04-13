package pl.edu.pwr.ztw.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// mvn clean install
// mvn spring-boot:run
// this is how to setup the app
@SpringBootApplication
// no other declarations needed view API docs by http://localhost:8080/swagger-ui/index.html
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
