
//Et une classe de test : 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<PersonneOther> listP = Arrays.asList(new PersonneOther(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new PersonneOther(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new PersonneOther(1.75, 65, "C", "Germain", Couleur.VERT),
				new PersonneOther(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new PersonneOther(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new PersonneOther(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new PersonneOther(1.90, 90, "G", "Olivier", Couleur.VERRON));

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		//
		// Stream.iterate(2d, (x) -> x + 1).limit(100).forEach(System.out::println);

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		//
		// System.out.println("\nAprès le filtre");
		// sp = listP.stream();
		// sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		//
		// System.out.println("\nAprès le filtre et le map");
		// sp = listP.stream();
		// sp.filter(x -> x.getPoids() > 50).map(x ->
		// x.getPoids()).forEach(System.out::println);

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		//
		// System.out.println("\nAprès le filtre et le map et reduce");
		// sp = listP.stream();
		//
		// Double sum = sp.filter(x -> x.getPoids() > 50).map(x ->
		// x.getPoids()).reduce(0.0d, (x, y) -> x + y);
		// System.out.println(sum);

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		//
		// System.out.println("\nAprès le filtre et le map et reduce");
		// sp = listP.stream();
		//
		// Optional<Double> sum = sp.filter(x -> x.getPoids() > 250).map(x ->
		// x.getPoids()).reduce((x, y) -> x + y);
		// if (sum.isPresent())
		// System.out.println(sum.get());
		// else
		// System.out.println("Aucun aggrégat de poids...");

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		// sp = listP.stream();
		//
		// Optional<Double> sum = sp .filter(x -> x.getPoids() > 250)
		// .map(x -> x.getPoids())
		// .reduce((x,y) -> x+y);
		// //Permet de gérer le cas d'erreur en renvoyant 0.0 si isPresent() == false
		// System.out.println(sum.orElse(0.0));

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		// sp = listP.stream();
		//
		// long count = sp.filter(x -> x.getPoids() > 50).map(x ->
		// x.getPoids()).count();
		//
		// System.out.println("Nombre d'éléments : " + count);

		// Stream<PersonneOther> sp = listP.stream();
		// sp.forEach(System.out::println);
		// sp = listP.stream();
		// D://Documents/IPTABLES.sh
		// List<Double> ld = sp.filter(x -> x.getPoids() > 50).map(x ->
		// x.getPoids()).collect(Collectors.toList());
		// System.out.println(ld);

		String fileName = "Macintosh HD://Utilisateurs⁩/eric⁩/eclipse-workspace⁩/⁨POO/test.txt⁩";
		try (Stream<String> sf = Files.lines(Paths.get(fileName))) {
			sf.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}