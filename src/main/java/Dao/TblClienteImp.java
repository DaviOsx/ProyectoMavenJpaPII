package Dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

// AGREGAR  E IMPLEMENTAR METODOS  "add"

public class TblClienteImp  implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		
		//ESTABLECER LA CONEXION  DE LA UNIDAD DE PERSISTENCE		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenJpaPII");
		
		// GENERAR LA ENTIDADES
		EntityManager emanager= em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
			emanager.getTransaction().begin();
			
			//REGISTAR BASE DE DATOS
			emanager.persist(cliente);
			
			// EMITIR MENSAJE POR CONSOLA
			System.out.println("Cliente registrado en la BD");
			
			// CONFIRMAR LA TRANSACCION
			emanager.getTransaction().commit();
			
			//CORRAMOS PROGRAMA
			emanager.close();	
		
	} // FIN DE METODO REGISTRAR
	
	

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	} // FIN DE METODO ACTUALIZAR

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	} // FIN DE METODO ELIMINAR
 
	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	} // FIN DE METODO BUSCAR
	
	@Override
	public List<TblCliente> ListarCliente() {
		// TODO Auto-generated method stub
		return null;
	} // FIN DE METODO LISTAR

} // FIN DE CLASE
