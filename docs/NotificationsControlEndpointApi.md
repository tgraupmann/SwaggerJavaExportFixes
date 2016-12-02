# NotificationsControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationList**](NotificationsControlEndpointApi.md#notificationList) | **GET** /API/Notifications | Get a list of outstanding notifications for the logged in player


<a name="notificationList"></a>
# **notificationList**
> ResponseOutputModelNotificationProfileCompleteOutputModel notificationList(lastDateTime, topCount)

Get a list of outstanding notifications for the logged in player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationsControlEndpointApi;


NotificationsControlEndpointApi apiInstance = new NotificationsControlEndpointApi();
String lastDateTime = "lastDateTime_example"; // String | 
Integer topCount = 56; // Integer | 
try {
    ResponseOutputModelNotificationProfileCompleteOutputModel result = apiInstance.notificationList(lastDateTime, topCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsControlEndpointApi#notificationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastDateTime** | **String**|  |
 **topCount** | **Integer**|  |

### Return type

[**ResponseOutputModelNotificationProfileCompleteOutputModel**](ResponseOutputModelNotificationProfileCompleteOutputModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

