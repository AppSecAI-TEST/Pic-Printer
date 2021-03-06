/*
 *  Copyright (C) 2013-2016 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.attribute.standard;

import libraries.Ricoh.function.print.attribute.PrintRequestAttribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ステープル設定を示すクラスです。
 * The class to indicate staple settings.
 */
public enum Staple implements PrintRequestAttribute {

    /**
     * 左2箇所
     * 2 at Left
     */
    DUAL_LEFT("dual_left"),

    /**
     * 右2箇所
     * 2 at right
     */
    DUAL_RIGHT("dual_right"),

    /**
     * 上2箇所
     * 2 at top
     */
    DUAL_TOP("dual_top"),

    /**
     * 中綴じ
     * Saddle Stitch
     */
    SADDLE_STITCH("saddle_stitch"),

    /**
     * 左上
     * Top left
     */
    TOP_LEFT("top_left"),

    /**
     * 左上斜め
     * Top left slant
     */
    TOP_LEFT_SLANT("top_left_slant"),

    /**
     * 右上
     * Top right
     */
    TOP_RIGHT("top_right"),

    /**
     * 右上斜め
     * Top right slant
     */
    TOP_RIGHT_SLANT("top_right_slant"),

    /**
     * 左下
     * Bottom left
     */
    BOTTOM_LEFT("bottom_left"),

    /**
     * 左下斜め
     * Bottom left slant.
     */
    BOTTOMLEFT_SLANT("bottomleft_slant"),

    /**
     * なし
     * No staple
     */
    NONE("none"),
    
    /**
     * 左上斜め(針無し綴じ)
     * top left slant stapleless
     * 
     * @since SmartSDK V2.12
     */
    TOP_LEFT_SLANT_STAPLELESS("top_left_slant_stapleless"),
    
    /**
     * 右上斜め(針無し綴じ)
     * top right slant stapleless
     * 
     * @since SmartSDK V2.12
     */
    TOP_RIGHT_SLANT_STAPLELESS("top_right_slant_stapleless");
    
    private final String STAPLE = "staple";
    private final String mStaple;

    private Staple(String staple) {
        this.mStaple = staple;
    }

    @Override
    public Object getValue() {
        return mStaple;
    }

    @Override
    public Class<?> getCategory() {
        return getClass();
    }

    @Override
    public String getName() {
        return STAPLE;
    }


    private static volatile Map<String, Staple> directory = null;

    private static Map<String, Staple> getDirectory() {
        if(directory == null) {
            Map<String, Staple> d = new HashMap<String, Staple>();
            for(Staple staple : values()) {
                d.put(staple.getValue().toString(), staple);
            }
            directory = d;
        }
        return directory;
    }

    private static Staple fromString(String value) {
        return getDirectory().get(value);
    }

    public static List<Staple> getSupportedValue(List<String> values) {
        if( values == null ) {
            return Collections.emptyList();
        }

        List<Staple> list = new ArrayList<Staple>();
        for(String value : values) {
            Staple staple = fromString(value);
            if( staple != null ) {
                list.add(staple);
            }
        }

        return list;
    }
}
