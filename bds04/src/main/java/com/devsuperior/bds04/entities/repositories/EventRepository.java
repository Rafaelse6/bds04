package com.devsuperior.bds04.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds04.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
