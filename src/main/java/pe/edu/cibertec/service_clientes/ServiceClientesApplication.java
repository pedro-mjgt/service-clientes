package pe.edu.cibertec.service_clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientesApplication.class, args);
	}

}
