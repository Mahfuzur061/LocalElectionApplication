package Controlller;

import Service.ICandidateService;
import Service.IUserService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    ICandidateService ICandidateService;
    @Autowired
    IUserService iUserService;



    @GetMapping("/login")
    public String login(){

        return login();

    }
    @GetMapping("/")
    public String Hello(@CurrentSecurityContext(expression="authentication.name") String currentUser, Model model) {
        List<User> candidateList = iUserService.fetchAllUser();
        model.addAttribute("iUserService", iUserService);

        System.out.println("currently logged in : "+ currentUser);
        return "index";
    }
    @GetMapping("/profile")
    public String getProfile(){
        return "profile/profile";
    }

}
