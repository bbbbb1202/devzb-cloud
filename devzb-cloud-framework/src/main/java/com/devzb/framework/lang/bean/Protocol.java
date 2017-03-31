
package com.devzb.framework.lang.bean;

import com.devzb.framework.lang.enums.RespCode;

/**
 * 数据请求封装类
 * 
 * @author zhangbin
 *
 */
public class Protocol {
	/**
	 * 返回状态编码
	 */
	private Integer	code	= RespCode.SUCCESS.value;
	/**
	 * 返回消息提示
	 */
	private String	msg;
	/**
	 * 返回具体内容
	 */
	private Object	data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
