package com.qa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String booking_time;
    private String booking_date;

    @OneToMany(mappedBy = "booking")
    private List<Seats> seats;

    protected Booking(){}

    public Booking(String name, String booking_time, String booking_date) {
        this.name = name;
        this.booking_time = booking_time;
        this.booking_date = booking_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookingTime() {
        return booking_time;
    }

    public void setBookingTime(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", booking_time='" + booking_time + '\'' +
                ", seats=" + seats +
                '}';
    }
}
