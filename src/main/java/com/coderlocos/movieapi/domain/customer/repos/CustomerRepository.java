package com.coderlocos.movieapi.domain.customer.repos;


import com.coderlocos.movieapi.domain.actor.models.Actor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Actor, Long> {
    Optional<Actor> findByName(String name);
}
