package com.anmol.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="role_permission")
@NamedQuery(name="RolePermission.findAll", query="SELECT r FROM RolePermission r")
public class RolePermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refId;

	@ManyToOne
	private Permission permission;

	@ManyToOne
	private Role role;

	public RolePermission() {
	}

	public int getRefId() {
		return this.refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}