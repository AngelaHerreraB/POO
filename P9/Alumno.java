import java.util.Scanner;
import java.io.*;

public class Alumno {
    String nombre;
    String matricula;
    int[] calificaciones = new int[7];
    Promedio p = new Promedio();

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        asignarCal(calificaciones);
        p.calcularProm(calificaciones);
    }

    public int asignarCal(int[] calificaciones){
        String file="practica9.csv";
        BufferedReader reader=null;
        String line="";
        int[] cali= new int[81];
        String aux;
        try{
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] cal=line.split(","); 
            }
            for(int i=0;cal[i]!=null; i=i+1){
                aux=cal[i];
                cali[i]=Integer.parseInt(aux);
            }
            
        } catch (IOException ioe){
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            e.printStackTrace();
            }
        }

        for(int i=0; i<=7; i=i+1){
            calificaciones[i]=cal[i];
        }
        return calificaciones;
        
    }
}
