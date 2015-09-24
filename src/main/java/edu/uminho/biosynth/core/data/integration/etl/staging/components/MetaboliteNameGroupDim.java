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
 * MetaboliteNameGroupDim generated by hbm2java
 */
@Entity
@Table(name = "metabolite_name_group_dim")
public class MetaboliteNameGroupDim implements java.io.Serializable {

	private int id;
	private Set<MetaboliteStga> metaboliteStgas = new HashSet<MetaboliteStga>(0);
	private Set<MetaboliteNameBridge> metaboliteNameBridges = new HashSet<MetaboliteNameBridge>(
			0);

	public MetaboliteNameGroupDim() {
	}

	public MetaboliteNameGroupDim(int id) {
		this.id = id;
	}

	public MetaboliteNameGroupDim(int id, Set<MetaboliteStga> metaboliteStgas,
			Set<MetaboliteNameBridge> metaboliteNameBridges) {
		this.id = id;
		this.metaboliteStgas = metaboliteStgas;
		this.metaboliteNameBridges = metaboliteNameBridges;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteNameGroupDim")
	public Set<MetaboliteStga> getMetaboliteStgas() {
		return this.metaboliteStgas;
	}

	public void setMetaboliteStgas(Set<MetaboliteStga> metaboliteStgas) {
		this.metaboliteStgas = metaboliteStgas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteNameGroupDim")
	public Set<MetaboliteNameBridge> getMetaboliteNameBridges() {
		return this.metaboliteNameBridges;
	}

	public void setMetaboliteNameBridges(
			Set<MetaboliteNameBridge> metaboliteNameBridges) {
		this.metaboliteNameBridges = metaboliteNameBridges;
	}

}
