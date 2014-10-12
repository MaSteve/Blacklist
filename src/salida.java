
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.TreeSet;

public class salida {
    
    private static final String nombre="blacklist.txt";
    
    public salida(TreeSet<String> lista)
    {
        try
        {
            FileWriter archivotxt=new FileWriter(nombre);
            BufferedWriter flujo=new BufferedWriter(archivotxt);
            flujo.write(""+lista.size());
            flujo.write('\n');
            for(String palabra: lista)
            {
                flujo.write(palabra);
                flujo.write('\n');
            }
            flujo.close();
        }
        catch(Exception e)
        {
            System.out.println("Falló la salida");
        } 
    }
}
