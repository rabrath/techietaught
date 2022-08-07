package com.techietaught.javaBookVersion.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookVersionHead")
public class TechBookVersionHead extends BaseEntity{

	String versionedTechBookType;
	String versionedTechBookId;
	int headVersionNumber;
	
	public TechBookVersionHead() {
		
	}

	public TechBookVersionHead(String versionedTechBookType, String versionedTechBookId, int headVersionNumber) {
		super();
		this.versionedTechBookType = versionedTechBookType;
		this.versionedTechBookId = versionedTechBookId;
		this.headVersionNumber = headVersionNumber;
	}

	public String getVersionedTechBookType() {
		return versionedTechBookType;
	}

	public void setVersionedTechBookType(String versionedTechBookType) {
		this.versionedTechBookType = versionedTechBookType;
	}

	public String getVersionedTechBookId() {
		return versionedTechBookId;
	}

	public void setVersionedTechBookId(String versionedTechBookId) {
		this.versionedTechBookId = versionedTechBookId;
	}

	public int getHeadVersionNumber() {
		return headVersionNumber;
	}

	public void setHeadVersionNumber(int headVersionNumber) {
		this.headVersionNumber = headVersionNumber;
	}
	
	public void incrementVersionNumber() {
		this.headVersionNumber++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(headVersionNumber, versionedTechBookId, versionedTechBookType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof TechBookVersionHead)) {
			return false;
		}
		TechBookVersionHead other = (TechBookVersionHead) obj;
		return headVersionNumber == other.headVersionNumber
				&& Objects.equals(versionedTechBookId, other.versionedTechBookId)
				&& Objects.equals(versionedTechBookType, other.versionedTechBookType);
	}

	@Override
	public String toString() {
		return "TechBookVersionHead [versionedTechBookType=" + versionedTechBookType + ", versionedTechBookId="
				+ versionedTechBookId + ", headVersionNumber=" + headVersionNumber + "]";
	}
	
}
