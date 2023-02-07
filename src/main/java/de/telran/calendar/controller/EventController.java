package de.telran.calendar.controller;

import de.telran.calendar.model.Event;
import de.telran.calendar.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping(value = "/events")
    public ResponseEntity<?> create(@RequestBody Event event){
        eventService.create(event);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/events/{id}")
    public ResponseEntity<Event> read(@PathVariable(name = "id") Long id) {
        final Event event = eventService.read(id);
        return event != null
                ? new ResponseEntity<>(event, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/events/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody Event event) {
        final boolean updated = eventService.update(event, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/events/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        final boolean deleted = eventService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

