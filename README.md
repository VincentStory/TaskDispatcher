# AppStart
android性能优化之启动优化，将启动任务统一管理，使代码更简洁，条理更清晰，支持任务优先级，支持任务同步机制，支持任务空闲加载

我们进入app的时候一般会有很多工具需要初始化，也会有一些比较耗时的任务，如果都写在application里面，代码不够美观，任务没有优先级也会增加app
启动时间，本工程完美解决这些问题，将启动任务拆分成一个个task去处理，还可以给每个task设置执行的优先级，大大提高初始化效率。

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

```
Copyright 2018 VincentStory

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
