/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.wrapper.common;

import libraries.Ricoh.wrapper.json.DecodedException;
import libraries.Ricoh.wrapper.json.Decoder;
import libraries.Ricoh.wrapper.json.JsonUtils;
import libraries.Ricoh.wrapper.log.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * JSON形式のデータを解析する機能を提供するクラス。
 */
public class GenericJsonDecoder {
    
    /**
     * Define the prefix for log information with abbreviation package and class name
     */
    private final static String PREFIX = "common:GenericJsonDec:";
    
	private static <T> T decode(String json, Class<T> clazz) throws DecodedException {
		Decoder decoder = JsonUtils.getDecoder();
		return decoder.decode(json, clazz);
	}
	
	@SuppressWarnings("unchecked")
	public static <K, V> Map<K, V> decodeToMap(String json) {
		try {
			return decode(json, Map.class);
		} catch (DecodedException e) {
            Logger.warn(Utils.getTagName(), PREFIX + e.toString());
		}
		return Collections.emptyMap();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> decodeToList(String json) {
		try {
			return decode(json, List.class);
		} catch (DecodedException e) {
		    Logger.warn(Utils.getTagName(), PREFIX + e.toString());
		}
		return Collections.emptyList();
	}
	
	private GenericJsonDecoder() {}

}
