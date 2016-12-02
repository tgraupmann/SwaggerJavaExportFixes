# StreamingControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamingLatestLiveStreams**](StreamingControlEndpointApi.md#streamingLatestLiveStreams) | **GET** /API/Streaming/Latest | Return a list of the top 12 latest live streams for any game
[**streamingLatestLiveStreamsAdvancedSearch**](StreamingControlEndpointApi.md#streamingLatestLiveStreamsAdvancedSearch) | **GET** /API/Streaming/Search | Return a list of the top latest live streams based on advanced search
[**streamingLatestLiveStreams_0**](StreamingControlEndpointApi.md#streamingLatestLiveStreams_0) | **GET** /API/Streaming/Latest/{topStreamCount} | Return a list of the latest live streams for any game
[**streamingLatestLiveStreams_1**](StreamingControlEndpointApi.md#streamingLatestLiveStreams_1) | **GET** /API/Streaming/{gameShortcode}/Latest/{topStreamCount} | Return a list of the latest live streams for a specific game


<a name="streamingLatestLiveStreams"></a>
# **streamingLatestLiveStreams**
> ResponseOutputModelListEntityStreamingModel streamingLatestLiveStreams()

Return a list of the top 12 latest live streams for any game

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamingControlEndpointApi;


StreamingControlEndpointApi apiInstance = new StreamingControlEndpointApi();
try {
    ResponseOutputModelListEntityStreamingModel result = apiInstance.streamingLatestLiveStreams();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamingControlEndpointApi#streamingLatestLiveStreams");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListEntityStreamingModel**](ResponseOutputModelListEntityStreamingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="streamingLatestLiveStreamsAdvancedSearch"></a>
# **streamingLatestLiveStreamsAdvancedSearch**
> ResponseOutputModelListEntityStreamingModel streamingLatestLiveStreamsAdvancedSearch(topStreamsCount, gameShortCodeList)

Return a list of the top latest live streams based on advanced search

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamingControlEndpointApi;


StreamingControlEndpointApi apiInstance = new StreamingControlEndpointApi();
Integer topStreamsCount = 56; // Integer | 
List<String> gameShortCodeList = Arrays.asList("gameShortCodeList_example"); // List<String> | 
try {
    ResponseOutputModelListEntityStreamingModel result = apiInstance.streamingLatestLiveStreamsAdvancedSearch(topStreamsCount, gameShortCodeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamingControlEndpointApi#streamingLatestLiveStreamsAdvancedSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topStreamsCount** | **Integer**|  |
 **gameShortCodeList** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**ResponseOutputModelListEntityStreamingModel**](ResponseOutputModelListEntityStreamingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="streamingLatestLiveStreams_0"></a>
# **streamingLatestLiveStreams_0**
> ResponseOutputModelListEntityStreamingModel streamingLatestLiveStreams_0(topStreamCount)

Return a list of the latest live streams for any game

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamingControlEndpointApi;


StreamingControlEndpointApi apiInstance = new StreamingControlEndpointApi();
Integer topStreamCount = 56; // Integer | 
try {
    ResponseOutputModelListEntityStreamingModel result = apiInstance.streamingLatestLiveStreams_0(topStreamCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamingControlEndpointApi#streamingLatestLiveStreams_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topStreamCount** | **Integer**|  |

### Return type

[**ResponseOutputModelListEntityStreamingModel**](ResponseOutputModelListEntityStreamingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="streamingLatestLiveStreams_1"></a>
# **streamingLatestLiveStreams_1**
> ResponseOutputModelListEntityStreamingModel streamingLatestLiveStreams_1(gameShortcode, topStreamCount)

Return a list of the latest live streams for a specific game

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamingControlEndpointApi;


StreamingControlEndpointApi apiInstance = new StreamingControlEndpointApi();
String gameShortcode = "gameShortcode_example"; // String | 
Integer topStreamCount = 56; // Integer | 
try {
    ResponseOutputModelListEntityStreamingModel result = apiInstance.streamingLatestLiveStreams_1(gameShortcode, topStreamCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamingControlEndpointApi#streamingLatestLiveStreams_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gameShortcode** | **String**|  |
 **topStreamCount** | **Integer**|  |

### Return type

[**ResponseOutputModelListEntityStreamingModel**](ResponseOutputModelListEntityStreamingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

