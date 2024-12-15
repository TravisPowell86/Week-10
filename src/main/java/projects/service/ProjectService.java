package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;


public class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	

	public Project addProject(Project project) {
		
		return projectDao.insertProject(project); 
		
	}

//NEW//
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}
	
//NEW//
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchByProjectId(projectId).orElseThrow(()-> new NoSuchElementException(
				"Project with id=" + projectId + " does not exist.\n"));
		
	}
	
}