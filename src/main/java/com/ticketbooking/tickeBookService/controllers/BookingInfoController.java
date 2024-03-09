package com.ticketbooking.tickeBookService.controllers;

import com.ticketbooking.tickeBookService.entities.BookingInfo;
import com.ticketbooking.tickeBookService.service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingInfoController {
    @Autowired
    BookingInfoService bookingInfoService;

    @PostMapping
    ResponseEntity<BookingInfo> createBooking(@RequestBody BookingInfo bookingInfo){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingInfoService.createBooking(bookingInfo));
    }
}
