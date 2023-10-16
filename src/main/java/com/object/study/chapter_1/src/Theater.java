package com.object.study.chapter_1.src;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
//        if(audience.getBag().hasInvitation()) {
//            Ticket tickets = ticketSeller.getTicketOffice().getTickets();
//            audience.getBag().setTicket(tickets);
//        } else {
//            Ticket tickets = ticketSeller.getTicketOffice().getTickets();
//            audience.getBag().minusAmount(tickets.getFee());
//            ticketSeller.getTicketOffice().plusAmount(tickets.getFee());
//            audience.getBag().setTicket(tickets);
//        }
    }
}
