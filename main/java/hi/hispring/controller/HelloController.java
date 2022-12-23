package hi.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller// 생략시 hello페이지 맵핑이 되지 않는다.
public class HelloController {

    private  final static String main = "index";
    private final static String err = "error";

    private final static String account = "account";
    private final static String slimeview = "slimState";


    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hi");
        return "hello";

    }

    @RequestMapping("/{url}")
    public String index(@PathVariable int url,Model model){
        int urlFix = url;
        model.addAttribute("msg","이 주소는 없는 주소입니다." + urlFix);
        return main;
    }

    @RequestMapping(value = "account",method = RequestMethod.POST)
    public String account(@RequestParam("id1") String id, Model model){
        String abc = id +"안녕하세여";

        model.addAttribute("msg", "hi"+id+"!!");
        model.addAttribute("msg",abc);
        model.addAttribute("id2",id);

        return account;
    }



}
