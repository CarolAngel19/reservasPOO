package org.example;
class CitaMedica implements Reservable {
    String doctor;
    String tipoCita;

    public CitaMedica(String doctor, String tipoCita) {
        this.doctor = doctor;
        this.tipoCita = tipoCita;
    }

    @Override
    public void realizarReserva() {
        System.out.println("Cita médica de " + tipoCita + " con el doctor " + doctor);
    }
}
