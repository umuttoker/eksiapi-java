/*
 * Ekşi Sözlük Unofficial API
 * Ekşi sözlük'ün public olmayan apiyı. Bunu kullanmanın size yasal yaptırımları olabilir. Bunu kullanan kişiler bu riski göze almış olarak düşünülür.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: reklam@eksisozluk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
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
        InlineResponse200 response = api.getUserByName(username);

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
    public void userUsernameFavoritedGetTest() throws ApiException {
        String username = null;
        Integer p = null;
        InlineResponse2001 response = api.userUsernameFavoritedGet(username, p);

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
    public void userUsernameFavoritesGetTest() throws ApiException {
        String username = null;
        Integer p = null;
        InlineResponse2001 response = api.userUsernameFavoritesGet(username, p);

        // TODO: test validations
    }
    
}