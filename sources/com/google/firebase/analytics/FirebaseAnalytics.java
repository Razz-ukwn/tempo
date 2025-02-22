package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m9.f;
import n9.a;
import q7.b5;
import ra.e;
import u6.q;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f6303b;

    /* renamed from: a  reason: collision with root package name */
    public final y1 f6304a;

    public FirebaseAnalytics(y1 y1Var) {
        q.i(y1Var);
        this.f6304a = y1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f6303b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f6303b == null) {
                    f6303b = new FirebaseAnalytics(y1.c(context, (Bundle) null));
                }
            }
        }
        return f6303b;
    }

    @Keep
    public static b5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        y1 c3 = y1.c(context, bundle);
        if (c3 == null) {
            return null;
        }
        return new a(c3);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = e.m;
            return (String) Tasks.await(((e) f.d().b(ra.f.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        y1 y1Var = this.f6304a;
        y1Var.getClass();
        y1Var.b(new f1(y1Var, activity, str, str2));
    }
}
