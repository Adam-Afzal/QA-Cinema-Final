package com.qa.controller;

import com.qa.domain.Booking;
import com.qa.repository.iBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@ResponseBody
public class BookingController {

    @Autowired
    private iBookingRepository iBookingRepository;

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public Iterable<Booking> getAllBooks(){
        return iBookingRepository.findAll();
    }

}
