package com.example.tut05.controller;

import com.example.tut05.dto.UsersDto;
import com.example.tut05.mappers.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired // 자동으로 유저 매퍼를 가져오는 것
    UsersMapper um;

    @GetMapping("")
    public String getUsers(Model model) {
        List<UsersDto> list = um.getUsers();
//        System.out.println(list);
//        System.out.println(list.get(0).getEmail()); 값 나오는지확인
        model.addAttribute("userList", list);
        return "users/list";
    }

    @GetMapping("/insert")
    public String getInsert() {
        return "users/insert";
    }

//    @PostMapping("/insert")
//    public void setInsert(@ModelAttribute UsersDto usersDto) {
//        System.out.println(usersDto);
//    }

        @PostMapping("/insert")
        public String setInsert(@ModelAttribute UsersDto usersDto) {
            um.setInsert(usersDto);

            //값 저장 후 페이지 이동 redirect
            return "redirect:/users";
        }
}
