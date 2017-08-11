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
import com.hasssektor.eksiapi.models.CaylakFavoritesResponse;
import com.hasssektor.eksiapi.models.FavoritesResponse;
import com.hasssektor.eksiapi.models.Topic;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntryApi
 */
@Ignore
public class EntryApiTest {

    private final EntryApi api = new EntryApi();

    
    /**
     * entrye eksi(-) oy verir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downVoteTest() throws ApiException {
        String entryId = null;
        api.downVote(entryId);

        // TODO: test validations
    }
    
    /**
     * entryi favoriler.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void favoriteTest() throws ApiException {
        String entryId = null;
        api.favorite(entryId);

        // TODO: test validations
    }
    
    /**
     * ilgili entryi getirir.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntryTest() throws ApiException {
        String entryId = null;
        Topic response = api.getEntry(entryId);

        // TODO: test validations
    }
    
    /**
     * Entryi favorileyen caylakları getirir.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoritedCaylaksTest() throws ApiException {
        String entryId = null;
        CaylakFavoritesResponse response = api.getFavoritedCaylaks(entryId);

        // TODO: test validations
    }
    
    /**
     * Entryi favorileyen suserları getirtir.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoritedUsersTest() throws ApiException {
        String entryId = null;
        FavoritesResponse response = api.getFavoritedUsers(entryId);

        // TODO: test validations
    }
    
    /**
     * verilen oyu geri alir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeVoteTest() throws ApiException {
        String entryId = null;
        api.removeVote(entryId);

        // TODO: test validations
    }
    
    /**
     * entryi favorilemeyi birakir.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unfavoriteTest() throws ApiException {
        String entryId = null;
        api.unfavorite(entryId);

        // TODO: test validations
    }
    
    /**
     * entryi sukelalar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upVoteTest() throws ApiException {
        String entryId = null;
        api.upVote(entryId);

        // TODO: test validations
    }
    
}
