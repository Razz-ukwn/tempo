package i5;

import ag.b1;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.quickkonnect.silencio.R;
import h5.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
public abstract class h<T extends View, Z> extends a<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final T f9586a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9587b;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f9588d;

        /* renamed from: a  reason: collision with root package name */
        public final View f9589a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f9590b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0177a f9591c;

        /* renamed from: i5.h$a$a  reason: collision with other inner class name */
        public static final class C0177a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f9592a;

            public C0177a(a aVar) {
                this.f9592a = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f9592a.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f9590b;
                    if (!arrayList.isEmpty()) {
                        int c3 = aVar.c();
                        int b10 = aVar.b();
                        boolean z10 = false;
                        if (c3 > 0 || c3 == Integer.MIN_VALUE) {
                            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).c(c3, b10);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f9589a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f9591c);
                            }
                            aVar.f9591c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f9589a = view;
        }

        public final int a(int i8, int i10, int i11) {
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i8 - i11;
            if (i13 > 0) {
                return i13;
            }
            View view = this.f9589a;
            if (view.isLayoutRequested() || i10 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f9588d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                b1.b(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f9588d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f9588d.intValue();
        }

        public final int b() {
            View view = this.f9589a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            View view = this.f9589a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public h(T t2) {
        b1.b(t2);
        this.f9586a = t2;
        this.f9587b = new a(t2);
    }

    public final d b() {
        Object tag = this.f9586a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof d) {
            return (d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void d(f fVar) {
        this.f9587b.f9590b.remove(fVar);
    }

    public final void f(f fVar) {
        a aVar = this.f9587b;
        int c3 = aVar.c();
        int b10 = aVar.b();
        boolean z10 = false;
        if (c3 > 0 || c3 == Integer.MIN_VALUE) {
            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                z10 = true;
            }
        }
        if (z10) {
            fVar.c(c3, b10);
            return;
        }
        ArrayList arrayList = aVar.f9590b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (aVar.f9591c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f9589a.getViewTreeObserver();
            a.C0177a aVar2 = new a.C0177a(aVar);
            aVar.f9591c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public final void i(d dVar) {
        this.f9586a.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public void k(Drawable drawable) {
        a aVar = this.f9587b;
        ViewTreeObserver viewTreeObserver = aVar.f9589a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f9591c);
        }
        aVar.f9591c = null;
        aVar.f9590b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f9586a;
    }
}
