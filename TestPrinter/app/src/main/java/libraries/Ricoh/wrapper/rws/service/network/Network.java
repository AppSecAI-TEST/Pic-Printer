/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.network;

import java.io.IOException;
import java.util.Map;

import libraries.Ricoh.wrapper.client.RestContext;
import libraries.Ricoh.wrapper.client.RestRequest;
import libraries.Ricoh.wrapper.client.RestResponse;
import libraries.Ricoh.wrapper.common.ApiClient;
import libraries.Ricoh.wrapper.common.EmptyResponseBody;
import libraries.Ricoh.wrapper.common.GenericJsonDecoder;
import libraries.Ricoh.wrapper.common.InvalidResponseException;
import libraries.Ricoh.wrapper.common.Request;
import libraries.Ricoh.wrapper.common.Response;
import libraries.Ricoh.wrapper.common.Utils;

/*
 * @since SmartSDK v2.40
 */
public class Network extends ApiClient{
    private static final String REST_PATH_REBOOT                = "/rws/service/network/reboot";
    
    public Network() {
        super();
    }

    public Network(RestContext context) {
        super(context);
    }
    
    /*
     * GET: /rws/service/network/reboot
     * 
     * RequestBody:  non
     * ResponseBody: GetRebootResponseBody
     */
    public Response<GetRebootResponseBody> getNetworkReboot(Request request) throws IOException, InvalidResponseException {
        RestResponse restResponse = execute(
                build(RestRequest.METHOD_GET, REST_PATH_REBOOT, request));
        Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

        switch (restResponse.getStatusCode()) {
            case 200:
                return new Response<GetRebootResponseBody>(restResponse, new GetRebootResponseBody(body));
            default:
                throw Utils.createInvalidResponseException(restResponse, body);
        }
    }
    
    /*
     * POST: /rws/service/network/reboot
     * 
     * RequestBody:  NetWorkRebootRequestBody
     * ResponseBody: non (EmptyResponseBody)
     */
    public Response<EmptyResponseBody> executeNetworkReboot(Request request) throws IOException, InvalidResponseException {
        RestResponse restResponse = execute(
                build(RestRequest.METHOD_POST, REST_PATH_REBOOT, request));
        Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

        switch (restResponse.getStatusCode()) {
            case 200:
                return new Response<EmptyResponseBody>(restResponse, new EmptyResponseBody(body));
            default:
                throw Utils.createInvalidResponseException(restResponse, body);
        }
    }


}
