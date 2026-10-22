public abstract class Contenido {
    public String titulo;
    public String autor;

    public Contenido(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    @Override 
    public String toString(){
        return "Titulo: "+ titulo+" Autor: "+autor;
    }
}