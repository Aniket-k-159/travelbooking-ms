package com.example.travelbooking_ms;

import com.example.travelbooking_ms.BookingRequest;
import org.springframework.stereotype.Service;

@Service
public class BusBookingService implements Bookingservice {

    @Override
    public String book(BookingRequest request) {
        return "Bus ticket booked from " + request.getSource() + " to " + request.getDestination()
                + " for user: " + request.getUser() + " on " + request.getDate();
    }
}
