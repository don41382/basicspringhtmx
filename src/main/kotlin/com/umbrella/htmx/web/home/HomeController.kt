package com.umbrella.htmx.web.home

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/home")
class HomeController {

    @GetMapping("/hello")
    fun hello(): String {
        return "home/hello"
    }

}