package com.devsuperior.dspesquisa.dto;

public class RecordInsertDTO {

	private String name;
	private Integer age;
	private long gameId;
	
	public RecordInsertDTO() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	
	
	
}
