package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import y1.e;

@SuppressLint({"UnknownNullness"})
public abstract class x0 {
    public static void d(View view, List list) {
        boolean z10;
        boolean z11;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z10 = false;
                break;
            } else if (list.get(i8) == view) {
                z10 = true;
                break;
            } else {
                i8++;
            }
        }
        if (!z10) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.i.k(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                z11 = false;
                                break;
                            } else if (list.get(i12) == childAt) {
                                z11 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (!z11 && i0.i.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2);

    public abstract void k(Object obj, View view, ArrayList<View> arrayList);

    public abstract void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void m(View view, Object obj);

    public abstract void n(Object obj, Rect rect);

    public void o(Object obj, e eVar, l lVar) {
        lVar.run();
    }

    public abstract void p(Object obj, View view, ArrayList<View> arrayList);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object r(Object obj);
}
