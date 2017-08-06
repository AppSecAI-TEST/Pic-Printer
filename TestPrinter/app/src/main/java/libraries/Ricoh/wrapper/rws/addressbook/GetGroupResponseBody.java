/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.addressbook;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class GetGroupResponseBody extends Group implements ResponseBody {
	
	GetGroupResponseBody(Map<String, Object> values) {
		super(values);
	}
	
}
