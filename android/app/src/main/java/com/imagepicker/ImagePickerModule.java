package com.developingprinter.imagepicker;

import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class ImagePickerModule extends ReactContextBaseJavaModule {
    public ImagePickerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ImagePicker";
}

}