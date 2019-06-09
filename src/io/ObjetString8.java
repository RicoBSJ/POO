package io;

//Packages à importer afin d'utiliser l'objet File
import java.io.*;

public class ObjetString8 {
public static void main(String[] args) {
  StringWriter sw = new StringWriter();
  StringReader sr;
		
  try {
    sw.write("Coucou les Zéros");
    //Appel à la méthode toString de notre objet de manière tacite
    System.out.println(sw);
			
    //caw.close() n'a aucun effet sur le flux
    //Seul caw.reset() peut tout effacer
    sw.close();
			
    //On passe un tableau de caractères à l'objet qui va lire le tampon
    sr = new StringReader(sw.toString());			
    int i ;
    //On remet tous les caractères lus dans un String
    String str = "";
    while(( i = sr.read()) != -1)
      str += (char) i;

    System.out.println(str);

  } catch (IOException e) {
    e.printStackTrace();
  }
}
}