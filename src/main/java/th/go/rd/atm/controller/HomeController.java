package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("greeting", "Sawaddee!!!"); //ส่งข้อมูลในตัวแปล greeting ผ่าน Model
        return "home"; //home.html
    }
}