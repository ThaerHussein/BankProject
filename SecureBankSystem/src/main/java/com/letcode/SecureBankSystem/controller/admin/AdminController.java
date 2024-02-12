package com.letcode.SecureBankSystem.controller.admin;

import com.letcode.SecureBankSystem.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin-dashboard")
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all-users-with-strong-password")
    public ResponseEntity<List<String>> getAllUsersWithStrongPassword(){
        List<String> allUsersWithStrongPassword= userService.getAllUsersWithStrongPassword();

        return ResponseEntity.ok(allUsersWithStrongPassword);
    }
}
