package n1;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import d2.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.e;
import o1.b;

public final class d extends ConstraintLayout implements x {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f11528j0 = 0;
    public float M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public long S;
    public float T;
    public c U;
    public b V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList<c> f11529a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList<c> f11530b0;

    /* renamed from: c0  reason: collision with root package name */
    public CopyOnWriteArrayList<c> f11531c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f11532d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f11533e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f11534f0;

    /* renamed from: g0  reason: collision with root package name */
    public b f11535g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f11536h0;

    /* renamed from: i0  reason: collision with root package name */
    public C0221d f11537i0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d.this.f11535g0.a();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f11539a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f11540b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f11541c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f11542d = -1;

        public b() {
        }

        public final void a() {
            int i8 = this.f11541c;
            d dVar = d.this;
            if (!(i8 == -1 && this.f11542d == -1)) {
                C0221d dVar2 = C0221d.f11544a;
                if (i8 == -1) {
                    dVar.s(this.f11542d);
                } else {
                    int i10 = this.f11542d;
                    if (i10 == -1) {
                        dVar.setState(dVar2);
                        dVar.O = i8;
                        dVar.N = -1;
                        dVar.P = -1;
                        o1.b bVar = dVar.G;
                        if (bVar != null) {
                            float f10 = (float) -1;
                            int i11 = bVar.f12112b;
                            SparseArray<b.a> sparseArray = bVar.f12114d;
                            int i12 = 0;
                            ConstraintLayout constraintLayout = bVar.f12111a;
                            if (i11 == i8) {
                                b.a valueAt = i8 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
                                int i13 = bVar.f12113c;
                                if (i13 == -1 || !valueAt.f12117b.get(i13).a(f10, f10)) {
                                    while (true) {
                                        ArrayList<b.C0229b> arrayList = valueAt.f12117b;
                                        if (i12 >= arrayList.size()) {
                                            i12 = -1;
                                            break;
                                        } else if (arrayList.get(i12).a(f10, f10)) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                    if (bVar.f12113c != i12) {
                                        ArrayList<b.C0229b> arrayList2 = valueAt.f12117b;
                                        androidx.constraintlayout.widget.b bVar2 = i12 == -1 ? null : arrayList2.get(i12).f12125f;
                                        if (i12 != -1) {
                                            int i14 = arrayList2.get(i12).f12124e;
                                        }
                                        if (bVar2 != null) {
                                            bVar.f12113c = i12;
                                            bVar2.a(constraintLayout);
                                            constraintLayout.setConstraintSet((androidx.constraintlayout.widget.b) null);
                                            constraintLayout.requestLayout();
                                        }
                                    }
                                }
                            } else {
                                bVar.f12112b = i8;
                                b.a aVar = sparseArray.get(i8);
                                while (true) {
                                    ArrayList<b.C0229b> arrayList3 = aVar.f12117b;
                                    if (i12 >= arrayList3.size()) {
                                        i12 = -1;
                                        break;
                                    } else if (arrayList3.get(i12).a(f10, f10)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                                ArrayList<b.C0229b> arrayList4 = aVar.f12117b;
                                androidx.constraintlayout.widget.b bVar3 = i12 == -1 ? aVar.f12119d : arrayList4.get(i12).f12125f;
                                if (i12 != -1) {
                                    int i15 = arrayList4.get(i12).f12124e;
                                }
                                if (bVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i8 + ", dim =-1.0, -1.0");
                                } else {
                                    bVar.f12113c = i12;
                                    bVar3.a(constraintLayout);
                                    constraintLayout.setConstraintSet((androidx.constraintlayout.widget.b) null);
                                    constraintLayout.requestLayout();
                                }
                            }
                        }
                    } else {
                        dVar.r(i8, i10);
                    }
                }
                dVar.setState(dVar2);
            }
            if (!Float.isNaN(this.f11540b)) {
                dVar.q(this.f11539a, this.f11540b);
                this.f11539a = Float.NaN;
                this.f11540b = Float.NaN;
                this.f11541c = -1;
                this.f11542d = -1;
            } else if (!Float.isNaN(this.f11539a)) {
                dVar.setProgress(this.f11539a);
            }
        }
    }

    public interface c {
        void a();

        void b();
    }

    /* renamed from: n1.d$d  reason: collision with other inner class name */
    public enum C0221d {
        f11544a,
        f11545b,
        f11546c;

        /* access modifiers changed from: public */
        C0221d() {
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        int i8;
        int i10;
        if (this.S == -1) {
            this.S = getNanoTime();
        }
        float f10 = this.R;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.O = -1;
        }
        boolean z10 = true;
        boolean z11 = false;
        if (this.W) {
            float signum = Math.signum(this.T - f10);
            long nanoTime = getNanoTime();
            float f11 = ((((float) (nanoTime - this.S)) * signum) * 1.0E-9f) / 0.0f;
            float f12 = this.R + f11;
            int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i11 > 0 && f12 >= this.T) || (signum <= 0.0f && f12 <= this.T)) {
                f12 = this.T;
            }
            this.R = f12;
            this.Q = f12;
            this.S = nanoTime;
            this.M = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(C0221d.f11545b);
            }
            if ((i11 > 0 && f12 >= this.T) || (signum <= 0.0f && f12 <= this.T)) {
                f12 = this.T;
            }
            int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
            C0221d dVar = C0221d.f11546c;
            if (i12 >= 0 || f12 <= 0.0f) {
                setState(dVar);
            }
            int childCount = getChildCount();
            this.W = false;
            getNanoTime();
            if (childCount <= 0) {
                boolean z12 = (i11 > 0 && f12 >= this.T) || (signum <= 0.0f && f12 <= this.T);
                if (!this.W && z12) {
                    setState(dVar);
                }
                boolean z13 = (!z12) | this.W;
                this.W = z13;
                if (f12 <= 0.0f && (i10 = this.N) != -1 && this.O != i10) {
                    this.O = i10;
                    throw null;
                } else if (((double) f12) >= 1.0d && this.O != (i8 = this.P)) {
                    this.O = i8;
                    throw null;
                } else if (z13) {
                    invalidate();
                } else if ((i11 > 0 && i12 == 0) || (signum < 0.0f && f12 == 0.0f)) {
                    setState(dVar);
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f13 = this.R;
        if (f13 >= 1.0f) {
            int i13 = this.O;
            int i14 = this.P;
            if (i13 == i14) {
                z10 = false;
            }
            this.O = i14;
        } else {
            if (f13 <= 0.0f) {
                int i15 = this.O;
                int i16 = this.N;
                if (i15 == i16) {
                    z10 = false;
                }
                this.O = i16;
            }
            if (z11 && !this.f11534f0) {
                requestLayout();
            }
            this.Q = this.R;
            super.dispatchDraw(canvas);
        }
        z11 = z10;
        requestLayout();
        this.Q = this.R;
        super.dispatchDraw(canvas);
    }

    public final void e(int i8) {
        this.G = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.O;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.V == null) {
            this.V = new b();
        }
        return this.V;
    }

    public int getEndState() {
        return this.P;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.R;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.N;
    }

    public float getTargetPosition() {
        return this.T;
    }

    public Bundle getTransitionState() {
        if (this.f11535g0 == null) {
            this.f11535g0 = new b();
        }
        b bVar = this.f11535g0;
        d dVar = d.this;
        bVar.f11542d = dVar.P;
        bVar.f11541c = dVar.N;
        bVar.f11540b = dVar.getVelocity();
        bVar.f11539a = dVar.getProgress();
        b bVar2 = this.f11535g0;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f11539a);
        bundle.putFloat("motion.velocity", bVar2.f11540b);
        bundle.putInt("motion.StartState", bVar2.f11541c);
        bundle.putInt("motion.EndState", bVar2.f11542d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.M;
    }

    public final void i() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.U != null || ((copyOnWriteArrayList = this.f11531c0) != null && !copyOnWriteArrayList.isEmpty())) && this.f11533e0 != this.Q) {
            if (this.f11532d0 != -1) {
                c cVar = this.U;
                if (cVar != null) {
                    cVar.b();
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f11531c0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.f11532d0 = -1;
            this.f11533e0 = this.Q;
            c cVar2 = this.U;
            if (cVar2 != null) {
                cVar2.a();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.f11531c0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(View view, int i8, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i8 != 0 || i10 != 0) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }
    }

    public final void k(View view, int i8, int i10, int i11, int i12, int i13) {
    }

    public final boolean l(View view, View view2, int i8, int i10) {
        return false;
    }

    public final void m(View view, View view2, int i8, int i10) {
        getNanoTime();
    }

    public final void n(View view, int i8) {
    }

    public final void o(View view, int i8, int i10, int[] iArr, int i11) {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.f11535g0;
        if (bVar == null) {
            return;
        }
        if (this.f11536h0) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        this.f11534f0 = true;
        try {
            super.onLayout(z10, i8, i10, i11, i12);
        } finally {
            this.f11534f0 = false;
        }
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i8) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.f11531c0 == null) {
                this.f11531c0 = new CopyOnWriteArrayList<>();
            }
            this.f11531c0.add(cVar);
            if (cVar.E) {
                if (this.f11529a0 == null) {
                    this.f11529a0 = new ArrayList<>();
                }
                this.f11529a0.add(cVar);
            }
            if (cVar.F) {
                if (this.f11530b0 == null) {
                    this.f11530b0 = new ArrayList<>();
                }
                this.f11530b0.add(cVar);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.f11529a0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.f11530b0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.U != null || ((copyOnWriteArrayList2 = this.f11531c0) != null && !copyOnWriteArrayList2.isEmpty())) && this.f11532d0 == -1) {
            this.f11532d0 = this.O;
            throw null;
        } else if (this.U != null || ((copyOnWriteArrayList = this.f11531c0) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public final void q(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.f11535g0 == null) {
                this.f11535g0 = new b();
            }
            b bVar = this.f11535g0;
            bVar.f11539a = f10;
            bVar.f11540b = f11;
            return;
        }
        setProgress(f10);
        setState(C0221d.f11545b);
        this.M = f11;
    }

    public final void r(int i8, int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.f11535g0 == null) {
                this.f11535g0 = new b();
            }
            b bVar = this.f11535g0;
            bVar.f11541c = i8;
            bVar.f11542d = i10;
        }
    }

    public final void requestLayout() {
        int i8 = this.O;
        super.requestLayout();
    }

    public final void s(int i8) {
        if (!super.isAttachedToWindow()) {
            if (this.f11535g0 == null) {
                this.f11535g0 = new b();
            }
            this.f11535g0.f11542d = i8;
            return;
        }
        int i10 = this.O;
        if (i10 != i8 && this.N != i8 && this.P != i8) {
            this.P = i8;
            if (i10 != -1) {
                r(i10, i8);
                this.R = 0.0f;
                return;
            }
            this.T = 1.0f;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    public void setDebugMode(int i8) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f11536h0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<c> arrayList = this.f11530b0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f11530b0.get(i8).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<c> arrayList = this.f11529a0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f11529a0.get(i8).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i8 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i8 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f11535g0 == null) {
                this.f11535g0 = new b();
            }
            this.f11535g0.f11539a = f10;
            return;
        }
        C0221d dVar = C0221d.f11546c;
        C0221d dVar2 = C0221d.f11545b;
        if (i8 <= 0) {
            if (this.R == 1.0f && this.O == this.P) {
                setState(dVar2);
            }
            this.O = this.N;
            if (this.R == 0.0f) {
                setState(dVar);
            }
        } else if (f10 >= 1.0f) {
            if (this.R == 0.0f && this.O == this.N) {
                setState(dVar2);
            }
            this.O = this.P;
            if (this.R == 1.0f) {
                setState(dVar);
            }
        } else {
            this.O = -1;
            setState(dVar2);
        }
    }

    public void setScene(e eVar) {
        d();
        throw null;
    }

    public void setStartState(int i8) {
        if (!super.isAttachedToWindow()) {
            if (this.f11535g0 == null) {
                this.f11535g0 = new b();
            }
            b bVar = this.f11535g0;
            bVar.f11541c = i8;
            bVar.f11542d = i8;
            return;
        }
        this.O = i8;
    }

    public void setState(C0221d dVar) {
        C0221d dVar2 = C0221d.f11546c;
        if (dVar != dVar2 || this.O != -1) {
            C0221d dVar3 = this.f11537i0;
            this.f11537i0 = dVar;
            C0221d dVar4 = C0221d.f11545b;
            if (dVar3 == dVar4 && dVar == dVar4) {
                i();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    i();
                }
                if (dVar == dVar2) {
                    p();
                }
            } else if (ordinal == 2 && dVar == dVar2) {
                p();
            }
        }
    }

    public void setTransition(int i8) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i8) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.U = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f11535g0 == null) {
            this.f11535g0 = new b();
        }
        b bVar = this.f11535g0;
        bVar.getClass();
        bVar.f11539a = bundle.getFloat("motion.progress");
        bVar.f11540b = bundle.getFloat("motion.velocity");
        bVar.f11541c = bundle.getInt("motion.StartState");
        bVar.f11542d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f11535g0.a();
        }
    }

    public final String toString() {
        Context context = getContext();
        return a.a(context, this.N) + "->" + a.a(context, this.P) + " (pos:" + this.R + " Dpos/Dt:" + this.M;
    }
}
