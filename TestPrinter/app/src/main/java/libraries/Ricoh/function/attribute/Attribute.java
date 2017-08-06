/*
 *  Copyright (C) 2013 RICOH Co.,LTD.
 *  All rights reserved.
 */
package libraries.Ricoh.function.attribute;

/**
 *
 * The interface to indicate an attribute.
 * An attribute provides the following basic functions.
 *  - Obtains the category of this attribute
 *  - Obtains the name of this attribute
 * The values that can be obtained for each method depend on the implementation class.
 */
public interface Attribute {

    /**
     * Obtains the category of this attribute.
     *         The category of this attribute
     */
	public abstract Class<?> getCategory();

    /**
     * Obtains the name of this attribute.
     *
     * @return The name of this attribute
     */
	public abstract String getName();

}
