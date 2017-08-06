/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.property;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDK v2.40
 */
public class GetUsbResponseBody extends Element implements ResponseBody{
	private static final String KEY_NOTIFY_UNSUPPORT    = "notifyUnsupport";

	public GetUsbResponseBody(Map<String, Object> values) {
		super(values);
	}
	
	/*
	 * notifyUnsupport (String)
	 */
	public String getNotifyUnsupport() {
		return getStringValue(KEY_NOTIFY_UNSUPPORT);
	}

	
}
