package com.devguilherme.GameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguilherme.GameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
