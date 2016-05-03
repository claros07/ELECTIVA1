package sv.edu.ucad.et1.biblioadmin.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@Access(value=AccessType.PROPERTY)
public class Usuarios {
	
	private int codusu;
	
	private String nomusu;
	
	private String apeusu;
	
	private String nivusu;
	
	private String clavusu;
	
	private String carusu;
	
	private String mailusu;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codusu", updatable=false)
	public int getCodusu() {
		return codusu;
	}
	public void setCodusu(int codusu) {
		this.codusu = codusu;
	}
	@Column(name="nomusu", nullable=false)
	public String getNomusu() {
		return nomusu;
	}
	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}
	@Column(name="apeusu", nullable=false)
	public String getApeusu() {
		return apeusu;
	}
	public void setApeusu(String apeusu) {
		this.apeusu = apeusu;
	}
	@Column(name="nivusu", nullable=false)
	public String getNivusu() {
		return nivusu;
	}
	public void setNivusu(String nivusu) {
		this.nivusu = nivusu;
	}
	@Column(name="clavusu", nullable=false)
	public String getClavusu() {
		return clavusu;
	}
	public void setClavusu(String clavusu) {
		this.clavusu = clavusu;
	}
	@Column(name="carusu", nullable=false)
	public String getCarusu() {
		return carusu;
	}
	public void setCarusu(String carusu) {
		this.carusu = carusu;
	}
	@Column(name="mailusu", nullable=false)
	public String getMailusu() {
		return mailusu;
	}
	public void setMailusu(String mailusu) {
		this.mailusu = mailusu;
	}

}


