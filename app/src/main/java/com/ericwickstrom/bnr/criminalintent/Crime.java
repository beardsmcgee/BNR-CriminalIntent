package com.ericwickstrom.bnr.criminalintent;

import java.util.UUID;

/**
 * Created by beardsmcgee on 5/19/16.
 */
public class Crime {
    private UUID id;
    private String title;

    public Crime(){
        id = UUID.randomUUID();
    }

    public UUID getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
