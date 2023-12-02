package com.umbrella.htmx.web.counter

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/counter")
class CounterController {

    @GetMapping("/count")
    fun count(model: Model, request: HttpServletRequest, response: HttpServletResponse): String {
        val count = request.getHeader("query_count")?.let { it.toInt() } ?: 0;
        val newCount = count + 1

        // set count for template
        model.addAttribute("count", newCount)
        // set count for history
        response.addHeader("hx-push-url", "/counter?count=${newCount}")

        return "counter/countMessage"
    }

}