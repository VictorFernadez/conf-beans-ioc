package com.coudevi.services;

import com.coudevi.models.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidosService {
    private List<Pedido> pedidos = new ArrayList<>();
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public List<Pedido> obtenerPedidos(){
        return pedidos;
    }
}
