package springBoot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String password;
    //name="username" 设置userName属性映射到数据库的username字段，而不是默认的user_name
    @Column(name = "username", nullable = true, unique = true)
    private String userName;

    @Column(nullable = true, unique = true)
    private int age;

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public User(Long id, String password, String userName, int age) {
		this.id = id;
		this.password = password;
		this.userName = userName;
		this.age = age;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", userName=" + userName + ", age=" + age + "]";
	}
    
}
