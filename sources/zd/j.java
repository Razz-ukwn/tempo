package zd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.fragment.app.x;
import java.lang.ref.WeakReference;
import s1.i;
import t1.a;

public final class j {
    public static void a(x xVar, String str) {
        Activity activity = (Activity) new WeakReference(xVar).get();
        if (activity != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                i.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent.setData(Uri.parse(str));
            Object obj = a.f15323a;
            a.C0282a.b(activity, intent, (Bundle) null);
        }
    }

    public static void b(Context context) {
        sf.j.f(context, "context");
        try {
            SharedPreferences.Editor editor = h.f17951b;
            if (editor != null) {
                editor.clear();
                editor.apply();
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(67108864);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(32768);
                }
                sf.j.c(launchIntentForPackage);
                Object obj = a.f15323a;
                a.C0282a.b(context, launchIntentForPackage, (Bundle) null);
                return;
            }
            sf.j.l("editor");
            throw null;
        } catch (Exception e10) {
            e10.printStackTrace();
            bh.a.f3654a.b(e10.getLocalizedMessage(), new Object[0]);
        }
    }
}
