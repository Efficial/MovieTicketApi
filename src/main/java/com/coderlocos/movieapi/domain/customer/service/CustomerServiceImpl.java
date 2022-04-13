package com.coderlocos.movieapi.domain.customer.service;

import com.coderlocos.movieapi.domain.actor.exceptions.ActorNotFoundException;
import com.coderlocos.movieapi.domain.actor.models.Actor;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Actor create(Actor item) {
        return null;
    }

    @Override
    public Actor findById(Long id) throws ActorNotFoundException {
        return null;
    }

    @Override
    public Iterable<Actor> findAll() {
        return null;
    }

    @Override
    public Actor update(Actor item) throws ActorNotFoundException {
        return null;
    }

    @Override
    public void delete(Long id) throws ActorNotFoundException {

    }
}
