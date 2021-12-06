package az.itcity.mailmanagementsystem.controller;

import az.itcity.mailmanagementsystem.entity.User;
import az.itcity.mailmanagementsystem.repository.jpa.MailRepository;
import az.itcity.mailmanagementsystem.repository.jpa.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {
    private MailRepository mailRepository;
    private UserRepository userRepository;

    public UserController(MailRepository mailRepository, UserRepository userRepository) {
        this.mailRepository = mailRepository;
        this.userRepository = userRepository;
    }

    @GetMapping
    public ModelAndView viewUsers() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user-detail");
        mav.addObject("user",userRepository.findAll());
        mav.addObject("mail",mailRepository.findAll());
        return mav;
    }

    @GetMapping("/{id}")
    public ModelAndView viewEmployeeById(@PathVariable(name = "id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-detail");
        try {
            Optional<User> optionalUser = userRepository.findById(id);
            optionalUser.ifPresent(user -> modelAndView.addObject("user", user));
        } catch (ResourceNotFound e) {
            System.out.println("user tapilmadi " + e.getMessage());
        }
        return modelAndView;
    }

    @GetMapping("/add")
    public String registerUser() {
        return "register";
    }

}
