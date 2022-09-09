package com.porkerspicks.fitbastats.repository;

import com.porkerspicks.fitbastats.domain.Season;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends CrudRepository<Season, Integer> {

}
