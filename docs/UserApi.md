# UserApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBestEntries**](UserApi.md#getBestEntries) | **GET** /v1/user/{username}/bestentries | Suserin en iyi entrylerini getirir
[**getFavoriEntries**](UserApi.md#getFavoriEntries) | **GET** /v1/user/{username}/favorites | Suserin favori entrylerini getirir
[**getFavoritedEntries**](UserApi.md#getFavoritedEntries) | **GET** /v1/user/{username}/favorited | Suserin favorilenen entrylerini getirir
[**getLastVotedEntries**](UserApi.md#getLastVotedEntries) | **GET** /v1/user/{username}/lastvoted | Suserin son oylanan entrylerini getirir
[**getSelfFavoritedEntries**](UserApi.md#getSelfFavoritedEntries) | **GET** /v1/user/{username}/selffavorited | Suserin el emegi goznuru entrylerini getirir
[**getUserByName**](UserApi.md#getUserByName) | **GET** /v1/user/{username} | Suserin tüm bilgilerini getirir.


<a name="getBestEntries"></a>
# **getBestEntries**
> GeneralResponse getBestEntries(username, p)

Suserin en iyi entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

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
    GeneralResponse result = apiInstance.getBestEntries(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getBestEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoriEntries"></a>
# **getFavoriEntries**
> GeneralResponse getFavoriEntries(username, p)

Suserin favori entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

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
    GeneralResponse result = apiInstance.getFavoriEntries(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getFavoriEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoritedEntries"></a>
# **getFavoritedEntries**
> GeneralResponse getFavoritedEntries(username, p)

Suserin favorilenen entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

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
    GeneralResponse result = apiInstance.getFavoritedEntries(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getFavoritedEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastVotedEntries"></a>
# **getLastVotedEntries**
> GeneralResponse getLastVotedEntries(username, p)

Suserin son oylanan entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

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
    GeneralResponse result = apiInstance.getLastVotedEntries(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getLastVotedEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The name that needs to be fetched. Use user1 for testing.  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSelfFavoritedEntries"></a>
# **getSelfFavoritedEntries**
> GeneralResponse getSelfFavoritedEntries(username, p)

Suserin el emegi goznuru entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

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
    GeneralResponse result = apiInstance.getSelfFavoritedEntries(username, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getSelfFavoritedEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByName"></a>
# **getUserByName**
> User getUserByName(username)

Suserin tüm bilgilerini getirir.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | 
try {
    User result = apiInstance.getUserByName(username);
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

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

