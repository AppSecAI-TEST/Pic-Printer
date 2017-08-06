/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.addressbook;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class CreateGroupResponseBody extends Group implements ResponseBody {

	CreateGroupResponseBody(Map<String, Object> value) {
		super(value);
	}

}
