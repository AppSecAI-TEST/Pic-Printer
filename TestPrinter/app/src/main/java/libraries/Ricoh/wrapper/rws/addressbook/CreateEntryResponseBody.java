/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.addressbook;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class CreateEntryResponseBody extends Entry implements ResponseBody {

	CreateEntryResponseBody(Map<String, Object> values) {
		super(values);
	}
	
}
