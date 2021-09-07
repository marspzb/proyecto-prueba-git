public
class NodoAB
{
    private int dato;
private NodoAB izq;
    private NodoAB der;

    public int cant(){
        return 1
             +  (izq!=null?izq.cant():0)
            +(der!=null?der.cant():0);
    }

    
    public int altura() {return -1;}


    public NodoAB inverso(){
        return null;
    }
}
