package com.fasonver.fas10ver.repository;

import com.fasonver.fas10ver.domain.advert.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepository extends JpaRepository<Advert,Long> {
}
