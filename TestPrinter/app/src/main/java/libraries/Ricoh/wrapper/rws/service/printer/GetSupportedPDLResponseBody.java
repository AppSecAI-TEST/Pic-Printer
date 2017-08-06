/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.printer;

import java.util.List;
import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

public class GetSupportedPDLResponseBody extends Element implements ResponseBody {

	private static final String KEY_PDL		= "pdl";

	GetSupportedPDLResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * pdl (Array[String])
	 */
	public List<String> getPdl() {
		return getArrayValue(KEY_PDL);
	}

}
