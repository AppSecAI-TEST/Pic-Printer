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
public class GetAddressbookResponseBody extends Element implements ResponseBody {
	private static final String KEY_AUTO_DELETE_USER      = "autoDeleteUser";

	GetAddressbookResponseBody(Map<String, Object> values) {
		super(values);
	}
	
	/*
	 * autoDeleteUser (String)
	 */
	public String getAutoDeleteUser() {
        return getStringValue(KEY_AUTO_DELETE_USER);
    }

}
