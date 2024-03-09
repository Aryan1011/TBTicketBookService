package com.ticketbooking.tickeBookService.repository;

import com.ticketbooking.tickeBookService.entities.BookingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingInfoRepository extends JpaRepository<BookingInfo,String> {
}
