package de.telran.calendar.service;

import de.telran.calendar.model.Event;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventServiceImp implements EventService {

    //Events repository map
    private static final Map<Long, Event>  EVENT_REPOSITORY_MAP = new HashMap<>();

    @Override
    public void create(Event event) {
        Long eventId = (long)event.getDate()*10_000
                + event.getStartTime();
//        Long eventId = (long)event.getDate()*10_000
//                + event.getStartTime().getHour()*100
//                + event.getStartTime().getMinute();
        event.setEventId(eventId);
        if (EVENT_REPOSITORY_MAP.put(eventId, event) != null) {
            System.out.println("Event exists");
            System.out.println(EVENT_REPOSITORY_MAP);
            System.out.println();
        }
        else {
            System.out.println("Event added successfully");
            System.out.println(EVENT_REPOSITORY_MAP);
            System.out.println();
        }
    }

    @Override
    public Event read(Long eventId) {
        return EVENT_REPOSITORY_MAP.get(eventId);
    }

    @Override
    public List<Event> readAll(Object filter) {
        return null;
    }

    @Override
    public boolean update(Event event, Long eventId) {
        if (EVENT_REPOSITORY_MAP.containsKey(eventId)) {
            EVENT_REPOSITORY_MAP.put(eventId, event);
            System.out.println("Event exists and update");
            return true;
        }
        else {
            System.out.println("Event doesn't exists");
            return false;
        }
    }

    @Override
    public boolean delete(Long eventId) {
        if (EVENT_REPOSITORY_MAP.remove(eventId) != null) {
            System.out.println("Event delete");
            return true;
        }
        else {
            System.out.println("Event doesn't exists");
            return false;
        }
    }
}


/*
    public void create(Event event) {
        Long eventId = (long)event.getDate()*10_000
                + event.getStartTime().getHour()*100
                + event.getStartTime().getMinute();
        event.setEventId(eventId);
        if (EVENT_REPOSITORY_MAP.put(eventId, event) == null) {
            System.out.println("Event exists");
        }
        else System.out.println("Event added successfully");
    }


    //Variable for generation an ID event
    private static final AtomicInteger EVENT_ID_HOLDER = new AtomicInteger();


    public Event read(Integer data, LocalTime startTime, LocalTime endTime) {
        Long eventId = (long)data*10_000
                + startTime.getHour()*100
                + startTime.getMinute();
        return EVENT_REPOSITORY_MAP.get(eventId);
    }


 */
