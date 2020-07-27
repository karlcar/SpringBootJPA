 package springBoot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import springBoot.bean.User;
import springBoot.bean.UserQuery;
import springBoot.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }

//	@Override
//	public List<User> findByUserName(String userName) {
//		return userRepository.findByQuery(userName);
//	}

	@Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
    
    @Transactional
    @Override
    public void edit(User user) {
        userRepository.save(user);
    }
    
    @Transactional
    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    
    
}
