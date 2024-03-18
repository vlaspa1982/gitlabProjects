package com.vladimirspalek.medical.medical;

import java.util.ArrayList;
import java.util.Date;

public class GitLabApiDto {
	public int id;
	public String description;
	public String name;
	public String name_with_namespace;
	public String path;
	public String path_with_namespace;
	public Date created_at;
	public String default_branch;
	public ArrayList<Object> tag_list;
	public ArrayList<Object> topics;
	public String ssh_url_to_repo;
	public String http_url_to_repo;
	public String web_url;
	public String readme_url;
	public int forks_count;
	public Object avatar_url;
	public int star_count;
	public Date last_activity_at;
	public Namespace namespace;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_with_namespace() {
		return name_with_namespace;
	}
	public void setName_with_namespace(String name_with_namespace) {
		this.name_with_namespace = name_with_namespace;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPath_with_namespace() {
		return path_with_namespace;
	}
	public void setPath_with_namespace(String path_with_namespace) {
		this.path_with_namespace = path_with_namespace;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getDefault_branch() {
		return default_branch;
	}
	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}
	public ArrayList<Object> getTag_list() {
		return tag_list;
	}
	public void setTag_list(ArrayList<Object> tag_list) {
		this.tag_list = tag_list;
	}
	public ArrayList<Object> getTopics() {
		return topics;
	}
	public void setTopics(ArrayList<Object> topics) {
		this.topics = topics;
	}
	public String getSsh_url_to_repo() {
		return ssh_url_to_repo;
	}
	public void setSsh_url_to_repo(String ssh_url_to_repo) {
		this.ssh_url_to_repo = ssh_url_to_repo;
	}
	public String getHttp_url_to_repo() {
		return http_url_to_repo;
	}
	public void setHttp_url_to_repo(String http_url_to_repo) {
		this.http_url_to_repo = http_url_to_repo;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getReadme_url() {
		return readme_url;
	}
	public void setReadme_url(String readme_url) {
		this.readme_url = readme_url;
	}
	public int getForks_count() {
		return forks_count;
	}
	public void setForks_count(int forks_count) {
		this.forks_count = forks_count;
	}
	public Object getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(Object avatar_url) {
		this.avatar_url = avatar_url;
	}
	public int getStar_count() {
		return star_count;
	}
	public void setStar_count(int star_count) {
		this.star_count = star_count;
	}
	public Date getLast_activity_at() {
		return last_activity_at;
	}
	public void setLast_activity_at(Date last_activity_at) {
		this.last_activity_at = last_activity_at;
	}
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}
}
