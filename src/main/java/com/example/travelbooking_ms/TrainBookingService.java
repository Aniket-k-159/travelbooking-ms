package com.example.travelbooking_ms;

import com.example.travelbooking_ms.BookingRequest;
import org.springframework.stereotype.Service;

@Service
public class TrainBookingService implements Bookingservice {

    @Override
    public String book(BookingRequest request) {
        return "Train ticket booked from " + request.getSource() + " to " + request.getDestination()
                + " for user: " + request.getUser() + " on " + request.getDate();
    }
}
