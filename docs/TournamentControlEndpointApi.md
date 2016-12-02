# TournamentControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentGetProfileGenerationTicks**](TournamentControlEndpointApi.md#tournamentGetProfileGenerationTicks) | **GET** /API/Tournament/{TournamentId}/GenerationTicks | Get the Int64 Ticks at time of last model generation
[**tournamentMatchGetProfileGenerationTicks**](TournamentControlEndpointApi.md#tournamentMatchGetProfileGenerationTicks) | **GET** /API/Tournament/Match/{TournamentMatchId}/GenerationTicks | Get the Int64 Ticks at time of last model generation
[**tournamentMatchMessageList**](TournamentControlEndpointApi.md#tournamentMatchMessageList) | **GET** /API/Tournament/Match/{TournamentMatchId}/Messaging | Get a list of messages sent from the game server for this match
[**tournamentMatchProfile**](TournamentControlEndpointApi.md#tournamentMatchProfile) | **GET** /API/Tournament/Match/{TournamentMatchId} | Get the profile and lobby for a specific tournament match
[**tournamentMatchTriggerTimedProcessing**](TournamentControlEndpointApi.md#tournamentMatchTriggerTimedProcessing) | **GET** /API/Tournament/Match/{TournamentMatchId}/Timer/Trigger | Trigger Match Timed Processing, such as Map Voting
[**tournamentProfile**](TournamentControlEndpointApi.md#tournamentProfile) | **GET** /API/Tournament/{TournamentId} | Get the profile details for a specific tournament
[**tournamentProfileUserContext**](TournamentControlEndpointApi.md#tournamentProfileUserContext) | **GET** /API/Tournament/{TournamentId}/Context | Get the user context for a specific tournament
[**tournamentUnresolvedAssistanceList**](TournamentControlEndpointApi.md#tournamentUnresolvedAssistanceList) | **GET** /API/Tournament/{TournamentId}/Assistance/Unresolved | Get a list of pending assistance requests for a tournament


<a name="tournamentGetProfileGenerationTicks"></a>
# **tournamentGetProfileGenerationTicks**
> ResponseOutputModelInt64 tournamentGetProfileGenerationTicks(tournamentId)

Get the Int64 Ticks at time of last model generation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String tournamentId = "tournamentId_example"; // String | 
try {
    ResponseOutputModelInt64 result = apiInstance.tournamentGetProfileGenerationTicks(tournamentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentGetProfileGenerationTicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **String**|  |

### Return type

[**ResponseOutputModelInt64**](ResponseOutputModelInt64.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentMatchGetProfileGenerationTicks"></a>
# **tournamentMatchGetProfileGenerationTicks**
> ResponseOutputModelInt64 tournamentMatchGetProfileGenerationTicks(tournamentMatchId)

Get the Int64 Ticks at time of last model generation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String tournamentMatchId = "tournamentMatchId_example"; // String | 
try {
    ResponseOutputModelInt64 result = apiInstance.tournamentMatchGetProfileGenerationTicks(tournamentMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentMatchGetProfileGenerationTicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentMatchId** | **String**|  |

### Return type

[**ResponseOutputModelInt64**](ResponseOutputModelInt64.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentMatchMessageList"></a>
# **tournamentMatchMessageList**
> ResponseOutputModelListTournamentMatchMessageModel tournamentMatchMessageList(lastUpdatedDateTime, tournamentMatchId)

Get a list of messages sent from the game server for this match

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String lastUpdatedDateTime = "lastUpdatedDateTime_example"; // String | 
String tournamentMatchId = "tournamentMatchId_example"; // String | 
try {
    ResponseOutputModelListTournamentMatchMessageModel result = apiInstance.tournamentMatchMessageList(lastUpdatedDateTime, tournamentMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentMatchMessageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastUpdatedDateTime** | **String**|  |
 **tournamentMatchId** | **String**|  |

### Return type

[**ResponseOutputModelListTournamentMatchMessageModel**](ResponseOutputModelListTournamentMatchMessageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentMatchProfile"></a>
# **tournamentMatchProfile**
> ResponseOutputModelTournamentMatchCompleteOutputModel tournamentMatchProfile(lastUpdatedDateTime, tournamentMatchId)

Get the profile and lobby for a specific tournament match

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String lastUpdatedDateTime = "lastUpdatedDateTime_example"; // String | 
String tournamentMatchId = "tournamentMatchId_example"; // String | 
try {
    ResponseOutputModelTournamentMatchCompleteOutputModel result = apiInstance.tournamentMatchProfile(lastUpdatedDateTime, tournamentMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentMatchProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastUpdatedDateTime** | **String**|  |
 **tournamentMatchId** | **String**|  |

### Return type

[**ResponseOutputModelTournamentMatchCompleteOutputModel**](ResponseOutputModelTournamentMatchCompleteOutputModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentMatchTriggerTimedProcessing"></a>
# **tournamentMatchTriggerTimedProcessing**
> ResponseModel tournamentMatchTriggerTimedProcessing(tournamentMatchId)

Trigger Match Timed Processing, such as Map Voting

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String tournamentMatchId = "tournamentMatchId_example"; // String | 
try {
    ResponseModel result = apiInstance.tournamentMatchTriggerTimedProcessing(tournamentMatchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentMatchTriggerTimedProcessing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentMatchId** | **String**|  |

### Return type

[**ResponseModel**](ResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentProfile"></a>
# **tournamentProfile**
> ResponseOutputModelTournamentCompleteOutputModel tournamentProfile(lastUpdatedDateTime, tournamentId)

Get the profile details for a specific tournament

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String lastUpdatedDateTime = "lastUpdatedDateTime_example"; // String | 
String tournamentId = "tournamentId_example"; // String | 
try {
    ResponseOutputModelTournamentCompleteOutputModel result = apiInstance.tournamentProfile(lastUpdatedDateTime, tournamentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastUpdatedDateTime** | **String**|  |
 **tournamentId** | **String**|  |

### Return type

[**ResponseOutputModelTournamentCompleteOutputModel**](ResponseOutputModelTournamentCompleteOutputModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentProfileUserContext"></a>
# **tournamentProfileUserContext**
> ResponseOutputModelTournamentPlayerContextModel tournamentProfileUserContext(tournamentId)

Get the user context for a specific tournament

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String tournamentId = "tournamentId_example"; // String | 
try {
    ResponseOutputModelTournamentPlayerContextModel result = apiInstance.tournamentProfileUserContext(tournamentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentProfileUserContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **String**|  |

### Return type

[**ResponseOutputModelTournamentPlayerContextModel**](ResponseOutputModelTournamentPlayerContextModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="tournamentUnresolvedAssistanceList"></a>
# **tournamentUnresolvedAssistanceList**
> ResponseOutputModelListTournamentMatchMiniModel tournamentUnresolvedAssistanceList(tournamentId)

Get a list of pending assistance requests for a tournament

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TournamentControlEndpointApi;


TournamentControlEndpointApi apiInstance = new TournamentControlEndpointApi();
String tournamentId = "tournamentId_example"; // String | 
try {
    ResponseOutputModelListTournamentMatchMiniModel result = apiInstance.tournamentUnresolvedAssistanceList(tournamentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentControlEndpointApi#tournamentUnresolvedAssistanceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **String**|  |

### Return type

[**ResponseOutputModelListTournamentMatchMiniModel**](ResponseOutputModelListTournamentMatchMiniModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

