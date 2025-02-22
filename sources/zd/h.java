package zd;

import android.content.SharedPreferences;
import sf.j;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f17950a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences.Editor f17951b;

    public static String a(String str) {
        SharedPreferences sharedPreferences = f17950a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            return string == null ? "" : string;
        }
        j.l("prefs");
        throw null;
    }

    public static void b() {
        SharedPreferences.Editor editor = f17951b;
        if (editor != null) {
            editor.putBoolean("IS_LOGIN", true);
            SharedPreferences.Editor editor2 = f17951b;
            if (editor2 != null) {
                editor2.commit();
            } else {
                j.l("editor");
                throw null;
            }
        } else {
            j.l("editor");
            throw null;
        }
    }

    public static void c(String str, String str2) {
        SharedPreferences.Editor editor = f17951b;
        if (editor != null) {
            editor.putString(str, str2);
            SharedPreferences.Editor editor2 = f17951b;
            if (editor2 != null) {
                editor2.commit();
            } else {
                j.l("editor");
                throw null;
            }
        } else {
            j.l("editor");
            throw null;
        }
    }
}
