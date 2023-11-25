package com.fasonver.fas10ver.service.advert;

import com.fasonver.fas10ver.domain.advert.Advert;
import com.fasonver.fas10ver.domain.dto.advert.AdvertDto;
import com.fasonver.fas10ver.domain.dto.advert.AdvertMapper;
import com.fasonver.fas10ver.repository.AdvertRepository;
import jakarta.servlet.http.PushBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdvertService {

    private final AdvertRepository advertRepository;

    public AdvertDto save(AdvertDto advertDto){
        Advert advert = AdvertMapper.INSTANCE.toEntity(advertDto);
        Advert savedAdvert = advertRepository.save(advert);
        return AdvertMapper.INSTANCE.toDto(savedAdvert);
    }
}
