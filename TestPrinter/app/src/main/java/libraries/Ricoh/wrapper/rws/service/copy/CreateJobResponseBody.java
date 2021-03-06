/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.copy;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

public class CreateJobResponseBody extends Element implements ResponseBody {

	private static final String KEY_JOB_ID	= "jobId";

	CreateJobResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * jobId (String)
	 */
	public String getJobId() {
		return getStringValue(KEY_JOB_ID);
	}

}
