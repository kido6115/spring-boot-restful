package com.sungyeh.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class Test extends Hero {
//    @JsonIgnoreProperties(value = "name")
//    private User user;
}
