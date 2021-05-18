import java.util.Scanner;
import java.io.*;

public class Alumnos {
    public static void main(String args[]) {
        boolean done=true;
        Alumno a1 = new Alumno("Angela", "127");
        Alumno a2 = new Alumno("Herrera", "29");
        Alumno a3 = new Alumno("Berrelleza", "86");

        try{
        FileOutputStream f=new FileOutputStream("alumnos.txt");
        ObjectOutputStream s=new ObjectOutputStream(f);
        s.writeobject(a1);
        s.writeobject(a2);
        s.writeobject(a3);
        s.close;
        }catch(IOException e){
            done=false;
            e.printStackTrace();
        }
        if(done==true){
            System.out.println("Se genero el archivo con la informacion");
        }
    }
}