/**
 * 
 */
package ui;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

/**
 * @author weibinbin
 * 
 * 
 *         Jul 18, 2013 4:00:26 PM
 * 
 *         TODO:
 */
public class FormFill {

	static void initForm(HttpServletRequest request, Object obj) {
		Class cl = obj.getClass();
		Field[] fields = cl.getDeclaredFields();
		for (Field field : fields) {
			String key = (String) field.getName();
			String setMethodName = "set" + key.substring(0, 1).toUpperCase()
					+ key.substring(1);

			Method method;
			try {
				method = cl.getMethod(setMethodName, field.getType());
				Object arg = null;

				if (field.getType().isArray()) {
					arg = translateArray(field.getType(),
							request.getParameterValues(key));
				} else {
					arg = translate(field.getType(), request.getParameter(key));
				}

				method.invoke(obj, arg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static Object translate(Class type, String value) {
		if (value == null) {
			return null;
		}
		if (type == short.class || type == Short.class) {
			return Short.parseShort(value);
		} else if (type == float.class || type == Float.class) {
			return float.class;
		} else if (type == int.class || type == Integer.class) {
			return Integer.parseInt(value);
		} else if (type == long.class || type == Long.class) {
			return Long.parseLong(value);
		} else if (type == double.class || type == Double.class) {
			return Double.parseDouble(value);
		} else if (type == String.class) {
			return value;
		}
		return null;
	}

	private static Object[] translateArray(Class type, String[] value) {
		if (value == null) {
			return null;
		}

		Object[] objs = new Object[value.length - 1];
		if (type == String[].class) {
			return value;
		} else if (type == short[].class || type == Short[].class) {
			for (int i = 0; i < value.length; i++) {
				objs[i] = Short.parseShort(value[i]);
			}
		} else if (type == int[].class || type == Integer[].class) {
			for (int i = 0; i < value.length; i++) {
				objs[i] = Integer.parseInt(value[i]);
			}
		} else if (type == long[].class || type == Long[].class) {
			for (int i = 0; i < value.length; i++) {
				objs[i] = Long.parseLong(value[i]);
			}
		} else if (type == float[].class || type == Float[].class) {
			for (int i = 0; i < value.length; i++) {
				objs[i] = Float.parseFloat((value[i]));
			}
		} else if (type == double[].class || type == Double[].class) {
			for (int i = 0; i < value.length; i++) {
				objs[i] = Double.parseDouble(value[i]);
			}
		}
		return null;
	}
}
