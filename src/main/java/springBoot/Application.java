package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
//	@RequestMapping("/getuser/{id}")
//	public void getById(@PathVariable(value="id") int id) {
//		System.out.println(id);
//	}
//	@RequestMapping("/saveuser")
//	public void getById(User user) {
//		System.out.println(id);
//	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
