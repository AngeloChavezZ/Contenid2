package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private int duracion;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, int duracion) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
    }
}
