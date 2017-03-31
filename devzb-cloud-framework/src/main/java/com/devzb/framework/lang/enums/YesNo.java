
package com.devzb.framework.lang.enums;

/**
 * 是否
 * 
 * @author zhangb
 *
 */
public enum YesNo {

	/**
	 * 是
	 */
	YES("y"),
	/**
	 * 否
	 */
	NO("n");

	public String value;

	private YesNo(String value) {
		this.value = value;
	}
}
