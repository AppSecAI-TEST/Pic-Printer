/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.event;

import libraries.Ricoh.function.print.attribute.PrintJobAttributeSet;

/**
 * プリンタジョブ状態が変更した際に通知されるジョブ属性をカプセル化したジョブイベントクラスです。
 * The event class which stores event information for the time of notifying print job events.
 */
public class PrintJobEvent {
    private PrintJobAttributeSet mAttributeSet;

    public PrintJobEvent(PrintJobAttributeSet attributeSet) {
         this.mAttributeSet = attributeSet;
    }

    public PrintJobAttributeSet getAttributeSet() {
        return this.mAttributeSet;
    }
}
