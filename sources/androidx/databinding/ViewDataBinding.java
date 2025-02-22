package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.i;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import com.quickkonnect.silencio.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.y0;

public abstract class ViewDataBinding extends a {
    public static final boolean P = true;
    public static final ReferenceQueue<ViewDataBinding> Q = new ReferenceQueue<>();
    public static final a R = new a();
    public final b D;
    public boolean E;
    public final j[] F;
    public final View G;
    public boolean H;
    public final Choreographer I;
    public final h J;
    public final Handler K;
    public final d L;
    public p M;
    public OnStartListener N;
    public boolean O;

    public static class OnStartListener implements o {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f1762a;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f1762a = new WeakReference<>(viewDataBinding);
        }

        @x(j.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f1762a.get();
            if (viewDataBinding == null) {
                return;
            }
            if (viewDataBinding.H) {
                viewDataBinding.u();
            } else if (viewDataBinding.o()) {
                viewDataBinding.H = true;
                viewDataBinding.n();
                viewDataBinding.H = false;
            }
        }
    }

    public class a implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).D.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.E = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.Q.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof j) {
                    ((j) poll).a();
                }
            }
            if (!ViewDataBinding.this.G.isAttachedToWindow()) {
                View view = ViewDataBinding.this.G;
                a aVar = ViewDataBinding.R;
                view.removeOnAttachStateChangeListener(aVar);
                ViewDataBinding.this.G.addOnAttachStateChangeListener(aVar);
                return;
            }
            ViewDataBinding viewDataBinding = ViewDataBinding.this;
            if (viewDataBinding.H) {
                viewDataBinding.u();
            } else if (viewDataBinding.o()) {
                viewDataBinding.H = true;
                viewDataBinding.n();
                viewDataBinding.H = false;
            }
        }
    }

    public ViewDataBinding(int i8, View view, Object obj) {
        d dVar;
        if (obj == null) {
            dVar = null;
        } else if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.D = new b();
        this.E = false;
        this.L = dVar;
        this.F = new j[i8];
        this.G = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (P) {
            this.I = Choreographer.getInstance();
            this.J = new h(this);
        } else {
            this.J = null;
            this.K = new Handler(Looper.myLooper());
        }
    }

    public static <T extends ViewDataBinding> T p(LayoutInflater layoutInflater, int i8, ViewGroup viewGroup, boolean z10, Object obj) {
        d dVar;
        if (obj == null) {
            dVar = null;
        } else if (obj instanceof d) {
            dVar = (d) obj;
        } else {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        DataBinderMapperImpl dataBinderMapperImpl = e.f1771a;
        boolean z11 = viewGroup != null && z10;
        int childCount = z11 ? viewGroup.getChildCount() : 0;
        View inflate = layoutInflater.inflate(i8, viewGroup, z10);
        if (!z11) {
            return e.f1771a.b(dVar, inflate, i8);
        }
        int childCount2 = viewGroup.getChildCount();
        int i10 = childCount2 - childCount;
        if (i10 == 1) {
            return e.f1771a.b(dVar, viewGroup.getChildAt(childCount2 - 1), i8);
        }
        View[] viewArr = new View[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            viewArr[i11] = viewGroup.getChildAt(i11 + childCount);
        }
        return e.f1771a.c(dVar, viewArr, i8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(android.view.View r6, java.lang.Object[] r7, android.util.SparseIntArray r8, boolean r9) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x000d
            r1 = 2131296668(0x7f09019c, float:1.821126E38)
            java.lang.Object r1 = r6.getTag(r1)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.Object r1 = r6.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001c
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L_0x001c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x0069
            java.lang.String r9 = "layout"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L_0x0069
            r9 = 95
            int r9 = r0.lastIndexOf(r9)
            if (r9 <= 0) goto L_0x008f
            int r9 = r9 + r2
            int r3 = r0.length()
            if (r3 != r9) goto L_0x003b
        L_0x0039:
            r3 = r1
            goto L_0x004d
        L_0x003b:
            r4 = r9
        L_0x003c:
            if (r4 >= r3) goto L_0x004c
            char r5 = r0.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L_0x0049
            goto L_0x0039
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x008f
            int r3 = r0.length()
            r4 = r1
        L_0x0054:
            if (r9 >= r3) goto L_0x0062
            int r4 = r4 * 10
            char r5 = r0.charAt(r9)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r9 = r9 + 1
            goto L_0x0054
        L_0x0062:
            r9 = r7[r4]
            if (r9 != 0) goto L_0x0090
            r7[r4] = r6
            goto L_0x0090
        L_0x0069:
            if (r0 == 0) goto L_0x008f
            java.lang.String r9 = "binding_"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L_0x008f
            int r9 = r0.length()
            r3 = 8
            r4 = r1
        L_0x007a:
            if (r3 >= r9) goto L_0x0088
            int r4 = r4 * 10
            char r5 = r0.charAt(r3)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x007a
        L_0x0088:
            r9 = r7[r4]
            if (r9 != 0) goto L_0x0090
            r7[r4] = r6
            goto L_0x0090
        L_0x008f:
            r2 = r1
        L_0x0090:
            if (r2 != 0) goto L_0x00a7
            int r9 = r6.getId()
            if (r9 <= 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            r0 = -1
            int r9 = r8.get(r9, r0)
            if (r9 < 0) goto L_0x00a7
            r0 = r7[r9]
            if (r0 != 0) goto L_0x00a7
            r7[r9] = r6
        L_0x00a7:
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x00be
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r9 = r6.getChildCount()
            r0 = r1
        L_0x00b2:
            if (r0 >= r9) goto L_0x00be
            android.view.View r2 = r6.getChildAt(r0)
            q(r2, r7, r8, r1)
            int r0 = r0 + 1
            goto L_0x00b2
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.q(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public static Object[] r(View view, int i8, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i8];
        q(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public abstract void n();

    public abstract boolean o();

    public abstract boolean s(Object obj, int i8, int i10);

    public final void t(int i8, y0 y0Var) {
        if (y0Var != null) {
            j<f<Object>>[] jVarArr = this.F;
            j<f<Object>> jVar = jVarArr[i8];
            if (jVar == null) {
                ReferenceQueue<ViewDataBinding> referenceQueue = Q;
                sf.j.e(referenceQueue, "referenceQueue");
                jVar = new i.a(this, i8, referenceQueue).f1775c;
                jVarArr[i8] = jVar;
                p pVar = this.M;
                if (pVar != null) {
                    jVar.f1784a.a(pVar);
                }
            }
            jVar.a();
            jVar.f1786c = y0Var;
            jVar.f1784a.b(y0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (P == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r3.I.postFrameCallback(r3.J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r3.K.post(r3.D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r3 = this;
            androidx.lifecycle.p r0 = r3.M
            r1 = 1
            if (r0 == 0) goto L_0x001b
            androidx.lifecycle.j r0 = r0.b()
            androidx.lifecycle.j$b r0 = r0.b()
            androidx.lifecycle.j$b r2 = androidx.lifecycle.j.b.f2280d
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            monitor-enter(r3)
            boolean r0 = r3.E     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return
        L_0x0022:
            r3.E = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            boolean r0 = P
            if (r0 == 0) goto L_0x0031
            android.view.Choreographer r0 = r3.I
            androidx.databinding.h r1 = r3.J
            r0.postFrameCallback(r1)
            goto L_0x0038
        L_0x0031:
            android.os.Handler r0 = r3.K
            androidx.databinding.ViewDataBinding$b r1 = r3.D
            r0.post(r1)
        L_0x0038:
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.u():void");
    }

    public final void v(p pVar) {
        if (pVar instanceof androidx.fragment.app.p) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        p pVar2 = this.M;
        if (pVar2 != pVar) {
            if (pVar2 != null) {
                pVar2.b().c(this.N);
            }
            this.M = pVar;
            if (pVar != null) {
                if (this.N == null) {
                    this.N = new OnStartListener(this);
                }
                pVar.b().a(this.N);
            }
            for (j jVar : this.F) {
                if (jVar != null) {
                    jVar.f1784a.a(pVar);
                }
            }
        }
    }
}
