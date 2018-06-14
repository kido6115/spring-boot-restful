package com.sungyeh.domain;

import lombok.Data;

import java.util.List;
@Data
public class GeoJson {
    String type="";
    List<Feature>features;
}
