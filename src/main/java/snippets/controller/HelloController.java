package snippets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(@RequestParam(defaultValue = "world", value="name") String userName, Model model) {
        model.addAttribute("message", "Hello from the controller， " + userName);
        return "resultPage";
    }
}
