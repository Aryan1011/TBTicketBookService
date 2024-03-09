package com.ticketbooking.tickeBookService.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingInfo {
    @Id
    private String bookingId;
    private String paymentId;
    private String userId;
    private String seatId;
    private String showId;

    public BookingInfo(String bookingId, String paymentId, String userId, String seatId, String showId) {
        this.bookingId = bookingId;
        this.paymentId = paymentId;
        this.userId = userId;
        this.seatId = seatId;
        this.showId = showId;
    }

    public BookingInfo() {
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }
}
