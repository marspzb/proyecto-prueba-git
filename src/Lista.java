
public class Lista {

	private NodoLista inicio;
	
	public void agregarPpio(int data) {
		NodoLista antInicio=inicio;
		inicio=new NodoLista();
		inicio.sig=antInicio;
		inicio.dato=data;
		
		
	}
	
	public int largo() {
		NodoLista act=inicio;
		int largo=0;
		while(act!=null) {
			largo++;
			act=act.sig;
		}
		return largo;
	}
}
