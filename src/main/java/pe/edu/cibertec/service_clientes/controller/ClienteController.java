package pe.edu.cibertec.service_clientes.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.service_clientes.remoteservice.ServiceInventarioClient;

@AllArgsConstructor
@RestController
public class ClienteController {

    private final ServiceInventarioClient serviceInventarioClient;

    @GetMapping("/cliente")
    public String listarClientes() {
        return "Lista de clientes";
    }

    @GetMapping("/cliente-producto")
    public String listarClientesProductos() {
        return serviceInventarioClient.obtenerProductos();
    }

}
