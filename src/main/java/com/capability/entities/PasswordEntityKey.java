package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author dsomajohassula
 * 
 * The primary key class for the password database table.
 * 
 */
@Embeddable
public class PasswordEntityKey implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The map id. */
	@Column(name="MAP_ID", insertable=false, updatable=false)
	private String mapId;

	/** The version id. */
	@Column(name="VERSION_ID", insertable=false, updatable=false)
	private String versionId;

	/** The sector id. */
	@Column(name="SECTOR_ID", insertable=false, updatable=false)
	private String sectorId;

	/**
	 * Instantiates a new password entity key.
	 */
	public PasswordEntityKey() {
	}
	
	/**
	 * Gets the map id.
	 *
	 * @return the map id
	 */
	public String getMapId() {
		return this.mapId;
	}
	
	/**
	 * Sets the map id.
	 *
	 * @param mapId the new map id
	 */
	public void setMapId(String mapId) {
		this.mapId = mapId;
	}
	
	/**
	 * Gets the version id.
	 *
	 * @return the version id
	 */
	public String getVersionId() {
		return this.versionId;
	}
	
	/**
	 * Sets the version id.
	 *
	 * @param versionId the new version id
	 */
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	
	/**
	 * Gets the sector id.
	 *
	 * @return the sector id
	 */
	public String getSectorId() {
		return this.sectorId;
	}
	
	/**
	 * Sets the sector id.
	 *
	 * @param sectorId the new sector id
	 */
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PasswordEntityKey)) {
			return false;
		}
		PasswordEntityKey castOther = (PasswordEntityKey)other;
		return 
			this.mapId.equals(castOther.mapId)
			&& this.versionId.equals(castOther.versionId)
			&& this.sectorId.equals(castOther.sectorId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mapId.hashCode();
		hash = hash * prime + this.versionId.hashCode();
		hash = hash * prime + this.sectorId.hashCode();
		
		return hash;
	}
}