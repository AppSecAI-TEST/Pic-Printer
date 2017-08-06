/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.fax;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;

public class GetCapabilityResponseBody extends Element implements ResponseBody {

    private static final String KEY_JOB_SETTING_CAPABILITY = "jobSettingCapability";

    GetCapabilityResponseBody(Map<String, Object> values) {
        super(values);
    }

    /*
     * jobSettingCapability (Object)
     */
    public Capability getJobSettingCapability() {
        Map<String, Object> value = getObjectValue(GetCapabilityResponseBody.KEY_JOB_SETTING_CAPABILITY);
        if (value == null) {
            return null;
        }
        return new Capability(value);
    }

}
