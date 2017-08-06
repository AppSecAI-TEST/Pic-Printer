/*
 *  Copyright (C) 2013-2015 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.printer;

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
//import libraries.Ricoh.wrapper.log.Logger;

public class Job extends ApiClient {

	private static final String REST_PATH_JOBS_ID			= "/rws/service/printer/jobs/%s";

	private final String jobId;

	public Job(String jobId) {
		super();
		if (jobId == null) {
			throw new NullPointerException("jobId must not be null.");
		}
		if(jobId.trim().length() == 0) {
			throw new IllegalArgumentException("jobId must not be empty.");
		}
		this.jobId = jobId;
	}

	public Job(RestContext context, String jobId) {
		super(context);
		if (jobId == null) {
			throw new NullPointerException("jobId must not be null.");
		}
		if(jobId.trim().length() == 0) {
			throw new IllegalArgumentException("jobId must not be empty.");
		}
		this.jobId = jobId;
	}

	/*
	 * GET: /rws/service/printer/jobs/{jobId}
	 * 
	 * RequestBody:  non
	 * ResponseBody: GetJobStatusResponseBody
	 */
	public Response<GetJobStatusResponseBody> getJobStatus(Request request) throws IOException, InvalidResponseException {
		RestResponse restResponse = execute(
				build(RestRequest.METHOD_GET, String.format(REST_PATH_JOBS_ID, jobId), request));
		Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

		switch (restResponse.getStatusCode()) {
			case 200:
				return new Response<GetJobStatusResponseBody>(restResponse, new GetJobStatusResponseBody(body));
			default:
				throw Utils.createInvalidResponseException(restResponse, body);
		}
	}

	/*
	 * PUT: /rws/service/printer/jobs/{jobId}
	 * 
	 * RequestBody:  UpdateJobStatusRequestBody
	 * ResponseBody: non (EmptyResponseBody)
	 */
	public Response<EmptyResponseBody> updateJobStatus(Request request) throws IOException, InvalidResponseException {
		// If you enable this comments, JSON structure that request will be output to the debug log.
		//if (Logger.isDebugEnabled()) {
		//	if (request.hasBody()) {
		//		Logger.debug("printer updateJobStatus json: " + request.getBody().toEntityString());
		//	}
		//}

		RestResponse restResponse = execute(
				build(RestRequest.METHOD_PUT, String.format(REST_PATH_JOBS_ID, jobId), request));
		Map<String, Object> body = GenericJsonDecoder.decodeToMap(restResponse.makeContentString("UTF-8"));

		switch (restResponse.getStatusCode()) {
			case 202:
				return new Response<EmptyResponseBody>(restResponse, new EmptyResponseBody(body));
			default:
				throw Utils.createInvalidResponseException(restResponse, body);
		}
	}

}
