# PlayerControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playerGetRank**](PlayerControlEndpointApi.md#playerGetRank) | **GET** /API/Player/My/Rank | Lookup Arena rank of the logged in player
[**playerIsAdmin**](PlayerControlEndpointApi.md#playerIsAdmin) | **GET** /API/Player/My/Permissions/Admin | Lookup whether the logged in player is a SysAdmin
[**playerLastMatchId**](PlayerControlEndpointApi.md#playerLastMatchId) | **GET** /API/Player/My/Tournaments/Match/LastId | Get the latest Match ID for the logged in player
[**playerMyActiveMatch**](PlayerControlEndpointApi.md#playerMyActiveMatch) | **GET** /API/Player/My/Tournaments/Match/Active | Get the match ready for check-in for the logged in player, if exists


<a name="playerGetRank"></a>
# **playerGetRank**
> ResponseOutputModelPlayerRankingLevel playerGetRank()

Lookup Arena rank of the logged in player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControlEndpointApi;


PlayerControlEndpointApi apiInstance = new PlayerControlEndpointApi();
try {
    ResponseOutputModelPlayerRankingLevel result = apiInstance.playerGetRank();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControlEndpointApi#playerGetRank");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelPlayerRankingLevel**](ResponseOutputModelPlayerRankingLevel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="playerIsAdmin"></a>
# **playerIsAdmin**
> ResponseOutputModelBoolean playerIsAdmin()

Lookup whether the logged in player is a SysAdmin

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControlEndpointApi;


PlayerControlEndpointApi apiInstance = new PlayerControlEndpointApi();
try {
    ResponseOutputModelBoolean result = apiInstance.playerIsAdmin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControlEndpointApi#playerIsAdmin");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelBoolean**](ResponseOutputModelBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="playerLastMatchId"></a>
# **playerLastMatchId**
> ResponseOutputModelInt64 playerLastMatchId()

Get the latest Match ID for the logged in player

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControlEndpointApi;


PlayerControlEndpointApi apiInstance = new PlayerControlEndpointApi();
try {
    ResponseOutputModelInt64 result = apiInstance.playerLastMatchId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControlEndpointApi#playerLastMatchId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelInt64**](ResponseOutputModelInt64.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="playerMyActiveMatch"></a>
# **playerMyActiveMatch**
> ResponseOutputModelTournamentMatchMyActiveMatchModel playerMyActiveMatch()

Get the match ready for check-in for the logged in player, if exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlayerControlEndpointApi;


PlayerControlEndpointApi apiInstance = new PlayerControlEndpointApi();
try {
    ResponseOutputModelTournamentMatchMyActiveMatchModel result = apiInstance.playerMyActiveMatch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerControlEndpointApi#playerMyActiveMatch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelTournamentMatchMyActiveMatchModel**](ResponseOutputModelTournamentMatchMyActiveMatchModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

