package springBoot.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import springBoot.bean.User;
import springBoot.bean.UserQuery;
import springBoot.service.UserService;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/")
    public String index(){
        return "redirect:/list"; 
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<User> users = userService.getUserList();
        model.addAttribute("users",users);
        return "user/list"; 
    } 

    @RequestMapping("/toAdd")
    public String toadd(User user){
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(@Valid User user){
        userService.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "user/userEdit"; 
    }
    @RequestMapping("/edit")
    public String edit(User user){
        userService.edit(user);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        userService.delete(id);
        return "redirect:/list";
    }
    

    
    
}
