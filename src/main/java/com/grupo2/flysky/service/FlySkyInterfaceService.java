package com.grupo2.flysky.service;

import com.grupo2.flysky.dto.ResponseDto;

public interface FlySkyInterfaceService {

    /*
     *  ResponseDto no seria el objeto final de retorno.
     *
     */

    ResponseDto findAllFlights(); // Buscar vuelos

    ResponseDto buyTicket(Long idFlight); // Comprar o Reservar un Boleto con el numero de Vuelo

    ResponseDto payment(Long idTicket); // Pagar la Compra o Reserva del Boleto

    ResponseDto findClient(Long idClient); // Buscar un cliente, para ver sus Datos e Historial
}
