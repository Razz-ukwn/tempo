package m8;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.z;
import java.util.WeakHashMap;

public final class v {

    public class a implements z {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f11310a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f11311b;

        public a(b bVar, c cVar) {
            this.f11310a = bVar;
            this.f11311b = cVar;
        }

        public final j1 a(View view, j1 j1Var) {
            return this.f11310a.a(view, j1Var, new c(this.f11311b));
        }
    }

    public interface b {
        j1 a(View view, j1 j1Var, c cVar);
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.i.u(view, new a(bVar, new c(i0.e.f(view), view.getPaddingTop(), i0.e.e(view), view.getPaddingBottom())));
        if (i0.g.b(view)) {
            i0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new w());
        }
    }

    public static float b(Context context, int i8) {
        return TypedValue.applyDimension(1, (float) i8, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return i0.e.d(view) == 1;
    }

    public static PorterDuff.Mode d(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f11312a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11313b;

        /* renamed from: c  reason: collision with root package name */
        public int f11314c;

        /* renamed from: d  reason: collision with root package name */
        public int f11315d;

        public c(int i8, int i10, int i11, int i12) {
            this.f11312a = i8;
            this.f11313b = i10;
            this.f11314c = i11;
            this.f11315d = i12;
        }

        public c(c cVar) {
            this.f11312a = cVar.f11312a;
            this.f11313b = cVar.f11313b;
            this.f11314c = cVar.f11314c;
            this.f11315d = cVar.f11315d;
        }
    }
}
