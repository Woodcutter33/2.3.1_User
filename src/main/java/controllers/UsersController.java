package controllers;

import Service.UserService;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/users")
    public String index(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "users";
    }

//    @GetMapping("/{id}")
//    public String showUser(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", serviceImpl.getUser(id));
//        return "show";
//    }

    @GetMapping("/edit/{id}")
    public String editUser(Model model, @PathVariable("id") int id) {
        model.addAttribute("editUser", userService.editUser(id));
        return "redirect:/users";
    }

    // добавить метод в сервис для показа человека
    @GetMapping("/{id}")
    public String getUser(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.getUser(id));
        return "user";
    }

    @GetMapping("/new")
    public String neweUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "redirect:/users";
    }

    @GetMapping("/update")
    public String index(Model model, @PathVariable("id") int id) {
        userService.deleteUser(id);
        return "users";
    }


}

