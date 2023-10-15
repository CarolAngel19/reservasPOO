package org.example;

class Reserva implements Reservable {
    Persona persona;
    String fechaHora;
    String tipoReserva;

    public Reserva(Persona persona, String fechaHora, String tipoReserva) {
        this.persona = persona;
        this.fechaHora = fechaHora;
        this.tipoReserva = tipoReserva;
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva realizada para " + persona.nombre + " el " + fechaHora + " para " + tipoReserva);
    }
}