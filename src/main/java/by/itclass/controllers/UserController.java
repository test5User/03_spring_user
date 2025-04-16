package by.itclass.controllers;

import by.itclass.model.entities.User;
import by.itclass.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static by.itclass.constants.AppConstants.*;

@Controller
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String root() {
        return INDEX_PAGE;
    }

    @GetMapping(ALL_USERS_URL)
    public String all(Model model) {
        var users = service.getAllUsers();
        model.addAttribute(USERS_LIST_ATTR, users);
        return USERS_PAGE;
    }

    @GetMapping(DEL_USER_URL)
    public String delete(@RequestParam(name = "id") int id) {
        service.deleteById(id);
        return "redirect:" + ALL_USERS_URL;
    }

    @GetMapping(ADD_USER_URL)
    public ModelAndView add() {
        return new ModelAndView(ADD_USER_PAGE, USER_ATTR, new User());
    }

    @PostMapping(SAVE_USER_URL)
    public String save(@ModelAttribute(name = USER_ATTR) User user) {
        service.addUser(user);
        return "redirect:" + ALL_USERS_URL;
    }

    @GetMapping(UPD_USER_URL + "/{param}")
    public ModelAndView upd(@PathVariable(name = "param") int id) {
        return new ModelAndView(UPD_USER_PAGE, USER_ATTR, service.getById(id));
    }

    @PostMapping(SAVE_UPD_USER_URL)
    public String saveUpd(@ModelAttribute(name = USER_ATTR) User user) {
        service.update(user);
        return "redirect:" + ALL_USERS_URL;
    }
}
