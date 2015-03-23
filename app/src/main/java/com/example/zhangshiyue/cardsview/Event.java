package com.example.zhangshiyue.cardsview;

import android.content.Context;

import java.util.Date;

/**
 * Created by zhangshiyue on 15-3-21.
 */
public class Event {
    private String eventImageName;
    private String eventName;
    private Date eventTime;
    private String eventLocation;
    private String eventSex;
    private int eventNumberOfPeople;

    public int getEventNumberOfPeople() {
        return eventNumberOfPeople;
    }

    public void setEventNumberOfPeople(int eventNumberOfPeople) {
        this.eventNumberOfPeople = eventNumberOfPeople;
    }

    public String getEventSex() {
        return eventSex;
    }

    public void setEventSex(String eventSex) {
        this.eventSex = eventSex;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String eventImageName() {
        return eventImageName;
    }

    public void setEventImageName(String eventImageName) {
        this.eventImageName = eventImageName;
    }


    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.eventImageName, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


}
