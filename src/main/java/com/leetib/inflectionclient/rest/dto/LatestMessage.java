package com.leetib.inflectionclient.rest.dto;


import lombok.Data;

@Data
public class LatestMessage {
    private String sid;
    private String text;
    private String direction;
    private Boolean isFlagged;
    private String sentAt;
    /**
     *
     */
    private Boolean sharingRestricted;
}