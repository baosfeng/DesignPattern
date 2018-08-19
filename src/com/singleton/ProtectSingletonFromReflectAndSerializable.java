package com.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018/8/19
 */
public class ProtectSingletonFromReflectAndSerializable implements Serializable {

	private static ProtectSingletonFromReflectAndSerializable instance;

	/**
	 * 防止反射进行创建对象
	 *
	 * @throws RuntimeException
	 */
	private ProtectSingletonFromReflectAndSerializable() throws RuntimeException {
		if (instance != null) {
			throw new RuntimeException("不允许通过反射进行创建对象");
		}
	}

	public static ProtectSingletonFromReflectAndSerializable getInstance() {
		if (instance == null) {
			return instance = new ProtectSingletonFromReflectAndSerializable();
		}
		return instance;
	}

	/**
	 * 防止通过反序列化创建对象
	 *
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
