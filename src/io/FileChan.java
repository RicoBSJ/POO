package io;

//Packages à importer afin d'utiliser l'objet File
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class FileChan {
public static void main(String[] args) throws IOException {
  FileInputStream fis;
  BufferedInputStream bis;
  FileChannel fc;
  //Nous déclarons nos objets en dehors du bloc try / catch
  ObjectInputStream ois = null;
  ObjectOutputStream oos = null;

  try {
    //Création des objets
    fis = new FileInputStream(new File("test.txt"));
    bis = new BufferedInputStream(fis);
    //Démarrage du chrono
    long time = System.currentTimeMillis();
    //Lecture
    while(bis.read() != -1);
    //Temps d'exécution
    System.out.println("Temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));
			
    //Création d'un nouveau flux de fichier
    fis = new FileInputStream(new File("test.txt"));
    //On récupère le canal
    fc = fis.getChannel();
    //On en déduit la taille
    int size = (int)fc.size();
    //On crée un buffer correspondant à la taille du fichier
    ByteBuffer bBuff = ByteBuffer.allocate(size);
			
    //Démarrage du chrono
    time = System.currentTimeMillis();
    //Démarrage de la lecture
    fc.read(bBuff);
    //On prépare à la lecture avec l'appel à flip
    bBuff.flip();
    //Affichage du temps d'exécution
    System.out.println("Temps d'exécution avec un nouveau buffer : " + (System.currentTimeMillis() - time));
			
    //Puisque nous avons utilisé un buffer de byte afin de récupérer les données
    //Nous pouvons utiliser un tableau de byte
    //La méthode array retourne un tableau de byte
    @SuppressWarnings("unused")
	byte[] tabByte = bBuff.array();
			
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  } catch (IOException e) {
    e.printStackTrace();
  }
  finally{
      if(ois != null)ois.close();
      if(oos != null)oos.close(); 
    }
}
}