package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idprodcuto;

	private String descrip;

	private String fechaVenc;

	private int idtipoproducto;

	private String lote;

	private String nomProd;

	private double precio;

	//bi-directional many-to-one association to TblTipoproducto
	@ManyToOne
	@JoinColumn(name="codbarras", referencedColumnName="descripcion")
	private TblTipoproducto tblTipoproducto;

	public TblProducto() {
	}

	public int getIdprodcuto() {
		return this.idprodcuto;
	}

	public void setIdprodcuto(int idprodcuto) {
		this.idprodcuto = idprodcuto;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getFechaVenc() {
		return this.fechaVenc;
	}

	public void setFechaVenc(String fechaVenc) {
		this.fechaVenc = fechaVenc;
	}

	public int getIdtipoproducto() {
		return this.idtipoproducto;
	}

	public void setIdtipoproducto(int idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
	}

	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNomProd() {
		return this.nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public TblTipoproducto getTblTipoproducto() {
		return this.tblTipoproducto;
	}

	public void setTblTipoproducto(TblTipoproducto tblTipoproducto) {
		this.tblTipoproducto = tblTipoproducto;
	}

}