package com.umbrella.htmx.web.home

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/home")
class HomeController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("text", "Sorry, you can't click me again.")
        model.addAttribute("disable", true)
        return "home/hello_button"
    }

}