package com.grupo19.GastroReserva.application.usecases.reserva;

import com.grupo19.GastroReserva.application.gateways.reserva.AlterarDataReservaInterface;
import com.grupo19.GastroReserva.domain.entities.reserva.Reserva;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlterarDataReservaTest {
    @Test
    public void deveAlterarDataReserva() {
        AlterarDataReservaInterface mockInterface = mock(AlterarDataReservaInterface.class);
        Reserva reserva = new Reserva();
        reserva.setData(LocalDate.of(2023, 10, 10));

        when(mockInterface.alterarDataReserva(reserva)).thenReturn(reserva);

        AlterarDataReserva alterarDataReserva = new AlterarDataReserva(mockInterface);
        Reserva result = alterarDataReserva.alterarDataReserva(reserva);

        assertNotNull(result);
        assertEquals(LocalDate.of(2023, 10, 10), result.getData());
    }
}
