/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.log.printerlog;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

/*
 * @since SmartSDK v2.40
 */
public class GetImageLogDestinationResponseBody extends Element implements ResponseBody {

	private static final String KEY_HDD_PATH = "hddPath";
	private static final String KEY_HDD_FULL_PATH = "hddFullPath";
	private static final String KEY_FILE_NAME_FORMAT = "fileNameFormat";

	GetImageLogDestinationResponseBody(Map<String, Object> values) {
		super(values);
	}

	/*
	 * hddPath (String)
	 */
	public String getHddPath() {
		return getStringValue(KEY_HDD_PATH);
	}

	/*
	 * hddFullPath (String)
	 */
	public String getHddFullPath() {
		return getStringValue(KEY_HDD_FULL_PATH);
	}

	/*
	 * fileNameFormat (String)
	 */
	public String getFileNameFormat() {
		return getStringValue(KEY_FILE_NAME_FORMAT);
	}
}
