/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storagesync.v2018_04_02.implementation.ServerEndpointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storagesync.v2018_04_02.implementation.StorageSyncManager;
import java.util.Map;

/**
 * Type representing ServerEndpoint.
 */
public interface ServerEndpoint extends HasInner<ServerEndpointInner>, Indexable, Refreshable<ServerEndpoint>, Updatable<ServerEndpoint.Update>, HasManager<StorageSyncManager> {
    /**
     * @return the cloudTiering value.
     */
    String cloudTiering();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastOperationName value.
     */
    String lastOperationName();

    /**
     * @return the lastWorkflowId value.
     */
    String lastWorkflowId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serverLocalPath value.
     */
    String serverLocalPath();

    /**
     * @return the serverResourceId value.
     */
    String serverResourceId();

    /**
     * @return the syncStatus value.
     */
    Object syncStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the volumeFreeSpacePercent value.
     */
    Integer volumeFreeSpacePercent();

    /**
     * The entirety of the ServerEndpoint definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSyncGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerEndpoint definition.
         */
        interface Blank extends WithSyncGroup {
        }

        /**
         * The stage of the serverendpoint definition allowing to specify SyncGroup.
         */
        interface WithSyncGroup {
           /**
            * Specifies resourceGroupName, storageSyncServiceName, syncGroupName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param storageSyncServiceName Name of Storage Sync Service resource
            * @param syncGroupName Name of Sync Group resource
            * @return the next definition stage
            */
            WithCreate withExistingSyncGroup(String resourceGroupName, String storageSyncServiceName, String syncGroupName);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify CloudTiering.
         */
        interface WithCloudTiering {
            /**
             * Specifies cloudTiering.
             * @param cloudTiering Cloud Tiering. Possible values include: 'on', 'off'
             * @return the next definition stage
             */
            WithCreate withCloudTiering(String cloudTiering);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly Name
             * @return the next definition stage
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify LastOperationName.
         */
        interface WithLastOperationName {
            /**
             * Specifies lastOperationName.
             * @param lastOperationName Resource Last Operation Name
             * @return the next definition stage
             */
            WithCreate withLastOperationName(String lastOperationName);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify LastWorkflowId.
         */
        interface WithLastWorkflowId {
            /**
             * Specifies lastWorkflowId.
             * @param lastWorkflowId ServerEndpoint lastWorkflowId
             * @return the next definition stage
             */
            WithCreate withLastWorkflowId(String lastWorkflowId);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState ServerEndpoint Provisioning State
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify ServerLocalPath.
         */
        interface WithServerLocalPath {
            /**
             * Specifies serverLocalPath.
             * @param serverLocalPath Server Local path
             * @return the next definition stage
             */
            WithCreate withServerLocalPath(String serverLocalPath);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify ServerResourceId.
         */
        interface WithServerResourceId {
            /**
             * Specifies serverResourceId.
             * @param serverResourceId Server Resource Id
             * @return the next definition stage
             */
            WithCreate withServerResourceId(String serverResourceId);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify SyncStatus.
         */
        interface WithSyncStatus {
            /**
             * Specifies syncStatus.
             * @param syncStatus Sync Health Status
             * @return the next definition stage
             */
            WithCreate withSyncStatus(Object syncStatus);
        }

        /**
         * The stage of the serverendpoint definition allowing to specify VolumeFreeSpacePercent.
         */
        interface WithVolumeFreeSpacePercent {
            /**
             * Specifies volumeFreeSpacePercent.
             * @param volumeFreeSpacePercent Level of free space to be maintained by Cloud Tiering if it is enabled
             * @return the next definition stage
             */
            WithCreate withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerEndpoint>, DefinitionStages.WithCloudTiering, DefinitionStages.WithFriendlyName, DefinitionStages.WithLastOperationName, DefinitionStages.WithLastWorkflowId, DefinitionStages.WithProvisioningState, DefinitionStages.WithServerLocalPath, DefinitionStages.WithServerResourceId, DefinitionStages.WithSyncStatus, DefinitionStages.WithVolumeFreeSpacePercent {
        }
    }
    /**
     * The template for a ServerEndpoint update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerEndpoint>, UpdateStages.WithCloudTiering, UpdateStages.WithTags, UpdateStages.WithVolumeFreeSpacePercent {
    }

    /**
     * Grouping of ServerEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serverendpoint update allowing to specify CloudTiering.
         */
        interface WithCloudTiering {
            /**
             * Specifies cloudTiering.
             * @param cloudTiering Cloud Tiering. Possible values include: 'on', 'off'
             * @return the next update stage
             */
            Update withCloudTiering(String cloudTiering);
        }

        /**
         * The stage of the serverendpoint update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The user-specified tags associated with the server endpoint
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the serverendpoint update allowing to specify VolumeFreeSpacePercent.
         */
        interface WithVolumeFreeSpacePercent {
            /**
             * Specifies volumeFreeSpacePercent.
             * @param volumeFreeSpacePercent Level of free space to be maintained by Cloud Tiering if it is enabled
             * @return the next update stage
             */
            Update withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent);
        }

    }
}
