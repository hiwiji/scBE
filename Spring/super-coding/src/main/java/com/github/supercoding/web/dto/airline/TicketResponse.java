package com.github.supercoding.web.dto.airline;

import java.util.List;

public class TicketResponse {
    // 필드값
    private List<Ticket> tickets;

    // 생성자
    public TicketResponse(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    // 빈생성자
    public TicketResponse() {
    }

    // getter
    public List<Ticket> getTickets() {
        return tickets;
    }


}
