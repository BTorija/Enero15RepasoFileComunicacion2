package com.corenetworks.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido implements Serializable {
    private int idPedido;
    private String nombreCliente;
    private double importe;
    private String formaEnvio;

}
