/*
 *  Copyright (C) 2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.fax;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDK V2.12
 */
public class CreateLockResponseBody extends Element implements ResponseBody {

	private static final String KEY_LOCK_ID	= "lockId";

	CreateLockResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * lockId (String)
	 * @since SmartSDK V2.12
	 */
	public String getLockId() {
		return getStringValue(KEY_LOCK_ID);
	}

}
