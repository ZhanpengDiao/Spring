package com.diao.springmvc;// controller class

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/") // add request mapping to the controller
    public String showPage() {
        return "main-menu"; // prefix/fname.suffix
    }

}
