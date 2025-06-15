package com.sparta.awstest.domain.user.controller.view;

import com.sparta.awstest.domain.user.dto.response.CreateUserResponseDto;
import com.sparta.awstest.domain.user.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserViewController {

    private final UserService userService;

    @GetMapping("/users")
    public String showUser(Model model) {
        List<CreateUserResponseDto> all = userService.findAll();
        model.addAttribute("users", all);
        return "user/list";
    }
}
