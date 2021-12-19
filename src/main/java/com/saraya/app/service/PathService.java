package com.saraya.app.service;

import com.saraya.app.model.Path;

import java.util.Set;

public interface PathService {
	public Path getPathByName(String name);
	public Path getPathById(Long id);
	public Path createPath(Path path);

	// TODO build this method, define attributes than can be modified
	default Path modifyPathInfo(Path path) {
		return null;
	}
	public void deletePathById(Long idPath);
	public Set<Path> allpaths();
}
