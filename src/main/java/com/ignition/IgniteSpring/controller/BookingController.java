package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.model.Booking;
import com.ignition.IgniteSpring.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {
    private BookingService bookingService;

    @PostMapping("/create")
    public String createNewBooking(@RequestBody Booking booking){
        return "";
    }


}
