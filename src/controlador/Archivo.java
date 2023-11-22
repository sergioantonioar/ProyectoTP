package controlador;


import modelo.Ventas;
import java.io.*;
import javax.swing.JOptionPane;
public class Archivo {
    
    File archivo;
    
    public void creararchivo(){
        try{
            archivo=new File("RegistroDeVentas.txt");
            if (archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "Venta Guardada");
        }
    }catch(IOException e){
            System.out.println(e);
    }   
}
    public void escribirenarchivo (Ventas persona){
        try{
            FileWriter escritura = new FileWriter(archivo,true);
            escritura.write(persona.getNombre() + "%" + persona.getApellido() + "%" + persona.getTotalventa()+"%"+ persona.getIgvventa()+ "\r\n");
            escritura.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
