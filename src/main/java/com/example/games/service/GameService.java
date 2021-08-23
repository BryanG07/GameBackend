package com.example.games.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.games.model.Game;
import com.example.games.repository.GameRepository;

@Service
public class GameService implements GameRepository{
	
	@Autowired
	private GameRepository gameRepository;

	@Override
	public List<Game> findAll() {
		return gameRepository.findAll();
	}
	
	public List<Game> findAllByTecnologia(Long id) {
		List<Game> gamesRespuesta= new ArrayList<>();
		List<Game> games= gameRepository.findAll();
		for(int i=0; i<games.size(); i++) {
			if (games.get(i).getTechnology().getId() == id) {
				gamesRespuesta.add(games.get(i));
			}
		}
		return gamesRespuesta;
	}
	
	public List<Game> findAllByBooleano(Long id) {
		List<Game> gamesRespuesta= new ArrayList<>();
		List<Game> games= gameRepository.findAll();
		for(int i=0; i<games.size(); i++) {
			if (games.get(i).getBool().getId() == id) {
				gamesRespuesta.add(games.get(i));
			}
		}
		return gamesRespuesta;
	}

	@Override
	public List<Game> findAll(Sort sort) {
		return gameRepository.findAll(sort);
	}

	@Override
	public List<Game> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Game> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Game> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Game getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Game> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> S save(S entity) {
		return gameRepository.save(entity);
	}

	@Override
	public Optional<Game> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		gameRepository.deleteById(id);
	}

	@Override
	public void delete(Game entity) {
		gameRepository.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Game> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Game> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Game> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Game> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
