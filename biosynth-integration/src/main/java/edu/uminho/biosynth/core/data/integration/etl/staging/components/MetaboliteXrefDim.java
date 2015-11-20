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
 * MetaboliteXrefDim generated by hbm2java
 */
@Entity
@Table(name = "metabolite_xref_dim")
public class MetaboliteXrefDim implements java.io.Serializable {

	private int id;
	private String value;
	private String source;
	private String type;
	private Set<MetaboliteXrefBridge> metaboliteXrefBridges = new HashSet<MetaboliteXrefBridge>(
			0);

	public MetaboliteXrefDim() {
	}

	public MetaboliteXrefDim(int id) {
		this.id = id;
	}

	public MetaboliteXrefDim(int id, String value, String source, String type,
			Set<MetaboliteXrefBridge> metaboliteXrefBridges) {
		this.id = id;
		this.value = value;
		this.source = source;
		this.type = type;
		this.metaboliteXrefBridges = metaboliteXrefBridges;
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

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "source")
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaboliteXrefDim")
	public Set<MetaboliteXrefBridge> getMetaboliteXrefBridges() {
		return this.metaboliteXrefBridges;
	}

	public void setMetaboliteXrefBridges(
			Set<MetaboliteXrefBridge> metaboliteXrefBridges) {
		this.metaboliteXrefBridges = metaboliteXrefBridges;
	}

}