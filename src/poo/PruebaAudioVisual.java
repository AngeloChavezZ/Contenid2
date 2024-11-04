package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        // Crear y probar una película
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        Actor actor = new Actor("Leonardo DiCaprio", 45, "Protagonista");
        pelicula.agregarActor(actor);
        pelicula.mostrarDetalles();

        // Crear y probar una serie de TV
        SerieDeTV serie = new SerieDeTV("Stranger Things", 50, "Ciencia Ficción");
        Temporada temporada1 = new Temporada(1, java.util.Arrays.asList("Episodio 1", "Episodio 2"));
        serie.agregarTemporada(temporada1);
        serie.mostrarDetalles();

        // Crear y probar un documental
        Documental documental = new Documental("Nuestro Planeta", 90, "Naturaleza", "Medio Ambiente");
        Investigador investigador = new Investigador("Dr. Jane Goodall", "Biología", "Universidad de Cambridge");
        documental.agregarInvestigador(investigador);
        documental.mostrarDetalles();

        // Crear y probar un video de YouTube
        VideoYouTube video = new VideoYouTube("Java Tutorial", 15, "Educativo", "ProgrammingWithMosh", 100000);
        video.mostrarDetalles();

        // Crear y probar un cortometraje
        Cortometraje corto = new Cortometraje("La Partida", 20, "Drama", "Carlos Lopez", 20);
        corto.mostrarDetalles();
    }
}


