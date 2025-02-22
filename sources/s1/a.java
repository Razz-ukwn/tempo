package s1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

public final class a extends t1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14472c = 0;

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    public static class C0273a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i8, Bundle bundle) {
            activity.startActivityForResult(intent, i8, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i8, Intent intent, int i10, int i11, int i12, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i8, intent, i10, i11, i12, bundle);
        }
    }

    public static class b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class c {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    public static class d {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface e {
        void A();
    }
}
