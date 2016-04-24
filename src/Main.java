import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		DecimalFormat df = new DecimalFormat(".0");
		df.setRoundingMode(RoundingMode.HALF_DOWN);

		double N1, N2, N3, N4, NE, media, mediafinal;
		
		N1 = sc.nextDouble();
		N2 = sc.nextDouble();
		N3 = sc.nextDouble();
		N4 = sc.nextDouble();
		
		media = (N1*2.0 + N2*3.0 + N3*4.0 + N4 * 1.0) / 10.0;
		
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			NE = sc.nextDouble();
			System.out.println("Nota do exame: " + df.format(NE));
			mediafinal = (NE + media) / 2.0;
			if (mediafinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(mediafinal));
		}
		
		sc.close();
	}
}
