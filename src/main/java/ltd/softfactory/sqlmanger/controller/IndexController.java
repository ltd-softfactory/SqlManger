package ltd.softfactory.sqlmanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @GetMapping("/")
    public String indexAction(HttpServletRequest req){
        req.setAttribute("aa","11");
        return "index";
    }

}
