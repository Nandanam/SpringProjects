package com.vikas.springdatarest.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.vikas.springdatarest.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant,Long> {

}
