package com.unaj.reservas.microservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unaj.reservas.microservice.exception.EstadoNotFoundException;
import com.unaj.reservas.microservice.exception.TipoProductoNotFoundException;
import com.unaj.reservas.microservice.input.ProductoInput;
import com.unaj.reservas.microservice.response.Respuesta;
import com.unaj.reservas.microservice.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductosRest {

	@Autowired
	private ProductoService productoService;

	@PostMapping("/nuevo")
	public Respuesta crearProducto(@RequestBody ProductoInput productoInput) {
		try {
			productoService.createProducto(productoInput.getDescripcion(), productoInput.getTipoProducto(),
					productoInput.getEstado());
		} catch (TipoProductoNotFoundException | EstadoNotFoundException e) {
			e.printStackTrace();
			return new Respuesta("ERROR", "Error al crear producto");
		}
		Respuesta respuesta = new Respuesta("OK", "Producto Creado");
		return respuesta;
	}
}
