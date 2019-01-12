package test;

import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import test.entities.Bus;
import test.entities.Direction;
import test.entities.Ticket;
import test.repositories.DirectionRepository;
import test.repositories.TicketRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

@Controller
public class MainController {

    private final TicketRepository ticketRepository;
    private final DirectionRepository directionRepository;


    public MainController(TicketRepository ticketRepository, DirectionRepository directionRepository) {
        this.ticketRepository = ticketRepository;
        this.directionRepository = directionRepository;
    }

    @GetMapping("/welcome")
    public String greeting() {
        return "welcome";
    }

    @GetMapping("/order")
    public String order() {
        return "order";
    }

    @RequestMapping(value="/orderYes", method = RequestMethod.GET)
    Ticket createTicket(@RequestParam(name  = "fio", defaultValue = "") String fio,
                        @RequestParam(name  = "date", defaultValue = "") String date,
                        @RequestParam(name  = "ticketDirectionId", defaultValue = "") Long ticketDirectionId) throws ParseException {
        Ticket ticketCreate = new Ticket();
        Optional<Direction> maybe = directionRepository.findById(1);
        Direction direction = maybe
                .orElseThrow(() -> new ExpressionException(String.valueOf(1)));

        Bus bus = direction.getBus();
        Integer count = bus.getNumberOfEmptySeats();
        Integer number = count;
        count = count - 1;
        bus.setNumberOfEmptySeats(count);

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        Date docDate= format.parse(date);

        ticketCreate.setFio(fio);
        ticketCreate.setTicketNumber(number);
        ticketCreate.setTicketDate(docDate);
        ticketCreate.setDirection(direction);
        ticketRepository.save(ticketCreate);

        return ticketCreate;
    }
}