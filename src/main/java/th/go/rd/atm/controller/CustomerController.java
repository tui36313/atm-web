package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class CustomerController {

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        ArrayList<String> customers = new ArrayList<>(); // สร้างตัวแปล ArrayList : customers
        customers.add("Peter");   // เพิ่มข้อมูลใน customers
        customers.add("Nancy");
        customers.add("Rick");
        model.addAttribute("allCustomers", customers); //ส่งค่า ArrayList : customers ในตัวแปล allCustomers ผ่าน Model
        return "customer";  // customer.html
    }
}