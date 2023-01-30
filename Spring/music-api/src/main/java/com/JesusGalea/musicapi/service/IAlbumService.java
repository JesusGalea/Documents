package com.JesusGalea.musicapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JesusGalea.musicapi.entity.Album;
import com.JesusGalea.musicapi.repository.AlbumRepository;


public interface IAlbumService {

List<Album> buscarTodos();
void guardar(Album album);
void eliminar (int idAlbum);
	
}
