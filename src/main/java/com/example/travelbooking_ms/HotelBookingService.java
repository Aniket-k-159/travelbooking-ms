package com.example.travelbooking_ms;

import com.example.travelbooking_ms.BookingRequest;
import org.springframework.stereotype.Service;

@Service
public class HotelBookingService implements Bookingservice {

    @Override
    public String book(BookingRequest request) {
        return "Hotel booked in " + request.getDestination() + " for user: " + request.getUser()
                + " from " + request.getDate() + " for " + request.getPassengers() + " nights.";
    }
}
