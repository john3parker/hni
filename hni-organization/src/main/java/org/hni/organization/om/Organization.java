package org.hni.organization.om;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hni.om.IdProvider;

/**
 * An organization is an entity that provides customer support
 * e.g. NI Personnel, NGO's, Schools, etc
 * 
 * All users are aligned to an organization in some way via a Role
 * 
 * @author jeff3parker
 *
 */
@Entity
@Table(name = "organizations")
public class Organization implements IdProvider, Serializable {
	private static final long serialVersionUID = 2775752378663345293L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	protected Long id;
	
	@Column(name="name") private String name;

	public Organization() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}