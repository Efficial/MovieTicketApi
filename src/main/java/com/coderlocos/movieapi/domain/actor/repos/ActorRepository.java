package com.coderlocos.movieapi.domain.actor.repos;

import com.coderlocos.movieapi.domain.actor.models.Actor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ActorRepository extends CrudRepository<Actor, Long> {
    Optional<Actor> findByAlias(String alias);
}
