package r3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final z f13865a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f13866b = new a();

    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(v.f13865a.n((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            v.f13865a.o((View) obj, floatValue);
        }
    }

    public class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            return i0.f.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f13865a = new a0();
        } else {
            f13865a = new z();
        }
        new b();
    }

    public static void a(View view, int i8, int i10, int i11, int i12) {
        f13865a.r(view, i8, i10, i11, i12);
    }
}
