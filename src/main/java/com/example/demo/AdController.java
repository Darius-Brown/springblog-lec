package com.example.demo;

import com.example.demo.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class AdController {

    // These two next steps are often called dependency injection, where we create a Repository instance and initialize it in the controller class constructor.
    private final AdRepository adDao;

    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());
        model.addAttribute("topAd", adDao.findByTitle("bicycle north side"));
//        model.addAttribute("searchAd", adDao.findByTitleLike("%"+ index + "%"));
        model.addAttribute("searchAd", adDao.findByTitleLike("%childcare%"));

        return "adIndex";
    }

}

