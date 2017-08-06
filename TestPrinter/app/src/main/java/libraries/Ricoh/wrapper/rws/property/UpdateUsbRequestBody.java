/*
 *  Copyright (C) 2017 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.property;

import java.util.HashMap;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

/*
 * @since SmartSDk v2.40
 */
public class UpdateUsbRequestBody extends WritableElement implements RequestBody{
	
	private final static String PREFIX = "property:UpdateUsbReq:";			
	private static final String CONTENT_TYPE_JSON               = "application/json; charset=utf-8";
	private static final String KEY_NOTIFY_UNSUPPORT            = "notifyUnsupport";

	public UpdateUsbRequestBody() {
		super(new HashMap<String, Object>());
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
	 * notifyUnsupport (String)
	 */
	public String getNotifyUnsupport() {
		return getStringValue(KEY_NOTIFY_UNSUPPORT);
	}
	public void setNotifyUnsupport(String value) {
		setStringValue(KEY_NOTIFY_UNSUPPORT, value);
	}
	public String removeNotifyUnsupport(){
		return removeStringValue(KEY_NOTIFY_UNSUPPORT);
	}

}
