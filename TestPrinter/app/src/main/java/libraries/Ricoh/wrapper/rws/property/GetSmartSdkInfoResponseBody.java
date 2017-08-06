/*
 *  Copyright (C) 2016 RICOH Co.,LTD.
 *  All rights reserved.
 */

package libraries.Ricoh.wrapper.rws.property;
import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDK V2.12
 */
public class GetSmartSdkInfoResponseBody extends Element implements ResponseBody{
	private static final String KEY_VERSION = "version";
	
	GetSmartSdkInfoResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * version (String)
	 * @since SmartSDK V2.12
	 */
	public String getVersion() {
		return getStringValue(KEY_VERSION);
	}
}