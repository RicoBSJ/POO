
//Package � importer afin d'utiliser l'objet File
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
	public static void main(String[] args) {
		// Cr�ation de l'objet File
		File f = new File("test.txt");
		System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("Est-ce qu'il existe ? " + f.exists());
		System.out.println("Est-ce un r�pertoire ? " + f.isDirectory());
		System.out.println("Est-ce un fichier ? " + f.isFile());

		System.out.println("Affichage des lecteurs � la racine du PC : ");
		// On r�cup�re maintenant la liste des r�pertoires dans une collection typ�e
		// Via l'objet FileSystem qui repr�sente le syst�me de fichier de l'OS
		// h�bergeant la JVM
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		// Maintenant, il ne nous reste plus qu'� parcourir
		for (Path chemin : roots) {
			System.out.println(chemin);
			// Pour lister un r�pertoire, il faut utiliser l'objet DirectoryStream
			// L'objet Files permet de cr�er ce type d'objet afin de pouvoir l'utiliser
			try(DirectoryStream<Path> listing = Files.newDirectoryStream(chemin, "*.txt"))
			//Ne prendra en compte que les fichier ayant l'extension .txt
			{

				int i = 0;
				for (Path nom : listing) {
					System.out.print("\t\t" + ((Files.isDirectory(nom)) ? nom + "/" : nom));
					i++;
					if (i % 4 == 0)
						System.out.println("\n");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}