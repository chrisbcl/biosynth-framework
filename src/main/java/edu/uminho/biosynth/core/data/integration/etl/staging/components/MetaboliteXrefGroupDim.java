package edu.uminho.biosynth.core.data.integration.etl.staging.components;

// Generated 14-Feb-2014 20:21:31 by Hibernate Tools 4.0.0

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

/**
 * MetaboliteXrefGroupDim generated by hbm2java
 */
@Entity
@Table(name = "metabolite_xref_group_dim")
public class MetaboliteXrefGroupDim implements java.io.Serializable {

	private int id;
	private Set<MetaboliteXrefBridge> metaboliteXrefBridges = new HashSet<MetaboliteXrefBridge>(
			0);
	private Set<MetaboliteStga> metaboliteStgas = new HashSet<MetaboliteStga>(0);

	public MetaboliteXrefGroupDim() {
	}

	public MetaboliteXrefGroupDim(int id) {
		this.id = id;
	}

	public MetaboliteXrefGroupDim(int id,
			Set<MetaboliteXrefBridge> metaboliteXrefBridges,
			Set<MetaboliteStga> metaboliteStgas) {
		this.id = id;
		this.metaboliteXrefBridges = metaboliteXrefBridges;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteXrefGroupDim")
	public Set<MetaboliteXrefBridge> getMetaboliteXrefBridges() {
		return this.metaboliteXrefBridges;
	}

	public void setMetaboliteXrefBridges(
			Set<MetaboliteXrefBridge> metaboliteXrefBridges) {
		this.metaboliteXrefBridges = metaboliteXrefBridges;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteXrefGroupDim")
	public Set<MetaboliteStga> getMetaboliteStgas() {
		return this.metaboliteStgas;
	}

	public void setMetaboliteStgas(Set<MetaboliteStga> metaboliteStgas) {
		this.metaboliteStgas = metaboliteStgas;
	}

}
