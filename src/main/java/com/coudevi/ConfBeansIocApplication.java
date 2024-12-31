package com.coudevi;

import com.coudevi.models.Pedido;
import com.coudevi.services.PedidosService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfBeansIocApplication implements CommandLineRunner {
    private final PedidosService pedidosService;

    public ConfBeansIocApplication(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfBeansIocApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pedidosService.agregarPedido(new Pedido("Laptop", 2));
        pedidosService.agregarPedido(new Pedido("Teléfono", 4));
        pedidosService.obtenerPedidos().forEach(System.out::println);
    }
}
