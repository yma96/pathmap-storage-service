package org.commonjava.service.storage.dto;

import java.util.Set;

/**
 * Delete multiple paths in one filesystem.
 */
public class BatchDeleteRequest
{
    private Set<String> paths;

    private String filesystem;

    public Set<String> getPaths() {
        return paths;
    }

    public void setPaths(Set<String> paths) {
        this.paths = paths;
    }

    public String getFilesystem() {
        return filesystem;
    }

    public void setFilesystem(String filesystem) {
        this.filesystem = filesystem;
    }

    @Override
    public String toString() {
        return "BatchDeleteRequest{" +
                "paths=" + paths +
                ", filesystem='" + filesystem + '\'' +
                '}';
    }
}