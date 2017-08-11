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
import com.hasssektor.eksiapi.models.GeneralResponse;
import com.hasssektor.eksiapi.models.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Suserin en iyi entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBestEntriesTest() throws ApiException {
        String username = null;
        Integer p = null;
        GeneralResponse response = api.getBestEntries(username, p);

        // TODO: test validations
    }
    
    /**
     * Suserin favori entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriEntriesTest() throws ApiException {
        String username = null;
        Integer p = null;
        GeneralResponse response = api.getFavoriEntries(username, p);

        // TODO: test validations
    }
    
    /**
     * Suserin favorilenen entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoritedEntriesTest() throws ApiException {
        String username = null;
        Integer p = null;
        GeneralResponse response = api.getFavoritedEntries(username, p);

        // TODO: test validations
    }
    
    /**
     * Suserin son oylanan entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastVotedEntriesTest() throws ApiException {
        String username = null;
        Integer p = null;
        GeneralResponse response = api.getLastVotedEntries(username, p);

        // TODO: test validations
    }
    
    /**
     * Suserin el emegi goznuru entrylerini getirir
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfFavoritedEntriesTest() throws ApiException {
        String username = null;
        Integer p = null;
        GeneralResponse response = api.getSelfFavoritedEntries(username, p);

        // TODO: test validations
    }
    
    /**
     * Suserin tüm bilgilerini getirir.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() throws ApiException {
        String username = null;
        User response = api.getUserByName(username);

        // TODO: test validations
    }
    
}