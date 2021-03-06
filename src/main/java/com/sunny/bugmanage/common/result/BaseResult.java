package com.sunny.bugmanage.common.result;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author sunny
 * @className com.sunny.bugmanage.common.result.BaseResult
 * @date 2017-06-06 14:06
 * @description:
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BaseResult<T> {
	/**
	 * 状态码.
	 */
	private Integer code;
	/**
	 * 提示信息
	 */
	private String msg;
	/**
	 * 具体内容
	 */
	private T data;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
