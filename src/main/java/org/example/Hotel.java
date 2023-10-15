package org.example;

class Hotel implements Reservable {
    String nombre;

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva en el hotel " + nombre);
    }
}
