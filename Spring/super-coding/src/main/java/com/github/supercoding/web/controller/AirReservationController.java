package com.github.supercoding.web.controller;

import com.github.supercoding.service.AirReservationService;
import com.github.supercoding.service.exceptions.InvalidValueException;
import com.github.supercoding.service.exceptions.NotAcceptException;
import com.github.supercoding.service.exceptions.NotFoundException;
import com.github.supercoding.web.dto.airline.ReservationRequest;
import com.github.supercoding.web.dto.airline.ReservationResult;
import com.github.supercoding.web.dto.airline.Ticket;
import com.github.supercoding.web.dto.airline.TicketResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/air-reservation")
@Slf4j
public class AirReservationController {

    // 서비스 객체 받기
    private AirReservationService airReservationService;

    // 서비스 생성자
    public AirReservationController(AirReservationService airReservationService) {
        this.airReservationService = airReservationService;
    }

    @GetMapping("/tickets")
    public TicketResponse findAirlineTickets(
            @RequestParam("user-Id") Integer userId,
            @RequestParam("airline-ticket-type") String ticketType) {

            // 로직 위임하기
            List<Ticket> tickets = airReservationService.findUserFavoritePlaceTickets(userId, ticketType);
            TicketResponse ticketResponse = new TicketResponse(tickets);
            return new TicketResponse(tickets);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/reservations")
    public ReservationResult makeReservation(@RequestBody ReservationRequest reservationRequest) {
            ReservationResult reservationResult = airReservationService.makeReservation(reservationRequest);
            return reservationResult;
    }


}
