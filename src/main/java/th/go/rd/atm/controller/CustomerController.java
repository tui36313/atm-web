package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class CustomerController {

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        ArrayList<Customer> customers = new ArrayList<>(); // สร้างตัวแปล object : Customers
        customers.add(new Customer(1,"Peter","1234"));   // เพิ่มข้อมูลใน Object Customers
        customers.add(new Customer(2,"Nancy","2345"));
        customers.add(new Customer(3,"Rick","3456"));
        model.addAttribute("allCustomers", customers); //ส่งค่า object : customers ในตัวแปล allCustomers ผ่าน Model
        return "customer";  // customer.html
    }
}