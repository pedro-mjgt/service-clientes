package pe.edu.cibertec.service_clientes.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-inventario")
public interface ServiceInventarioClient {

    @GetMapping("/inventario")
    String obtenerProductos();

}
