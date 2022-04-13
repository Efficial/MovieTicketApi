package com.coderlocos.movieapi.domain.core.interfaces;

import com.coderlocos.movieapi.domain.actor.exceptions.ActorNotFoundException;

public interface CrudService <T, I>{
    T create(T item);
    T findById(I id) throws ActorNotFoundException;
    Iterable<T> findAll();
    T update(T item) throws ActorNotFoundException;
    void delete(I id) throws ActorNotFoundException;
}
