package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public final class e extends a0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f2615s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2616h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2617i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<C0030e> f2618j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<d> f2619k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.b0>> f2620l = new ArrayList<>();
    public final ArrayList<ArrayList<C0030e>> m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f2621n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2622o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2623p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2624q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f2625r = new ArrayList<>();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2626a;

        public a(ArrayList arrayList) {
            this.f2626a = arrayList;
        }

        public final void run() {
            ArrayList arrayList = this.f2626a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    C0030e eVar2 = (C0030e) it.next();
                    RecyclerView.b0 b0Var = eVar2.f2638a;
                    eVar.getClass();
                    View view = b0Var.f2440a;
                    int i8 = eVar2.f2641d - eVar2.f2639b;
                    int i10 = eVar2.f2642e - eVar2.f2640c;
                    if (i8 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i10 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    eVar.f2623p.add(b0Var);
                    animate.setDuration(eVar.f2466e).setListener(new h(eVar, b0Var, i8, view, i10, animate)).start();
                } else {
                    arrayList.clear();
                    eVar.m.remove(arrayList);
                    return;
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2628a;

        public b(ArrayList arrayList) {
            this.f2628a = arrayList;
        }

        public final void run() {
            ArrayList arrayList = this.f2628a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    d dVar = (d) it.next();
                    eVar.getClass();
                    RecyclerView.b0 b0Var = dVar.f2632a;
                    View view = null;
                    View view2 = b0Var == null ? null : b0Var.f2440a;
                    RecyclerView.b0 b0Var2 = dVar.f2633b;
                    if (b0Var2 != null) {
                        view = b0Var2.f2440a;
                    }
                    ArrayList<RecyclerView.b0> arrayList2 = eVar.f2625r;
                    long j10 = eVar.f2467f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j10);
                        arrayList2.add(dVar.f2632a);
                        duration.translationX((float) (dVar.f2636e - dVar.f2634c));
                        duration.translationY((float) (dVar.f2637f - dVar.f2635d));
                        duration.alpha(0.0f).setListener(new i(eVar, dVar, duration, view2)).start();
                    }
                    if (view != null) {
                        ViewPropertyAnimator animate = view.animate();
                        arrayList2.add(dVar.f2633b);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(j10).alpha(1.0f).setListener(new j(eVar, dVar, animate, view)).start();
                    }
                } else {
                    arrayList.clear();
                    eVar.f2621n.remove(arrayList);
                    return;
                }
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2630a;

        public c(ArrayList arrayList) {
            this.f2630a = arrayList;
        }

        public final void run() {
            ArrayList arrayList = this.f2630a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
                    eVar.getClass();
                    View view = b0Var.f2440a;
                    ViewPropertyAnimator animate = view.animate();
                    eVar.f2622o.add(b0Var);
                    animate.alpha(1.0f).setDuration(eVar.f2464c).setListener(new g(view, animate, eVar, b0Var)).start();
                } else {
                    arrayList.clear();
                    eVar.f2620l.remove(arrayList);
                    return;
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f2632a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f2633b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2634c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2635d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2636e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2637f;

        public d(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i8, int i10, int i11, int i12) {
            this.f2632a = b0Var;
            this.f2633b = b0Var2;
            this.f2634c = i8;
            this.f2635d = i10;
            this.f2636e = i11;
            this.f2637f = i12;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f2632a);
            sb2.append(", newHolder=");
            sb2.append(this.f2633b);
            sb2.append(", fromX=");
            sb2.append(this.f2634c);
            sb2.append(", fromY=");
            sb2.append(this.f2635d);
            sb2.append(", toX=");
            sb2.append(this.f2636e);
            sb2.append(", toY=");
            return rb.b.a(sb2, this.f2637f, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e  reason: collision with other inner class name */
    public static class C0030e {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f2638a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2639b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2640c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2641d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2642e;

        public C0030e(RecyclerView.b0 b0Var, int i8, int i10, int i11, int i12) {
            this.f2638a = b0Var;
            this.f2639b = i8;
            this.f2640c = i10;
            this.f2641d = i11;
            this.f2642e = i12;
        }
    }

    public static void n(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.b0) arrayList.get(size)).f2440a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final boolean f(RecyclerView.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || m(b0Var);
    }

    public final void h(RecyclerView.b0 b0Var) {
        View view = b0Var.f2440a;
        view.animate().cancel();
        ArrayList<C0030e> arrayList = this.f2618j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f2638a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                g(b0Var);
                arrayList.remove(size);
            }
        }
        p(b0Var, this.f2619k);
        if (this.f2616h.remove(b0Var)) {
            view.setAlpha(1.0f);
            g(b0Var);
        }
        if (this.f2617i.remove(b0Var)) {
            view.setAlpha(1.0f);
            g(b0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f2621n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = arrayList2.get(size2);
            p(b0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<C0030e>> arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C0030e) arrayList5.get(size4)).f2638a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    g(b0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList6 = this.f2620l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(b0Var)) {
                    view.setAlpha(1.0f);
                    g(b0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f2624q.remove(b0Var);
                this.f2622o.remove(b0Var);
                this.f2625r.remove(b0Var);
                this.f2623p.remove(b0Var);
                o();
                return;
            }
        }
    }

    public final void i() {
        ArrayList<C0030e> arrayList = this.f2618j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0030e eVar = arrayList.get(size);
            View view = eVar.f2638a.f2440a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            g(eVar.f2638a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.b0> arrayList2 = this.f2616h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            g(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.b0> arrayList3 = this.f2617i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList3.get(size3);
            b0Var.f2440a.setAlpha(1.0f);
            g(b0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f2619k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.b0 b0Var2 = dVar.f2632a;
            if (b0Var2 != null) {
                q(dVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = dVar.f2633b;
            if (b0Var3 != null) {
                q(dVar, b0Var3);
            }
        }
        arrayList4.clear();
        if (j()) {
            ArrayList<ArrayList<C0030e>> arrayList5 = this.m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C0030e eVar2 = (C0030e) arrayList6.get(size6);
                        View view2 = eVar2.f2638a.f2440a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        g(eVar2.f2638a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.b0>> arrayList7 = this.f2620l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.b0 b0Var4 = (RecyclerView.b0) arrayList8.get(size8);
                        b0Var4.f2440a.setAlpha(1.0f);
                        g(b0Var4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f2621n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        d dVar2 = (d) arrayList10.get(size10);
                        RecyclerView.b0 b0Var5 = dVar2.f2632a;
                        if (b0Var5 != null) {
                            q(dVar2, b0Var5);
                        }
                        RecyclerView.b0 b0Var6 = dVar2.f2633b;
                        if (b0Var6 != null) {
                            q(dVar2, b0Var6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            n(this.f2624q);
            n(this.f2623p);
            n(this.f2622o);
            n(this.f2625r);
            ArrayList<RecyclerView.j.a> arrayList11 = this.f2463b;
            int size11 = arrayList11.size();
            for (int i8 = 0; i8 < size11; i8++) {
                arrayList11.get(i8).a();
            }
            arrayList11.clear();
        }
    }

    public final boolean j() {
        return !this.f2617i.isEmpty() || !this.f2619k.isEmpty() || !this.f2618j.isEmpty() || !this.f2616h.isEmpty() || !this.f2623p.isEmpty() || !this.f2624q.isEmpty() || !this.f2622o.isEmpty() || !this.f2625r.isEmpty() || !this.m.isEmpty() || !this.f2620l.isEmpty() || !this.f2621n.isEmpty();
    }

    public final void k() {
        long j10;
        ArrayList<RecyclerView.b0> arrayList = this.f2616h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<C0030e> arrayList2 = this.f2618j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f2619k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.b0> arrayList4 = this.f2617i;
        boolean z13 = !arrayList4.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.b0> it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j10 = this.f2465d;
                if (!hasNext) {
                    break;
                }
                RecyclerView.b0 next = it.next();
                View view = next.f2440a;
                ViewPropertyAnimator animate = view.animate();
                this.f2624q.add(next);
                animate.setDuration(j10).alpha(0.0f).setListener(new f(view, animate, this, next)).start();
            }
            arrayList.clear();
            if (z11) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.m.add(arrayList5);
                arrayList2.clear();
                a aVar = new a(arrayList5);
                if (z10) {
                    View view2 = ((C0030e) arrayList5.get(0)).f2638a.f2440a;
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.n(view2, aVar, j10);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.f2621n.add(arrayList6);
                arrayList3.clear();
                b bVar = new b(arrayList6);
                if (z10) {
                    View view3 = ((d) arrayList6.get(0)).f2632a.f2440a;
                    WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                    i0.d.n(view3, bVar, j10);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f2620l.add(arrayList7);
                arrayList4.clear();
                c cVar = new c(arrayList7);
                if (z10 || z11 || z12) {
                    long j11 = 0;
                    if (!z10) {
                        j10 = 0;
                    }
                    long j12 = z11 ? this.f2466e : 0;
                    if (z12) {
                        j11 = this.f2467f;
                    }
                    View view4 = ((RecyclerView.b0) arrayList7.get(0)).f2440a;
                    WeakHashMap<View, d1> weakHashMap3 = i0.f7217a;
                    i0.d.n(view4, cVar, Math.max(j12, j11) + j10);
                    return;
                }
                cVar.run();
            }
        }
    }

    public final boolean l(RecyclerView.b0 b0Var, int i8, int i10, int i11, int i12) {
        View view = b0Var.f2440a;
        int translationX = i8 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) b0Var.f2440a.getTranslationY());
        r(b0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            g(b0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX((float) (-i13));
        }
        if (i14 != 0) {
            view.setTranslationY((float) (-i14));
        }
        this.f2618j.add(new C0030e(b0Var, translationX, translationY, i11, i12));
        return true;
    }

    public final void o() {
        if (!j()) {
            ArrayList<RecyclerView.j.a> arrayList = this.f2463b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).a();
            }
            arrayList.clear();
        }
    }

    public final void p(RecyclerView.b0 b0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) arrayList.get(size);
                if (q(dVar, b0Var) && dVar.f2632a == null && dVar.f2633b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean q(d dVar, RecyclerView.b0 b0Var) {
        if (dVar.f2633b == b0Var) {
            dVar.f2633b = null;
        } else if (dVar.f2632a != b0Var) {
            return false;
        } else {
            dVar.f2632a = null;
        }
        b0Var.f2440a.setAlpha(1.0f);
        View view = b0Var.f2440a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        g(b0Var);
        return true;
    }

    public final void r(RecyclerView.b0 b0Var) {
        if (f2615s == null) {
            f2615s = new ValueAnimator().getInterpolator();
        }
        b0Var.f2440a.animate().setInterpolator(f2615s);
        h(b0Var);
    }
}
