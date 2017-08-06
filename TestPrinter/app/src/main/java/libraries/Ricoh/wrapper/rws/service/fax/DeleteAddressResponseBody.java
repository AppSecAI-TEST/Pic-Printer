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
public class DeleteAddressResponseBody extends Element implements ResponseBody {

	private static final String KEY_ADDRESS_COUNT	= "addressCount";

	DeleteAddressResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * addressCount (Number)
	 * @since SmartSDK V2.12
	 */
	public Integer getAddressCount() {
		return getNumberValue(KEY_ADDRESS_COUNT);
	}

}
