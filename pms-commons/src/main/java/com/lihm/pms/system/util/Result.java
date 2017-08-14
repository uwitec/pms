package com.lihm.pms.system.util;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: lihuimeng
 * @Discription:返回结果
 * @Date: 2017/8/9 17:07
 */
public class Result<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = -8508268287523566997L;

	/** 类型 */
	private Type type;

	/** 消息 */
	private List<String> messages;

	/** 数据 */
	private T data;

	private List<T> dataList;

	/** 构造函数 */
	public Result() {
		messages = new LinkedList<String>();
	}

	/**
	 * 构造函数
	 *
	 * @param type
	 */
	public Result(Type type) {
		this();
		this.type = type;
	}

	/**
	 * 构造函数
	 *
	 * @param type
	 * @param message
	 */
	public Result(Type type, String message) {
		this(type);
		addMessage(message);
	}

	/**
	 * 构造函数
	 *
	 * @param type
	 * @param message
	 * @param data
	 */
	public Result(Type type, String message, T data) {
		this(type, message);
		this.data = data;
	}

	/**
	 * 是否成功
	 * 
	 * @return
	 */
	public boolean success() {
		return Type.SUCCESS.equals(this.type);
	}

	/**
	 * 是否警告
	 * 
	 * @return
	 */
	public boolean warning() {
		return Type.WARNING.equals(this.type);
	}

	/**
	 * 是否失败
	 * 
	 * @return
	 */
	public boolean failure() {
		return Type.FAILURE.equals(this.type);
	}

	/**
	 * 读取类型
	 * 
	 * @return
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 设置类型
	 * 
	 * @param type
	 * @return
	 */
	public Result<T> setType(Type type) {
		this.type = type;
		return this;
	}

	/**
	 * 读取消息
	 * 
	 * @param
	 * @return
	 */
	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/**
	 * 读取第一条消息
	 * 
	 * @return
	 */
	public String getFirstMessage() {
		return !messages.isEmpty() ? messages.get(0) : null;
	}

	/**
	 * 添加消息
	 * 
	 * @param message
	 * @param
	 * @return
	 */
	public Result<T> addMessage(String message) {
		if (!StringUtils.isEmpty(message)) {
			this.messages.add(message);
		}
		return this;
	}

	/**
	 * 添加消息
	 * 
	 * @param index
	 * @param message
	 * @return
	 */
	public Result<T> addMessage(int index, String message) {
		if (!StringUtils.isEmpty(message)) {
			this.messages.add(index, message);
		}
		return this;
	}

	/**
	 * 读取数据
	 * 
	 * @return
	 */
	public T getData() {
		return this.data;
	}

	/**
	 * 设置数据
	 * 
	 * @param data
	 * @return
	 */
	public Result<T> setData(T data) {
		this.data = data;
		return this;
	}

	/**
	 * @return
	 */
	public boolean isResult() {
		return true;
	}

	/**
	 * 类型
	 * 
	 * @author ultrafrog
	 * @version 1.0, 2012-10-18
	 * @since 1.0
	 */
	public enum Type {

		/** 成功 */
		SUCCESS,

		/** 警告 */
		WARNING,

		/** 失败 */
		FAILURE,

		/** 版本错误 */
		VERSIONERR;
	}

	public boolean getSuccess() {
		return success();
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
}
