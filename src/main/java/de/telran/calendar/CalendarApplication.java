package de.telran.calendar;

import de.telran.calendar.model.Event;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args){
		SpringApplication.run(CalendarApplication.class, args);

	}

}
//date, name, description, location, startTime, endTime

//04.02.23 Homework
//Написать методы для создания, удаления, модификации, замены и получения объекта события,
//а так же метод для получения списка таких объектов по некоторому фильтру
// (фильтр будет отдельным объектом, пока можно просто вставить Object).
//Вам нужно везде проставить соответствующие аннотации и понять,
// как должен будет выглядеть тот или иной запрос, для этого рекомендую подробнее
// почитать про REST и RESTful архитектуру. Возвращать из методов ничего не нужно,
// можно просто проставить null и проверить, что все запускается.