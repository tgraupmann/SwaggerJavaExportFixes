# LookupsControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lookupsCountryList**](LookupsControlEndpointApi.md#lookupsCountryList) | **GET** /API/Lookups/CountryList | Return list of all countries supported.
[**lookupsGamePlatforms**](LookupsControlEndpointApi.md#lookupsGamePlatforms) | **GET** /API/Lookups/GamePlatforms | Return a list of all game platforms.
[**lookupsGameTitleCallbackTemplates**](LookupsControlEndpointApi.md#lookupsGameTitleCallbackTemplates) | **GET** /API/Lookups/GameTitleCallbackTemplates | Return a list of all game join schemas.
[**lookupsGameTitleValidationMethodTypes**](LookupsControlEndpointApi.md#lookupsGameTitleValidationMethodTypes) | **GET** /API/Lookups/GameTitleValidationMethodTypes | Return a list of all player validation types.
[**lookupsGamingServerRegions**](LookupsControlEndpointApi.md#lookupsGamingServerRegions) | **GET** /API/Lookups/GamingServerRegions | Return a list of all game server region classifications.
[**lookupsGetArenaRankList**](LookupsControlEndpointApi.md#lookupsGetArenaRankList) | **GET** /API/Lookups/RankList | Return a list of all Arena Ranking Levels
[**lookupsGetMapVotingTypes**](LookupsControlEndpointApi.md#lookupsGetMapVotingTypes) | **GET** /API/Lookups/MapVotingTypes | Return a list of all round rule map voting and veto types.
[**lookupsGetRosterRoles**](LookupsControlEndpointApi.md#lookupsGetRosterRoles) | **GET** /API/Lookups/RosterRoles | Return a list of all team roster roles
[**lookupsQualifierTieBreakerTypes**](LookupsControlEndpointApi.md#lookupsQualifierTieBreakerTypes) | **GET** /API/Lookups/QualifierTieBreakerTypes | Return list of all tournament privacy types.
[**lookupsStreamingServices**](LookupsControlEndpointApi.md#lookupsStreamingServices) | **GET** /API/Lookups/StreamingServices | Return a list of all video streaming services.
[**lookupsTournamentJoinTypes**](LookupsControlEndpointApi.md#lookupsTournamentJoinTypes) | **GET** /API/Lookups/TournamentJoinTypes | Return list of all tournament privacy types.
[**lookupsTournamentPairingTypes**](LookupsControlEndpointApi.md#lookupsTournamentPairingTypes) | **GET** /API/Lookups/TournamentPairingTypes | Return a list of all tournament pairing types
[**lookupsTournamentPrizeFundingTypes**](LookupsControlEndpointApi.md#lookupsTournamentPrizeFundingTypes) | **GET** /API/Lookups/TournamentPrizeFundingTypes | Return a list of all tournament funding types.
[**lookupsTournamentSeedingTypes**](LookupsControlEndpointApi.md#lookupsTournamentSeedingTypes) | **GET** /API/Lookups/TournamentSeedingTypes | Return a list of all bracket seeding methods.
[**lookupsTournamentTypes**](LookupsControlEndpointApi.md#lookupsTournamentTypes) | **GET** /API/Lookups/TournamentTypes | Return a list of all tournament lifecycle types.


<a name="lookupsCountryList"></a>
# **lookupsCountryList**
> ResponseOutputModelListAddressCountryModel lookupsCountryList()

Return list of all countries supported.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListAddressCountryModel result = apiInstance.lookupsCountryList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsCountryList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListAddressCountryModel**](ResponseOutputModelListAddressCountryModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGamePlatforms"></a>
# **lookupsGamePlatforms**
> ResponseOutputModelListString lookupsGamePlatforms()

Return a list of all game platforms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListString result = apiInstance.lookupsGamePlatforms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGamePlatforms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListString**](ResponseOutputModelListString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGameTitleCallbackTemplates"></a>
# **lookupsGameTitleCallbackTemplates**
> ResponseOutputModelListGameTitleCallbackTemplateModel lookupsGameTitleCallbackTemplates()

Return a list of all game join schemas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListGameTitleCallbackTemplateModel result = apiInstance.lookupsGameTitleCallbackTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGameTitleCallbackTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListGameTitleCallbackTemplateModel**](ResponseOutputModelListGameTitleCallbackTemplateModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGameTitleValidationMethodTypes"></a>
# **lookupsGameTitleValidationMethodTypes**
> ResponseOutputModelListGameTitleValidationMethodTypeModel lookupsGameTitleValidationMethodTypes()

Return a list of all player validation types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListGameTitleValidationMethodTypeModel result = apiInstance.lookupsGameTitleValidationMethodTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGameTitleValidationMethodTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListGameTitleValidationMethodTypeModel**](ResponseOutputModelListGameTitleValidationMethodTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGamingServerRegions"></a>
# **lookupsGamingServerRegions**
> ResponseOutputModelListGamingServerRegionModel lookupsGamingServerRegions()

Return a list of all game server region classifications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListGamingServerRegionModel result = apiInstance.lookupsGamingServerRegions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGamingServerRegions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListGamingServerRegionModel**](ResponseOutputModelListGamingServerRegionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGetArenaRankList"></a>
# **lookupsGetArenaRankList**
> ResponseOutputModelListPlayerRankingLevel lookupsGetArenaRankList()

Return a list of all Arena Ranking Levels

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListPlayerRankingLevel result = apiInstance.lookupsGetArenaRankList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGetArenaRankList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListPlayerRankingLevel**](ResponseOutputModelListPlayerRankingLevel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGetMapVotingTypes"></a>
# **lookupsGetMapVotingTypes**
> ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel lookupsGetMapVotingTypes()

Return a list of all round rule map voting and veto types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel result = apiInstance.lookupsGetMapVotingTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGetMapVotingTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel**](ResponseOutputModelListTournamentRoundRuleMapVotingStyleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsGetRosterRoles"></a>
# **lookupsGetRosterRoles**
> ResponseOutputModelListTeamRosterRoleModel lookupsGetRosterRoles()

Return a list of all team roster roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTeamRosterRoleModel result = apiInstance.lookupsGetRosterRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsGetRosterRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTeamRosterRoleModel**](ResponseOutputModelListTeamRosterRoleModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsQualifierTieBreakerTypes"></a>
# **lookupsQualifierTieBreakerTypes**
> ResponseOutputModelListTournamentQualifierTieBreakerTypeModel lookupsQualifierTieBreakerTypes()

Return list of all tournament privacy types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentQualifierTieBreakerTypeModel result = apiInstance.lookupsQualifierTieBreakerTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsQualifierTieBreakerTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentQualifierTieBreakerTypeModel**](ResponseOutputModelListTournamentQualifierTieBreakerTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsStreamingServices"></a>
# **lookupsStreamingServices**
> ResponseOutputModelListStreamingServiceModel lookupsStreamingServices()

Return a list of all video streaming services.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListStreamingServiceModel result = apiInstance.lookupsStreamingServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsStreamingServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListStreamingServiceModel**](ResponseOutputModelListStreamingServiceModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsTournamentJoinTypes"></a>
# **lookupsTournamentJoinTypes**
> ResponseOutputModelListTournamentJoinTypeModel lookupsTournamentJoinTypes()

Return list of all tournament privacy types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentJoinTypeModel result = apiInstance.lookupsTournamentJoinTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsTournamentJoinTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentJoinTypeModel**](ResponseOutputModelListTournamentJoinTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsTournamentPairingTypes"></a>
# **lookupsTournamentPairingTypes**
> ResponseOutputModelListTournamentPairingTypeModel lookupsTournamentPairingTypes()

Return a list of all tournament pairing types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentPairingTypeModel result = apiInstance.lookupsTournamentPairingTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsTournamentPairingTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentPairingTypeModel**](ResponseOutputModelListTournamentPairingTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsTournamentPrizeFundingTypes"></a>
# **lookupsTournamentPrizeFundingTypes**
> ResponseOutputModelListTournamentPrizeFundingTypeModel lookupsTournamentPrizeFundingTypes()

Return a list of all tournament funding types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentPrizeFundingTypeModel result = apiInstance.lookupsTournamentPrizeFundingTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsTournamentPrizeFundingTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentPrizeFundingTypeModel**](ResponseOutputModelListTournamentPrizeFundingTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsTournamentSeedingTypes"></a>
# **lookupsTournamentSeedingTypes**
> ResponseOutputModelListTournamentSeedingTypeModel lookupsTournamentSeedingTypes()

Return a list of all bracket seeding methods.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentSeedingTypeModel result = apiInstance.lookupsTournamentSeedingTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsTournamentSeedingTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentSeedingTypeModel**](ResponseOutputModelListTournamentSeedingTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="lookupsTournamentTypes"></a>
# **lookupsTournamentTypes**
> ResponseOutputModelListTournamentTypeModel lookupsTournamentTypes()

Return a list of all tournament lifecycle types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookupsControlEndpointApi;


LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
try {
    ResponseOutputModelListTournamentTypeModel result = apiInstance.lookupsTournamentTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookupsControlEndpointApi#lookupsTournamentTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTournamentTypeModel**](ResponseOutputModelListTournamentTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

