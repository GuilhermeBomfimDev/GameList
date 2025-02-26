package com.devguilherme.GameList.dto;

import com.devguilherme.GameList.entities.Game;
import com.devguilherme.GameList.projection.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		super();
	}

	public GameMinDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();;
		year = entity.getYear();;
		imgUrl = entity.getImgUrl();;
		shortDescription = entity.getShortDescription();;
	}
	
	public GameMinDTO(GameMinProjection projection) {
		super();
		id = projection.getId();
		title = projection.getTitle();;
		year = projection.getYear();;
		imgUrl = projection.getImgUrl();;
		shortDescription = projection.getShortDescription();;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}

