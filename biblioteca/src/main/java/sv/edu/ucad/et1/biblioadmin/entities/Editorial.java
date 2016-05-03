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
@Table(name="editorial")
@Access(value=AccessType.PROPERTY)
public class Editorial {
	
	private int codedit;
	private String nomedit;
	private String ciuedit;
	private String paiedit;
	private String webedit;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codedit", updatable=false)
	public int getCodedit() {
		return codedit;
	}
	public void setCodedit(int codedit) {
		this.codedit = codedit;
	}
	@Column(name="nomedit", updatable=false)
	public String getNomedit() {
		return nomedit;
	}
	public void setNomedit(String nomedit) {
		this.nomedit = nomedit;
	}
	@Column(name="ciuedit", updatable=false)
	public String getCiuedit() {
		return ciuedit;
	}
	public void setCiuedit(String ciuedit) {
		this.ciuedit = ciuedit;
	}
	@Column(name="paiedit", updatable=false)
	public String getPaiedit() {
		return paiedit;
	}
	public void setPaiedit(String paiedit) {
		this.paiedit = paiedit;
	}
	@Column(name="webedit", updatable=false)
	public String getWebedit() {
		return webedit;
	}
	public void setWebedit(String webedit) {
		this.webedit = webedit;
	}
	
	
	
	

}
