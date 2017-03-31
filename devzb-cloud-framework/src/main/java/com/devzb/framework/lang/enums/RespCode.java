package com.devzb.framework.lang.enums;

/**
 * 返回状态编码
 * 
 * @author zhangbin
 *
 */
public enum RespCode {

	/**
	 * 成功
	 */
	SUCCESS(200000),
	/**
	 * 非预期内部错误
	 */
	ERROR(200500),
	/**
	 * 未登录
	 */
	NO_LOGIN(200401),
	/**
	 * 无权限
	 */
	NO_PERMISSION(200403);

	public int value;

	private RespCode(int value) {
		this.value = value;
	}
}
