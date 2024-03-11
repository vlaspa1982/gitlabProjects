package com.vladimirspalek.medical.medical;

public class GitLabApiDto {
	private Namespace namespace;
	private Root root;
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}
	public Root getRoot() {
		return root;
	}
	public void setRoot(Root root) {
		this.root = root;
	}
}
