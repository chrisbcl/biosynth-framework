package edu.uminho.biosynth.core.data.integration.staging.components;

// Generated 12-Feb-2014 16:59:46 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MetaboliteFormulaDim generated by hbm2java
 */
@Entity
@Table(name = "metabolite_formula_dim", uniqueConstraints = @UniqueConstraint(columnNames = "formula"))
public class MetaboliteFormulaDim implements java.io.Serializable {

	private static final long serialVersionUID = -6145111302443332937L;
	
	private int id;
	private String formula;
	private Set<MetaboliteStga> metaboliteStgas = new HashSet<MetaboliteStga>(0);

	public MetaboliteFormulaDim() {
	}

	public MetaboliteFormulaDim(int id) {
		this.id = id;
	}

	public MetaboliteFormulaDim(int id, String formula,
			Set<MetaboliteStga> metaboliteStgas) {
		this.id = id;
		this.formula = formula;
		this.metaboliteStgas = metaboliteStgas;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "formula", unique = true)
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteFormulaDim")
	public Set<MetaboliteStga> getMetaboliteStgas() {
		return this.metaboliteStgas;
	}

	public void setMetaboliteStgas(Set<MetaboliteStga> metaboliteStgas) {
		this.metaboliteStgas = metaboliteStgas;
	}

}
