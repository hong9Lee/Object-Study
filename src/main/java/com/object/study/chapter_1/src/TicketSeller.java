package com.object.study.chapter_1.src;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
//        if (audience.getBag().hasInvitation()) {
//            Ticket tickets = ticketOffice.getTickets();
//            audience.getBag().setTicket(tickets);
//        } else {
//            Ticket tickets = ticketOffice.getTickets();
//            audience.getBag().minusAmount(tickets.getFee());
//            ticketOffice.plusAmount(tickets.getFee());
//            audience.getBag().setTicket(tickets);
//        }
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
