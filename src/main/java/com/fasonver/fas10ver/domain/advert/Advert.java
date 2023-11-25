package com.fasonver.fas10ver.domain.advert;

import com.fasonver.fas10ver.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "advert")
public class Advert extends BaseEntity {

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "colors")
    private List<String> colors;

    @Column(name = "fabric")
    private String fabric;

    @Column(name = "product")
    private String product;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "description")
    private String description;

    @Column(name = "title")
    private String title;


}
