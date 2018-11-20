package com.sungyeh.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * 英雄
 * @author Sungyeh
 */
@Entity
@Data
@Table(name = "hero")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Hero {
    /**
     * 編號
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_")
    private Integer id;
    /**
     * 名稱
     */
    @Column(name = "name_")
    private String name;
    /**
     * 超能力
     */
    @Column(name = "alter_ego_")
    private String alterEgo;
    /**
     * 能力
     */
    @Column(name = "power_")
    private String power;
    /**
     * 使用者
     */
    @ManyToOne
    @JoinColumn(name="user_")
    private User user;
}
