package springBoot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import springBoot.bean.User;


public interface UserService {
	//获取所有
	public List<User> getUserList();
	//根据id获取
	public User findUserById(long id);
	
	public void save(User user);
	
	public void edit(User user);
	
	public void delete(long id);
	
	/**
     * 分页查询所有数据
     * @param page //当前页
     * @param pageSize //每页记录数
     * @return
     */
	//Page<User> findAll(int page,int pageSize);
}
