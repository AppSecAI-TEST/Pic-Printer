/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.impl.job;

import libraries.Ricoh.function.print.attribute.PrintJobAttributeSet;

/**
 * Listener to notify job state changes
 */
public interface JobListener {

    /**
     * Notifies the job state
     */
    void onChangeJobStatus(PrintJobAttributeSet jobStatus);

    /**
     * Notifies that the job starts and the job ID is assigned.
     * @param jobId
     */
    void setJobId(String jobId);

    /**
     * Obtains the current job number
     * @return
     */
    String getJobId();

}
