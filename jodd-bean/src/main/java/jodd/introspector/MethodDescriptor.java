// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.introspector;

import jodd.util.ReflectUtil;

import java.lang.reflect.Method;

/**
 * Method descriptor.
 */
class MethodDescriptor {
	final Method method;
	final Class[] parameterTypes;

	MethodDescriptor(Method method) {
		Class[] params = method.getParameterTypes();
		if (params == null) {
			this.parameterTypes = ReflectUtil.NO_PARAMETERS;
		} else {
			this.parameterTypes = params;
		}
		this.method = method;
	}
}
