/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.impl.service;

import libraries.Ricoh.wrapper.rws.service.printer.GetJobStatusResponseBody;

/**
 * ジョブごとの非同期通信用リスナーです。
 * Listener for asynchronous communication by job
 */
public interface AsyncJobEventHandler {

    void onReceiveJobEvent(GetJobStatusResponseBody event);

    String getJobId();
}
