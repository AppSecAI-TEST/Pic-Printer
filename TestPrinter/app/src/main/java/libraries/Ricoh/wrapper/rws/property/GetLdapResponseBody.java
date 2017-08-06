/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.property;

import java.util.Map;

import libraries.Ricoh.wrapper.common.ResponseBody;

public class GetLdapResponseBody extends Ldap implements ResponseBody {

    GetLdapResponseBody(Map<String, Object> values) {
        super(values);
    }

}
