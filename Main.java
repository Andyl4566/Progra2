package docu;

import java.util.Scanner;


    class Docu {
    private String imprimir, escribir, nombredoc;
    
    public void setnombredoc (String nombredoc){
        this.nombredoc = nombredoc;
    }
    
    public String getnombredoc(){
        return nombredoc;
    }
    public void setimprimir (String imprimir){
        this.imprimir = imprimir;
    }
    
    public String getimprimir(){
        return imprimir;
    }
    
    public void setescribir (String escribir){
        this.escribir = escribir;
    }
    
    public String getescribir (){
        return escribir; 
    }
}
    
    class carta{
        private String fecha, nombre;
        
        public void setfecha (String fecha){
            this.fecha = fecha;
        }
        
        public String getfecha (){
            return fecha;
        }
        
        public void setnombre(String nombre){
            this.nombre = nombre;
        }
        
        public String getnombre (){
            return nombre;
        }
    }
    
    class memo{
        private int numpag;
        
        public void setnumpag (int numpag){
            this.numpag = numpag;
        }
        
        public int getnumpag (){
            return numpag;
        }
    }
    
    public class Main{
    public static void main (String [] args){
    Docu documento1 = new Docu();
    carta carta1 = new carta();
    memo memo1 = new memo();
    Scanner entrada = new Scanner (System.in);
    System.out.print("ingrese el nombre del documento: \n");
    documento1.setnombredoc(entrada.nextLine());
    if (!documento1.getnombredoc().isEmpty()){
        System.out.println("el nombre asignado al documento es: "+documento1.getnombredoc());
        System.out.print("puede escribir algo en el documento\n" );
        documento1.setescribir(entrada.nextLine());
        documento1.setimprimir(documento1.getescribir());
        System.out.println("Imprimiendo texto : "+documento1.getimprimir());
        
        System.out.print("ingrese un nombre a la carta: \n");
        carta1.setnombre(entrada.nextLine());        
        if (!carta1.getnombre().isEmpty()){
        System.out.print("ingrese la fecha: ");
        carta1.setfecha(entrada.nextLine());
        System.out.println("ingrese el numero de paginas que desea: ");
        memo1.setnumpag(entrada.nextInt());
        System.out.println("la fecha ingresada es: "+carta1.getfecha());
        System.out.println("el numero de paginas ingresadas son: "+memo1.getnumpag());
        } else {
            System.out.print("no ha ingresado ningun nombre a la carta");
        }
    } else{
        System.out.print("El documento no tiene un nombre asignado \n");
    }
  }
}

