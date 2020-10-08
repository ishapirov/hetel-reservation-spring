package com.ishapirov.hotelreservation.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "The room has already been reserved for the given date interval")
public class ReservationOverlapException extends RuntimeException{
    
}
