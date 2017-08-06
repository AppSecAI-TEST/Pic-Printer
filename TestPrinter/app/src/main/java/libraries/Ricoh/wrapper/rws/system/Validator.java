package libraries.Ricoh.wrapper.rws.system;

import libraries.Ricoh.wrapper.common.ApiClient;

/*
 *  Copyright (C) 2014-2017 RICOH Co.,LTD.
 *  All rights reserved.
 */

import java.io.IOException;
import java.util.Map;

import libraries.Ricoh.wrapper.client.RestContext;
import libraries.Ricoh.wrapper.client.RestRequest;
import libraries.Ricoh.wrapper.client.RestResponse;
import libraries.Ricoh.wrapper.common.ApiClient;
import libraries.Ricoh.wrapper.common.GenericJsonDecoder;
import libraries.Ricoh.wrapper.common.InvalidResponseException;
import libraries.Ricoh.wrapper.common.Request;
import libraries.Ricoh.wrapper.common.Response;
import libraries.Ricoh.wrapper.common.Utils;

/*
 * @since SmartSDK V1.02
 */
public class Validator extends ApiClient {

    private static final String REST_PATH_VALIDATE           = "/rws/system/validate";
    private static final String REST_PATH_ADMIN_AUTH_REQUEST = "/rws/system/auth/adminAuthRequest"; // SmartSDK v2.40

    public Validator() {
        super();
    }

    public Validator(RestContext context) {
        super(context);
    }

    /*
     * POST: /rws/system/validate
     *
     * RequestBody:  non
     * ResponseBody: CreateSessionTokenResponseBody
     *
     * @since SmartSDK V1.02
     */
    public Response<CreateSessionTokenResponseBody> createSessionToken(Request request) throws IOException, InvalidResponseException {
        RestResponse restResponse = execute(
                build(RestRequest.METHOD_POST, REST_PATH_VALIDATE, request));
        Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

        switch (restResponse.getStatusCode()) {
            case 200:
                return new Response<CreateSessionTokenResponseBody>(restResponse, new CreateSessionTokenResponseBody(body));
            default:
                throw Utils.createInvalidResponseException(restResponse, body);
        }
    }
    
    /*
     * POST: /rws/system/auth/adminAuthRequest
     * 
     * RequestBody:  AdminAuthRequestBody
     * ResponseBody: AdminAuthResponseBody
     * @since SmartSDK V2.40
     */
    public Response<AdminAuthResponseBody> sendAdminAuthRequest(Request request) throws IOException, InvalidResponseException {

        RestResponse restResponse = execute(
                build(RestRequest.METHOD_POST, REST_PATH_ADMIN_AUTH_REQUEST, request));
        Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

        switch (restResponse.getStatusCode()) {
            case 200:
                return new Response<AdminAuthResponseBody>(restResponse, new AdminAuthResponseBody(body));
            default:
                throw Utils.createInvalidResponseException(restResponse, body);
        }
    }

}
