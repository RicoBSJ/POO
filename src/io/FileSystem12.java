package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem12 {

	public static void main(String[] args) {
		// Création d'un système de fichiers en fonction d'un fichier ZIP
		try (FileSystem zipFS = FileSystems.newFileSystem(Paths.get("monFichier.zip"), null)) {

			// Suppression d'un fichier à l'intérieur du ZIP :
			Files.deleteIfExists(zipFS.getPath("test.txt"));

			// Création d'un fichier à l'intérieur du ZIP :
			Path path = zipFS.getPath("nouveau.txt");
			String message = "Hello World !!!";
			Files.write(path, message.getBytes());

			// Parcours des éléments à l'intérieur du ZIP :
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(zipFS.getPath("/"))) {
				for (Path entry : stream) {
					System.out.println(entry);
				}
			}

			// Copie d'un fichier du disque vers l'archive ZIP :
			Files.copy(Paths.get("fichierSurDisque.txt"), zipFS.getPath("fichierDansZIP.txt"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
