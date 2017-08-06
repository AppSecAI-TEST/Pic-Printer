/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.property;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class UpdateLdapResponseBody extends Ldap implements ResponseBody {

    UpdateLdapResponseBody(Map<String, Object> values) {
        super(values);
    }

}
