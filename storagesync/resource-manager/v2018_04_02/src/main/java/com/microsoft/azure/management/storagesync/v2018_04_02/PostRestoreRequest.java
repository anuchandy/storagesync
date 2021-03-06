/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Post Restore Request.
 */
public class PostRestoreRequest {
    /**
     * Post Restore partition.
     */
    @JsonProperty(value = "partition")
    private String partition;

    /**
     * Post Restore replica group.
     */
    @JsonProperty(value = "replicaGroup")
    private String replicaGroup;

    /**
     * Post Restore request id.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * Post Restore Azure file share uri.
     */
    @JsonProperty(value = "azureFileShareUri")
    private String azureFileShareUri;

    /**
     * Post Restore Azure status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Post Restore Azure source azure file share uri.
     */
    @JsonProperty(value = "sourceAzureFileShareUri")
    private String sourceAzureFileShareUri;

    /**
     * Post Restore Azure failed file list.
     */
    @JsonProperty(value = "failedFileList")
    private String failedFileList;

    /**
     * Post Restore restore file spec array.
     */
    @JsonProperty(value = "restoreFileSpec")
    private List<RestoreFileSpec> restoreFileSpec;

    /**
     * Get post Restore partition.
     *
     * @return the partition value
     */
    public String partition() {
        return this.partition;
    }

    /**
     * Set post Restore partition.
     *
     * @param partition the partition value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * Get post Restore replica group.
     *
     * @return the replicaGroup value
     */
    public String replicaGroup() {
        return this.replicaGroup;
    }

    /**
     * Set post Restore replica group.
     *
     * @param replicaGroup the replicaGroup value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withReplicaGroup(String replicaGroup) {
        this.replicaGroup = replicaGroup;
        return this;
    }

    /**
     * Get post Restore request id.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set post Restore request id.
     *
     * @param requestId the requestId value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get post Restore Azure file share uri.
     *
     * @return the azureFileShareUri value
     */
    public String azureFileShareUri() {
        return this.azureFileShareUri;
    }

    /**
     * Set post Restore Azure file share uri.
     *
     * @param azureFileShareUri the azureFileShareUri value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withAzureFileShareUri(String azureFileShareUri) {
        this.azureFileShareUri = azureFileShareUri;
        return this;
    }

    /**
     * Get post Restore Azure status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set post Restore Azure status.
     *
     * @param status the status value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get post Restore Azure source azure file share uri.
     *
     * @return the sourceAzureFileShareUri value
     */
    public String sourceAzureFileShareUri() {
        return this.sourceAzureFileShareUri;
    }

    /**
     * Set post Restore Azure source azure file share uri.
     *
     * @param sourceAzureFileShareUri the sourceAzureFileShareUri value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withSourceAzureFileShareUri(String sourceAzureFileShareUri) {
        this.sourceAzureFileShareUri = sourceAzureFileShareUri;
        return this;
    }

    /**
     * Get post Restore Azure failed file list.
     *
     * @return the failedFileList value
     */
    public String failedFileList() {
        return this.failedFileList;
    }

    /**
     * Set post Restore Azure failed file list.
     *
     * @param failedFileList the failedFileList value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withFailedFileList(String failedFileList) {
        this.failedFileList = failedFileList;
        return this;
    }

    /**
     * Get post Restore restore file spec array.
     *
     * @return the restoreFileSpec value
     */
    public List<RestoreFileSpec> restoreFileSpec() {
        return this.restoreFileSpec;
    }

    /**
     * Set post Restore restore file spec array.
     *
     * @param restoreFileSpec the restoreFileSpec value to set
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withRestoreFileSpec(List<RestoreFileSpec> restoreFileSpec) {
        this.restoreFileSpec = restoreFileSpec;
        return this;
    }

}
