package com.vladimirspalek.medical.medical;

import org.springframework.stereotype.Service;


@Service
public class GitLabService {
	
	public GitLabDto getProjects() {
		GitLabConnector connector = new GitLabConnector();
		GitLabApiDto gitLabApiDto = connector.getProjects();
		return transformDto(gitLabApiDto);
	}
	
    private static GitLabDto transformDto(GitLabApiDto gitLabApiDto) {
        GitLabDto gitLabDto = new GitLabDto();
        
        gitLabDto.setId(gitLabApiDto.getId());
        gitLabDto.setName(gitLabApiDto.getName());
        gitLabDto.setPath(gitLabApiDto.getPath());
        //gitLabDto.setCreateAt((gitLabApiDto.getCreated_at()));
        return gitLabDto;
    }
}
