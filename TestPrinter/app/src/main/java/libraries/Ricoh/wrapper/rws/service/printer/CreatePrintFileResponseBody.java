/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.printer;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

public class CreatePrintFileResponseBody extends Element implements ResponseBody {

	private static final String KEY_FILE_ID		= "fileId";

	CreatePrintFileResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * fileId (String)
	 */
	public String getFileId() {
		return getStringValue(KEY_FILE_ID);
	}

}
