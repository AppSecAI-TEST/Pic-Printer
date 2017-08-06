/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.network;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDK v2.40
 */
public class GetRebootResponseBody extends Element implements ResponseBody{
	private static final String KEY_STATUS    = "status";

	public GetRebootResponseBody(Map<String, Object> values) {
		super(values);
	}
	
	/*
	 * status (String)
	 */
	public String getStatus() {
		return getStringValue(KEY_STATUS);
	}

}
