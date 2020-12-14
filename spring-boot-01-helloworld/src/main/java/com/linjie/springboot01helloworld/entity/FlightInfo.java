package com.linjie.springboot01helloworld.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FlightInfo {
    public String faultDate;
    public String flightPhase;
    public List<Map<String,Object>> drawingDataParseParameterDTOS;
}
