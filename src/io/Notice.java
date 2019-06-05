package io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Notice implements Serializable {
	private String langue;

	public Notice() {
		this.langue = "Français";
	}

	public Notice(String lang) {
		this.langue = lang;
	}

	public String toString() {
		return this.langue;
	}
}