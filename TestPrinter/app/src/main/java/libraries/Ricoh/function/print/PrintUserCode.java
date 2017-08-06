/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print;

/**
 * プリントのユーザーコードを示すクラスです。
 * The class to indicate the print user code.
 */
public class PrintUserCode {
    private String userCode;

    public PrintUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        return userCode;
    }
}
