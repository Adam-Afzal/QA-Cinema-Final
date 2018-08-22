package com.qa.domain;

import javax.persistence.*;

@Entity
public class Seats {

    @Id
    @GeneratedValue
    private Long seats_id;
    private int seat_num;
    private String seat_status;

    @ManyToOne
    private Booking booking;

    @ManyToOne
    private Screen screen;

    protected Seats(){}

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Seats(int seat_num, String seat_status, Booking booking) {
        this.seat_num = seat_num;
        this.seat_status = seat_status;
        this.booking = booking;
    }

    public Long getId() {
        return seats_id;
    }

    public void setId(Long seats_id) {
        this.seats_id = seats_id;
    }

    public int getSeatNum() {
        return seat_num;
    }

    public void setSeatNum(int seatNum) {
        this.seat_num = seat_num;
    }

    public String getSeatStatus() {
        return seat_status;
    }

    public void setSeatStatus(String seat_status) {
        this.seat_status = seat_status;
    }
}
