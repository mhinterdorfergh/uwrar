/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.AuthRequestDTO;
import io.swagger.client.model.AuthResponseDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AuthControllerApi
 */
@Ignore
public class AuthControllerApiTest {

    private final AuthControllerApi api = new AuthControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAuthTokenTest() throws Exception {
        AuthRequestDTO body = null;
        AuthResponseDTO response = api.createAuthToken(body);

        // TODO: test validations
    }
}
