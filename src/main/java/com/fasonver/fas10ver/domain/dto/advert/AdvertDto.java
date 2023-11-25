package com.fasonver.fas10ver.domain.dto.advert;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AdvertDto {

    private Integer amount;
    private List<String> colors;
    private String fabric;
    private String product;
    private Date startDate;
    private Date endDate;
    private String description;
    private String title;

}
