import java.io.*;
import java.util.TreeSet;

public class archivo {
   private static final String nombre="listapropia.txt";
   private static TreeSet<String> lista;
   //private static int cont;
   public archivo()
   {
       lista=new TreeSet<String>();
       leer();
   }
   private void leer()
   {
       BufferedReader flujo;
       try{
       FileReader archivotxt=new FileReader(nombre);
       flujo=new BufferedReader(archivotxt);
       //cont=0;
       String auxi=flujo.readLine();
       while(auxi!=null)
       {
           //if(auxi.length()<=3)
           //{
               lista.add(remove1(auxi).toUpperCase());
               //cont++;
           //}
           auxi=flujo.readLine();
       }
          
       flujo.close();
       }
       catch(Exception e)
       {
           System.out.println("Falló la entrada"); 
       }
   }
   public TreeSet<String> getDic()
   {
       return lista;
   }
   public int getCont()
   {
       //return cont;
       return lista.size();
   }
   private static String remove1(String input) {
    // Cadena de caracteres original a sustituir.
    String original = "áàäéèëíìïóòöúùuÁÀÄÉÈËÍÌÏÓÒÖÚÙÜçÇ";
    // Cadena de caracteres ASCII que reemplazarán los originales.
    String ascii = "aaaeeeiiiooouuuAAAEEEIIIOOOUUUcC";
    String output = input;
    for (int i=0; i<original.length(); i++) {
        // Reemplazamos los caracteres especiales.
        output = output.replace(original.charAt(i), ascii.charAt(i));
    }//for i
    return output;
    }//remove1
}
