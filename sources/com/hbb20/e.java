package com.hbb20;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.lang.reflect.Field;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f6412a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f6413b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f6414c;

    /* renamed from: d  reason: collision with root package name */
    public static Dialog f6415d;

    /* renamed from: e  reason: collision with root package name */
    public static Context f6416e;

    static {
        Field field;
        Field field2;
        Field field3;
        Class<TextView> cls = TextView.class;
        boolean z10 = true;
        try {
            field2 = cls.getDeclaredField("mCursorDrawableRes");
            try {
                field2.setAccessible(true);
                field3 = cls.getDeclaredField("mEditor");
                try {
                    field3.setAccessible(true);
                    field = field3.getType().getDeclaredField("mCursorDrawable");
                    try {
                        field.setAccessible(true);
                        z10 = false;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    field = null;
                }
            } catch (Exception unused3) {
                field3 = null;
                field = null;
            }
        } catch (Exception unused4) {
            field3 = null;
            field2 = null;
            field = null;
        }
        if (z10) {
            f6412a = null;
            f6413b = null;
            f6414c = null;
            return;
        }
        f6412a = field3;
        f6413b = field;
        f6414c = field2;
    }

    public static void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
