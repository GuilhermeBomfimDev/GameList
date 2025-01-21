package com.devguilherme.GameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguilherme.GameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
