package com.fasonver.fas10ver.controller;

import com.fasonver.fas10ver.domain.dto.advert.AdvertDto;
import com.fasonver.fas10ver.service.advert.AdvertService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v/advert")
@RequiredArgsConstructor
public class AdvertController {

    private final AdvertService advertService;

    @PostMapping
    public ResponseEntity<AdvertDto> save(@RequestBody AdvertDto advertDto){
        return ResponseEntity.ok(advertService.save(advertDto));
    }

}
