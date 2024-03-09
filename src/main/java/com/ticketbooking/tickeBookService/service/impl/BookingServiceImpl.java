package com.ticketbooking.tickeBookService.service.impl;

import com.ticketbooking.tickeBookService.entities.BookingInfo;
import com.ticketbooking.tickeBookService.repository.BookingInfoRepository;
import com.ticketbooking.tickeBookService.service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingInfoService {

    @Autowired
    BookingInfoRepository bookingInfoRepository;
    @Override
    public BookingInfo createBooking(BookingInfo bookingInfo) {
        bookingInfo.setBookingId(UUID.randomUUID().toString());
        return bookingInfoRepository.save(bookingInfo);
    }
}
