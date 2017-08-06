/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.property;

import libraries.Ricoh.wrapper.common.RequestBody;
import libraries.Ricoh.wrapper.common.Utils;
import libraries.Ricoh.wrapper.json.EncodedException;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

import java.util.HashMap;
import java.util.Map;

public class UpdateLdapRequestBody extends Ldap implements RequestBody {

    private static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "property:UpdateLdapReq:";

    public UpdateLdapRequestBody() {
        super(new HashMap<String, Object>());
    }
    public UpdateLdapRequestBody(Map<String, Object> values) {
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

}
