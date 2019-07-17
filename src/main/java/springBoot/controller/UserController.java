package springBoot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBoot.bean.User;
import springBoot.service.UserService;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String index(){
        return "redirect:/list"; //重定向到 /list
    }
    
//    @GetMapping("/query")
//    public  Page<User> findByPage(Integer page , HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin","*"); //解决跨域请求
//        if(page==null||page<=0){
//            page=0;
//        }else{
//            page-=1;
//        }
//        return  userService.findAll(page,5);
//    }
   


    @GetMapping("/list")
    public String lsit(Model model){
        List<User> users = userService.getUserList();
        model.addAttribute("users",users);
        return "user/list"; 
    }

    @RequestMapping("/toAdd")
    public String toadd(User user){
        return "user/userAdd";//跳转到userAdd.html
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.save(user);
        return "redirect:/list";//添加完成，请求重定向到/list
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "user/userEdit"; //跳转到userEdit.html页面
    }
    @PutMapping("/edit")
    public String edit(User user){
        userService.edit(user);
        return "redirect:/list";//获取列表数据并显示
    }

    @DeleteMapping("/delete")
    public String edit(Long id){
        userService.delete(id);
        return "redirect:/list";
    }
}
