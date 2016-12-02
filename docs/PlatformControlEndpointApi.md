# PlatformControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**platformMaintenanceStatus**](PlatformControlEndpointApi.md#platformMaintenanceStatus) | **GET** /API/Platform/Maintenance/Status | Get the status of maintenance mode for the platform
[**platformRazerCommsVersion**](PlatformControlEndpointApi.md#platformRazerCommsVersion) | **GET** /API/Platform/Module/Razer/Comms/Version | Get the installed version of Razer comms for the logged in player
[**platformTimeSynchronization**](PlatformControlEndpointApi.md#platformTimeSynchronization) | **GET** /API/Platform/Synchronization/Time | 


<a name="platformMaintenanceStatus"></a>
# **platformMaintenanceStatus**
> ResponseOutputModelMaintenanceModeModel platformMaintenanceStatus(lastUpdatedDateTime)

Get the status of maintenance mode for the platform

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlatformControlEndpointApi;


PlatformControlEndpointApi apiInstance = new PlatformControlEndpointApi();
String lastUpdatedDateTime = "lastUpdatedDateTime_example"; // String | 
try {
    ResponseOutputModelMaintenanceModeModel result = apiInstance.platformMaintenanceStatus(lastUpdatedDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformControlEndpointApi#platformMaintenanceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastUpdatedDateTime** | **String**|  |

### Return type

[**ResponseOutputModelMaintenanceModeModel**](ResponseOutputModelMaintenanceModeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="platformRazerCommsVersion"></a>
# **platformRazerCommsVersion**
> ResponseOutputModelCommsModel platformRazerCommsVersion()

Get the installed version of Razer comms for the logged in player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlatformControlEndpointApi;


PlatformControlEndpointApi apiInstance = new PlatformControlEndpointApi();
try {
    ResponseOutputModelCommsModel result = apiInstance.platformRazerCommsVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformControlEndpointApi#platformRazerCommsVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelCommsModel**](ResponseOutputModelCommsModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="platformTimeSynchronization"></a>
# **platformTimeSynchronization**
> ResponseOutputModelSynchronizationTimeModel platformTimeSynchronization(clientTime)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlatformControlEndpointApi;


PlatformControlEndpointApi apiInstance = new PlatformControlEndpointApi();
String clientTime = "clientTime_example"; // String | 
try {
    ResponseOutputModelSynchronizationTimeModel result = apiInstance.platformTimeSynchronization(clientTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlatformControlEndpointApi#platformTimeSynchronization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientTime** | **String**|  |

### Return type

[**ResponseOutputModelSynchronizationTimeModel**](ResponseOutputModelSynchronizationTimeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

