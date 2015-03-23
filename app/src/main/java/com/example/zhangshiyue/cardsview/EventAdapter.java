package com.example.zhangshiyue.cardsview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhangshiyue on 15-3-21.
 */
public class EventAdapter extends  RecyclerView.Adapter<EventAdapter.ViewHolder>{

        private List<Event> events;
        private int rowLayout;
        private Context mContext;

        public EventAdapter(List<Event> events, int rowLayout, Context context) {
            this.events = events;
            this.rowLayout = rowLayout;
            this.mContext = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Event event = events.get(i);
            viewHolder.eventName.setText(event.getEventName());
            viewHolder.eventLocation.setText(event.getEventLocation());
            viewHolder.eventTime.setText(event.getEventTime().toString().substring(0, 10) + "   ");
            viewHolder.eventSex.setText(event.getEventSex()+"  ");
            viewHolder.eventNumberOfPeople.setText(String.valueOf(event.getEventNumberOfPeople()));
            viewHolder.eventImage.setImageDrawable(mContext.getDrawable(event.getImageResourceId(mContext)));
        }

        @Override
        public int getItemCount() {
            return events == null ? 0 : events.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView eventImage;
            public TextView eventName;
            public TextView eventTime;
            public TextView eventLocation;
            public TextView eventSex;
            public TextView eventNumberOfPeople;
            public Button goingBtn;
            public Button reviewBtn;


            public ViewHolder(View itemView) {
                super(itemView);
                eventImage = (ImageView) itemView.findViewById(R.id.eventImage);
                eventName = (TextView) itemView.findViewById(R.id.name);
                eventName.setTextColor(Color.WHITE);
                eventTime = (TextView) itemView.findViewById(R.id.time);
                eventTime.setTextColor(Color.GRAY);
                eventLocation = (TextView) itemView.findViewById(R.id.location);
                eventLocation.setTextColor(Color.GRAY);
                eventSex = (TextView) itemView.findViewById(R.id.sex);
                eventSex.setTextColor(Color.GRAY);
                eventNumberOfPeople = (TextView) itemView.findViewById(R.id.peopleNumber);
                eventNumberOfPeople.setTextColor(Color.GRAY);
                goingBtn = (Button)itemView.findViewById(R.id.goingBtn);
                reviewBtn = (Button)itemView.findViewById(R.id.reviewBtn);

            }

        }
}
