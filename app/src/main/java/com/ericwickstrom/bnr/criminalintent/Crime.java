package com.ericwickstrom.bnr.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by beardsmcgee on 5/19/16.
 */
public class Crime {
    private UUID id;
    private String title;
    private Date date;
    private boolean solved;

    public Crime(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public UUID getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
