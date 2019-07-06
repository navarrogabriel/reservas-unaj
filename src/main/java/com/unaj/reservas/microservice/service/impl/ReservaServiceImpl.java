package com.unaj.reservas.microservice.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unaj.reservas.microservice.dominio.Estado;
import com.unaj.reservas.microservice.dominio.Producto;
import com.unaj.reservas.microservice.dominio.Reserva;
import com.unaj.reservas.microservice.dominio.Usuario;
import com.unaj.reservas.microservice.exception.ProductoNotFoundException;
import com.unaj.reservas.microservice.exception.UsuarioNotFoundException;
import com.unaj.reservas.microservice.repository.EstadoRepository;
import com.unaj.reservas.microservice.repository.ProductoRepository;
import com.unaj.reservas.microservice.repository.ReservaRepository;
import com.unaj.reservas.microservice.repository.UsuarioRepository;
import com.unaj.reservas.microservice.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	@Autowired
	private ProductoRepository productoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public List<Reserva> getAllReservas() {
		return (List<Reserva>) reservaRepository.findAll();
	}

	@Override
	public List<Reserva> getAllReservasByUsuario(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createReserva(Long idProducto, Long idUsuario, LocalDate fechaInicio, LocalDate fechaFin)
			throws UsuarioNotFoundException, ProductoNotFoundException {

		Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
		if (usuario.isEmpty()) {
			throw new UsuarioNotFoundException();
		}

		Optional<Producto> producto = productoRepository.findById(idProducto);
		checkProductoNotEmpty(producto);
		checkProductoEstadoHabilitado(producto.get());

		Reserva reserva = new Reserva();
		reserva.setUsuario(usuario.get());
		reserva.setProducto(producto.get());
		reserva.setCodigo(UUID.randomUUID().toString());
		reserva.setFechaInicio(getDateFromLocalDate(fechaInicio));
		reserva.setFechaFin(getDateFromLocalDate(fechaFin));
		// guardamos reserva
		reservaRepository.save(reserva);

		// actualizamos el estado del producto
		Optional<Estado> estado = estadoRepository.findById(2L);
		producto.get().setEstado(estado.get());
		productoRepository.save(producto.get());
	}

	private void checkProductoEstadoHabilitado(Producto producto) {
		if (producto.getEstado().getId() == 2) {
			throw new RuntimeException();
		}
	}

	private void checkProductoNotEmpty(Optional<Producto> producto) throws ProductoNotFoundException {
		if (producto.isEmpty()) {
			throw new ProductoNotFoundException();
		}
	}

	private Date getDateFromLocalDate(LocalDate dateToConvert) {
		return java.util.Date.from(dateToConvert.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

}
