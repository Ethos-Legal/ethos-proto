package com.ethos.legal.Controllers;


import com.ethos.legal.Models.Bid;
import com.ethos.legal.Models.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class BidController {




//    @PostMapping("/postBid")
//    public RedirectView bidPoster(String pricePerHour, String datePosted){
//        Bid bid = new Bid(pricePerHour,datePosted);
//
//        bidRepository.save(bid);
//        System.out.println(pricePerHour);
//        return new RedirectView("/jobPosterProfile");
//    }

}
