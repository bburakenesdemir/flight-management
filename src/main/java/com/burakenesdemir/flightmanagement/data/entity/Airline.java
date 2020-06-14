package com.burakenesdemir.flightmanagement.data.entity;

import com.burakenesdemir.flightmanagement.data.entity.base.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="airline")
public class Airline extends AbstractEntity {

    @Column(name = "company_name")
    private String companyName;
}