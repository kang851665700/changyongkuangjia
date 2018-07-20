package com.example.module;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * 吐司工具类
 */
public class IToast {
	/**
	 * String类型吐司(短吐司)
	 *
	 * @param context
	 * @param info
	 */
	public static void show(Context context, String info) {
		Toast toast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	/**
	 * String类型吐司(长吐司)
	 *
	 * @param context
	 * @param info
	 */
	public static void showLong(Context context, String info) {
		Toast toast = Toast.makeText(context, info, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	/**
	 * int类型吐司(短吐司)
	 *
	 * @param context
	 * @param info
	 */
	public static void show(Context context, int info) {
		Toast toast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	/**
	 * int类型吐司(长吐司)
	 *
	 * @param context
	 * @param info
	 */
	public static void showLong(Context context, int info) {
		Toast toast = Toast.makeText(context, info, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
}
