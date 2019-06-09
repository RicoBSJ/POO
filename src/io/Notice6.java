package io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Notice6 implements Serializable {
	private String langue;

	public Notice6() {
		this.langue = "Français";
	}

	public Notice6(String lang) {
		this.langue = lang;
	}

	public String toString() {
		return this.langue;
	}
}