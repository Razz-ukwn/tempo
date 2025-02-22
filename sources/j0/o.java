package j0;

import a6.b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.util.JsonReader;
import ca.a;
import com.google.android.material.textfield.TextInputLayout;
import k6.s;
import ya.f;

public final /* synthetic */ class o implements j, s.a, TextInputLayout.f, f.a, a.C0060a, ve.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9711a;

    public /* synthetic */ o(int i8) {
        this.f9711a = i8;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = s.B;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public final Object b(JsonReader jsonReader) {
        switch (this.f9711a) {
            case 5:
                return a.b(jsonReader);
            default:
                return a.a(jsonReader);
        }
    }

    public final String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public final double e(double d10) {
        return d10;
    }
}
