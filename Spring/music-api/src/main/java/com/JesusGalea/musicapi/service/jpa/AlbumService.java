package com.JesusGalea.musicapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.JesusGalea.musicapi.entity.Album;
import com.JesusGalea.musicapi.repository.AlbumRepository;
import com.JesusGalea.musicapi.service.IAlbumService;
@Service
@Primary
public class AlbumService implements IAlbumService {

	@Autowired
	private AlbumRepository albumRepo;
	
	@Override
	public List<Album> buscarTodos() {
	
		return albumRepo.findAll();
	}

	@Override
	public void guardar(Album album) {
		 albumRepo.save(album);
		
	}

	@Override
	public void eliminar(int idAlbum) {
		albumRepo.deleteById(idAlbum);
		
	}

}
