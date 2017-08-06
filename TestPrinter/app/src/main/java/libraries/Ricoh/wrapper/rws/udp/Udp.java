/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.udp;

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
 * @since SmartSDK V2.31
 */
public class Udp extends ApiClient{
	private static final String REST_PATH_TRANSMISSION = "/rws/udp/transmission"; 
	
	public Udp() {
		super();
	}
	
	public Udp(RestContext context ) {
		super(context);
	}
	
	/*
     * PUT: /rws/udp/transmission
     * 
     * RequestBody:  SendTransmissionRequestBody
     * ResponseBody: non (EmptyResponseBody)
     */
    public Response<EmptyResponseBody> sendTransmission(Request request) throws IOException, InvalidResponseException {
        RestResponse restResponse = execute(
                build(RestRequest.METHOD_PUT, REST_PATH_TRANSMISSION, request));
        Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

        switch (restResponse.getStatusCode()) {
            case 200:  
                return new Response<EmptyResponseBody>(restResponse, new EmptyResponseBody(body));
            default:
                throw Utils.createInvalidResponseException(restResponse, body);
        }
    }

}
