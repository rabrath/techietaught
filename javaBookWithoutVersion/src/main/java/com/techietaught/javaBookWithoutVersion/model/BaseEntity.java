package com.techietaught.javaBookWithoutVersion.model;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public abstract class BaseEntity {

	@Id
	private String id;

	@CreatedDate
	private Date createdAt;

	@LastModifiedDate
	private Date lastModifiedAt;

	@CreatedBy
	private String createdBy;

	@LastModifiedBy
	private String lastModifiedBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, createdBy, id, lastModifiedAt, lastModifiedBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BaseEntity)) {
			return false;
		}
		BaseEntity other = (BaseEntity) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(createdBy, other.createdBy)
				&& Objects.equals(id, other.id) && Objects.equals(lastModifiedAt, other.lastModifiedAt)
				&& Objects.equals(lastModifiedBy, other.lastModifiedBy);
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", createdAt=" + createdAt + ", lastModifiedAt=" + lastModifiedAt
				+ ", createdBy=" + createdBy + ", lastModifiedBy=" + lastModifiedBy + "]";
	}	
}
