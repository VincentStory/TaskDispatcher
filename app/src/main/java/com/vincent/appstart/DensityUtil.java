package com.vincent.appstart;

import android.content.Context;

/**
 * liujingyuan
 */
public class DensityUtil {

//	private static int[] deviceWidthHeight = new int[2];
//	public static int[] getDeviceInfo(Context context) {
//		if ((deviceWidthHeight[0] == 0) && (deviceWidthHeight[1] == 0)) {
//			DisplayMetrics metrics = new DisplayMetrics();
//			((Activity) context).getWindowManager().getDefaultDisplay()
//					.getMetrics(metrics);
//
//			deviceWidthHeight[0] = metrics.widthPixels;
//			deviceWidthHeight[1] = metrics.heightPixels;
//		}
//		return deviceWidthHeight;
//	}
	/**
	 *
	 * @param context 上下文
	 * @param dpValue dp数值
	 * @return dp to  px
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);

	}
//	/**
//	 * 获取屏幕尺寸
//	 */
//	@SuppressWarnings("deprecation")
//	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
//	public static Point getScreenSize(Context context){
//		WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//		Display display = windowManager.getDefaultDisplay();
//		if(Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB_MR2){
//			return new Point(display.getWidth(), display.getHeight());
//		}else{
//			Point point = new Point();
//			display.getSize(point);
//			return point;
//		}
//	}





//
//	/**
//	 * 获取屏幕高度
//	 * @param
//	 * @return
//	 */
//	public static int getScreenHeight(){
//		Point point = getScreenSize(KlCore.getApplicationContext());
//		return point.y;
//	}

	/**
	 *
	 * @param context    上下文
	 * @param pxValue  px的数值
	 * @return  px to dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);

	}

	/**
	 * 将px值转换为sp值，保证文字大小不变
	 */
	public static int px2sp(Context context, float pxValue) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (pxValue / fontScale + 0.5f);
	}

	/**
	 * 将sp值转换为px值，保证文字大小不变
	 */
	public static int sp2px(Context context, float spValue) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (spValue * fontScale + 0.5f);
	}
}
