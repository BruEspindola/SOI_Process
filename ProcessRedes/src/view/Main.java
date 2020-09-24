package view;
import controller.RedesController;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[]args) {
		String SO = System.getProperty("os.name");
		RedesController Redes = new RedesController();
		
		int Menu;
		
		do {
			Menu = Integer.parseInt(JOptionPane.showInputDialog
					("MENU : \n"
					+ "1 - IPv4 \n"
					+ "2 - PING \n"
					+ "9 - Finalizar"));
			
			switch (Menu) {
			case 1: 
				System.out.println(Redes.ip(SO));
				break;
			case 2:
				System.out.println( Redes.ping(SO));
				break;
			case 9: 
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Valor inserido é invalido");
			}
		}while(Menu!=9);

	}

}