package com.birprojedaha.common.utils;

import java.util.Arrays;

public final class ArrayUtils {

	public static int[] splitIntArray(String str) {
		if (str != null && !str.isEmpty()) {
			return Arrays.stream(str.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		}

		return null;

	}
}
