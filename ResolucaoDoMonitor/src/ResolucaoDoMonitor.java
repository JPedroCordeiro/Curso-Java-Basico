import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoMonitor {

	public static void main(String[] args) {

		Toolkit resolucao = Toolkit.getDefaultToolkit();
		Dimension dimensao = resolucao.getScreenSize();
		
		System.out.println("A resolu��o do seu monitor �: " + dimensao.width + " X " + dimensao.height);
	}

}