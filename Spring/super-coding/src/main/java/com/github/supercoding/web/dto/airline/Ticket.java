package com.github.supercoding.web.dto.airline;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.supercoding.repository.airlineTicket.AirlineTicket;

import java.time.format.DateTimeFormatter;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Ticket {
    // 필드
    private String depart;
    private String arrival;
    private String departureTime;
    private String returnTime;
    private Integer ticketId;

    // 빈생성자
    public Ticket() {
    }

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Ticket(AirlineTicket airlineTicket) {
        this.ticketId = airlineTicket.getTicketId();
        this.depart = airlineTicket.getDepartureLocation();
        this.arrival = airlineTicket.getArrivalLocation();
        this.departureTime = airlineTicket.getDepartureAt().format(formatter);
        this.returnTime = airlineTicket.getReturnAt().format(formatter);
    }

    // getter
    public String getDepart() {
        return depart;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public Integer getTicketId() {
        return ticketId;
    }
}
