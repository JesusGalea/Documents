package com.JesusGalea.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JesusGalea.musicapi.entity.Album;


public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
