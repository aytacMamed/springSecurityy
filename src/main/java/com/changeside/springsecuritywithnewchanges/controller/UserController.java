package com.changeside.springsecuritywithnewchanges.controller;

import com.changeside.springsecuritywithnewchanges.dto.RegisterRequest;
import com.changeside.springsecuritywithnewchanges.dto.UserPageResponse;
import com.changeside.springsecuritywithnewchanges.dto.UserRequestResponse;
import com.changeside.springsecuritywithnewchanges.entity.User;
import com.changeside.springsecuritywithnewchanges.manager.UserServiceImpl;
import com.changeside.springsecuritywithnewchanges.services.UserService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }




    @GetMapping
    public UserPageResponse getAll(@RequestParam(value = "page") int page, @RequestParam(value = "count") int count) {
        logger.info("getAll request accepted");
        return userService.getAll(page,count);
    }

    @GetMapping("/{id}")
    public UserRequestResponse getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveUser(@RequestBody @Valid UserRequestResponse user) {
        User user1 = userService.saveUser(user);
        System.out.println(user1);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PostMapping("/register")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void register(@RequestBody @Valid RegisterRequest request) {
        userService.register(request);
    }
}