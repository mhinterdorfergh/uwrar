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

import io.swagger.client.model.GenericListDTORoleResponseDTO;
import io.swagger.client.model.RoleRequestDTO;
import io.swagger.client.model.RoleResponseDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RoleControllerApi
 */
@Ignore
public class RoleControllerApiTest {

    private final RoleControllerApi api = new RoleControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() throws Exception {
        RoleRequestDTO body = null;
        RoleResponseDTO response = api.createRole(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws Exception {
        Integer id = null;
        Object response = api.deleteRole(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllRolesTest() throws Exception {
        GenericListDTORoleResponseDTO response = api.getAllRoles();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getById1Test() throws Exception {
        Integer id = null;
        RoleResponseDTO response = api.getById1(id);

        // TODO: test validations
    }
}
