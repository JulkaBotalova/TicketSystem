package test.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import test.entities.Bus;

import java.util.List;
import java.util.Optional;

public interface BusRepository extends PagingAndSortingRepository<Bus, Integer> {
    Optional<Bus> findById(Integer id);
    List<Bus> findAll();

}