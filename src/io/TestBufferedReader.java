package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {

	protected String source;

	public TestBufferedReader(String source) {
		this.source = source;
		lecture();

	}

	public static void main(String args[]) {
		new TestBufferedReader("source.txt");
	}

	private void lecture() {
		BufferedReader fichier = null;
		try {
			String ligne;
			FileReader fileReader = new FileReader(source);
			fichier = new BufferedReader(fileReader);
			while ((ligne = fichier.readLine()) != null) {
				System.out.println(ligne);
			}
			fichier.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}