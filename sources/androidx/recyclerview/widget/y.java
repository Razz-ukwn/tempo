package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import e2.i;
import e2.j;
import java.util.WeakHashMap;

public class y extends d2.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2757d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2758e;

    public static class a extends d2.a {

        /* renamed from: d  reason: collision with root package name */
        public final y f2759d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f2760e = new WeakHashMap();

        public a(y yVar) {
            this.f2759d = yVar;
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public final j b(View view) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public final void d(View view, i iVar) {
            y yVar = this.f2759d;
            RecyclerView recyclerView = yVar.f2757d;
            boolean z10 = !recyclerView.Q || recyclerView.f2406c0 || recyclerView.f2407d.g();
            AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
            View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
            if (!z10) {
                RecyclerView recyclerView2 = yVar.f2757d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().W(view, iVar);
                    d2.a aVar = (d2.a) this.f2760e.get(view);
                    if (aVar != null) {
                        aVar.d(view, iVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            d2.a aVar = (d2.a) this.f2760e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            y yVar = this.f2759d;
            RecyclerView recyclerView = yVar.f2757d;
            if (!(!recyclerView.Q || recyclerView.f2406c0 || recyclerView.f2407d.g())) {
                RecyclerView recyclerView2 = yVar.f2757d;
                if (recyclerView2.getLayoutManager() != null) {
                    d2.a aVar = (d2.a) this.f2760e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i8, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i8, bundle)) {
                        return true;
                    }
                    RecyclerView.t tVar = recyclerView2.getLayoutManager().f2472b.f2403b;
                    return false;
                }
            }
            return super.g(view, i8, bundle);
        }

        public final void h(View view, int i8) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            if (aVar != null) {
                aVar.h(view, i8);
            } else {
                super.h(view, i8);
            }
        }

        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            d2.a aVar = (d2.a) this.f2760e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public y(RecyclerView recyclerView) {
        this.f2757d = recyclerView;
        a aVar = this.f2758e;
        if (aVar != null) {
            this.f2758e = aVar;
        } else {
            this.f2758e = new a(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f2757d;
            if (!(!recyclerView.Q || recyclerView.f2406c0 || recyclerView.f2407d.g())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().U(accessibilityEvent);
                }
            }
        }
    }

    public void d(View view, i iVar) {
        this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
        RecyclerView recyclerView = this.f2757d;
        if (!(!recyclerView.Q || recyclerView.f2406c0 || recyclerView.f2407d.g()) && recyclerView.getLayoutManager() != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f2472b;
            layoutManager.V(recyclerView2.f2403b, recyclerView2.D0, iVar);
        }
    }

    public final boolean g(View view, int i8, Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i8, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2757d;
        if (recyclerView.Q && !recyclerView.f2406c0 && !recyclerView.f2407d.g()) {
            z10 = false;
        }
        if (z10 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2472b;
        return layoutManager.i0(recyclerView2.f2403b, recyclerView2.D0, i8, bundle);
    }
}
