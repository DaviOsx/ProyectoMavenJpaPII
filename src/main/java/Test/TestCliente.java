package Test;

import Dao.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TblCliente cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//insertamos datos
		cliente.setNombre("nalle");
		cliente.setApellido("chero");
		cliente.setDni("466654222");
		cliente.setEmail("mmego@gmail.com");
		cliente.setTelf("999387459");
		cliente.setSexo("f");
		cliente.setNacionalidad("Peru");
		//invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);

	}//fin del metodo principal...

}   //fin de la clase...
