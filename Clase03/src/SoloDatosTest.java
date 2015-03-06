
public class SoloDatosTest {

	public static void main(String[] args) {
		
		SoloDatos datos = new SoloDatos();
		
		datos.i = 2;
		datos.b = true;
		datos.d = 1.2;
		datos.c = 'a';
		datos.s = "cadena";
		
		
		System.out.println(datos.s+datos.i+datos.b+datos.c+datos.d); 
		
		SoloDatos datos2 = new SoloDatos();
		System.out.println(datos2.s+datos2.i+datos2.b+datos2.c+datos2.d);
	}

}
