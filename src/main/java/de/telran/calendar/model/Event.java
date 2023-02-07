package de.telran.calendar.model;

import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Data
public class Event {

    private Long eventId;
    private Integer date;
    private String name;
    private String description;
    private String location;
    private int startTime;
    private int endTime;
}

/*
//    private LocalTime startTime;
//    private LocalTime endTime;

    public Long getEventId(Event event){
        return (long)event.getDate()*100_000_000
                + event.getStartTime().getHour()*1_000_000
                + event.getStartTime().getMinute()*10_000
                + event.getEndTime().getHour()*100
                + event.getEndTime().getMinute();
    }
 */