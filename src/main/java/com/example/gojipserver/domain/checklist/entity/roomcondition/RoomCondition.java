package com.example.gojipserver.domain.checklist.entity.roomcondition;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

//집 조건
public class RoomCondition {

    private int area; //평수

    @Enumerated(EnumType.STRING)
    private Building building; //건물상태

    private int stationDistance; //역과의 거리

    @Embedded
    private Noise noise; //소음
}
