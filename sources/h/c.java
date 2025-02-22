package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f9006f;

    /* renamed from: a  reason: collision with root package name */
    public int f9007a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f9008b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f9009c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f9010d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f9011e;

    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super((Context) null);
    }

    public final void a(Configuration configuration) {
        if (this.f9011e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f9010d == null) {
            this.f9010d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f9008b == null) {
            this.f9008b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9008b.setTo(theme);
            }
        }
        this.f9008b.applyStyle(this.f9007a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f9011e == null) {
            Configuration configuration = this.f9010d;
            if (configuration != null) {
                if (f9006f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f9006f = configuration2;
                }
                if (!configuration.equals(f9006f)) {
                    this.f9011e = a.a(this, this.f9010d).getResources();
                }
            }
            this.f9011e = super.getResources();
        }
        return this.f9011e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9009c == null) {
            this.f9009c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9009c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9008b;
        if (theme != null) {
            return theme;
        }
        if (this.f9007a == 0) {
            this.f9007a = 2132017715;
        }
        b();
        return this.f9008b;
    }

    public final void setTheme(int i8) {
        if (this.f9007a != i8) {
            this.f9007a = i8;
            b();
        }
    }

    public c(Context context, int i8) {
        super(context);
        this.f9007a = i8;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f9008b = theme;
    }
}
