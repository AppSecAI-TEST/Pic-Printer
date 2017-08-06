/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.log.printerlog;
import java.util.List;

import java.util.HashMap;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

/*
 * @since SmartSDK v2.40
 */
public class UpdateDeviceLogCollectionRequestBody extends WritableElement implements RequestBody {
	
	/**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "printerlog:updateDevCollReq:";
    private static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    private static final String KEY_COLLECT_SETTING = "collectSetting";
    private static final String KEY_JOB_LOG_TYPE = "jobLogType";
    
    
    public UpdateDeviceLogCollectionRequestBody() {
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
     * collectSetting (Boolean)
     */
    public Boolean getCollectSetting() {
    	return getBooleanValue(KEY_COLLECT_SETTING);
    }
    public void setCollectSetting(Boolean value) {
    	setBooleanValue(KEY_COLLECT_SETTING, value);
    }
    public Boolean removeCollectSetting() {
    	return removeBooleanValue(KEY_COLLECT_SETTING);
    }
    
    /*
     * jobLogType (Array[String])
     */
    public List<String> getJobLogType() {
    	return getArrayValue(KEY_JOB_LOG_TYPE);
    }
    public void setJobLogType(List<String> value) {
    	setArrayValue(KEY_JOB_LOG_TYPE, value);
    }
    public List<String> removeJobLogType() {
    	return removeArrayValue(KEY_JOB_LOG_TYPE);
    }
    
}
