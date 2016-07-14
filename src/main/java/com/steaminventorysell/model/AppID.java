package com.steaminventorysell.model;

public enum AppID {

	DOTA2("570");
	
	private String descricao;

	AppID(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
