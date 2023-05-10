package com.egor.spring.mvcForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
@RequestMapping("/")
    public String showFirstView(){
    return "first-View";
}
@RequestMapping("/askDetails")
    public String askEmpDetails(Model model){
    model.addAttribute("employee", new Employee());
    return "ask-emp-details-view";
}
@RequestMapping("/showDetail")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
    if(bindingResult.hasErrors())
        return "ask-emp-details-view";
else {
        return "show-emp-detail-view";
    }

}
}
