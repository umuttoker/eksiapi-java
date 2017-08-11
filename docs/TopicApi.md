# TopicApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**follow**](TopicApi.md#follow) | **GET** /v1/topic/follow/{topicId} | basligi takip et
[**getBuddyEntries**](TopicApi.md#getBuddyEntries) | **GET** /v1/topic/{topicId}/buddies | baslitaki buddy entrylerini getirir
[**getDailyNices**](TopicApi.md#getDailyNices) | **GET** /v1/topic/{topicId}/dailynice | gunun sukelalari
[**getLinks**](TopicApi.md#getLinks) | **GET** /v1/topic/{topicId}/links | baslitaki linkleri getirir
[**getNices**](TopicApi.md#getNices) | **GET** /v1/topic/{topicId}/allnice | tum zamanlarin sukelalari
[**getTopic**](TopicApi.md#getTopic) | **GET** /v1/topic/{topicId} | basligin entrylerini getirir
[**getTopicIdFromSlug**](TopicApi.md#getTopicIdFromSlug) | **GET** /v1/topic/query | textle baslik id si doner
[**search**](TopicApi.md#search) | **GET** /v1/topic/{topicId}/search/{term} | baslikta arar
[**unfollow**](TopicApi.md#unfollow) | **GET** /v1/topic/unfollow/{topicId} | basligi takibi birak


<a name="follow"></a>
# **follow**
> follow(topicId)

basligi takip et

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
try {
    apiInstance.follow(topicId);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#follow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuddyEntries"></a>
# **getBuddyEntries**
> Topic getBuddyEntries(topicId, p)

baslitaki buddy entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.getBuddyEntries(topicId, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getBuddyEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDailyNices"></a>
# **getDailyNices**
> Topic getDailyNices(topicId, p)

gunun sukelalari

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.getDailyNices(topicId, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getDailyNices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLinks"></a>
# **getLinks**
> Topic getLinks(topicId, p)

baslitaki linkleri getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.getLinks(topicId, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNices"></a>
# **getNices**
> Topic getNices(topicId, p)

tum zamanlarin sukelalari

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.getNices(topicId, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getNices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopic"></a>
# **getTopic**
> Topic getTopic(topicId, p)

basligin entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.getTopic(topicId, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopicIdFromSlug"></a>
# **getTopicIdFromSlug**
> TopicQueryResponse getTopicIdFromSlug(term)

textle baslik id si doner

Autocomplateden sonra cagirmak lazim gibi gibi

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String term = "term_example"; // String | 
try {
    TopicQueryResponse result = apiInstance.getTopicIdFromSlug(term);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#getTopicIdFromSlug");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**TopicQueryResponse**](TopicQueryResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="search"></a>
# **search**
> Topic search(topicId, term, p)

baslikta arar

Eger term @ ile baslarsa bu bi suser nickidir ve suserin o basliktaki entrylerini getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
String term = "term_example"; // String | 
Integer p = 56; // Integer | Sayfa numarası
try {
    Topic result = apiInstance.search(topicId, term, p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |
 **term** | **String**|  |
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**Topic**](Topic.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unfollow"></a>
# **unfollow**
> unfollow(topicId)

basligi takibi birak

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.TopicApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TopicApi apiInstance = new TopicApi();
String topicId = "topicId_example"; // String | 
try {
    apiInstance.unfollow(topicId);
} catch (ApiException e) {
    System.err.println("Exception when calling TopicApi#unfollow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

