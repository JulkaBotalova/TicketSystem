package test.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import test.entities.Direction;

import java.util.List;
import java.util.Optional;

public interface DirectionRepository extends PagingAndSortingRepository<Direction, Integer> {
    Optional<Direction> findById(Integer id);
    List<Direction> findAll();

}