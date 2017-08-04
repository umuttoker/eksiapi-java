# EntryApi

All URIs are relative to *https://api.eksisozluk.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entryEntryIdCaylakfavoritesGet**](EntryApi.md#entryEntryIdCaylakfavoritesGet) | **GET** /entry/{entryId}/caylakfavorites | Entryi favorileyen caylakları getirir.
[**entryEntryIdFavoritesGet**](EntryApi.md#entryEntryIdFavoritesGet) | **GET** /entry/{entryId}/favorites | Entryi favorileyen suserları getirtir.


<a name="entryEntryIdCaylakfavoritesGet"></a>
# **entryEntryIdCaylakfavoritesGet**
> InlineResponse2003 entryEntryIdCaylakfavoritesGet(entryId)

Entryi favorileyen caylakları getirir.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.entryEntryIdCaylakfavoritesGet(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryEntryIdCaylakfavoritesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entryEntryIdFavoritesGet"></a>
# **entryEntryIdFavoritesGet**
> InlineResponse2002 entryEntryIdFavoritesGet(entryId)

Entryi favorileyen suserları getirtir.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EntryApi apiInstance = new EntryApi();
String entryId = "entryId_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.entryEntryIdFavoritesGet(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryEntryIdFavoritesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **String**|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

