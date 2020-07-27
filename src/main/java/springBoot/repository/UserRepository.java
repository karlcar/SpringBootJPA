package springBoot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springBoot.bean.User;
import springBoot.bean.UserQuery;

public interface UserRepository extends JpaRepository<User,Long>{
	
    User findById(long id);
    void deleteById(Long id);
    
    User findByUserName(String username);
    
//    @Query("select t from user t where t.userName like ?1")
//    List<User> findByQuery(String userName);
    
    
}
