public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = (numeroPaginas > 0) ? numeroPaginas : 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Libro -> Título: " + titulo
                + ", Autor: " + autor
                + ", Páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
