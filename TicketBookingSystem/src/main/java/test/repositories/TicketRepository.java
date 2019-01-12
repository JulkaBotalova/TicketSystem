package test.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import test.entities.Ticket;

import java.util.List;
import java.util.Optional;

    public interface TicketRepository extends PagingAndSortingRepository<Ticket, Integer> {
        Optional<Ticket> findById(Integer id);
        List<Ticket> findAll();

    }
