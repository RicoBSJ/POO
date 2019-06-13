package io;

//Packages à importer afin d'utiliser les objets
import java.io.*;

public class ReadAndCopy2 {

	public static void main(String[] args) {

		// On instancie nos objets :
		// fis va lire le fichier
		// fos va écrire dans le nouveau !

		try (FileInputStream fis = new FileInputStream("test.txt");
				FileOutputStream fos = new FileOutputStream("test2.txt")) {

			// On crée un tableau de byte pour indiquer le nombre de bytes lus à
			// chaque tour de boucle
			byte[] buf = new byte[8];

			// On crée une variable de type int pour y affecter le résultat de
			// la lecture
			// Vaut -1 quand c'est fini
			@SuppressWarnings("unused")
			int n = 0;

			// Tant que l'affectation dans la variable est possible, on boucle
			// Lorsque la lecture du fichier est terminée l'affectation n'est
			// plus possible !
			// On sort donc de la boucle
			while ((n = fis.read(buf)) >= 0) {
				// On écrit dans notre deuxième fichier avec l'objet adéquat
				fos.write(buf);
				// On affiche ce qu'a lu notre boucle au format byte et au
				// format char
				for (byte bit : buf) {
					System.out.print("\t" + bit + "(" + (char) bit + ")");
				}
				System.out.println("");
				// Nous réinitialisons le buffer à vide
				// au cas où les derniers byte lus ne soient pas un multiple de 8
				// Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de
				// doublon en fin de fichier
				buf = new byte[8];

			}
			System.out.println("Copie terminée !");

		} catch (FileNotFoundException e) {
			// Cette exception est levée si l'objet FileInputStream ne trouve
			// aucun fichier
			e.printStackTrace();
		} catch (IOException e) {
			// Celle-ci se produit lors d'une erreur d'écriture ou de lecture
			e.printStackTrace();

		}
	}
}