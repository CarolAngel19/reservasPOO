package org.example;

class SalonEventos implements Reservable {
    String nombre;

    public SalonEventos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva en el salón de eventos " + nombre);
    }
}
