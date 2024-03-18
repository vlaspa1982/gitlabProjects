package com.vladimirspalek.medical.medical;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



public class GitLabConnector {
	private static java.lang.String url = "https://gitlab.com/api/v4/projects";
	

	
	public GitLabApiDto[] getProjects() {
        RestTemplate template = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        
        ResponseEntity<GitLabApiDto[]> response = template.getForEntity(uri, GitLabApiDto[].class);
       GitLabApiDto[] apiDtos = response.getBody();
       
       return apiDtos;
	}
}

