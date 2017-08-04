# UserApi

All URIs are relative to *https://api.eksisozluk.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Suserin tüm bilgilerini getirir.
[**userUsernameFavoritedGet**](UserApi.md#userUsernameFavoritedGet) | **GET** /user/{username}/favorited | Suserin favorilenen entrylerini getirir
[**userUsernameFavoritesGet**](UserApi.md#userUsernameFavoritesGet) | **GET** /user/{username}/favorites | Suserin favori entrylerini getirir


<a name="getUserByName"></a>
# **getUserByName**
> InlineResponse200 getUserByName(username)

Suserin tüm bilgilerini getirir.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    InlineResponse200 result = apiInstance.getUserByName(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userUsernameFavoritedGet"></a>
# **userUsernameFavoritedGet**
> InlineResponse2001 userUsernameFavoritedGet(username, p)

Suserin favorilenen entrylerini getirir

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
Integer p = 56; // Integer | Sayfa numarası
try {
    InlineResponse2001 result = apiInstance.userUsernameFavoritedGet(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userUsernameFavoritedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userUsernameFavoritesGet"></a>
# **userUsernameFavoritesGet**
> InlineResponse2001 userUsernameFavoritesGet(username, p)

Suserin favori entrylerini getirir

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    InlineResponse2001 result = apiInstance.userUsernameFavoritesGet(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userUsernameFavoritesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

