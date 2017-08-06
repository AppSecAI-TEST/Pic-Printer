/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.addressbook;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class GetTagResponseBody extends Tag implements ResponseBody {

	GetTagResponseBody(Map<String, Object> values) {
		super(values);
	}
	
}
