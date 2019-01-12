package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.entities.Direction;
import test.repositories.DirectionRepository;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class TicketSystemRestController {

    private final DirectionRepository directionRepository;

    public TicketSystemRestController(DirectionRepository directionRepository) {
        this.directionRepository = directionRepository;
    }

    @GetMapping("/directions")
    public List<Direction> getDirections() {
        return directionRepository.findAll();
    }
}
