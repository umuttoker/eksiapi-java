# SettingsApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](SettingsApi.md#get) | **GET** /v1/settings/get/preferences | ayarlari getirir
[**set**](SettingsApi.md#set) | **POST** /v1/settings/set/preferences | ayarlari degistirir


<a name="get"></a>
# **get**
> Settings get()

ayarlari getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
try {
    Settings result = apiInstance.get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Settings**](Settings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="set"></a>
# **set**
> set(body)

ayarlari degistirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SettingsApi apiInstance = new SettingsApi();
Settings body = new Settings(); // Settings | 
try {
    apiInstance.set(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#set");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Settings**](Settings.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

