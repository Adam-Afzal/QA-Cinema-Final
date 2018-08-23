package com.qa.controller;

import com.qa.business.TransactionService;
import com.qa.persistence.domain.Booking;
import com.qa.persistence.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/booking")
@ResponseBody
public class BookingController {

    private final TransactionService transactionService;

    @Autowired
    public BookingController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void addTransaction (@RequestBody Booking booking){
        transactionService.save(booking);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Transaction> getAllBookings(){
        return transactionService.findAll();
    }

    @RequestMapping(value = "/get-booking/{name}", method = RequestMethod.GET)
    public List<Transaction> findByName(@PathVariable String name) {
        return transactionService.findByName(name);
    }

    @RequestMapping(value="/get-booking/{date}", method = RequestMethod.GET)
    public List<Transaction> getAllBooked(@PathVariable String date){
        return transactionService.findByDateAndTime(date);
    }

    @RequestMapping(value = "/delete-all", method = RequestMethod.DELETE)
    public void deleteAll(){
        transactionService.deleteAll();
    }

    @RequestMapping(value = "/delete-by-name/{name}", method = RequestMethod.DELETE)
    public void deleteByName(@PathVariable String name){
        List<Transaction> existingTransaction = transactionService.findByName(name);
        transactionService.deleteAll(existingTransaction);
    }

}
