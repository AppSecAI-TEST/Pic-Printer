/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.supported;

import libraries.Ricoh.wrapper.common.MaxLengthElement;

/**
 * 最大長を示すサポートクラスです。
 * The support class to indicate max length information.
 */
public final class MaxLengthSupported {

	private final int maxLength;
	private final String supportedCharType;

	public MaxLengthSupported(int maxLength, String supportedCharType){
		this.maxLength = maxLength;
		this.supportedCharType = supportedCharType;
	}

	public static MaxLengthSupported getMaxLengthSupported(MaxLengthElement value) {
		if (value == null) {
			return null;
		}
		return new MaxLengthSupported(value.getMaxLength(), value.getAvailableCharacterType());
	}

	public int getMaxLength() {
		return maxLength;
	}

	public String getSupportedCharType() {
		return supportedCharType;
	}

}
