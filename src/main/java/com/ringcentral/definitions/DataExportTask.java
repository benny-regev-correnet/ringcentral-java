package com.ringcentral.definitions;


public class DataExportTask {
    /**
     * Canonical URI of a task
     */
    public String uri;
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Task creation datetime
     */
    public String creationTime;
    /**
     * Task last modification datetime
     */
    public String lastModifiedTime;
    /**
     * Task status
     * Enum: Accepted, InProgress, Completed, Failed, Expired
     */
    public String status;
    /**
     * Task creator information
     */
    public CreatorInfo creator;
    /**
     * Information specififed in request
     */
    public SpecificInfo specific;
    /**
     * Data collection sets. Returned by task ID
     */
    public ExportTaskResultInfo[] datasets;

    public DataExportTask uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DataExportTask id(String id) {
        this.id = id;
        return this;
    }

    public DataExportTask creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public DataExportTask lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public DataExportTask status(String status) {
        this.status = status;
        return this;
    }

    public DataExportTask creator(CreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public DataExportTask specific(SpecificInfo specific) {
        this.specific = specific;
        return this;
    }

    public DataExportTask datasets(ExportTaskResultInfo[] datasets) {
        this.datasets = datasets;
        return this;
    }

}
