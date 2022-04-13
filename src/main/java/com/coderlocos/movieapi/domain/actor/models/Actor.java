package com.coderlocos.movieapi.domain.actor.models;

import com.coderlocos.movieapi.domain.core.models.Person;

import javax.persistence.Entity;


    @Entity
    public class Actor extends Person {
        private String alias;

        public Actor() {
        }

        public Actor(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }
    }

