package r2;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.p;

public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13771a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f13772b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f13773c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f13773c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f13773c;
        return cls != null ? new p(cls, charSequence) : super.newEditable(charSequence);
    }
}
