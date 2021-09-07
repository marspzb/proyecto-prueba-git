
public class Lista {

	private NodoLista inicio;
	
	public void agregarPpio() {
		
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
