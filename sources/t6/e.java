package t6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.j0;
import androidx.fragment.app.x;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.h;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.quickkonnect.silencio.R;
import h7.d;
import s1.m;
import s1.r;
import s1.s;
import u6.a0;
import u6.b0;
import u6.q;
import u6.y;
import u6.z;
import z6.c;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {d.class, h7.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15392c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final e f15393d = new e();

    public static AlertDialog e(Context context, int i8, b0 b0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(y.b(context, i8));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i8 != 1 ? i8 != 2 ? i8 != 3 ? resources.getString(17039370) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, b0Var);
        }
        String c3 = y.c(context, i8);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i8)}), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof x) {
                j0 I = ((x) activity).I();
                k kVar = new k();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                    alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    kVar.L0 = alertDialog;
                    if (onCancelListener != null) {
                        kVar.M0 = onCancelListener;
                    }
                    kVar.s0(I, str);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            cVar.f15382a = alertDialog;
            if (onCancelListener != null) {
                cVar.f15383b = onCancelListener;
            }
            cVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    public final Intent a(int i8, Context context, String str) {
        return super.a(i8, context, str);
    }

    public final int b(Context context) {
        return super.b(context);
    }

    public final int c(Context context, int i8) {
        return super.c(context, i8);
    }

    public final AlertDialog d(Activity activity, int i8, int i10, DialogInterface.OnCancelListener onCancelListener) {
        return e(activity, i8, new z(i10, activity, super.a(i8, activity, "d")), onCancelListener);
    }

    @TargetApi(20)
    public final void g(Context context, int i8, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i8), null}), new IllegalArgumentException());
        if (i8 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String e10 = i8 == 6 ? y.e(context, "common_google_play_services_resolution_required_title") : y.c(context, i8);
            if (e10 == null) {
                e10 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            String d10 = (i8 == 6 || i8 == 19) ? y.d(context, "common_google_play_services_resolution_required_text", y.a(context)) : y.b(context, i8);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            q.i(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            s sVar = new s(context, (String) null);
            sVar.m = true;
            sVar.c(true);
            sVar.f14515e = s.b(e10);
            r rVar = new r();
            rVar.f14510b = s.b(d10);
            sVar.e(rVar);
            PackageManager packageManager = context.getPackageManager();
            if (c.f17769a == null) {
                c.f17769a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (c.f17769a.booleanValue()) {
                sVar.f14528s.icon = context.getApplicationInfo().icon;
                sVar.f14520j = 2;
                if (c.a(context)) {
                    sVar.f14512b.add(new m(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    sVar.f14517g = pendingIntent;
                }
            } else {
                sVar.f14528s.icon = 17301642;
                sVar.f14528s.tickerText = s.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                sVar.f14528s.when = System.currentTimeMillis();
                sVar.f14517g = pendingIntent;
                sVar.f14516f = s.b(d10);
            }
            synchronized (f15392c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            sVar.f14526q = "com.google.android.gms.availability";
            Notification a10 = sVar.a();
            if (i8 == 1 || i8 == 2 || i8 == 3) {
                i.f15402a.set(false);
                i10 = 10436;
            } else {
                i10 = 39789;
            }
            notificationManager.notify(i10, a10);
        } else if (i8 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final void h(Activity activity, h hVar, int i8, d1 d1Var) {
        AlertDialog e10 = e(activity, i8, new a0(super.a(i8, activity, "d"), hVar), d1Var);
        if (e10 != null) {
            f(activity, e10, "GooglePlayServicesErrorDialog", d1Var);
        }
    }
}
