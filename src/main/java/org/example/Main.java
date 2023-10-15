package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Carol Angel", "1001234597", "3175678765");

        // Crear una reserva de hotel
        Reservable reservaHotel = new Reserva(persona, "20/11/2023 2:00 PM", "Hotel Santa Bárbara Real");
        reservaHotel.realizarReserva();

        // Crear una reserva de cita médica
        Reservable citaMedica = new CitaMedica("Dr. Sanchez", "Odontologia");
        citaMedica.realizarReserva();

        // Crear una reserva en un restaurante
        Reservable reservaRestaurante = new Restaurante("Santa Fe Cafe & Restaurante");
        reservaRestaurante.realizarReserva();

        // Crear una reserva en un salón de eventos
        Reservable reservaSalonEventos = new SalonEventos("Salón 15 años");
        reservaSalonEventos.realizarReserva();
    }
}