public class Cancion extends Contenido implements Reproducible, Descargable{
    private int duracion;
    
    public Cancion(String titulo, String autor, int duracion){
        super(titulo, autor);
        this.duracion=duracion;
    }

    @Override 
    public void reproducir(){
        System.out.println("Reproduciondo: "+titulo+ " del autor: "+autor);
    }

    @Override 
    public int getDuracion(){
        return duracion;
    }

    @Override 
    public double calcularTamaño(double duracion){
        return duracion*1.5;
    }

    @Override 
    public String toString(){
        return super.toString()+ " Duración: "+duracion;
    }
}
