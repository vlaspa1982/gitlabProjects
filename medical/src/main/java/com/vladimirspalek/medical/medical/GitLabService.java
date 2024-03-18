package com.vladimirspalek.medical.medical;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.parser.Entity;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class GitLabService {
	
	
	
	public GitLabDto[] getProjects() {
		GitLabConnector connector = new GitLabConnector();
		GitLabApiDto[] apiDtos = connector.getProjects();
		GitLabDto[] dtos = new GitLabDto[apiDtos.length];
		for(int i = 0; i< apiDtos.length-1; i++) {
			dtos[i] = transformDto(apiDtos[i]);
		}
		return dtos;
	}
	
    private static GitLabDto transformDto(GitLabApiDto gitLabApiDto) {
        GitLabDto gitLabDto = new GitLabDto();
        
        gitLabDto.setId(gitLabApiDto.getId());
        gitLabDto.setName(gitLabApiDto.getName());
        gitLabDto.setNamespaceName(gitLabApiDto.getNamespace().getName());
        gitLabDto.setPath(gitLabApiDto.getPath());
        gitLabDto.setCreateAt((int)gitLabApiDto.getCreated_at().getTime());
        return gitLabDto;
    }
}
