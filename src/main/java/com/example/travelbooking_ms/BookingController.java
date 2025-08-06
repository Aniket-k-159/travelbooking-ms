package com.example.travelbooking_ms;

import com.example.travelbooking_ms.BookingRequest;
import com.example.travelbooking_ms.Bookingservice;
import com.example.travelbooking_ms.BusBookingService;
import com.example.travelbooking_ms.HotelBookingService;
import com.example.travelbooking_ms.TrainBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BookingController {

    private final TrainBookingService trainService;
    private final BusBookingService busService;
    private final HotelBookingService hotelService;

    @Autowired
    public BookingController(TrainBookingService trainService, BusBookingService busService, HotelBookingService hotelService) {
        this.trainService = trainService;
        this.busService = busService;
        this.hotelService = hotelService;
    }

    @PostMapping
    public String bookTicket(@RequestBody BookingRequest request) {
        Bookingservice service;
        switch (request.getType().toLowerCase()) {
            case "train":
                service = trainService;
                break;
            case "bus":
                service = busService;
                break;
            case "hotel":
                service = hotelService;
                break;
            default:
                return "Invalid booking type: " + request.getType();
        }
        return service.book(request);
    }
    // ✅ Home route
    @GetMapping
    public String home() {
        return "Welcome to the Travel Booking API!";
    }
}
