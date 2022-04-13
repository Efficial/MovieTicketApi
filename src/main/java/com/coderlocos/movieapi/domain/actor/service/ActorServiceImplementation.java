package com.coderlocos.movieapi.domain.actor.service;

import com.coderlocos.movieapi.domain.actor.exceptions.ActorNotFoundException;
import com.coderlocos.movieapi.domain.actor.models.Actor;
import com.coderlocos.movieapi.domain.actor.repos.ActorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ActorServiceImplementation implements ActorService{

    private ActorRepository actorRepository;

    @Autowired
    public ActorServiceImplementation(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

    @Override
    public Actor findByAlias(String alias) {
        return findByAlias("");
    }

    @Override
    public Actor create(Actor item) {
        item = actorRepository.save(item);
        log.info("Saved item with id {}", item.getId());
        return actorRepository.save(item);
    }

    @Override
    public Actor findById(Long id) throws ActorNotFoundException {
        log.info("Looking for Task bunny with id {}", id);
        Optional<Actor> actorOptional = actorRepository.findById(id);
        if(actorOptional.isEmpty())
            throw new ActorNotFoundException("No actor with id found");
        return actorOptional.get();
    }

    @Override
    public Iterable<Actor> findAll() {
        return (List) actorRepository.findAll();
    }

    @Override
    public Actor update(Actor item) throws ActorNotFoundException {
        Long id = item.getId();
        Optional<Actor> actorExistOption = actorRepository.findById(id);
        if(actorExistOption.isEmpty())
            throw new ActorNotFoundException("No actor with this id found");
        return actorRepository.save(item);
    }




    @Override
    public void delete(Long id) throws ActorNotFoundException {
        Optional<Actor> actorExistsOption = actorRepository.findById(id);
        if(actorExistsOption.isEmpty());
            throw new ActorNotFoundException("No actor with this id");
        Actor actorToDelete = actorExistsOption.get();
        actorRepository.delete(actorToDelete);
    }
}
