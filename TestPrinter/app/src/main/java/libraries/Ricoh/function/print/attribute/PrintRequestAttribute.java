/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.print.attribute;

import libraries.Ricoh.function.attribute.Attribute;

/**
 *  印刷時に機器に対して設定できる属性を示すインターフェースです。
 *  Attribute set interface to indicate print request attributes.
 */
public interface PrintRequestAttribute extends Attribute {
    public abstract Object getValue();
}
