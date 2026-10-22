public class Podcast extends Contenido implements Reproducible, Descargable{
    private int duracion;
    private int episodio;
   
    public Podcast(String titulo, String  autor, int duracion, int episodio){
        super(titulo, autor);
        this.duracion=duracion;
        this.episodio=episodio;
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
        return duracion*1.0;
   }

   @Override 
   public String toString(){
        return super.toString()+ " Duración: "+duracion+ " Episodio: "+episodio;
   }
}
