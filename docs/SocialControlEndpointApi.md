# SocialControlEndpointApi

All URIs are relative to *https://polling.arena.razerzone.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**socialLatestFriendsSocial**](SocialControlEndpointApi.md#socialLatestFriendsSocial) | **GET** /API/Social/Arena/Latest | Return latest Arena player social feed items based on friends list
[**socialLatestInsiderPosts**](SocialControlEndpointApi.md#socialLatestInsiderPosts) | **GET** /API/Social/Insider/Latest | Return latest Razer Insider posts on the Arena forum
[**socialLatestTweets**](SocialControlEndpointApi.md#socialLatestTweets) | **GET** /API/Social/Twitter/Latest | Return latest tweets by Razer Arena on Twitter


<a name="socialLatestFriendsSocial"></a>
# **socialLatestFriendsSocial**
> ResponseOutputModelListSocialActionMessageModel socialLatestFriendsSocial()

Return latest Arena player social feed items based on friends list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SocialControlEndpointApi;


SocialControlEndpointApi apiInstance = new SocialControlEndpointApi();
try {
    ResponseOutputModelListSocialActionMessageModel result = apiInstance.socialLatestFriendsSocial();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialControlEndpointApi#socialLatestFriendsSocial");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListSocialActionMessageModel**](ResponseOutputModelListSocialActionMessageModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="socialLatestInsiderPosts"></a>
# **socialLatestInsiderPosts**
> ResponseOutputModelListInsiderPostModel socialLatestInsiderPosts()

Return latest Razer Insider posts on the Arena forum

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SocialControlEndpointApi;


SocialControlEndpointApi apiInstance = new SocialControlEndpointApi();
try {
    ResponseOutputModelListInsiderPostModel result = apiInstance.socialLatestInsiderPosts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialControlEndpointApi#socialLatestInsiderPosts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListInsiderPostModel**](ResponseOutputModelListInsiderPostModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="socialLatestTweets"></a>
# **socialLatestTweets**
> ResponseOutputModelListTweetModel socialLatestTweets()

Return latest tweets by Razer Arena on Twitter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SocialControlEndpointApi;


SocialControlEndpointApi apiInstance = new SocialControlEndpointApi();
try {
    ResponseOutputModelListTweetModel result = apiInstance.socialLatestTweets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialControlEndpointApi#socialLatestTweets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseOutputModelListTweetModel**](ResponseOutputModelListTweetModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

