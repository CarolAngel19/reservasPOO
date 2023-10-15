package org.example;

class Restaurante implements Reservable {
    String nombre;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva en el restaurante " + nombre);
    }
}
