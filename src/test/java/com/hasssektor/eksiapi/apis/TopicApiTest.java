/*
 * Ekşi Sözlük UnPublic API
 * Ekşi sözlük'ün public olmayan apiyı. Bunu kullanmanın size yasal yaptırımları olabilir. Bunu kullanan kişiler bu riski göze almış olarak düşünülür.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: umt.toker@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hasssektor.eksiapi.apis;

import com.hasssektor.eksiapi.ApiException;
import com.hasssektor.eksiapi.models.Topic;
import com.hasssektor.eksiapi.models.TopicQueryResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TopicApi
 */
@Ignore
public class TopicApiTest {

    private final TopicApi api = new TopicApi();

    
    /**
     * basligi takip et
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void followTest() throws ApiException {
        String topicId = null;
        api.follow(topicId);

        // TODO: test validations
    }
    
    /**
     * baslitaki buddy entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBuddyEntriesTest() throws ApiException {
        String topicId = null;
        Integer p = null;
        Topic response = api.getBuddyEntries(topicId, p);

        // TODO: test validations
    }
    
    /**
     * gunun sukelalari
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDailyNicesTest() throws ApiException {
        String topicId = null;
        Integer p = null;
        Topic response = api.getDailyNices(topicId, p);

        // TODO: test validations
    }
    
    /**
     * baslitaki linkleri getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLinksTest() throws ApiException {
        String topicId = null;
        Integer p = null;
        Topic response = api.getLinks(topicId, p);

        // TODO: test validations
    }
    
    /**
     * tum zamanlarin sukelalari
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNicesTest() throws ApiException {
        String topicId = null;
        Integer p = null;
        Topic response = api.getNices(topicId, p);

        // TODO: test validations
    }
    
    /**
     * basligin entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTopicTest() throws ApiException {
        String topicId = null;
        Integer p = null;
        Topic response = api.getTopic(topicId, p);

        // TODO: test validations
    }
    
    /**
     * textle baslik id si doner
     *
     * Autocomplateden sonra cagirmak lazim gibi gibi
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTopicIdFromSlugTest() throws ApiException {
        String term = null;
        TopicQueryResponse response = api.getTopicIdFromSlug(term);

        // TODO: test validations
    }
    
    /**
     * baslikta arar
     *
     * Eger term @ ile baslarsa bu bi suser nickidir ve suserin o basliktaki entrylerini getirir
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String topicId = null;
        String term = null;
        Integer p = null;
        Topic response = api.search(topicId, term, p);

        // TODO: test validations
    }
    
    /**
     * basligi takibi birak
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unfollowTest() throws ApiException {
        String topicId = null;
        api.unfollow(topicId);

        // TODO: test validations
    }
    
}
