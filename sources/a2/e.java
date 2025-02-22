package a2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import sf.j;

@SuppressLint({"CustomSplashScreen"})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f77a;

    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public f f78c;

        /* renamed from: d  reason: collision with root package name */
        public final C0004a f79d;

        /* renamed from: a2.e$a$a  reason: collision with other inner class name */
        public static final class C0004a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f80a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Activity f81b;

            public C0004a(a aVar, Activity activity) {
                this.f80a = aVar;
                this.f81b = activity;
            }

            public final void onChildViewAdded(View view, View view2) {
                if (view2 instanceof SplashScreenView) {
                    this.f80a.getClass();
                    a.d((SplashScreenView) view2);
                    ((ViewGroup) this.f81b.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                }
            }

            public final void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            j.f(activity, "activity");
            this.f79d = new C0004a(this, activity);
        }

        public static void d(SplashScreenView splashScreenView) {
            j.f(splashScreenView, "child");
            WindowInsets build = new WindowInsets.Builder().build();
            j.e(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (build == splashScreenView.getRootView().computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
        }

        public final void a() {
            Activity activity = this.f82a;
            Resources.Theme theme = activity.getTheme();
            j.e(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f79d);
        }

        public final void b(MainActivity.b bVar) {
            this.f83b = bVar;
            View findViewById = this.f82a.findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.f78c != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f78c);
            }
            f fVar = new f(this, findViewById);
            this.f78c = fVar;
            viewTreeObserver.addOnPreDrawListener(fVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f82a;

        /* renamed from: b  reason: collision with root package name */
        public c f83b = new b();

        public b(Activity activity) {
            j.f(activity, "activity");
            this.f82a = activity;
        }

        public void a() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f82a.getTheme();
            theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
            c(theme, typedValue);
        }

        public void b(MainActivity.b bVar) {
            this.f83b = bVar;
            View findViewById = this.f82a.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new c(this, findViewById));
        }

        public final void c(Resources.Theme theme, TypedValue typedValue) {
            int i8;
            if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i8 = typedValue.resourceId) != 0) {
                this.f82a.setTheme(i8);
            }
        }
    }

    public interface c {
        boolean a();
    }

    public e(Activity activity) {
        this.f77a = Build.VERSION.SDK_INT >= 31 ? new a(activity) : new b(activity);
    }
}
