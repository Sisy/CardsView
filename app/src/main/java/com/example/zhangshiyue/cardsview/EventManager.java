package com.example.zhangshiyue.cardsview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangshiyue on 15-3-21.
 */
public class EventManager {




    private static EventManager mInstance;
    private List<Event> events;

    public static EventManager getInstance() {
        if (mInstance == null) {
            mInstance = new EventManager();
        }

        return mInstance;
    }

    public List<Event> getEvents() {
        if (events == null) {
            events = new ArrayList<Event>();

                Event event = new Event();
                event.setEventImageName("ladiesnight");
                event.setEventLocation("boston");
                event.setEventName("Ladies'Night");
                event.setEventNumberOfPeople(3);
                event.setEventSex("Female");
                event.setEventTime(new Date());
                events.add(event);

            Event event1 = new Event();
            event1.setEventImageName("superbowl");
            event1.setEventLocation("boston");
            event1.setEventName("Rock SuperBowl");
            event1.setEventNumberOfPeople(10);
            event1.setEventSex("Male");
            event1.setEventTime(new Date());
            events.add(event1);


            Event event2 = new Event();
            event2.setEventImageName("skiing");
            event2.setEventLocation("New Hampsire");
            event2.setEventName("Skiing");
            event2.setEventNumberOfPeople(10);
            event2.setEventSex("Male");
            event2.setEventTime(new Date());
            events.add(event2);

        }

        return  events;
    }
}
