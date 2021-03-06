/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02.implementation;

import com.microsoft.azure.management.storagesync.v2018_04_02.ServerEndpoint;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.storagesync.v2018_04_02.ServerEndpointUpdateParameters;
import java.util.Map;
import rx.functions.Func1;

class ServerEndpointImpl extends CreatableUpdatableImpl<ServerEndpoint, ServerEndpointInner, ServerEndpointImpl> implements ServerEndpoint, ServerEndpoint.Definition, ServerEndpoint.Update {
    private final StorageSyncManager manager;
    private String resourceGroupName;
    private String storageSyncServiceName;
    private String syncGroupName;
    private String serverEndpointName;
    private ServerEndpointUpdateParameters updateParameter;

    ServerEndpointImpl(String name, StorageSyncManager manager) {
        super(name, new ServerEndpointInner());
        this.manager = manager;
        // Set resource name
        this.serverEndpointName = name;
        //
        this.updateParameter = new ServerEndpointUpdateParameters();
    }

    ServerEndpointImpl(ServerEndpointInner inner, StorageSyncManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverEndpointName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.storageSyncServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageSyncServices");
        this.syncGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "syncGroups");
        this.serverEndpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "serverEndpoints");
        //
        this.updateParameter = new ServerEndpointUpdateParameters();
    }

    @Override
    public StorageSyncManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerEndpoint> createResourceAsync() {
        ServerEndpointsInner client = this.manager().inner().serverEndpoints();
        return client.createAsync(this.resourceGroupName, this.storageSyncServiceName, this.syncGroupName, this.serverEndpointName, this.inner())
            .map(new Func1<ServerEndpointInner, ServerEndpointInner>() {
               @Override
               public ServerEndpointInner call(ServerEndpointInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerEndpoint> updateResourceAsync() {
        ServerEndpointsInner client = this.manager().inner().serverEndpoints();
        return client.updateAsync(this.resourceGroupName, this.storageSyncServiceName, this.syncGroupName, this.serverEndpointName, this.updateParameter)
            .map(new Func1<ServerEndpointInner, ServerEndpointInner>() {
               @Override
               public ServerEndpointInner call(ServerEndpointInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerEndpointInner> getInnerAsync() {
        ServerEndpointsInner client = this.manager().inner().serverEndpoints();
        return client.getAsync(this.resourceGroupName, this.storageSyncServiceName, this.syncGroupName, this.serverEndpointName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ServerEndpointUpdateParameters();
    }

    @Override
    public String cloudTiering() {
        return this.inner().cloudTiering();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String lastOperationName() {
        return this.inner().lastOperationName();
    }

    @Override
    public String lastWorkflowId() {
        return this.inner().lastWorkflowId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String serverLocalPath() {
        return this.inner().serverLocalPath();
    }

    @Override
    public String serverResourceId() {
        return this.inner().serverResourceId();
    }

    @Override
    public Object syncStatus() {
        return this.inner().syncStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Integer volumeFreeSpacePercent() {
        return this.inner().volumeFreeSpacePercent();
    }

    @Override
    public ServerEndpointImpl withExistingSyncGroup(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.storageSyncServiceName = storageSyncServiceName;
        this.syncGroupName = syncGroupName;
        return this;
    }

    @Override
    public ServerEndpointImpl withFriendlyName(String friendlyName) {
        this.inner().withFriendlyName(friendlyName);
        return this;
    }

    @Override
    public ServerEndpointImpl withLastOperationName(String lastOperationName) {
        this.inner().withLastOperationName(lastOperationName);
        return this;
    }

    @Override
    public ServerEndpointImpl withLastWorkflowId(String lastWorkflowId) {
        this.inner().withLastWorkflowId(lastWorkflowId);
        return this;
    }

    @Override
    public ServerEndpointImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public ServerEndpointImpl withServerLocalPath(String serverLocalPath) {
        this.inner().withServerLocalPath(serverLocalPath);
        return this;
    }

    @Override
    public ServerEndpointImpl withServerResourceId(String serverResourceId) {
        this.inner().withServerResourceId(serverResourceId);
        return this;
    }

    @Override
    public ServerEndpointImpl withSyncStatus(Object syncStatus) {
        this.inner().withSyncStatus(syncStatus);
        return this;
    }

    @Override
    public ServerEndpointImpl withTags(Map<String, String> tags) {
        this.updateParameter.withTags(tags);
        return this;
    }

    @Override
    public ServerEndpointImpl withCloudTiering(String cloudTiering) {
        if (isInCreateMode()) {
            this.inner().withCloudTiering(cloudTiering);
        } else {
            this.updateParameter.withCloudTiering(cloudTiering);
        }
        return this;
    }

    @Override
    public ServerEndpointImpl withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent) {
        if (isInCreateMode()) {
            this.inner().withVolumeFreeSpacePercent(volumeFreeSpacePercent);
        } else {
            this.updateParameter.withVolumeFreeSpacePercent(volumeFreeSpacePercent);
        }
        return this;
    }

}
