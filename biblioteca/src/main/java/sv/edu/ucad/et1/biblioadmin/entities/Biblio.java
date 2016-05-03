package sv.edu.ucad.et1.biblioadmin.entities;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="biblio")
@Access(value=AccessType.PROPERTY)
public class Biblio {
	private int codbib;
	
	private String edibib;
	
	private Date fpubib;
	
	private int isbbib;
	
	private int ejbib;
	
	private int volbib;
	
	private int pagbib;
	
	private String titbib;
	
	private String cvñbib;
	
	private String dewbib;
	
	private String cuttbib;
	
	private String ubibib;
	
	private String viadbib;
	
	public Editorial edit;

	//asociacion uno auno
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codedit")
	public Editorial getEdit(){
		return edit;
	}
	public void setEdit(Editorial edit){
		this.edit=edit;
	}
	
	
	//propiedad vendera que se dclara como @ transient
	private boolean estado;
	@Transient
	public boolean isEstado(){
		return estado;
	}
	public void setEstado(boolean estado){
		this.estado=estado;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codbib")
	public int getCodbib() {
		return codbib;
	}

	public void setCodbib(int codbib) {
		this.codbib = codbib;
	}
	@Column(name="edibib")
	public String getEdibib() {
		return edibib;
	}

	public void setEdibib(String edibib) {
		this.edibib = edibib;
	}
	@Column(name="fpubib")
	public Date getFpubib() {
		return fpubib;
	}

	public void setFpubib(Date fpubib) {
		this.fpubib = fpubib;
	}
	@Column(name="isbbib")
	public int getIsbbib() {
		return isbbib;
	}

	public void setIsbbib(int isbbib) {
		this.isbbib = isbbib;
	}
	@Column(name="ejbib")
	public int getEjbib() {
		return ejbib;
	}

	public void setEjbib(int ejbib) {
		this.ejbib = ejbib;
	}
	@Column(name="volbib")
	public int getVolbib() {
		return volbib;
	}

	public void setVolbib(int volbib) {
		this.volbib = volbib;
	}
	@Column(name="pagbib")
	public int getPagbib() {
		return pagbib;
	}

	public void setPagbib(int pagbib) {
		this.pagbib = pagbib;
	}
	@Column(name="titbib")
	public String getTitbib() {
		return titbib;
	}

	public void setTitbib(String titbib) {
		this.titbib = titbib;
	}
	@Column(name="cvñbib")
	public String getCvñbib() {
		return cvñbib;
	}

	public void setCvñbib(String cvñbib) {
		this.cvñbib = cvñbib;
	}
	@Column(name="dewbib")
	public String getDewbib() {
		return dewbib;
	}

	public void setDewbib(String dewbib) {
		this.dewbib = dewbib;
	}
	@Column(name="cuttbib")
	public String getCuttbib() {
		return cuttbib;
	}

	public void setCuttbib(String cuttbib) {
		this.cuttbib = cuttbib;
	}
	@Column(name="ubibib")
	public String getUbibib() {
		return ubibib;
	}

	public void setUbibib(String ubibib) {
		this.ubibib = ubibib;
	}
	@Column(name="viadbib")
	public String getViadbib() {
		return viadbib;
	}

	public void setViadbib(String viadbib) {
		this.viadbib = viadbib;
	}
	}//fin de biblio
