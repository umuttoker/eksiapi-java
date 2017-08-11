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

import com.hasssektor.eksiapi.*;
import com.hasssektor.eksiapi.auth.*;
import com.hasssektor.eksiapi.models.*;
import com.hasssektor.eksiapi.apis.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.eksisozluk.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**getAccessToken**](docs/AuthApi.md#getAccessToken) | **POST** /token | access token dondurur
*AutocomplateApi* | [**complete**](docs/AutocomplateApi.md#complete) | **GET** /v1/autocomplete/query/{term} | hersey icin autocomplate
*AutocomplateApi* | [**completeNick**](docs/AutocomplateApi.md#completeNick) | **GET** /v1/autocomplete/nick/{term} | sadece nickler icin autocomplate
*EntryApi* | [**downVote**](docs/EntryApi.md#downVote) | **POST** /v1/entry/vote/{entryId}/-1 | entrye eksi(-) oy verir
*EntryApi* | [**favorite**](docs/EntryApi.md#favorite) | **POST** /v1/entry/{entryId}/favorite | entryi favoriler.
*EntryApi* | [**getEntry**](docs/EntryApi.md#getEntry) | **GET** /v1/entry/{entryId} | ilgili entryi getirir.
*EntryApi* | [**getFavoritedCaylaks**](docs/EntryApi.md#getFavoritedCaylaks) | **GET** /v1/entry/{entryId}/caylakfavorites | Entryi favorileyen caylakları getirir.
*EntryApi* | [**getFavoritedUsers**](docs/EntryApi.md#getFavoritedUsers) | **GET** /v1/entry/{entryId}/favorites | Entryi favorileyen suserları getirtir.
*EntryApi* | [**removeVote**](docs/EntryApi.md#removeVote) | **POST** /v1/entry/vote/{entryId}/remove | verilen oyu geri alir
*EntryApi* | [**unfavorite**](docs/EntryApi.md#unfavorite) | **POST** /v1/entry/{entryId}/unfavorite | entryi favorilemeyi birakir.
*EntryApi* | [**upVote**](docs/EntryApi.md#upVote) | **POST** /v1/entry/vote/{entryId}/1 | entryi sukelalar
*MessageApi* | [**getMessages**](docs/MessageApi.md#getMessages) | **GET** /v1/message | mesajlari getirir
*MessageApi* | [**getThread**](docs/MessageApi.md#getThread) | **GET** /v1/message/thread/nick/{nick} | Suserla olan mesajlari getirir (Page 0 dan basliyor)
*MessageApi* | [**getUnreadedThreadCount**](docs/MessageApi.md#getUnreadedThreadCount) | **GET** /v1/message/totalunreadthreadcount | okunmamis dialog sayisini doner
*MessageApi* | [**markAsRead**](docs/MessageApi.md#markAsRead) | **GET** /v1/message/markread/nick/{nick} | Mesaji okundu olarak isaretler
*MessageApi* | [**send**](docs/MessageApi.md#send) | **POST** /v1/message/send | Mesaj atar
*SettingsApi* | [**get**](docs/SettingsApi.md#get) | **GET** /v1/settings/get/preferences | ayarlari getirir
*SettingsApi* | [**set**](docs/SettingsApi.md#set) | **POST** /v1/settings/set/preferences | ayarlari degistirir
*TopicApi* | [**follow**](docs/TopicApi.md#follow) | **GET** /v1/topic/follow/{topicId} | basligi takip et
*TopicApi* | [**getBuddyEntries**](docs/TopicApi.md#getBuddyEntries) | **GET** /v1/topic/{topicId}/buddies | baslitaki buddy entrylerini getirir
*TopicApi* | [**getDailyNices**](docs/TopicApi.md#getDailyNices) | **GET** /v1/topic/{topicId}/dailynice | gunun sukelalari
*TopicApi* | [**getLinks**](docs/TopicApi.md#getLinks) | **GET** /v1/topic/{topicId}/links | baslitaki linkleri getirir
*TopicApi* | [**getNices**](docs/TopicApi.md#getNices) | **GET** /v1/topic/{topicId}/allnice | tum zamanlarin sukelalari
*TopicApi* | [**getTopic**](docs/TopicApi.md#getTopic) | **GET** /v1/topic/{topicId} | basligin entrylerini getirir
*TopicApi* | [**getTopicIdFromSlug**](docs/TopicApi.md#getTopicIdFromSlug) | **GET** /v1/topic/query | textle baslik id si doner
*TopicApi* | [**search**](docs/TopicApi.md#search) | **GET** /v1/topic/{topicId}/search/{term} | baslikta arar
*TopicApi* | [**unfollow**](docs/TopicApi.md#unfollow) | **GET** /v1/topic/unfollow/{topicId} | basligi takibi birak
*UserApi* | [**getBestEntries**](docs/UserApi.md#getBestEntries) | **GET** /v1/user/{username}/bestentries | Suserin en iyi entrylerini getirir
*UserApi* | [**getFavoriEntries**](docs/UserApi.md#getFavoriEntries) | **GET** /v1/user/{username}/favorites | Suserin favori entrylerini getirir
*UserApi* | [**getFavoritedEntries**](docs/UserApi.md#getFavoritedEntries) | **GET** /v1/user/{username}/favorited | Suserin favorilenen entrylerini getirir
*UserApi* | [**getLastVotedEntries**](docs/UserApi.md#getLastVotedEntries) | **GET** /v1/user/{username}/lastvoted | Suserin son oylanan entrylerini getirir
*UserApi* | [**getSelfFavoritedEntries**](docs/UserApi.md#getSelfFavoritedEntries) | **GET** /v1/user/{username}/selffavorited | Suserin el emegi goznuru entrylerini getirir
*UserApi* | [**getUserByName**](docs/UserApi.md#getUserByName) | **GET** /v1/user/{username} | Suserin tüm bilgilerini getirir.


## Documentation for Models

 - [Author](docs/Author.md)
 - [AutocomplateNickResponse](docs/AutocomplateNickResponse.md)
 - [AutocomplateResponse](docs/AutocomplateResponse.md)
 - [Badges](docs/Badges.md)
 - [CaylakFavoritesResponse](docs/CaylakFavoritesResponse.md)
 - [Entry](docs/Entry.md)
 - [EntryCounts](docs/EntryCounts.md)
 - [EntryWithTopic](docs/EntryWithTopic.md)
 - [FavoritesResponse](docs/FavoritesResponse.md)
 - [GeneralResponse](docs/GeneralResponse.md)
 - [Karma](docs/Karma.md)
 - [Message](docs/Message.md)
 - [MessageThread](docs/MessageThread.md)
 - [Messages](docs/Messages.md)
 - [MessagesResponse](docs/MessagesResponse.md)
 - [QueryData](docs/QueryData.md)
 - [Settings](docs/Settings.md)
 - [SummaryMessage](docs/SummaryMessage.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [Topic](docs/Topic.md)
 - [TopicId](docs/TopicId.md)
 - [TopicQueryResponse](docs/TopicQueryResponse.md)
 - [User](docs/User.md)
 - [UserEntryCounts](docs/UserEntryCounts.md)
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

umt.toker@gmail.com

