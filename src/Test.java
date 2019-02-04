import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
  public static void main(String[] args) {		
    File file = new File("testFileWriter.txt");
    FileWriter fw;
    FileReader fr;
		
    try {
      //Cr�ation de l'objet
      fw = new FileWriter(file);
      String str = "Bonjour � tous, amis Z�ros !\n";
      str += "\tComment allez-vous ? \n";
      //On �crit la cha�ne
      fw.write(str);
      //On ferme le flux
      fw.close();
			
      //Cr�ation de l'objet de lecture
      fr = new FileReader(file);
      str = "";
      int i = 0;
      //Lecture des donn�es
      while((i = fr.read()) != -1)
        str += (char)i;

      //Affichage
      System.out.println(str);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}