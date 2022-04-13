package com.coderlocos.movieapi.domain.actor.exceptions;

public class ActorNotFoundException extends Exception{
    public ActorNotFoundException(String msg){
        super(msg);
    }
}
