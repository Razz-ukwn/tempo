package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

public interface h {
    void c(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback f(Class cls, String str);

    Activity i();

    void startActivityForResult(Intent intent, int i8);
}
