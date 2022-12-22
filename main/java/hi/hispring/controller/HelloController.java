package hi.hispring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hi");
        return "hello";
    }
}
