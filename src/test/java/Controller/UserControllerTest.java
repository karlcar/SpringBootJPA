package Controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springBoot.Application;
import springBoot.bean.User;
import springBoot.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserControllerTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testList() {
		List<User> findAll = userRepository.findAll();
		System.out.println(findAll);
	}

	@Test
	public void testAdd() {
		User user = new User();
		user.setAge(57);
		user.setPassword("3tt4");
		user.setUserName("高少侠");
		
		User save = userRepository.save(user);
		System.out.println(save);
	}

	@Test
	public void testEdit() {
		User user = new User();
		user.setAge(107);
		user.setPassword("tianaong");
		user.setUserName("SkyF222");
		User save = userRepository.save(user);
		System.out.println(save);
		user.setPassword("tiankong111rr");
		User update = userRepository.save(user);
		System.out.println(update);
	}

	@Test
	public void testDelete() {
		User user = new User();
		user.setAge(67);
		user.setPassword("asddddd");
		user.setUserName("TestP");
		User save = userRepository.save(user);
		System.out.println(save);
		userRepository.deleteById(save.getId());
		System.out.println("delete success");
	}
	
	
}
