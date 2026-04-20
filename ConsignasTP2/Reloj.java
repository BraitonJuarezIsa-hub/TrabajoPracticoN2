static class Reloj {

    int hora;
    int minutos;
    int segundos;

    Reloj() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    void establecerHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }
    void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }
    }
}

public static void main() {
    Reloj miReloj = new Reloj();

    miReloj.establecerHora(10, 30, 45);
    miReloj.mostrarHora(); // Muestra: 10:30:45

    miReloj.avanzarSegundo();
    miReloj.mostrarHora(); // Muestra: 10:30:46
}
