package com.developingprinter;
import android.widget.Toast;
import android.app.Activity;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
public class ToastModule extends ReactContextBaseJavaModule {
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";
  private Activity mActivity = null;
  public ToastModule(ReactApplicationContext reactContext, Activity mActivity) {
    super(reactContext);
    mActivity = activity;
  }
  // your module's name that can be access as 
  // "NativeModules.yourmodulename" in JavaScript
  @Override    
  public String getName() {
    return "ToastModule";
  }
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }
  // your custom method that exposed to JavaScript
  @ReactMethod    
  public void show(String message, int duration) {
    Toast.makeText(getReactApplicationContext(), message, duration).show();
  }
}