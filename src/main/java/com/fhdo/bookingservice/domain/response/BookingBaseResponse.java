package com.fhdo.bookingservice.domain.response;

import com.fhdo.bookingservice.domain.BookingState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingBaseResponse {

    private UUID bookingId;

    private UUID userId;

    private BookingState state;
}
