package  com.azure.storagesync.sample;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.storagesync.v2018_04_02.CloudEndpoint;
import com.microsoft.azure.management.storagesync.v2018_04_02.StorageSyncService;
import com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroup;
import com.microsoft.azure.management.storagesync.v2018_04_02.implementation.StorageSyncManager;
import rx.Observable;

public class App
{
    public App() {
    }

    public static void main(String[] args ) {
        final String client = System.getenv("AZURE_CLIENT_ID");
        final String tenant = System.getenv("AZURE_TENANT_ID");
        final String key = System.getenv("AZURE_CLIENT_SECRET");
        final String subscriptionId = System.getenv("AZURE_SUBSCRIPTION_ID");
        //
        AzureTokenCredentials credentials = new ApplicationTokenCredentials(client, tenant, key, AzureEnvironment.AZURE)
                .withDefaultSubscriptionId(subscriptionId);
        //
        //
        StorageSyncManager storageSyncManager = StorageSyncManager
                .authenticate(credentials, credentials.defaultSubscriptionId());
        //
        //
        final String rgName = "<Existing-RG-Name>";
        final String ssyncName = "mystgSync123";
        //
        StorageSyncService syncService = storageSyncManager.storageSyncServices().define(ssyncName)
                .withRegion("East US")
                .withExistingResourceGroup(rgName)
                .create();
        //
        System.out.println(syncService.storageSyncServiceStatus());
        System.out.println(syncService.storageSyncServiceUid());
        //
        SyncGroup syncGroup = storageSyncManager.syncGroups().define("")
                .withExistingStorageSyncService(rgName, ssyncName)
                .withUniqueId("c059bbbf-3ba7-4dab-a25f-d43a6e4d23ea")
                .create();
        //
        System.out.println(syncGroup.name());
        System.out.println(syncGroup.id());

        Observable<SyncGroup> syncGroups = storageSyncManager.syncGroups()
               .listByStorageSyncServiceAsync(rgName, ssyncName);
        //

        syncService = syncService.update()
                .withTag("tag1", "tag1val")
                .apply();
        //
       CloudEndpoint cEndpoint = storageSyncManager.cloudEndpoints()
                .define("cep1")
                .withExistingSyncGroup(rgName, syncService.name(), syncGroup.name())
                .withFriendlyName("frname1")
                .withStorageAccount("<stg_account_id>")
                .create();
       //
    }
}
