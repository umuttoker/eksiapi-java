# EntryApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downVote**](EntryApi.md#downVote) | **POST** /v1/entry/vote/{entryId}/-1 | entrye eksi(-) oy verir
[**favorite**](EntryApi.md#favorite) | **POST** /v1/entry/{entryId}/favorite | entryi favoriler.
[**getEntry**](EntryApi.md#getEntry) | **GET** /v1/entry/{entryId} | ilgili entryi getirir.
[**getFavoritedCaylaks**](EntryApi.md#getFavoritedCaylaks) | **GET** /v1/entry/{entryId}/caylakfavorites | Entryi favorileyen caylakları getirir.
[**getFavoritedUsers**](EntryApi.md#getFavoritedUsers) | **GET** /v1/entry/{entryId}/favorites | Entryi favorileyen suserları getirtir.
[**removeVote**](EntryApi.md#removeVote) | **POST** /v1/entry/vote/{entryId}/remove | verilen oyu geri alir
[**unfavorite**](EntryApi.md#unfavorite) | **POST** /v1/entry/{entryId}/unfavorite | entryi favorilemeyi birakir.
[**upVote**](EntryApi.md#upVote) | **POST** /v1/entry/vote/{entryId}/1 | entryi sukelalar


<a name="downVote"></a>
# **downVote**
> downVote(entryId)

entrye eksi(-) oy verir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    apiInstance.downVote(entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#downVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="favorite"></a>
# **favorite**
> favorite(entryId)

entryi favoriler.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    apiInstance.favorite(entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#favorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEntry"></a>
# **getEntry**
> Topic getEntry(entryId)

ilgili entryi getirir.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    Topic result = apiInstance.getEntry(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#getEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoritedCaylaks"></a>
# **getFavoritedCaylaks**
> CaylakFavoritesResponse getFavoritedCaylaks(entryId)

Entryi favorileyen caylakları getirir.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    CaylakFavoritesResponse result = apiInstance.getFavoritedCaylaks(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#getFavoritedCaylaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

[**CaylakFavoritesResponse**](CaylakFavoritesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoritedUsers"></a>
# **getFavoritedUsers**
> FavoritesResponse getFavoritedUsers(entryId)

Entryi favorileyen suserları getirtir.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    FavoritesResponse result = apiInstance.getFavoritedUsers(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#getFavoritedUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

[**FavoritesResponse**](FavoritesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeVote"></a>
# **removeVote**
> removeVote(entryId)

verilen oyu geri alir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    apiInstance.removeVote(entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#removeVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unfavorite"></a>
# **unfavorite**
> unfavorite(entryId)

entryi favorilemeyi birakir.

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    apiInstance.unfavorite(entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#unfavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upVote"></a>
# **upVote**
> upVote(entryId)

entryi sukelalar

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    apiInstance.upVote(entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#upVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

