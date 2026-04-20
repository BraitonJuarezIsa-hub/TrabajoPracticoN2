class Libro {

    String titulo;
    String autor;
    String isbn;
    String estado;

    Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = "Disponible";
    }

    void prestar() {
        if (estado.equals("Disponible")) {
            estado = "Prestado";
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    void devolver() {
        estado = "Disponible";
    }

    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + estado);
        System.out.println("                  ");
    }
}
    void main() {
        Libro miLibro = new Libro("El Hobbit", "J.R.R. Tolkien", "978-0345339683");

        miLibro.mostrarInformacion();

        miLibro.prestar();
        miLibro.mostrarInformacion();

        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
