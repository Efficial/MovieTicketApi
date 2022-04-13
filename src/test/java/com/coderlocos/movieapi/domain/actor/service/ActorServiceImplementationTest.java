package com.coderlocos.movieapi.domain.actor.service;

import com.coderlocos.movieapi.domain.actor.exceptions.ActorNotFoundException;
import com.coderlocos.movieapi.domain.actor.models.Actor;
import com.coderlocos.movieapi.domain.actor.repos.ActorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ActorServiceImplementationTest {
    @MockBean
    private ActorRepository actorRepo;

    @Autowired
    private ActorService actorService;

    private Actor inputActor01;
    private Actor outputActor01;

    @BeforeEach
    public void setUp() {
        inputActor01 = new Actor();
        outputActor01 = new Actor();
        outputActor01.setId(1l);
    }

    @Test
    void actorFindByAliasTest01() {
    }

    @Test
    void actorCreateTest01() {
    }

    @Test
    void actorFindByIdTest01() throws ActorNotFoundException {
        BDDMockito.doReturn(Optional.of(inputActor01)).when(actorRepo).findById(1l);
        Actor foundActor = actorService.findById(1l);
        Assertions.assertEquals(inputActor01.toString(), foundActor.toString());
    }

    @Test
    void getActorByIdFailed(){
        BDDMockito.doReturn(Optional.empty()).when(actorRepo).findById(1l);
        Assertions.assertThrows(ActorNotFoundException.class,() ->{
            actorService.findById(1l);
        });
    }

    @Test
    void actorFindAllTest01() {
        List<Actor> actorList = new ArrayList<>();
        actorList.add(inputActor01);
        actorList.add(outputActor01);

        BDDMockito.doReturn(actorList).when(actorRepo).findAll();

        Iterable<Actor> actorResponse = actorService.findAll();
        Assertions.assertIterableEquals(actorList,actorResponse);

    }

    @Test
    void actorUpdateTest01() throws ActorNotFoundException {
        Actor expectedActorUpdate = new Actor();
        expectedActorUpdate.setId(1l);

        BDDMockito.doReturn(Optional.of(inputActor01)).when(actorRepo).findById(1l);
        BDDMockito.doReturn(expectedActorUpdate).when(actorRepo).save(ArgumentMatchers.any());

        Actor actualTask = actorService.update(expectedActorUpdate);
        Assertions.assertEquals(expectedActorUpdate.toString(), actualTask.toString());
    }

    @Test
    void actorDeleteTest01() {
    }
}