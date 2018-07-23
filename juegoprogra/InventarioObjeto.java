package juegoprogra;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InventarioObjeto extends Inventario{
	private static Scanner sca = new Scanner(System.in);
    
	public  void agregarObjeto(ArrayList<ObjetoEquipable> objetos) {
		if (objetos.size() < 10) {
			objetos.add(new ObjetoEquipable());
		} else {
			JOptionPane.showMessageDialog(null,"Usted no puede tener mas objetos");
		}
		
	}

	public static void quitarObjeto(ArrayList<ObjetoEquipable> objetos) {
		if(objetos.size()==0) {
			JOptionPane.showMessageDialog(null,"no existen objetos para eliminar");
		}else {
			
			int num=Integer.parseInt(JOptionPane.showInputDialog(null,"elija el numero del objeto que quiera eliminar"));
			JOptionPane.showMessageDialog(null,"ha eliminado el objeto: "+objetos.get(num).getTipo());
                        
			objetos.remove(num - 1);
		}
	}

	public static void filtrarObjeto(ArrayList<ObjetoEquipable> objetos) {
		if(objetos.size()==0) {
			System.out.println("No posee objetos en el inventario");
		}else {
		int cont=0;
		System.out.println("Por cual rango desea filtrar?");
		int rango = sca.nextInt();
		for (int i = 0; i < objetos.size(); i++) {
			if (objetos.get(i).getRangoEstrellas() == rango) {
				objetos.get(i).mostrar();
				System.out.println("--------------------------------------------------");
				cont++;	
			}
			}
		if(cont==0) {
			System.out.println("no existen objetos del rango buscado");
		    }
		
		
	    }
	}

	public static void mostrarObjetos(ArrayList<ObjetoEquipable> objetos) {
		if (objetos.size() == 0) {
			System.out.println(" no posee objetos en el inventario");
		} else {
			for (int i = 0; i < objetos.size(); i++) {
				objetos.get(i).mostrar();
				System.out.println("----------------------------------------------------------------------------");
			}
		}
	}
	
	public static void mostrarListaObjetos(ArrayList<ObjetoEquipable> objetos) {
		String datosObjeto = null;
		for (int i = 0; i < objetos.size(); i++) {
			datosObjeto = objetos.get(i).getTipo() + " - " + objetos.get(i).getAtributo() + " - " + objetos.get(i).getMejoraTotal() + " - " 
					+ objetos.get(i).getRango() + " - " + objetos.get(i).getRangoEstrellas();
			System.out.println(i+1 +". " + datosObjeto);
		}
	}
}
