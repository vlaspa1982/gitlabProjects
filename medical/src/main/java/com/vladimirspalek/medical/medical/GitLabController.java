package com.vladimirspalek.medical.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class GitLabController {
	
	 @Autowired
	 GitLabService gitLabService;
	 
	@RequestMapping("/projects")
	public GitLabDto getProjects() {
		return gitLabService.getProjects();
	}

}
