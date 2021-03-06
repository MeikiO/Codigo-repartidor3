package edu.mondragon.mikel_murua.proyecto_repartidor3.repartidores;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepartidorPersistenciaX extends JpaRepository<Repartidor, Long> {
// IMPORTANTE: JpaRepository<clase que se guarda, Long>
	//--> tiene que coincidir el LONG con la variable que se haya puesto como @ID() en la clase que se guarda
}
// Nota: No es necesario proveenr una implentacion explicicita. Lo hace directamente el JPA