/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.printer;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

import java.util.HashMap;

public class UpdateJobStatusRequestBody extends WritableElement implements RequestBody {
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "printer:UpdateJobStatusReq:";

	private static final String CONTENT_TYPE_JSON	= "application/json; charset=utf-8";

	private static final String KEY_JOB_STATUS		= "jobStatus";
	private static final String KEY_USER_CODE		= "userCode";

	public UpdateJobStatusRequestBody() {
		super(new HashMap<String, Object>());
	}

	@Override
	public String getContentType() {
		return CONTENT_TYPE_JSON;
	}

	@Override
	public String toEntityString() {
		try {
			return JsonUtils.getEncoder().encode(values);
		} catch (EncodedException e) {
            Logger.warn(Utils.getTagName(), PREFIX + e.toString());
			return "{}";
		}
	}

	/*
	 * jobStatus (String)
	 */
	public String getJobStatus() {
		return getStringValue(KEY_JOB_STATUS);
	}
	public void setJobStatus(String value) {
		setStringValue(KEY_JOB_STATUS, value);
	}
	public String removeJobStatus() {
		return removeStringValue(KEY_JOB_STATUS);
	}

	/*
	 * userCode (String)
	 */
	public String getUserCode() {
		return getStringValue(KEY_USER_CODE);
	}
	public void setUserCode(String value) {
		setStringValue(KEY_USER_CODE, value);
	}
	public String removeUserCode() {
		return removeStringValue(KEY_USER_CODE);
	}

}
