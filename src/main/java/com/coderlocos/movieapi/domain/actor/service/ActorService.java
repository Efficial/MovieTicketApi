package com.coderlocos.movieapi.domain.actor.service;

import com.coderlocos.movieapi.domain.actor.exceptions.ActorNotFoundException;
import com.coderlocos.movieapi.domain.actor.models.Actor;
import com.coderlocos.movieapi.domain.core.interfaces.CrudService;

import java.util.List;

public interface ActorService extends CrudService<Actor, Long> {
}
