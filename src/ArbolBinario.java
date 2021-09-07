public
class ArbolBinario
{
    private NodoAB raiz;

    public void agregarDato(){
        raiz=new NodoAB();
    }
    public int cantidad(){
        if(raiz==null)return 0;
        return raiz.cantidad();
    }
}
