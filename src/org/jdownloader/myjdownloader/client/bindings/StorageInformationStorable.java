package org.jdownloader.myjdownloader.client.bindings;

public class StorageInformationStorable {

    private String path  = null;
    private String error = null;

    public String getError() {
        return this.error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getFree() {
        return this.free;
    }

    public void setFree(long free) {
        this.free = free;
    }

    private long size = -1;
    private long free = -1;
    
}
