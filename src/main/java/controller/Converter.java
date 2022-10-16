package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/convert")
    public String displayForm() {
        return "/views/convert.jsp";
    }
    @PostMapping( "/convert")
    public String convert(@RequestParam String rate, String usd, Model model ){
        double rateInDouble = Double.parseDouble(rate);
        double usdInDouble = Double.parseDouble(usd);
        double vnd=rateInDouble*usdInDouble;
        model.addAttribute("vnd",vnd);
        model.addAttribute("rate",rate);
        model.addAttribute("usd",usd);

        return "/views/convert.jsp";
    }

}
