package com.github.supercoding.web.dto.airline;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TicketResponse {
    // 필드값
    private List<Ticket> tickets;
}
