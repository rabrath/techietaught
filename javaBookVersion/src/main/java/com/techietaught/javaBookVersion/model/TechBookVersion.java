package com.techietaught.javaBookVersion.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookVersions")
public class TechBookVersion extends BaseEntity{
	
	String versionedTechBookType;
	String versionedTechBookId;
	int version;
	Object snapshot;
	
	public TechBookVersion() {
		
	}

	public TechBookVersion(String versionedTechBookType, String versionedTechBookId, int version, Object snapshot) {
		super();
		this.versionedTechBookType = versionedTechBookType;
		this.versionedTechBookId = versionedTechBookId;
		this.version = version;
		this.snapshot = snapshot;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Object getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(Object snapshot) {
		this.snapshot = snapshot;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(snapshot, version, versionedTechBookId, versionedTechBookType);
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
		if (!(obj instanceof TechBookVersion)) {
			return false;
		}
		TechBookVersion other = (TechBookVersion) obj;
		return Objects.equals(snapshot, other.snapshot) && version == other.version
				&& Objects.equals(versionedTechBookId, other.versionedTechBookId)
				&& Objects.equals(versionedTechBookType, other.versionedTechBookType);
	}

	@Override
	public String toString() {
		return "TechBookVersion [versionedTechBookType=" + versionedTechBookType + ", versionedTechBookId="
				+ versionedTechBookId + ", version=" + version + ", snapshot=" + snapshot + "]";
	}

}
