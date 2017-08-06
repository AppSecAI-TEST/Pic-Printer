/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.log.printerlog;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDk v2.40
 */
public class GetImageLogServerlessResponseBody extends Element implements ResponseBody {

	private static final String KEY_STATUS_INFO = "statusInfo";
	private static final String KEY_IMAGE_LOG_TRANS_SETTING = "imageLogTransSetting";
	
	GetImageLogServerlessResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * statusInfo (String)
	 */
	public String getStatusInfo() {
		return getStringValue(KEY_STATUS_INFO);
	}
	
	/*
	 * imageLogTransSetting (Boolean)
	 */
	public Boolean getImageLogTransSetting() {
		return getBooleanValue(KEY_IMAGE_LOG_TRANS_SETTING);
	}
		
}
