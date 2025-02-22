package com.google.android.gms.common;

import androidx.activity.result.d;
import com.google.android.gms.common.annotation.KeepName;
import t6.f;

@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i8) {
        super(d.b("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", f.f15395a, " but found ", i8, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
