package j0;

import a6.b;
import a6.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.util.JsonReader;
import ca.a;
import com.google.android.material.tabs.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import k6.s;
import ya.f;

public final /* synthetic */ class e implements j, h, s.a, f.a, t9.f, a.C0060a, d.b {
    public static /* synthetic */ int f(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            return 2;
        }
        if (i8 == 3) {
            return 3;
        }
        if (i8 == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i8) {
        return i8 == 1 ? "OK" : i8 == 2 ? "BAD_CONFIG" : i8 == 3 ? "AUTH_ERROR" : "null";
    }

    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = s.B;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public Object b(JsonReader jsonReader) {
        la.d dVar = a.f3872a;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null libraryName");
                    }
                case 1:
                    str = jsonReader.nextString();
                    if (str != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null arch");
                    }
                case 2:
                    str3 = jsonReader.nextString();
                    if (str3 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null buildId");
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str4 = str == null ? " arch" : "";
        if (str2 == null) {
            str4 = str4.concat(" libraryName");
        }
        if (str3 == null) {
            str4 = h4.a.c(str4, " buildId");
        }
        if (str4.isEmpty()) {
            return new ba.d(str, str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str4));
    }

    public String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public void d(Exception exc) {
    }

    public double e(double d10) {
        double d11;
        double d12 = d10 < 0.0d ? -d10 : d10;
        if (d12 >= 0.0031308049535603718d) {
            d12 = Math.pow(d12, 0.4166666666666667d) - 0.05213270142180095d;
            d11 = 0.9478672985781991d;
        } else {
            d11 = 0.07739938080495357d;
        }
        return Math.copySign(d12 / d11, d10);
    }
}
