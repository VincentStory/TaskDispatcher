# AppStart
启动优化项目示例代码
启动器TaskDispatcher

	
# 使用方法
## 添加依赖
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

``` 
Step 2. Add the dependency

```
dependencies {
	           implementation 'com.github.VincentStory:AppStart:Tag'
	    }

``` 
具体使用方式如下
其中DelayInitDispatcher 为空闲加载任务

![效果图](https://github.com/VincentStory/AppStart/blob/master/app/app_start.png)

如果需要任务在Application初始化完成之前完成初始化，需要在子task内重写neetWait()方法，然后返回true。
示例代码：

``` 

public class GetDeviceIdTask extends Task {
    private String mDeviceId;

    @Override
    public boolean needWait() {
        return true;
    }

    @SuppressLint("MissingPermission")
    @Override
    public void run() {
//        MyApp app = (MyApp) mContext;
//        app.setDeviceId(mDeviceId);
    }
}

``` 

