# AuthApi

All URIs are relative to *https://api.eksisozluk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](AuthApi.md#getAccessToken) | **POST** /token | access token dondurur


<a name="getAccessToken"></a>
# **getAccessToken**
> TokenResponse getAccessToken(grantType, username, password, clientSecret)

access token dondurur

kullanici adi kismina email girmek daha saglikli olur

### Example
```java
// Import classes:
//import com.hasssektor.eksiapi.ApiException;
//import com.hasssektor.eksiapi.apis.AuthApi;


AuthApi apiInstance = new AuthApi();
String grantType = "password"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    TokenResponse result = apiInstance.getAccessToken(grantType, username, password, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | [optional] [default to password]
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

