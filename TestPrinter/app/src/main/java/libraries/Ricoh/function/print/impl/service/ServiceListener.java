/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.impl.service;

import libraries.Ricoh.function.print.attribute.PrintServiceAttributeSet;

/**
 * SDKServiceからの非同期サービスイベントを通知するリスナーインターフェイスです。
 * The listener interface to notify the asynchronous service events from SDKService.
 */
public interface ServiceListener {

    void onChangePrintServiceAttributes(PrintServiceAttributeSet attributes);

}
