# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EntryApi;

import java.io.File;
import java.util.*;

public class EntryApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.eksisozluk.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EntryApi* | [**entryEntryIdCaylakfavoritesGet**](docs/EntryApi.md#entryEntryIdCaylakfavoritesGet) | **GET** /entry/{entryId}/caylakfavorites | Entryi favorileyen caylakları getirir.
*EntryApi* | [**entryEntryIdFavoritesGet**](docs/EntryApi.md#entryEntryIdFavoritesGet) | **GET** /entry/{entryId}/favorites | Entryi favorileyen suserları getirtir.
*UserApi* | [**getUserByName**](docs/UserApi.md#getUserByName) | **GET** /user/{username} | Suserin tüm bilgilerini getirir.
*UserApi* | [**userUsernameFavoritedGet**](docs/UserApi.md#userUsernameFavoritedGet) | **GET** /user/{username}/favorited | Suserin favorilenen entrylerini getirir
*UserApi* | [**userUsernameFavoritesGet**](docs/UserApi.md#userUsernameFavoritesGet) | **GET** /user/{username}/favorites | Suserin favori entrylerini getirir


## Documentation for Models

 - [Author](docs/Author.md)
 - [Badges](docs/Badges.md)
 - [CaylakFavoritesResponse](docs/CaylakFavoritesResponse.md)
 - [Entry](docs/Entry.md)
 - [EntryWithTopic](docs/EntryWithTopic.md)
 - [FavoritesResponse](docs/FavoritesResponse.md)
 - [GeneralResponse](docs/GeneralResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Entries](docs/InlineResponse2001Entries.md)
 - [InlineResponse2001Entry](docs/InlineResponse2001Entry.md)
 - [InlineResponse2001EntryAuthor](docs/InlineResponse2001EntryAuthor.md)
 - [InlineResponse2001TopicId](docs/InlineResponse2001TopicId.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse200Badges](docs/InlineResponse200Badges.md)
 - [InlineResponse200UserInfo](docs/InlineResponse200UserInfo.md)
 - [InlineResponse200UserInfoKarma](docs/InlineResponse200UserInfoKarma.md)
 - [InlineResponse200UserInfoUserIdentifier](docs/InlineResponse200UserInfoUserIdentifier.md)
 - [Karma](docs/Karma.md)
 - [TopicId](docs/TopicId.md)
 - [User](docs/User.md)
 - [UserIdentifier](docs/UserIdentifier.md)
 - [UserInfo](docs/UserInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

reklam@eksisozluk.com

