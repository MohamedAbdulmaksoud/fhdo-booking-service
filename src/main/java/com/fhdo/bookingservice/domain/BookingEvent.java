package com.fhdo.bookingservice.domain;

public enum BookingEvent {
    CHECK_VALIDITY,
    BOOK_PARKING_SLOT,
    BOOKING_CONFIRMED,
    BOOKING_FAILED,
    VEHICLE_PARKED,
    OVERSTAY_OCCURRED,
    BOOKING_COMPLETED,
    BOOKING_CANCELLED,
}
