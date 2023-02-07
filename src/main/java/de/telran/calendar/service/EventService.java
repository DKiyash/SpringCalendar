package de.telran.calendar.service;

import de.telran.calendar.model.Event;

import java.time.LocalTime;
import java.util.List;

public interface EventService {
    //Create a new event
    void create(Event event);

    //Get event by data, startTime, endTime
    Event read(Long eventId);

    //Returns list of events by filter (!!!!!!!!!!!!!)
    List<Event> readAll(Object filter);

    //Update/modify an event by data, startTime, endTime
    //returns true if transaction successful, else - false
    boolean update(Event event, Long eventId);

    //Delete event by data, startTime, endTime
    //returns true if transaction successful, else - false
    boolean delete(Long eventId);

}

/*
    Event read(Integer data, LocalTime startTime, LocalTime endTime);
    boolean update(Event event, Integer data, LocalTime startTime, LocalTime endTime);
    boolean delete(Integer data, LocalTime startTime, LocalTime endTime);

 */