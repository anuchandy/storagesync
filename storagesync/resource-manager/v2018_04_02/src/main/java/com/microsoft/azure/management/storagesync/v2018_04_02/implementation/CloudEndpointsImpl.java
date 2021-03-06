/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storagesync.v2018_04_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagesync.v2018_04_02.CloudEndpoints;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.storagesync.v2018_04_02.PostBackupResponse;
import com.microsoft.azure.management.storagesync.v2018_04_02.PreRestoreRequest;
import com.microsoft.azure.management.storagesync.v2018_04_02.PostRestoreRequest;
import com.microsoft.azure.management.storagesync.v2018_04_02.CloudEndpoint;

class CloudEndpointsImpl extends WrapperImpl<CloudEndpointsInner> implements CloudEndpoints {
    private final StorageSyncManager manager;

    CloudEndpointsImpl(StorageSyncManager manager) {
        super(manager.inner().cloudEndpoints());
        this.manager = manager;
    }

    public StorageSyncManager manager() {
        return this.manager;
    }

    @Override
    public CloudEndpointImpl define(String name) {
        return wrapModel(name);
    }

    private CloudEndpointImpl wrapModel(CloudEndpointInner inner) {
        return  new CloudEndpointImpl(inner, manager());
    }

    private CloudEndpointImpl wrapModel(String name) {
        return new CloudEndpointImpl(name, this.manager());
    }

    @Override
    public Completable preBackupAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName) {
        CloudEndpointsInner client = this.inner();
        return client.preBackupAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName).toCompletable();
    }

    @Override
    public Observable<PostBackupResponse> postBackupAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName) {
        CloudEndpointsInner client = this.inner();
        return client.postBackupAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName)
        .map(new Func1<PostBackupResponseInner, PostBackupResponse>() {
            @Override
            public PostBackupResponse call(PostBackupResponseInner inner) {
                return new PostBackupResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable preRestoreAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName, PreRestoreRequest parameters) {
        CloudEndpointsInner client = this.inner();
        return client.preRestoreAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName, parameters).toCompletable();
    }

    @Override
    public Completable restoreheartbeatAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName) {
        CloudEndpointsInner client = this.inner();
        return client.restoreheartbeatAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName).toCompletable();
    }

    @Override
    public Completable postRestoreAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName, PostRestoreRequest parameters) {
        CloudEndpointsInner client = this.inner();
        return client.postRestoreAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName, parameters).toCompletable();
    }

    @Override
    public Observable<CloudEndpoint> listBySyncGroupAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        CloudEndpointsInner client = this.inner();
        return client.listBySyncGroupAsync(resourceGroupName, storageSyncServiceName, syncGroupName)
        .flatMap(new Func1<List<CloudEndpointInner>, Observable<CloudEndpointInner>>() {
            @Override
            public Observable<CloudEndpointInner> call(List<CloudEndpointInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CloudEndpointInner, CloudEndpoint>() {
            @Override
            public CloudEndpoint call(CloudEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CloudEndpoint> getAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName) {
        CloudEndpointsInner client = this.inner();
        return client.getAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName)
        .map(new Func1<CloudEndpointInner, CloudEndpoint>() {
            @Override
            public CloudEndpoint call(CloudEndpointInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String cloudEndpointName) {
        CloudEndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, storageSyncServiceName, syncGroupName, cloudEndpointName).toCompletable();
    }

}
