
# ResponseOutputModelListSocialActionMessageModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | [**List&lt;SocialActionMessageModel&gt;**](SocialActionMessageModel.md) |  |  [optional]
**success** | **Boolean** |  |  [optional]
**message** | **String** |  |  [optional]
**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) | See {Razer.Arena.Processing.Models.Enumerations.ApiResponseStatusCodes} for status code meaning.  0 &#x3D; success, 2 &#x3D; invalid api key, 3 &#x3D; invalid login token, 9 &#x3D; processing error (see message). |  [optional]


<a name="StatusCodeEnum"></a>
## Enum: StatusCodeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_9 | 9



