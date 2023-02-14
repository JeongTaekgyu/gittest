package com.example.gittest1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Test1Entity {
    @Id @GeneratedValue
    private Long id;
    private BigDecimal updatetest1;
    private Long phone;
    private String address;
}
