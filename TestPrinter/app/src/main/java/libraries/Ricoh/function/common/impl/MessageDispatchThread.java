/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.common.impl;

import android.util.Log;
import libraries.Ricoh.function.common.SmartSDKApplication;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 受信した非同期イベントをイベントリスナーにポストするスレッドです。
 * The thread to post received asynchronous events to the event listener.
 */
class MessageDispatchThread extends Thread{
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "impl:MsgDispThread:";
    
	/**
	 * 受信したコピー状態イベント・コピージョブ状態イベントを同じキューに入れるために
	 * 使用するデータ構造です
	 * The data structure to set received copy state events and copy job state events
	 * to a same queue.
	 */
	public static class EventData {
		public static final int EVENT_TYPE_APP_STATE = 0;
		public static final int EVENT_TYPE_JOB_EVENT = 1;
		public static final int EVENT_TYPE_RECEIVE_FAX = 2;

		private String evData;
		private AbstractEventReceiver receiver;
		private int eventType;

		public EventData(int eventType, String val, AbstractEventReceiver receiver) {
			this.eventType = eventType;
			this.evData = val;
			this.receiver = receiver;
		}

		public String getEventData() { return this.evData; }
		public AbstractEventReceiver getReceiver() { return this.receiver; }
		public int getEventType() { return this.eventType; }
	}

	private LinkedBlockingQueue<EventData> mEventQueue;
	private volatile boolean isStart;

	public MessageDispatchThread() {
		mEventQueue = new LinkedBlockingQueue<EventData>();
		isStart = true;
	}

	public void post(int eventType, String eventData, AbstractEventReceiver receiver)  {
		EventData data = new EventData(eventType,eventData, receiver);
		try {
			mEventQueue.put(data);
		} catch (InterruptedException e) {
            Log.w(SmartSDKApplication.getTagName(), PREFIX + e.toString());
		}
	}

	public void run() {
		while(isStart) {
			try {
				EventData ev = mEventQueue.take();

				AbstractEventReceiver receiver = ev.getReceiver();
				int evType = ev.getEventType();
				String data = ev.getEventData();

				receiver.notifyAsyncEvent(evType, data);

			} catch (InterruptedException e) {
	            Log.w(SmartSDKApplication.getTagName(), PREFIX + e.toString());
			} catch (Exception ex) {
			    // continue the thread
	            Log.w(SmartSDKApplication.getTagName(), PREFIX + ex.toString());
			}
		}
	}


	public void stopThread(){
		isStart = false;
		interrupt();
	}
}

