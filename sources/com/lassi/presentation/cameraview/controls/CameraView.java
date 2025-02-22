package com.lassi.presentation.cameraview.controls;

import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a1;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import com.lassi.presentation.cameraview.controls.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.c;
import tb.e;
import tb.f;
import tb.h;
import tb.i;
import tb.k;
import tb.l;
import ub.m;
import ub.n;
import ub.r;
import ub.s;
import ub.w;
import ub.y;
import ub.z;
import vb.g;
import vb.j;
import wb.d;
import wb.q;

public class CameraView extends FrameLayout implements o {
    public static final wb.a O = new wb.a("CameraView");
    public j B;
    public g C;
    public boolean D;
    public final HashMap<e, f> E = new HashMap<>(4);
    public tb.j F;
    public vb.a G;
    public d H;
    public g I;
    public MediaActionSound J;
    public androidx.lifecycle.j K;
    public boolean L;
    public Handler M;
    public q N;

    /* renamed from: a  reason: collision with root package name */
    public a f6422a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f6423b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f6424c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public vb.e f6425d;

    /* renamed from: e  reason: collision with root package name */
    public vb.f f6426e;

    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final wb.a f6427a = new wb.a(b.class.getSimpleName());

        /* renamed from: com.lassi.presentation.cameraview.controls.CameraView$a$a  reason: collision with other inner class name */
        public class C0081a implements Runnable {
            public C0081a(float f10, float[] fArr, PointF[] pointFArr) {
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r f6430a;

            public b(r rVar) {
                this.f6430a = rVar;
            }

            public final void run() {
                Iterator it = CameraView.this.f6424c.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a();
                }
                this.f6430a.a();
            }
        }

        public class c implements Runnable {
            public c(m mVar) {
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j f6433a;

            public d(j jVar) {
                this.f6433a = jVar;
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a(this.f6433a);
                }
            }
        }

        public class e implements Runnable {
            public e() {
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public class f implements Runnable {
            public f() {
            }

            public final void run() {
                CameraView.this.requestLayout();
            }
        }

        public class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w f6437a;

            public g(w wVar) {
                this.f6437a = wVar;
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).b(this.f6437a);
                }
            }
        }

        public class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ z f6439a;

            public h(z zVar) {
                this.f6439a = zVar;
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).c(this.f6439a);
                }
            }
        }

        public class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ tb.e f6441a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PointF f6442b;

            public i(tb.e eVar, PointF pointF) {
                this.f6441a = eVar;
                this.f6442b = pointF;
            }

            public final void run() {
                a aVar = a.this;
                tb.e eVar = this.f6441a;
                if (eVar != null && CameraView.this.E.get(eVar) == tb.f.FOCUS_WITH_MARKER) {
                    vb.j jVar = CameraView.this.B;
                    jVar.removeCallbacks(jVar.D);
                    jVar.B.clearAnimation();
                    jVar.C.clearAnimation();
                    PointF pointF = this.f6442b;
                    jVar.B.setTranslationX((float) ((int) (pointF.x - ((float) (jVar.B.getWidth() / 2)))));
                    jVar.B.setTranslationY((float) ((int) (pointF.y - ((float) (jVar.B.getWidth() / 2)))));
                    jVar.B.setScaleX(1.36f);
                    jVar.B.setScaleY(1.36f);
                    jVar.B.setAlpha(1.0f);
                    jVar.C.setScaleX(0.0f);
                    jVar.C.setScaleY(0.0f);
                    jVar.C.setAlpha(1.0f);
                    vb.j.d(jVar.B, 1.0f, 1.0f, 300, 0, (AnimatorListenerAdapter) null);
                    vb.j.d(jVar.C, 1.0f, 1.0f, 300, 0, new vb.k(jVar));
                }
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f6444a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ tb.e f6445b;

            public j(boolean z10, tb.e eVar, PointF pointF) {
                this.f6444a = z10;
                this.f6445b = eVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
                r2 = r0.f6428b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.lassi.presentation.cameraview.controls.CameraView$a r0 = com.lassi.presentation.cameraview.controls.CameraView.a.this
                    boolean r1 = r4.f6444a
                    if (r1 == 0) goto L_0x001f
                    com.lassi.presentation.cameraview.controls.CameraView r2 = com.lassi.presentation.cameraview.controls.CameraView.this
                    boolean r3 = r2.D
                    if (r3 == 0) goto L_0x001f
                    if (r3 == 0) goto L_0x001f
                    android.media.MediaActionSound r3 = r2.J
                    if (r3 != 0) goto L_0x0019
                    android.media.MediaActionSound r3 = new android.media.MediaActionSound
                    r3.<init>()
                    r2.J = r3
                L_0x0019:
                    android.media.MediaActionSound r2 = r2.J
                    r3 = 1
                    r2.play(r3)
                L_0x001f:
                    tb.e r2 = r4.f6445b
                    if (r2 == 0) goto L_0x0036
                    com.lassi.presentation.cameraview.controls.CameraView r3 = com.lassi.presentation.cameraview.controls.CameraView.this
                    java.util.HashMap<tb.e, tb.f> r3 = r3.E
                    java.lang.Object r2 = r3.get(r2)
                    tb.f r3 = tb.f.FOCUS_WITH_MARKER
                    if (r2 != r3) goto L_0x0036
                    com.lassi.presentation.cameraview.controls.CameraView r2 = com.lassi.presentation.cameraview.controls.CameraView.this
                    vb.j r2 = r2.B
                    r2.e(r1)
                L_0x0036:
                    com.lassi.presentation.cameraview.controls.CameraView r0 = com.lassi.presentation.cameraview.controls.CameraView.this
                    java.util.concurrent.CopyOnWriteArrayList r0 = r0.f6423b
                    java.util.Iterator r0 = r0.iterator()
                L_0x003e:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x004e
                    java.lang.Object r1 = r0.next()
                    ub.n r1 = (ub.n) r1
                    r1.getClass()
                    goto L_0x003e
                L_0x004e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.CameraView.a.j.run():void");
            }
        }

        public class k implements Runnable {
            public k(int i8) {
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public class l implements Runnable {
            public l(float f10, PointF[] pointFArr) {
            }

            public final void run() {
                Iterator it = CameraView.this.f6423b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).getClass();
                }
            }
        }

        public a() {
        }

        public final void a(m mVar) {
            this.f6427a.a(1, "dispatchError", mVar);
            CameraView.this.M.post(new c(mVar));
        }

        public final void b(tb.e eVar, PointF pointF) {
            this.f6427a.a(1, "dispatchOnFocusStart", eVar, pointF);
            CameraView.this.M.post(new i(eVar, pointF));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r1.f6428b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(boolean r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x001b
                com.lassi.presentation.cameraview.controls.CameraView r2 = com.lassi.presentation.cameraview.controls.CameraView.this
                boolean r0 = r2.D
                if (r0 == 0) goto L_0x001b
                if (r0 == 0) goto L_0x001b
                android.media.MediaActionSound r0 = r2.J
                if (r0 != 0) goto L_0x0015
                android.media.MediaActionSound r0 = new android.media.MediaActionSound
                r0.<init>()
                r2.J = r0
            L_0x0015:
                android.media.MediaActionSound r2 = r2.J
                r0 = 0
                r2.play(r0)
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.CameraView.a.c(boolean):void");
        }

        public final void d(z zVar) {
            this.f6427a.a(1, "dispatchOnVideoTaken", zVar);
            CameraView.this.M.post(new h(zVar));
        }

        public final void e(w wVar) {
            this.f6427a.a(1, "dispatchOnPictureTaken");
            CameraView.this.M.post(new g(wVar));
        }

        public final void f(tb.e eVar, boolean z10, PointF pointF) {
            this.f6427a.a(1, "dispatchOnFocusEnd", eVar, Boolean.valueOf(z10), pointF);
            CameraView.this.M.post(new j(z10, eVar, pointF));
        }

        public final void g() {
            this.f6427a.a(1, "dispatchOnCameraClosed");
            CameraView.this.M.post(new e());
        }

        public final void h(float f10, float[] fArr, PointF[] pointFArr) {
            this.f6427a.a(1, "dispatchOnExposureCorrectionChanged", Float.valueOf(f10));
            CameraView.this.M.post(new C0081a(f10, fArr, pointFArr));
        }

        public final void i(int i8) {
            this.f6427a.a(1, "onDeviceOrientationChanged", Integer.valueOf(i8));
            CameraView cameraView = CameraView.this;
            cameraView.I.T = i8;
            cameraView.M.post(new k((i8 + cameraView.H.f16668d) % 360));
        }

        public final void j() {
            this.f6427a.a(1, "onCameraPreviewStreamSizeChanged");
            CameraView.this.M.post(new f());
        }

        public final void k(r rVar) {
            CameraView cameraView = CameraView.this;
            if (cameraView.f6424c.isEmpty()) {
                rVar.a();
                return;
            }
            Object[] objArr = new Object[4];
            objArr[0] = "dispatchFrame:";
            if (rVar.f15984b != null) {
                objArr[1] = Long.valueOf(rVar.f15985c);
                objArr[2] = "processors:";
                objArr[3] = Integer.valueOf(cameraView.f6424c.size());
                this.f6427a.a(0, objArr);
                cameraView.N.b(new b(rVar));
                return;
            }
            throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously,for the duration of the process() method.");
        }

        public final void l(j jVar) {
            this.f6427a.a(1, "dispatchOnCameraOpened", jVar);
            CameraView.this.M.post(new d(jVar));
        }

        public final void m(float f10, PointF[] pointFArr) {
            this.f6427a.a(1, "dispatchOnZoomChanged", Float.valueOf(f10));
            CameraView.this.M.post(new l(f10, pointFArr));
        }
    }

    public interface b extends d.a {
        void a(m mVar);

        void b(e eVar, PointF pointF);

        void c(boolean z10);

        void d(z zVar);

        void e(w wVar);

        void f(e eVar, boolean z10, PointF pointF);

        void g();

        void h(float f10, float[] fArr, PointF[] pointFArr);

        void j();

        void k(r rVar);

        void l(j jVar);

        void m(float f10, PointF[] pointFArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        tb.j jVar;
        c cVar;
        tb.d dVar;
        tb.g gVar;
        l lVar;
        i iVar;
        int i8;
        h hVar;
        tb.a aVar;
        k kVar;
        k kVar2;
        Context context2 = context;
        int i10 = 0;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cb.c.f3888d, 0, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(24, true);
        obtainStyledAttributes.getBoolean(3, false);
        int integer = obtainStyledAttributes.getInteger(25, 2);
        tb.j[] values = tb.j.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                jVar = null;
                break;
            }
            jVar = values[i11];
            if (jVar.f15561a == integer) {
                break;
            }
            i11++;
        }
        this.F = jVar;
        c cVar2 = c.BACK;
        if (!wb.b.a(cVar2)) {
            c cVar3 = c.FRONT;
            if (wb.b.a(cVar3)) {
                cVar2 = cVar3;
            }
        }
        int integer2 = obtainStyledAttributes.getInteger(4, cVar2.f15532a);
        c[] values2 = c.values();
        int length2 = values2.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length2) {
                cVar = null;
                break;
            }
            cVar = values2[i12];
            if (cVar.f15532a == integer2) {
                break;
            }
            i12++;
        }
        int integer3 = obtainStyledAttributes.getInteger(5, 0);
        tb.d[] values3 = tb.d.values();
        int length3 = values3.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length3) {
                dVar = null;
                break;
            }
            dVar = values3[i13];
            if (dVar.f15537a == integer3) {
                break;
            }
            i13++;
        }
        int integer4 = obtainStyledAttributes.getInteger(11, 0);
        tb.g[] values4 = tb.g.values();
        int length4 = values4.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length4) {
                gVar = null;
                break;
            }
            gVar = values4[i14];
            if (gVar.f15550a == integer4) {
                break;
            }
            i14++;
        }
        int color = obtainStyledAttributes.getColor(12, vb.e.C);
        int integer5 = obtainStyledAttributes.getInteger(41, 0);
        l[] values5 = l.values();
        int length5 = values5.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length5) {
                lVar = null;
                break;
            }
            lVar = values5[i15];
            if (lVar.f15568a == integer5) {
                break;
            }
            i15++;
        }
        int integer6 = obtainStyledAttributes.getInteger(14, 0);
        i[] values6 = i.values();
        int length6 = values6.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length6) {
                iVar = null;
                break;
            }
            iVar = values6[i16];
            if (iVar.f15558a == integer6) {
                break;
            }
            i16++;
        }
        int integer7 = obtainStyledAttributes.getInteger(13, 0);
        h[] values7 = h.values();
        int length7 = values7.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length7) {
                i8 = 1;
                hVar = null;
                break;
            }
            hVar = values7[i17];
            if (hVar.f15554a == integer7) {
                i10 = 0;
                i8 = 1;
                break;
            }
            i17++;
            i10 = 0;
        }
        int integer8 = obtainStyledAttributes.getInteger(i10, i8);
        tb.a[] values8 = tb.a.values();
        int length8 = values8.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length8) {
                aVar = null;
                break;
            }
            aVar = values8[i18];
            tb.a[] aVarArr = values8;
            if (aVar.f15528a == integer8) {
                break;
            }
            i18++;
            values8 = aVarArr;
        }
        int integer9 = obtainStyledAttributes.getInteger(29, 0);
        k[] values9 = k.values();
        int length9 = values9.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length9) {
                kVar = null;
                break;
            }
            int i20 = length9;
            kVar = values9[i19];
            k[] kVarArr = values9;
            if (kVar.f15563a == integer9) {
                break;
            }
            i19++;
            length9 = i20;
            values9 = kVarArr;
        }
        k kVar3 = kVar;
        long j10 = (long) obtainStyledAttributes.getFloat(31, 0.0f);
        int integer10 = obtainStyledAttributes.getInteger(30, 0);
        int integer11 = obtainStyledAttributes.getInteger(28, 0);
        int i21 = integer10;
        int integer12 = obtainStyledAttributes.getInteger(1, 0);
        long integer13 = (long) obtainStyledAttributes.getInteger(2, 3000);
        ArrayList arrayList = new ArrayList(3);
        if (obtainStyledAttributes.hasValue(22)) {
            arrayList.add(new wb.o(new wb.f(obtainStyledAttributes.getInteger(22, 0))));
        }
        if (obtainStyledAttributes.hasValue(19)) {
            arrayList.add(new wb.o(new wb.e(obtainStyledAttributes.getInteger(19, 0))));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            arrayList.add(new wb.o(new com.google.android.gms.internal.p000firebaseauthapi.o(obtainStyledAttributes.getInteger(21, 0))));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            arrayList.add(new wb.o(new wb.g(obtainStyledAttributes.getInteger(18, 0))));
        }
        if (obtainStyledAttributes.hasValue(20)) {
            arrayList.add(new wb.o(new wb.l(obtainStyledAttributes.getInteger(20, 0))));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            arrayList.add(new wb.o(new wb.k(obtainStyledAttributes.getInteger(17, 0))));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            Parcelable.Creator<a> creator = a.CREATOR;
            arrayList.add(new wb.o(new wb.h(a.C0082a.b(obtainStyledAttributes.getString(15)).a())));
        }
        if (obtainStyledAttributes.getBoolean(23, false)) {
            arrayList.add(new wb.j());
        }
        if (obtainStyledAttributes.getBoolean(16, false)) {
            arrayList.add(new wb.i());
        }
        y mVar = !arrayList.isEmpty() ? new wb.m((y[]) arrayList.toArray(new y[0])) : new wb.i();
        ArrayList arrayList2 = new ArrayList(3);
        if (obtainStyledAttributes.hasValue(39)) {
            kVar2 = kVar3;
            arrayList2.add(new wb.o(new wb.f(obtainStyledAttributes.getInteger(39, 0))));
        } else {
            kVar2 = kVar3;
        }
        if (obtainStyledAttributes.hasValue(36)) {
            arrayList2.add(new wb.o(new wb.e(obtainStyledAttributes.getInteger(36, 0))));
        }
        if (obtainStyledAttributes.hasValue(38)) {
            arrayList2.add(new wb.o(new com.google.android.gms.internal.p000firebaseauthapi.o(obtainStyledAttributes.getInteger(38, 0))));
        }
        if (obtainStyledAttributes.hasValue(35)) {
            arrayList2.add(new wb.o(new wb.g(obtainStyledAttributes.getInteger(35, 0))));
        }
        if (obtainStyledAttributes.hasValue(37)) {
            arrayList2.add(new wb.o(new wb.l(obtainStyledAttributes.getInteger(37, 0))));
        }
        if (obtainStyledAttributes.hasValue(34)) {
            arrayList2.add(new wb.o(new wb.k(obtainStyledAttributes.getInteger(34, 0))));
        }
        if (obtainStyledAttributes.hasValue(32)) {
            Parcelable.Creator<a> creator2 = a.CREATOR;
            arrayList2.add(new wb.o(new wb.h(a.C0082a.b(obtainStyledAttributes.getString(32)).a())));
        }
        if (obtainStyledAttributes.getBoolean(40, false)) {
            arrayList2.add(new wb.j());
        }
        if (obtainStyledAttributes.getBoolean(33, false)) {
            arrayList2.add(new wb.i());
        }
        y mVar2 = !arrayList2.isEmpty() ? new wb.m((y[]) arrayList2.toArray(new y[0])) : new wb.i();
        f a10 = f.a(obtainStyledAttributes.getInteger(10, 0));
        f a11 = f.a(obtainStyledAttributes.getInteger(6, 0));
        f a12 = f.a(obtainStyledAttributes.getInteger(7, 0));
        f a13 = f.a(obtainStyledAttributes.getInteger(8, 0));
        f a14 = f.a(obtainStyledAttributes.getInteger(9, 0));
        obtainStyledAttributes.recycle();
        a aVar2 = new a();
        this.f6422a = aVar2;
        this.I = new g(aVar2);
        this.M = new Handler(Looper.getMainLooper());
        this.N = q.a("FrameProcessorsWorker");
        this.f6425d = new vb.e(context2);
        this.f6426e = new vb.f(context2);
        this.B = new j(context2);
        this.C = new g(context2);
        addView(this.f6425d);
        addView(this.f6426e);
        addView(this.B);
        addView(this.C);
        setPlaySounds(z10);
        setFacing(cVar);
        setFlash(dVar);
        setMode(iVar);
        setWhiteBalance(lVar);
        setGrid(gVar);
        setGridColor(color);
        setHdr(hVar);
        setAudio(aVar);
        setAudioBitRate(integer12);
        setPictureSize(mVar);
        setVideoSize(mVar2);
        setVideoCodec(kVar2);
        setVideoMaxSize(j10);
        setVideoMaxDuration(i21);
        setVideoBitRate(integer11);
        setAutoFocusResetDelay(integer13);
        f(e.TAP, a10);
        f(e.LONG_TAP, a11);
        f(e.PINCH, a12);
        f(e.SCROLL_HORIZONTAL, a13);
        f(e.SCROLL_VERTICAL, a14);
        if (!isInEditMode()) {
            this.H = new d(context2, this.f6422a);
        }
    }

    @SuppressLint({"NewApi"})
    public final boolean a(tb.a aVar) {
        e(aVar);
        Context context = getContext();
        boolean z10 = rb.a.V.F == 2 && aVar == tb.a.ON;
        boolean z11 = context.checkSelfPermission("android.permission.CAMERA") != 0;
        boolean z12 = z10 && context.checkSelfPermission("android.permission.RECORD_AUDIO") != 0;
        if (((context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) && context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) && context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
            context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
        }
        if (!z11 && !z12) {
            return true;
        }
        Activity activity = null;
        for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add("android.permission.CAMERA");
        }
        if (z12) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (activity != null) {
            activity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 16);
        }
        return false;
    }

    @x(j.a.ON_PAUSE)
    public void close() {
        g gVar = this.I;
        gVar.getClass();
        h.U.a(1, "Stop:", "posting runnable. State:", gVar.l());
        gVar.f6479c.b(new i(gVar));
        vb.a aVar = this.G;
        if (aVar != null) {
            aVar.i();
        }
    }

    @x(j.a.ON_DESTROY)
    public void destroy() {
        this.f6423b.clear();
        this.f6424c.clear();
        this.I.c();
        vb.a aVar = this.G;
        if (aVar != null) {
            aVar.h();
        }
    }

    public final void e(tb.a aVar) {
        if (aVar == tb.a.ON) {
            try {
                String[] strArr = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 4096).requestedPermissions;
                int length = strArr.length;
                int i8 = 0;
                while (i8 < length) {
                    if (!strArr[i8].equals("android.permission.RECORD_AUDIO")) {
                        i8++;
                    } else {
                        return;
                    }
                }
                Log.e("Permission error:", "When audio is enabled (Audio.ON), the RECORD_AUDIO permission should be added to the app manifest file.");
                throw new IllegalStateException(wb.a.f16661b);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("CameraView", "checkPermissionsManifestOrThrow >> " + e10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(tb.e r5, tb.f r6) {
        /*
            r4 = this;
            tb.f r0 = tb.f.NONE
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L_0x0011
            java.util.List<tb.f> r3 = r5.f15542a
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r3 = r1
            goto L_0x0015
        L_0x0011:
            r5.getClass()
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 == 0) goto L_0x0068
            java.util.HashMap<tb.e, tb.f> r3 = r4.E
            r3.put(r5, r6)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x005a
            if (r5 == r2) goto L_0x0044
            r6 = 2
            if (r5 == r6) goto L_0x0044
            r6 = 3
            if (r5 == r6) goto L_0x002e
            r6 = 4
            if (r5 == r6) goto L_0x002e
            goto L_0x0067
        L_0x002e:
            vb.g r5 = r4.C
            tb.e r6 = tb.e.SCROLL_HORIZONTAL
            java.lang.Object r6 = r3.get(r6)
            if (r6 != r0) goto L_0x0040
            tb.e r6 = tb.e.SCROLL_VERTICAL
            java.lang.Object r6 = r3.get(r6)
            if (r6 == r0) goto L_0x0041
        L_0x0040:
            r1 = r2
        L_0x0041:
            r5.f16362a = r1
            goto L_0x0067
        L_0x0044:
            vb.j r5 = r4.B
            tb.e r6 = tb.e.TAP
            java.lang.Object r6 = r3.get(r6)
            if (r6 != r0) goto L_0x0056
            tb.e r6 = tb.e.LONG_TAP
            java.lang.Object r6 = r3.get(r6)
            if (r6 == r0) goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            r5.f16362a = r1
            goto L_0x0067
        L_0x005a:
            vb.f r5 = r4.f6426e
            tb.e r6 = tb.e.PINCH
            java.lang.Object r6 = r3.get(r6)
            if (r6 == r0) goto L_0x0065
            r1 = r2
        L_0x0065:
            r5.f16362a = r1
        L_0x0067:
            return
        L_0x0068:
            r4.f(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.CameraView.f(tb.e, tb.f):void");
    }

    public final void g(vb.b bVar, j jVar) {
        int i8;
        int i10;
        e gestureType = bVar.getGestureType();
        PointF[] points = bVar.getPoints();
        int ordinal = this.E.get(gestureType).ordinal();
        if (ordinal == 1 || ordinal == 2) {
            g gVar = this.I;
            PointF pointF = points[0];
            vb.a aVar = gVar.f6478b;
            if (aVar != null) {
                if (aVar.f16355b > 0 && aVar.f16356c > 0) {
                    i10 = aVar.f16361h.getWidth();
                    i8 = gVar.f6478b.f16361h.getHeight();
                    gVar.z((u.b) null, true, new f(gVar, pointF, i10, i8, gestureType));
                }
            }
            i10 = 0;
            i8 = 0;
            gVar.z((u.b) null, true, new f(gVar, pointF, i10, i8, gestureType));
        } else if (ordinal == 3) {
            g gVar2 = this.I;
            gVar2.getClass();
            g.Y.a(0, "takePicture: scheduling");
            gVar2.z((u.b) null, true, new b(gVar2));
        } else if (ordinal == 4) {
            float f10 = this.I.f6488l;
            float c3 = bVar.c(f10, 0.0f, 1.0f);
            if (c3 != f10) {
                g gVar3 = this.I;
                gVar3.getClass();
                gVar3.z(gVar3.H, true, new d(gVar3, c3, true, points));
            }
        } else if (ordinal == 5) {
            float f11 = this.I.m;
            float f12 = jVar.f6518k;
            float f13 = jVar.f6519l;
            float c10 = bVar.c(f11, f12, f13);
            if (c10 != f11) {
                g gVar4 = this.I;
                gVar4.getClass();
                gVar4.z(gVar4.I, true, new e(gVar4, c10, true, new float[]{f12, f13}, points));
            }
        }
    }

    public tb.a getAudio() {
        return this.I.f6487k;
    }

    public int getAudioBitRate() {
        return this.I.f6499x;
    }

    public long getAutoFocusResetDelay() {
        return this.I.B;
    }

    public j getCameraOptions() {
        return this.I.f6491p;
    }

    public float getExposureCorrection() {
        return this.I.m;
    }

    public c getFacing() {
        return this.I.f6480d;
    }

    public tb.d getFlash() {
        return this.I.f6481e;
    }

    public tb.g getGrid() {
        return this.f6425d.getGridMode();
    }

    public int getGridColor() {
        return this.f6425d.getGridColor();
    }

    public h getHdr() {
        return this.I.f6485i;
    }

    public Location getLocation() {
        return this.I.f6486j;
    }

    public i getMode() {
        return this.I.f6484h;
    }

    public ub.x getPictureSize() {
        return this.I.e();
    }

    public boolean getPlaySounds() {
        return this.D;
    }

    public ub.x getSnapshotSize() {
        Rect rect;
        int i8;
        ub.x xVar;
        ub.x xVar2 = null;
        if (!(getWidth() == 0 || getHeight() == 0)) {
            g gVar = this.I;
            ub.x f10 = gVar.f();
            if (f10 != null) {
                boolean d10 = gVar.d(1, 1);
                int i10 = d10 ? gVar.G : gVar.F;
                int i11 = d10 ? gVar.F : gVar.G;
                Parcelable.Creator<a> creator = a.CREATOR;
                int i12 = f10.f15991a;
                int i13 = f10.f15992b;
                float a10 = a.C0082a.a(i12, i13).a();
                if (a.C0082a.a(i10, i11).a() >= a10) {
                    int min = Math.min(i13, i11);
                    xVar = new ub.x((int) Math.floor((double) (((float) min) * a10)), min);
                } else {
                    int min2 = Math.min(i12, i10);
                    xVar = new ub.x(min2, (int) Math.floor((double) (((float) min2) / a10)));
                }
                xVar2 = xVar;
            }
            Parcelable.Creator<a> creator2 = a.CREATOR;
            a a11 = a.C0082a.a(getWidth(), getHeight());
            int i14 = xVar2.f15991a;
            int i15 = xVar2.f15992b;
            int i16 = i15;
            int i17 = i14;
            while (i16 != 0) {
                int i18 = i17 % i16;
                i17 = i16;
                i16 = i18;
            }
            int i19 = 0;
            if (a11.f6450a == i14 / i17 && a11.f6451b == i15 / i17) {
                rect = new Rect(0, 0, i14, i15);
            } else {
                if (a.C0082a.a(i14, i15).a() > a11.a()) {
                    int a12 = (int) (a11.a() * ((float) i15));
                    int i20 = (i14 - a12) / 2;
                    i14 = a12;
                    i8 = 0;
                    i19 = i20;
                } else {
                    int a13 = (int) (((float) i14) / a11.a());
                    int i21 = (i15 - a13) / 2;
                    i15 = a13;
                    i8 = i21;
                }
                rect = new Rect(i19, i8, i14 + i19, i15 + i8);
            }
            xVar2 = new ub.x(rect.width(), rect.height());
            if (this.I.d(1, 2)) {
                return xVar2.a();
            }
        }
        return xVar2;
    }

    public int getVideoBitRate() {
        return this.I.f6498w;
    }

    public k getVideoCodec() {
        return this.I.f6483g;
    }

    public int getVideoMaxDuration() {
        return this.I.f6497v;
    }

    public long getVideoMaxSize() {
        return this.I.f6496u;
    }

    public ub.x getVideoSize() {
        g gVar = this.I;
        if (gVar.f6500y == null || gVar.f6484h == i.PICTURE) {
            return null;
        }
        boolean d10 = gVar.d(0, 2);
        ub.x xVar = gVar.f6500y;
        return d10 ? xVar.a() : xVar;
    }

    public l getWhiteBalance() {
        return this.I.f6482f;
    }

    public float getZoom() {
        return this.I.f6488l;
    }

    public final void h() {
        if (isEnabled()) {
            vb.a aVar = this.G;
            if (aVar != null) {
                aVar.j();
            }
            if (a(getAudio())) {
                this.H.a(getContext());
                g gVar = this.I;
                gVar.S = this.H.f16668d;
                gVar.m();
            }
        }
    }

    public final void onAttachedToWindow() {
        vb.a aVar;
        super.onAttachedToWindow();
        if (this.G == null) {
            Context context = getContext();
            O.a(2, "preview:", "isHardwareAccelerated:", Boolean.valueOf(isHardwareAccelerated()));
            int ordinal = this.F.ordinal();
            if (ordinal == 0) {
                aVar = new vb.i(context, this);
            } else if (ordinal == 1 && isHardwareAccelerated()) {
                aVar = new vb.m(context, this);
            } else {
                this.F = tb.j.GL_SURFACE;
                aVar = new vb.d(context, this);
            }
            this.G = aVar;
            g gVar = this.I;
            gVar.f6478b = aVar;
            aVar.f16360g = gVar;
            if (!(aVar.f16355b == 0 && aVar.f16356c == 0)) {
                gVar.y();
            }
        }
        if (!isInEditMode()) {
            this.H.a(getContext());
        }
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            d dVar = this.H;
            dVar.f16665a.disable();
            dVar.f16668d = -1;
            dVar.f16667c = -1;
        }
        super.onDetachedFromWindow();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onMeasure(int i8, int i10) {
        ub.x f10 = this.I.f();
        wb.a aVar = O;
        if (f10 == null) {
            aVar.a(2, "onMeasure:", "surface is not ready. Calling default behavior.");
            super.onMeasure(i8, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i10);
        float f11 = (float) f10.f15991a;
        float f12 = (float) f10.f15992b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.G.l()) {
            if (mode == 1073741824) {
                mode = Integer.MIN_VALUE;
            }
            if (mode2 == 1073741824) {
                mode2 = Integer.MIN_VALUE;
            }
        } else {
            if (mode == Integer.MIN_VALUE && layoutParams.width == -1) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE && layoutParams.height == -1) {
                mode2 = 1073741824;
            }
        }
        Object[] objArr = new Object[3];
        objArr[0] = "onMeasure:";
        objArr[1] = "requested dimensions are";
        StringBuilder b10 = a1.b("(", size, "[");
        b10.append(mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? null : "EXACTLY" : "UNSPECIFIED" : "AT_MOST");
        b10.append("]x");
        b10.append(size2);
        b10.append("[");
        objArr[2] = androidx.activity.g.a(b10, mode2 != Integer.MIN_VALUE ? mode2 != 0 ? mode2 != 1073741824 ? null : "EXACTLY" : "UNSPECIFIED" : "AT_MOST", "])");
        aVar.a(1, objArr);
        aVar.a(1, "onMeasure:", "previewSize is", "(" + f11 + "x" + f12 + ")");
        if (mode == 1073741824 && mode2 == 1073741824) {
            aVar.a(2, "onMeasure:", "both are MATCH_PARENT or fixed value. We adapt.", "This means CROP_CENTER.", androidx.activity.result.d.b("(", size, "x", size2, ")"));
            super.onMeasure(i8, i10);
        } else if (mode == 0 && mode2 == 0) {
            aVar.a(1, "onMeasure:", "both are completely free.", "We respect that and extend to the whole preview size.", "(" + f11 + "x" + f12 + ")");
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824));
        } else {
            float f13 = f12 / f11;
            if (mode == 0 || mode2 == 0) {
                if (mode == 0) {
                    size = (int) (((float) size2) / f13);
                } else {
                    size2 = (int) (((float) size) * f13);
                }
                aVar.a(1, "onMeasure:", "one dimension was free, we adapted it to fit the aspect ratio.", androidx.activity.result.d.b("(", size, "x", size2, ")"));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (mode == 1073741824 || mode2 == 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min((int) (((float) size2) / f13), size);
                } else {
                    size2 = Math.min((int) (((float) size) * f13), size2);
                }
                aVar.a(1, "onMeasure:", "one dimension was EXACTLY, another AT_MOST.", "We have TRIED to fit the aspect ratio, but it's not guaranteed.", androidx.activity.result.d.b("(", size, "x", size2, ")"));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                float f14 = (float) size2;
                float f15 = (float) size;
                if (f14 / f15 >= f13) {
                    size2 = (int) (f15 * f13);
                } else {
                    size = (int) (f14 / f13);
                }
                aVar.a(1, "onMeasure:", "both dimension were AT_MOST.", "We fit the preview aspect ratio.", androidx.activity.result.d.b("(", size, "x", size2, ")"));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g gVar = this.I;
        if (!(gVar.D >= 2)) {
            return true;
        }
        j jVar = gVar.f6491p;
        boolean onTouchEvent = this.f6426e.onTouchEvent(motionEvent);
        wb.a aVar = O;
        if (onTouchEvent) {
            aVar.a(1, "onTouchEvent", "pinch!");
            g(this.f6426e, jVar);
        } else if (this.C.onTouchEvent(motionEvent)) {
            aVar.a(1, "onTouchEvent", "scroll!");
            g(this.C, jVar);
        } else if (this.B.onTouchEvent(motionEvent)) {
            aVar.a(1, "onTouchEvent", "tap!");
            g(this.B, jVar);
        }
        return true;
    }

    public void set(tb.b bVar) {
        if (bVar instanceof tb.a) {
            setAudio((tb.a) bVar);
        } else if (bVar instanceof c) {
            setFacing((c) bVar);
        } else if (bVar instanceof tb.d) {
            setFlash((tb.d) bVar);
        } else if (bVar instanceof tb.g) {
            setGrid((tb.g) bVar);
        } else if (bVar instanceof h) {
            setHdr((h) bVar);
        } else if (bVar instanceof i) {
            setMode((i) bVar);
        } else if (bVar instanceof l) {
            setWhiteBalance((l) bVar);
        } else if (bVar instanceof k) {
            setVideoCodec((k) bVar);
        } else if (bVar instanceof tb.j) {
            setPreview((tb.j) bVar);
        }
    }

    public void setAudio(tb.a aVar) {
        if (aVar != getAudio()) {
            if (!(this.I.D == 0)) {
                if (a(aVar)) {
                    g gVar = this.I;
                    if (gVar.f6487k != aVar) {
                        if (gVar.f6495t != null) {
                            g.Y.a(2, "Audio setting was changed while recording. Changes will take place starting from next video");
                        }
                        gVar.f6487k = aVar;
                        return;
                    }
                    return;
                }
                close();
                return;
            }
        }
        g gVar2 = this.I;
        if (gVar2.f6487k != aVar) {
            if (gVar2.f6495t != null) {
                g.Y.a(2, "Audio setting was changed while recording. Changes will take place starting from next video");
            }
            gVar2.f6487k = aVar;
        }
    }

    public void setAudioBitRate(int i8) {
        this.I.f6499x = i8;
    }

    public void setAutoFocusResetDelay(long j10) {
        this.I.B = j10;
    }

    public void setExposureCorrection(float f10) {
        j cameraOptions = getCameraOptions();
        if (cameraOptions != null) {
            float f11 = cameraOptions.f6518k;
            if (f10 < f11) {
                f10 = f11;
            }
            float f12 = cameraOptions.f6519l;
            float f13 = f10 > f12 ? f12 : f10;
            float[] fArr = {f11, f12};
            g gVar = this.I;
            gVar.getClass();
            gVar.z(gVar.I, true, new e(gVar, f13, false, fArr, (PointF[]) null));
        }
    }

    public void setFacing(c cVar) {
        g gVar = this.I;
        c cVar2 = gVar.f6480d;
        if (cVar != cVar2) {
            gVar.f6480d = cVar;
            gVar.z((u.b) null, true, new ub.k(gVar, cVar2));
        }
    }

    public void setFlash(tb.d dVar) {
        g gVar = this.I;
        tb.d dVar2 = gVar.f6481e;
        gVar.f6481e = dVar;
        gVar.z(gVar.J, true, new ub.d(gVar, dVar2));
    }

    public void setGrid(tb.g gVar) {
        this.f6425d.setGridMode(gVar);
    }

    public void setGridColor(int i8) {
        this.f6425d.setGridColor(i8);
    }

    public void setHdr(h hVar) {
        g gVar = this.I;
        h hVar2 = gVar.f6485i;
        gVar.f6485i = hVar;
        gVar.z(gVar.L, true, new ub.c(gVar, hVar2));
    }

    public void setLifecycleOwner(p pVar) {
        androidx.lifecycle.j jVar = this.K;
        if (jVar != null) {
            jVar.c(this);
        }
        androidx.lifecycle.j b10 = pVar.b();
        this.K = b10;
        b10.a(this);
    }

    public void setLocation(Location location) {
        g gVar = this.I;
        Location location2 = gVar.f6486j;
        gVar.f6486j = location;
        gVar.z(gVar.M, true, new ub.j(gVar, location2));
    }

    public void setMode(i iVar) {
        g gVar = this.I;
        if (iVar != gVar.f6484h) {
            gVar.f6484h = iVar;
            gVar.z((u.b) null, true, new ub.i(gVar));
        }
    }

    public void setPictureSize(y yVar) {
        this.I.Q = yVar;
    }

    public void setPlaySounds(boolean z10) {
        this.D = z10;
        g gVar = this.I;
        boolean z11 = gVar.f6489n;
        gVar.f6489n = z10;
        gVar.z(gVar.O, true, new ub.f(gVar, z11));
    }

    public void setPreview(tb.j jVar) {
        this.F = jVar;
    }

    public void setPreviewStreamSize(y yVar) {
        this.I.P = yVar;
    }

    public void setSnapshotMaxHeight(int i8) {
        this.I.G = i8;
    }

    public void setSnapshotMaxWidth(int i8) {
        this.I.F = i8;
    }

    public void setVideoBitRate(int i8) {
        this.I.f6498w = i8;
    }

    public void setVideoCodec(k kVar) {
        this.I.f6483g = kVar;
    }

    public void setVideoMaxDuration(int i8) {
        this.I.f6497v = i8;
    }

    public void setVideoMaxSize(long j10) {
        this.I.f6496u = j10;
    }

    public void setVideoSize(y yVar) {
        this.I.R = yVar;
    }

    public void setWhiteBalance(l lVar) {
        g gVar = this.I;
        l lVar2 = gVar.f6482f;
        gVar.f6482f = lVar;
        gVar.z(gVar.K, true, new ub.l(gVar, lVar2));
    }

    public void setZoom(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        g gVar = this.I;
        gVar.getClass();
        gVar.z(gVar.H, true, new d(gVar, f10, false, (PointF[]) null));
    }
}
