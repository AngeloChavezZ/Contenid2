package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int vistas;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int vistas) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.vistas = vistas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Vistas: " + vistas);
    }
}
