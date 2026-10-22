public class LibroDigital extends Contenido implements Descargable{
    public int paginas;

    public LibroDigital(String titulo, String autor, int paginas){
        super(titulo, autor);
        this.paginas=paginas;
    }

    @Override 
    public double calcularTamaño(double duracion){
        return paginas*0.2;
    }

    @Override 
    public String toString(){
        return super.toString()+ " páginas: "+ paginas;
    }
}
