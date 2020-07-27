package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot.bean.User;
@RestController
@RequestMapping("/user")
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	@RequestMapping("/getuser/{id}")
	public Object getById(@PathVariable(value="id") long id) {
//		System.out.println(id);
		User user = new User();
		user.setId(id);
		user.setUserName("kingdom");
		System.out.println(id);
		return user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
