package com.birprojedaha.common.enums;

public enum Language {
	ALL(1, "ALL"), TURKISH(2, "TR"), RUSSIAN(3, "RU"), ENGLISH(4, "EN"), GERMAN(5, "DE"), FARSI(6, "FA"), DUTCH(7, "NL"), NOTSET(0, "NS"),;

	private int id;
	private String code;

	private Language(int id, String code) {
		this.id = id;
		this.code = code;
	}

	public static Language getById(int id) {
		for (Language type : Language.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return Language.NOTSET;
	}

	public static Language getByCode(String code) {
		for (Language type : Language.values()) {
			if (type.code.equalsIgnoreCase(code)) {
				return type;
			}
		}
		return Language.NOTSET;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}
}
