package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BellSchedule {
    @GetMapping("/bellschedule")
    public String BellSchedule() {
        return "bellschedule";
    }
}