package e;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import e.p;
import e.r;
import java.lang.ref.WeakReference;
import o.b;
import y1.h;

public abstract class e {
    public static boolean B = false;
    public static final o.b<WeakReference<e>> C = new o.b<>();
    public static final Object D = new Object();
    public static final Object E = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static final r.a f7616a = new r.a(new r.b());

    /* renamed from: b  reason: collision with root package name */
    public static final int f7617b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static h f7618c = null;

    /* renamed from: d  reason: collision with root package name */
    public static h f7619d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f7620e = null;

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean l(Context context) {
        if (f7620e == null) {
            try {
                int i8 = p.f7697a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, p.class), p.a.a() | 128).metaData;
                if (bundle != null) {
                    f7620e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f7620e = Boolean.FALSE;
            }
        }
        return f7620e.booleanValue();
    }

    public static void s(e eVar) {
        synchronized (D) {
            o.b<WeakReference<e>> bVar = C;
            bVar.getClass();
            b.a aVar = new b.a();
            while (aVar.hasNext()) {
                e eVar2 = (e) ((WeakReference) aVar.next()).get();
                if (eVar2 == eVar || eVar2 == null) {
                    aVar.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i8);

    public Context f() {
        return null;
    }

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract a i();

    public abstract void j();

    public abstract void k();

    public abstract void m(Configuration configuration);

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i8);

    public abstract void u(int i8);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void x(Toolbar toolbar);

    public void y(int i8) {
    }

    public abstract void z(CharSequence charSequence);
}
