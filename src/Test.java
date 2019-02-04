
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {
	public static void main(String[] args) {
		// Cr�ation de l'objet File
		Path path = Paths.get("test.txt");
		System.out.println("Chemin absolu du fichier : " + path.toAbsolutePath());
		System.out.println("Est-ce qu'il existe ? " + Files.exists(path));
		System.out.println("Nom du fichier : " + path.getFileName());
		System.out.println("Est-ce un répertoire ? " + Files.isDirectory(path));

		// On récupère maintenant la liste des répertoires dans une collection typée
		// Via l'objet FileSystem qui représente le système de fichier de l'OS
		// hébergeant la JVM
		// Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		// Maintenant, il ne nous reste plus qu'à parcourir
		// for (Path chemin : roots) {
		// System.out.println(chemin);
		// Pour lister un répertoire, il faut utiliser l'objet DirectoryStream
		// L'objet Files permet de créer ce type d'objet afin de pouvoir l'utiliser
		Path source = Paths.get("test2.txt");
		Path cible = Paths.get("test3.txt");
		try {
			Files.move(source, cible, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}