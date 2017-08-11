# AutocomplateApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete**](AutocomplateApi.md#complete) | **GET** /v1/autocomplete/query/{term} | hersey icin autocomplate
[**completeNick**](AutocomplateApi.md#completeNick) | **GET** /v1/autocomplete/nick/{term} | sadece nickler icin autocomplate


<a name="complete"></a>
# **complete**
> AutocomplateResponse complete(term)

hersey icin autocomplate

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.AutocomplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutocomplateApi apiInstance = new AutocomplateApi();
String term = "term_example"; // String | 
try {
    AutocomplateResponse result = apiInstance.complete(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutocomplateApi#complete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**AutocomplateResponse**](AutocomplateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="completeNick"></a>
# **completeNick**
> AutocomplateNickResponse completeNick(term)

sadece nickler icin autocomplate

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.AutocomplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AutocomplateApi apiInstance = new AutocomplateApi();
String term = "term_example"; // String | 
try {
    AutocomplateNickResponse result = apiInstance.completeNick(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutocomplateApi#completeNick");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**AutocomplateNickResponse**](AutocomplateNickResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

