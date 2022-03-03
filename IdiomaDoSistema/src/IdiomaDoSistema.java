import java.util.Locale;

public class IdiomaDoSistema {

	public static void main(String[] args) {
		
		Locale idioma = Locale.getDefault();
		
		System.out.print("O idioma do computador é: ");
		System.out.println(idioma.getDisplayLanguage());
		
	}

}
