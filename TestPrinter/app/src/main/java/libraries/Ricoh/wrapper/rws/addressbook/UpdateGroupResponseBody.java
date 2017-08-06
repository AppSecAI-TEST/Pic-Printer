/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.addressbook;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class UpdateGroupResponseBody extends Group implements ResponseBody {

	UpdateGroupResponseBody(Map<String, Object> values) {
		super(values);
	}

}
