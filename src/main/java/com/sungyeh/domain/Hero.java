package com.sungyeh.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "hero")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Hero {
    @Id
    @Column(name = "id_")
    private Integer id;
    @Column(name = "name_")
    private String name;
    @Column(name = "alter_ego_")
    private String alterEgo;
    @Column(name = "power_")
    private String power;
}
