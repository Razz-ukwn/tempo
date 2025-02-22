package com.quickkonnect.silencio;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import bh.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import jc.l;
import m9.f;
import sf.j;
import v9.e;
import z9.c0;
import z9.x;
import zd.h;

public final class MyApplication extends l {
    public final void onCreate() {
        Boolean bool;
        String str;
        super.onCreate();
        SharedPreferences sharedPreferences = getSharedPreferences("params", 0);
        j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        h.f17950a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        j.e(edit, "prefs.edit()");
        h.f17951b = edit;
        e eVar = (e) f.d().b(e.class);
        if (eVar != null) {
            x xVar = eVar.f16349a;
            Boolean bool2 = Boolean.TRUE;
            c0 c0Var = xVar.f17896b;
            synchronized (c0Var) {
                if (bool2 != null) {
                    try {
                        c0Var.f17807f = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bool2 != null) {
                    bool = bool2;
                } else {
                    f fVar = c0Var.f17803b;
                    fVar.a();
                    bool = c0Var.a(fVar.f11331a);
                }
                c0Var.f17808g = bool;
                SharedPreferences.Editor edit2 = c0Var.f17802a.edit();
                if (bool2 != null) {
                    edit2.putBoolean("firebase_crashlytics_collection_enabled", true);
                } else {
                    edit2.remove("firebase_crashlytics_collection_enabled");
                }
                edit2.apply();
                synchronized (c0Var.f17804c) {
                    str = null;
                    if (c0Var.b()) {
                        if (!c0Var.f17806e) {
                            c0Var.f17805d.trySetResult(null);
                            c0Var.f17806e = true;
                        }
                    } else if (c0Var.f17806e) {
                        c0Var.f17805d = new TaskCompletionSource<>();
                        c0Var.f17806e = false;
                    }
                }
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                File externalCacheDir = getExternalCacheDir();
                sb2.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
                sb2.append("/measuring.aac");
                new File(sb2.toString()).delete();
            } catch (Exception e10) {
                a.f3654a.c(e10);
            }
            try {
                StringBuilder sb3 = new StringBuilder();
                File externalCacheDir2 = getExternalCacheDir();
                sb3.append(externalCacheDir2 != null ? externalCacheDir2.getAbsolutePath() : null);
                sb3.append("measuring.aac");
                new File(sb3.toString()).delete();
            } catch (Exception e11) {
                a.f3654a.c(e11);
            }
            try {
                StringBuilder sb4 = new StringBuilder();
                File cacheDir = getCacheDir();
                sb4.append(cacheDir != null ? cacheDir.getAbsolutePath() : null);
                sb4.append("/measuring.aac");
                new File(sb4.toString()).delete();
            } catch (Exception e12) {
                a.f3654a.c(e12);
            }
            try {
                StringBuilder sb5 = new StringBuilder();
                File cacheDir2 = getCacheDir();
                if (cacheDir2 != null) {
                    str = cacheDir2.getAbsolutePath();
                }
                sb5.append(str);
                sb5.append("/screen.jpeg");
                new File(sb5.toString()).delete();
            } catch (Exception e13) {
                a.f3654a.c(e13);
            }
            NotificationChannel notificationChannel = new NotificationChannel("location", "Location", 2);
            Object systemService = getSystemService("notification");
            j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            return;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }
}
