/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.scanner;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

import java.util.HashMap;
import java.util.Map;

public class CreateJobRequestBody extends WritableElement implements RequestBody {
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "scanner:CreateJobReq:";
	
	private static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
	
	private static final String KEY_VALIDATE_ONLY	= "validateOnly";
	private static final String KEY_JOB_SETTING		= "jobSetting";
	
	public CreateJobRequestBody() {
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
	 * validateOnly (Boolean)
	 */
	public Boolean getValidateOnly() {
		return getBooleanValue(KEY_VALIDATE_ONLY);
	}
	public void setValidateOnly(Boolean value) {
		setBooleanValue(KEY_VALIDATE_ONLY, value);
	}
	public Boolean removeValidateOnly() {
		return removeBooleanValue(KEY_VALIDATE_ONLY);
	}
	
	/*
	 * jobSetting (Object)
	 */
	public JobSetting getJobSetting() {
		Map<String, Object> value = getObjectValue(KEY_JOB_SETTING);
		if (value == null) {
			value = Utils.createElementMap();
			setObjectValue(KEY_JOB_SETTING, value);
		}
		return new JobSetting(value);
	}
//	public void setJobSetting(JobSetting value) {
//		throw new UnsupportedOperationException();
//	}
	public JobSetting removeJobSetting() {
		Map<String, Object> value = removeObjectValue(KEY_JOB_SETTING);
		if (value == null) {
			return null;
		}
		return new JobSetting(value);
	}
	
}
