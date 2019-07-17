package springBoot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springBoot.bean.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
    User findById(long id);
    void deleteById(Long id);
    
    
    //List<User> findAll(Specification<User> spc, Pageable pageable);
}
