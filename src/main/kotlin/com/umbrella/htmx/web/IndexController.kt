package com.umbrella.htmx.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {

    @GetMapping("/")
    fun index(): String =
        "index/index"


    @GetMapping("/hello")
    fun hello(): String {
        return "index/hello"
    }

}