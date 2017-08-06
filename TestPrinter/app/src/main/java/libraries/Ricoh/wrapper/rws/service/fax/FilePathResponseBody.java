/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.rws.service.fax;

import java.util.Map;

import libraries.Ricoh.wrapper.common.Element;
import libraries.Ricoh.wrapper.common.ResponseBody;


public class FilePathResponseBody extends Element implements ResponseBody {

    private static final String KEY_FILE_PATH   = "filePath";
    private static final String KEY_FILE_ROTATE = "rotate";

    FilePathResponseBody(Map<String, Object> values) {
        super(values);
    }

    /*
     * filePath (String)
     */
    public String getFilePath() {
        return getStringValue(KEY_FILE_PATH);
    }

    /*
     * rotate (Number)
     */
    public Integer getRotate() {
        return getNumberValue(KEY_FILE_ROTATE);
    }

}