package com.fasonver.fas10ver.domain.dto.advert;

import com.fasonver.fas10ver.domain.advert.Advert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdvertMapper {
    AdvertMapper INSTANCE = Mappers.getMapper(AdvertMapper.class);
    AdvertDto toDto(Advert advert);
    Advert toEntity(AdvertDto advertDto);
}
