package com.sungyeh.domain;

import lombok.Data;

import java.util.Map;
@Data
public class Feature {
    String type;
    Map<String,Object> geometry;
    Map<String,String> properties;

}
