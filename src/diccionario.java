
import java.util.TreeSet;



public class diccionario {

    public static TreeSet<String> lista;
    private archivo fuente;
    //public static int cont;
    public static salida out;
    
    public diccionario()
    {
        fuente=new archivo();
        lista=fuente.getDic();
        //cont=fuente.getCont();
    }
    
    public static void main(String[] args) {
        diccionario dic=new diccionario();
        //ordenar();
        out=new salida(lista);
    }
    
    /*public static void ordenar()
    {
        for(int i=1; i<cont; i++)
        {
            inserc(i);
        }
    }
    
    public static void inserc(int i)
    {
        String auxi=lista[i];
        while(i>0 && auxi.compareTo(lista[i-1])<0)
        {
            lista[i]=lista[i-1];
            i--;
        }
        lista[i]=auxi;
    }*/
}
