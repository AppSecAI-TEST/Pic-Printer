/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.log.printerlog;

import java.util.HashMap;
import java.util.Map;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

/*
 * @since SmartSDk v2.40
 */
public class UpdateImageLogDestinationRequestBody extends WritableElement implements RequestBody {

	/**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "printerlog:updateImgDesReq:";
	private static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
	private static final String KEY_HDD_PATH = "hddPath";
	private static final String KEY_FILE_NAME_FORMAT = "fileNameFormat";

	public UpdateImageLogDestinationRequestBody() {
		super(new HashMap<String, Object>());
	}

	public UpdateImageLogDestinationRequestBody(Map<String, Object> values) {
		super(values);
	}

	@Override
	public String getContentType() {
		return CONTENT_TYPE_JSON;
	}

	@Override
	public String toEntityString() {
		try {
			return JsonUtils.getEncoder().encode(values);
		} catch (EncodedException e) {
			Logger.warn(Utils.getTagName(), PREFIX + e.toString());
			return "{}";
		}
	}

	/*
	 * hddPath (String)
	 */
	public String getHddPath() {
		return getStringValue(KEY_HDD_PATH);
	}
	public void setHddPath(String value) {
		setStringValue(KEY_HDD_PATH, value);
	}
	public String removeHddPath() {
		return removeStringValue(KEY_HDD_PATH);
	}

	/*
	 * fileNameFormat (String)
	 */
	public String getFileNameFormat() {
		return getStringValue(KEY_FILE_NAME_FORMAT);
	}
	public void setFileNameFormat(String value) {
		setStringValue(KEY_FILE_NAME_FORMAT, value);
	}
	public String removeFileNameFormat() {
		return removeStringValue(KEY_FILE_NAME_FORMAT);
	}
}
