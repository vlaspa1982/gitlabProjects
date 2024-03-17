package com.vladimirspalek.medical.medical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GitLabController {
	
	 @Autowired
	 GitLabService gitLabService;
	 
	@RequestMapping("/projects")
	Collection<GitLabDto> getProjects() {
		ArrayList<GitLabDto> dtos = new ArrayList<>();
		for (GitLabDto dto: dtos) {
			dtos.add(gitLabService.getProjects());
		}
		return dtos;
	}
	
}
