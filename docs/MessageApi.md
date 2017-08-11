# MessageApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessages**](MessageApi.md#getMessages) | **GET** /v1/message | mesajlari getirir
[**getThread**](MessageApi.md#getThread) | **GET** /v1/message/thread/nick/{nick} | Suserla olan mesajlari getirir (Page 0 dan basliyor)
[**getUnreadedThreadCount**](MessageApi.md#getUnreadedThreadCount) | **GET** /v1/message/totalunreadthreadcount | okunmamis dialog sayisini doner
[**markAsRead**](MessageApi.md#markAsRead) | **GET** /v1/message/markread/nick/{nick} | Mesaji okundu olarak isaretler
[**send**](MessageApi.md#send) | **POST** /v1/message/send | Mesaj atar


<a name="getMessages"></a>
# **getMessages**
> MessagesResponse getMessages(p)

mesajlari getirir

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
Integer p = 56; // Integer | Sayfa numarası
try {
    MessagesResponse result = apiInstance.getMessages(p);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **p** | **Integer**| Sayfa numarası | [optional]

### Return type

[**MessagesResponse**](MessagesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThread"></a>
# **getThread**
> MessageThread getThread(nick)

Suserla olan mesajlari getirir (Page 0 dan basliyor)

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
String nick = "nick_example"; // String | 
try {
    MessageThread result = apiInstance.getThread(nick);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#getThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nick** | **String**|  |

### Return type

[**MessageThread**](MessageThread.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUnreadedThreadCount"></a>
# **getUnreadedThreadCount**
> Integer getUnreadedThreadCount()

okunmamis dialog sayisini doner

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
try {
    Integer result = apiInstance.getUnreadedThreadCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#getUnreadedThreadCount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Integer**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="markAsRead"></a>
# **markAsRead**
> markAsRead(nick)

Mesaji okundu olarak isaretler

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
String nick = "nick_example"; // String | 
try {
    apiInstance.markAsRead(nick);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#markAsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nick** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="send"></a>
# **send**
> MessageThread send(to, message, threadId)

Mesaj atar

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiClient;
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.Configuration;
//import com.hasssektor.eksiapi.auth.*;
//import com.hasssektor.eksiapi.apis.MessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

MessageApi apiInstance = new MessageApi();
String to = "to_example"; // String | 
String message = "message_example"; // String | 
Integer threadId = 0; // Integer | 
try {
    MessageThread result = apiInstance.send(to, message, threadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#send");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**|  | [optional]
 **message** | **String**|  | [optional]
 **threadId** | **Integer**|  | [optional] [default to 0]

### Return type

[**MessageThread**](MessageThread.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

