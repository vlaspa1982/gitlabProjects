package com.vladimirspalek.medical.medical;

public class GitLabDto {
	private Integer id;
	private String name;
	private String namespaceName;
	private String path;
	private Integer createAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNamespaceName() {
		return namespaceName;
	}
	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}
}
