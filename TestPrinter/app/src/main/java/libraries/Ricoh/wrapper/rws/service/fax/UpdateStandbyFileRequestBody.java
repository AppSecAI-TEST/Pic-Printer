/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.fax;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.common.WritableElement;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

import java.util.HashMap;

public class UpdateStandbyFileRequestBody extends WritableElement implements RequestBody  {
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "fax:UpdateStandbyFileReq:";

    private static final String CONTENT_TYPE_JSON   = "application/json; charset=utf-8";

    private static final String KEY_TIME            = "time";

    public UpdateStandbyFileRequestBody() {
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
     * time (String)
     */
    public String getTime() {
        return getStringValue(KEY_TIME);
    }
    public void setTime(String value) {
        setStringValue(KEY_TIME, value);
    }
    public String removeTime() {
        return removeStringValue(KEY_TIME);
    }

}
