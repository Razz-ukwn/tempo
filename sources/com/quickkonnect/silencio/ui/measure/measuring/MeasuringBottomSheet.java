package com.quickkonnect.silencio.ui.measure.measuring;

import ag.g0;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.DashPathEffect;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.z0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.VoiceRecordingSamples;
import com.quickkonnect.silencio.service.measuring.MeasuringService;
import gf.q;
import gf.s;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jf.f;
import kotlinx.coroutines.flow.y0;
import md.a0;
import md.b0;
import md.c0;
import md.f0;
import md.h0;
import md.r;
import md.u;
import md.v;
import md.x;
import md.x0;
import md.y;
import md.z;
import nc.i0;
import rf.p;
import x2.a;
import zf.o;

public final class MeasuringBottomSheet extends md.a {

    /* renamed from: h1  reason: collision with root package name */
    public static final /* synthetic */ int f6988h1 = 0;
    public i0 Q0;
    public float R0;
    public final k0 S0;
    public LocationManager T0;
    public androidx.activity.result.c<String[]> U0;
    public androidx.appcompat.app.b V0;
    public String W0 = "";
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f6989a1;

    /* renamed from: b1  reason: collision with root package name */
    public AudioManager f6990b1;

    /* renamed from: c1  reason: collision with root package name */
    public AudioFocusRequest f6991c1;

    /* renamed from: d1  reason: collision with root package name */
    public k7.d f6992d1;

    /* renamed from: e1  reason: collision with root package name */
    public final md.d f6993e1;

    /* renamed from: f1  reason: collision with root package name */
    public final d f6994f1;

    /* renamed from: g1  reason: collision with root package name */
    public final a f6995g1;

    public static final class a extends n7.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f6996a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f6996a = measuringBottomSheet;
        }

        public final void a(LocationResult locationResult) {
            sf.j.f(locationResult, "result");
            List list = locationResult.f5660a;
            sf.j.e(list, "result.locations");
            Location location = (Location) q.C0(list);
            if (location != null) {
                new Date();
                int i8 = MeasuringBottomSheet.f6988h1;
                MeasuringBottomSheet measuringBottomSheet = this.f6996a;
                measuringBottomSheet.getClass();
                measuringBottomSheet.B0().j(String.valueOf(location.getLongitude()), String.valueOf(location.getLatitude()), location.getAccuracy());
            }
        }
    }

    public static final class b implements androidx.activity.result.b<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f6997a;

        public b(MeasuringBottomSheet measuringBottomSheet) {
            this.f6997a = measuringBottomSheet;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r12) {
            /*
                r11 = this;
                java.util.Map r12 = (java.util.Map) r12
                bh.a$a r0 = bh.a.f3654a
                java.lang.String r1 = r12.toString()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.b(r1, r3)
                boolean r0 = r12.isEmpty()
                if (r0 == 0) goto L_0x0015
                goto L_0x0036
            L_0x0015:
                java.util.Set r12 = r12.entrySet()
                java.util.Iterator r12 = r12.iterator()
            L_0x001d:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0036
                java.lang.Object r0 = r12.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x001d
                goto L_0x0037
            L_0x0036:
                r2 = 1
            L_0x0037:
                com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet r3 = r11.f6997a
                if (r2 == 0) goto L_0x0042
                int r12 = com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.f6988h1
                r3.E0()
                goto L_0x00fd
            L_0x0042:
                int r12 = com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.f6988h1
                java.lang.String r12 = "android.permission.ACCESS_COARSE_LOCATION"
                boolean r12 = r3.l0(r12)
                if (r12 == 0) goto L_0x0064
                java.lang.String r4 = "Permission Required"
                java.lang.String r5 = "Location Permission is required for this app."
                java.lang.String r6 = "OK"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.l0 r9 = new md.l0
                r9.<init>(r3)
                md.m0 r10 = new md.m0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00fd
            L_0x0064:
                java.lang.String r12 = "android.permission.ACCESS_FINE_LOCATION"
                boolean r12 = r3.l0(r12)
                if (r12 == 0) goto L_0x0084
                java.lang.String r4 = "Permission Required"
                java.lang.String r5 = "Location Permission is required for this app."
                java.lang.String r6 = "OK"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.n0 r9 = new md.n0
                r9.<init>(r3)
                md.o0 r10 = new md.o0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00fd
            L_0x0084:
                java.lang.String r12 = "android.permission.RECORD_AUDIO"
                boolean r12 = r3.l0(r12)
                if (r12 == 0) goto L_0x00a3
                java.lang.String r4 = "Silencio"
                java.lang.String r5 = "\"Silencio\" Would like to access the microphone - It is used to measure loudness in dBA"
                java.lang.String r6 = "OK"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.p0 r9 = new md.p0
                r9.<init>(r3)
                md.q0 r10 = new md.q0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00fd
            L_0x00a3:
                int r12 = android.os.Build.VERSION.SDK_INT
                r0 = 29
                if (r12 > r0) goto L_0x00e7
                java.lang.String r12 = "android.permission.READ_EXTERNAL_STORAGE"
                boolean r12 = r3.l0(r12)
                if (r12 == 0) goto L_0x00c8
                java.lang.String r4 = "Permission Required"
                java.lang.String r5 = "Storage Permission is required for this app."
                java.lang.String r6 = "OK"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.r0 r9 = new md.r0
                r9.<init>(r3)
                md.s0 r10 = new md.s0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00fd
            L_0x00c8:
                java.lang.String r12 = "android.permission.WRITE_EXTERNAL_STORAGE"
                boolean r12 = r3.l0(r12)
                if (r12 == 0) goto L_0x00e7
                java.lang.String r4 = "Permission Required"
                java.lang.String r5 = "Storage Permission is required for this app."
                java.lang.String r6 = "OK"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.t0 r9 = new md.t0
                r9.<init>(r3)
                md.i0 r10 = new md.i0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00fd
            L_0x00e7:
                java.lang.String r4 = "Permission Required"
                java.lang.String r5 = "Mic, Location & Storage permissions are required for this app."
                java.lang.String r6 = "Open Settings"
                java.lang.String r7 = "Cancel"
                r8 = 1
                md.j0 r9 = new md.j0
                r9.<init>(r3)
                md.k0 r10 = new md.k0
                r10.<init>(r3)
                zd.d.d(r3, r4, r5, r6, r7, r8, r9, r10)
            L_0x00fd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.b.a(java.lang.Object):void");
        }
    }

    @lf.e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$onResume$1", f = "MeasuringBottomSheet.kt", l = {228}, m = "invokeSuspend")
    public static final class c extends lf.i implements p<g0, jf.d<? super ff.m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6998a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f6999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MeasuringBottomSheet measuringBottomSheet, jf.d<? super c> dVar) {
            super(2, dVar);
            this.f6999b = measuringBottomSheet;
        }

        public final jf.d<ff.m> create(Object obj, jf.d<?> dVar) {
            return new c(this.f6999b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((g0) obj, (jf.d) obj2)).invokeSuspend(ff.m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f6998a;
            if (i8 == 0) {
                cb.b.J(obj);
                this.f6998a = 1;
                if (cb.d.x(250, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MeasuringBottomSheet measuringBottomSheet = this.f6999b;
            MeasuringBottomSheet.u0(measuringBottomSheet);
            if (measuringBottomSheet.Z0 || measuringBottomSheet.f6989a1) {
                measuringBottomSheet.B0().getClass();
                measuringBottomSheet.D0();
            }
            return ff.m.f8717a;
        }
    }

    public static final class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f7000a;

        public d(MeasuringBottomSheet measuringBottomSheet) {
            this.f7000a = measuringBottomSheet;
        }

        public final void onReceive(Context context, Intent intent) {
            sf.j.f(context, "context");
            sf.j.f(intent, "intent");
            double doubleExtra = intent.getDoubleExtra("DB", 0.0d);
            intent.getDoubleExtra("SPEED", 0.0d);
            boolean booleanExtra = intent.getBooleanExtra("SPEED_CAP_REACHED", false);
            MeasuringBottomSheet measuringBottomSheet = this.f7000a;
            measuringBottomSheet.f6989a1 = booleanExtra;
            if (doubleExtra < 20.0d && doubleExtra > 0.0d) {
                doubleExtra = 20.0d;
            }
            List list = s.f8978a;
            if (Build.VERSION.SDK_INT >= 33) {
                VoiceRecordingSamples[] voiceRecordingSamplesArr = (VoiceRecordingSamples[]) intent.getParcelableArrayExtra("POINTS", VoiceRecordingSamples.class);
                if (voiceRecordingSamplesArr != null) {
                    list = gf.l.f0(voiceRecordingSamplesArr);
                }
            } else {
                Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("POINTS");
                if (parcelableArrayExtra != null) {
                    list = gf.l.f0(parcelableArrayExtra);
                }
            }
            measuringBottomSheet.B0().i((float) doubleExtra, list);
            if (measuringBottomSheet.f6989a1) {
                measuringBottomSheet.F0();
                measuringBottomSheet.B0().getClass();
                measuringBottomSheet.D0();
            }
        }
    }

    public static final class e implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.l f7001a;

        public e(rf.l lVar) {
            this.f7001a = lVar;
        }

        public final ff.a<?> a() {
            return this.f7001a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7001a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return sf.j.a(this.f7001a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7001a.hashCode();
        }
    }

    public static final class f extends sf.k implements rf.a<androidx.fragment.app.p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f7002a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.p pVar) {
            super(0);
            this.f7002a = pVar;
        }

        public final Object d() {
            return this.f7002a;
        }
    }

    public static final class g extends sf.k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7003a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f7003a = fVar;
        }

        public final Object d() {
            return (p0) this.f7003a.d();
        }
    }

    public static final class h extends sf.k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7004a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ff.d dVar) {
            super(0);
            this.f7004a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7004a, "owner.viewModelStore");
        }
    }

    public static final class i extends sf.k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ff.d dVar) {
            super(0);
            this.f7005a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7005a);
            x2.a aVar = null;
            androidx.lifecycle.h hVar = b10 instanceof androidx.lifecycle.h ? (androidx.lifecycle.h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class j extends sf.k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f7006a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.p pVar, ff.d dVar) {
            super(0);
            this.f7006a = pVar;
            this.f7007b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7007b);
            androidx.lifecycle.h hVar = b10 instanceof androidx.lifecycle.h ? (androidx.lifecycle.h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7006a.k();
            }
            sf.j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public static final class k extends sf.k implements rf.l<Location, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f7008a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(MeasuringBottomSheet measuringBottomSheet) {
            super(1);
            this.f7008a = measuringBottomSheet;
        }

        public final Object invoke(Object obj) {
            Location location = (Location) obj;
            int i8 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f7008a;
            measuringBottomSheet.getClass();
            if (!(location == null || measuringBottomSheet.Q0 == null)) {
                Intent intent = new Intent(measuringBottomSheet.d0().getApplicationContext(), MeasuringService.class);
                intent.setAction("ACTION_START");
                measuringBottomSheet.e0().startService(intent);
                measuringBottomSheet.Y0 = true;
                measuringBottomSheet.B0().j(String.valueOf(location.getLongitude()), String.valueOf(location.getLatitude()), location.getAccuracy());
                MeasuringViewModel B0 = measuringBottomSheet.B0();
                List P = cb.d.P(String.valueOf(location.getLongitude()), String.valueOf(location.getLatitude()));
                B0.getClass();
                cb.b.D(gc.b.o(B0), (f.b) null, 0, new x0(B0, P, (jf.d<? super x0>) null), 3);
            }
            return ff.m.f8717a;
        }
    }

    public static final class l extends sf.k implements rf.a<ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f7009a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(MeasuringBottomSheet measuringBottomSheet) {
            super(0);
            this.f7009a = measuringBottomSheet;
        }

        public final Object d() {
            int i8 = MeasuringBottomSheet.f6988h1;
            this.f7009a.C0();
            return ff.m.f8717a;
        }
    }

    public static final class m extends sf.k implements rf.a<ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f7010a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(MeasuringBottomSheet measuringBottomSheet) {
            super(0);
            this.f7010a = measuringBottomSheet;
        }

        public final Object d() {
            int i8 = MeasuringBottomSheet.f6988h1;
            this.f7010a.C0();
            return ff.m.f8717a;
        }
    }

    public MeasuringBottomSheet() {
        ff.d w10 = b7.a.w(new g(new f(this)));
        this.S0 = z0.e(this, sf.w.a(MeasuringViewModel.class), new h(w10), new i(w10), new j(this, w10));
        new Date();
        LocationRequest.a aVar = new LocationRequest.a(100, 500);
        aVar.b(2);
        aVar.c(500);
        aVar.f5651g = 0.0f;
        ag.m.z(100);
        aVar.f5645a = 100;
        aVar.f5652h = true;
        aVar.a();
        this.f6993e1 = new md.d(this);
        this.f6994f1 = new d(this);
        this.f6995g1 = new a(this);
    }

    public static final void u0(MeasuringBottomSheet measuringBottomSheet) {
        if (measuringBottomSheet.X0) {
            Integer p02 = zf.i.p0(o.a1(2, (String) measuringBottomSheet.B0().f7018o.getValue()));
            if ((p02 != null ? p02.intValue() : 0) >= 20) {
                y0 y0Var = measuringBottomSheet.B0().f7018o;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{20}, 1));
                sf.j.e(format, "format(format, *args)");
                y0Var.setValue(format.concat(":00"));
            }
            measuringBottomSheet.F0();
            measuringBottomSheet.B0().getClass();
            measuringBottomSheet.D0();
        }
    }

    public final void A0() {
        if (Build.VERSION.SDK_INT > 29) {
            if (t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION") + t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") + t1.a.a(e0(), "android.permission.RECORD_AUDIO") == 0) {
                E0();
                return;
            }
            try {
                androidx.activity.result.c<String[]> cVar = this.U0;
                if (cVar != null) {
                    cVar.a(new String[]{"android.permission.RECORD_AUDIO", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
                } else {
                    sf.j.l("requestPermissions");
                    throw null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            if (t1.a.a(e0(), "android.permission.WRITE_EXTERNAL_STORAGE") + t1.a.a(e0(), "android.permission.READ_EXTERNAL_STORAGE") + t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION") + t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") + t1.a.a(e0(), "android.permission.RECORD_AUDIO") == 0) {
                E0();
                return;
            }
            androidx.activity.result.c<String[]> cVar2 = this.U0;
            if (cVar2 != null) {
                cVar2.a(new String[]{"android.permission.RECORD_AUDIO", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
            } else {
                sf.j.l("requestPermissions");
                throw null;
            }
        }
    }

    public final MeasuringViewModel B0() {
        return (MeasuringViewModel) this.S0.getValue();
    }

    public final void C0() {
        try {
            ag.m.c(this).o();
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
    }

    public final void D0() {
        Window window;
        try {
            i0 i0Var = this.Q0;
            sf.j.c(i0Var);
            int width = i0Var.f11708e.getWidth();
            i0 i0Var2 = this.Q0;
            sf.j.c(i0Var2);
            Bitmap createBitmap = Bitmap.createBitmap(width, i0Var2.f11708e.getHeight(), Bitmap.Config.ARGB_8888);
            int[] iArr = new int[2];
            i0 i0Var3 = this.Q0;
            sf.j.c(i0Var3);
            i0Var3.f11708e.getLocationInWindow(iArr);
            Dialog dialog = this.G0;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                int i8 = iArr[0];
                int i10 = iArr[1];
                i0 i0Var4 = this.Q0;
                sf.j.c(i0Var4);
                int i11 = iArr[1];
                i0 i0Var5 = this.Q0;
                sf.j.c(i0Var5);
                PixelCopy.request(window, new Rect(i8, i10, i0Var4.f11708e.getWidth() + i8, i11 + i0Var5.f11708e.getHeight()), createBitmap, new md.c(this, createBitmap), new Handler(Looper.getMainLooper()));
            }
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
    }

    public final void E0() {
        Task d10;
        Task addOnSuccessListener;
        Context e02 = e0();
        int i8 = n7.d.f11604a;
        this.f6992d1 = new k7.d(e02);
        if (t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") == 0 || t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            k7.d dVar = this.f6992d1;
            if (!(dVar == null || (d10 = dVar.d()) == null || (addOnSuccessListener = d10.addOnSuccessListener(new j0.p(new k(this), 9))) == null)) {
                addOnSuccessListener.addOnFailureListener(new j0.f(10));
            }
            AudioManager audioManager = this.f6990b1;
            if (audioManager != null) {
                AudioFocusRequest audioFocusRequest = this.f6991c1;
                if (audioFocusRequest == null) {
                    sf.j.l("audioFocusRequest");
                    throw null;
                } else if (audioManager.requestAudioFocus(audioFocusRequest) != 1) {
                    bh.a.f3654a.b("===== not granted", new Object[0]);
                    C0();
                    String x10 = x(R.string.interrupted_by_microphone);
                    sf.j.e(x10, "getString(R.string.interrupted_by_microphone)");
                    String x11 = x(R.string.request_interrupted_by_microphone_message);
                    sf.j.e(x11, "getString(R.string.reque…ed_by_microphone_message)");
                    zd.d.d(this, x10, x11, "OK", (String) null, false, new l(this), new m(this));
                }
            } else {
                sf.j.l("audioManager");
                throw null;
            }
        }
    }

    public final void F0() {
        Intent intent = new Intent(d0().getApplicationContext(), MeasuringService.class);
        intent.setAction("ACTION_STOP");
        e0().startService(intent);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        sf.j.f(layoutInflater2, "inflater");
        WebView.enableSlowWholeDocumentDraw();
        View inflate = layoutInflater2.inflate(R.layout.bottom_sheet_measuring, viewGroup, false);
        int i8 = R.id.btn_close;
        ImageView imageView = (ImageView) cb.b.x(inflate, R.id.btn_close);
        if (imageView != null) {
            i8 = R.id.btn_measuring_stop;
            MaterialButton materialButton = (MaterialButton) cb.b.x(inflate, R.id.btn_measuring_stop);
            if (materialButton != null) {
                i8 = R.id.card_information_measuring;
                MaterialCardView materialCardView = (MaterialCardView) cb.b.x(inflate, R.id.card_information_measuring);
                if (materialCardView != null) {
                    i8 = R.id.cl_chart;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cb.b.x(inflate, R.id.cl_chart);
                    if (constraintLayout != null) {
                        i8 = R.id.dba_chart;
                        if (((TextView) cb.b.x(inflate, R.id.dba_chart)) != null) {
                            i8 = R.id.imageView22;
                            if (((ImageView) cb.b.x(inflate, R.id.imageView22)) != null) {
                                i8 = R.id.materialCardView;
                                if (((MaterialCardView) cb.b.x(inflate, R.id.materialCardView)) != null) {
                                    i8 = R.id.measuring_card_view;
                                    if (((MaterialCardView) cb.b.x(inflate, R.id.measuring_card_view)) != null) {
                                        i8 = R.id.measuring_chart;
                                        LineChart lineChart = (LineChart) cb.b.x(inflate, R.id.measuring_chart);
                                        if (lineChart != null) {
                                            i8 = R.id.measuring_meter_compose_view;
                                            ComposeView composeView = (ComposeView) cb.b.x(inflate, R.id.measuring_meter_compose_view);
                                            if (composeView != null) {
                                                i8 = R.id.textView35;
                                                if (((TextView) cb.b.x(inflate, R.id.textView35)) != null) {
                                                    i8 = R.id.textView38;
                                                    if (((TextView) cb.b.x(inflate, R.id.textView38)) != null) {
                                                        i8 = R.id.textView47;
                                                        if (((TextView) cb.b.x(inflate, R.id.textView47)) != null) {
                                                            i8 = R.id.textView48;
                                                            if (((TextView) cb.b.x(inflate, R.id.textView48)) != null) {
                                                                i8 = R.id.textView49;
                                                                if (((TextView) cb.b.x(inflate, R.id.textView49)) != null) {
                                                                    i8 = R.id.textView50;
                                                                    if (((TextView) cb.b.x(inflate, R.id.textView50)) != null) {
                                                                        i8 = R.id.time_chart_text;
                                                                        if (((TextView) cb.b.x(inflate, R.id.time_chart_text)) != null) {
                                                                            i8 = R.id.tv_dba;
                                                                            if (((TextView) cb.b.x(inflate, R.id.tv_dba)) != null) {
                                                                                i8 = R.id.tv_earned_coins;
                                                                                TextView textView = (TextView) cb.b.x(inflate, R.id.tv_earned_coins);
                                                                                if (textView != null) {
                                                                                    i8 = R.id.tv_measuring_avg_db;
                                                                                    TextView textView2 = (TextView) cb.b.x(inflate, R.id.tv_measuring_avg_db);
                                                                                    if (textView2 != null) {
                                                                                        i8 = R.id.tv_measuring_db;
                                                                                        TextView textView3 = (TextView) cb.b.x(inflate, R.id.tv_measuring_db);
                                                                                        if (textView3 != null) {
                                                                                            i8 = R.id.tv_measuring_max_db;
                                                                                            TextView textView4 = (TextView) cb.b.x(inflate, R.id.tv_measuring_max_db);
                                                                                            if (textView4 != null) {
                                                                                                i8 = R.id.tv_measuring_min_db;
                                                                                                TextView textView5 = (TextView) cb.b.x(inflate, R.id.tv_measuring_min_db);
                                                                                                if (textView5 != null) {
                                                                                                    i8 = R.id.tv_measuring_timer;
                                                                                                    TextView textView6 = (TextView) cb.b.x(inflate, R.id.tv_measuring_timer);
                                                                                                    if (textView6 != null) {
                                                                                                        i8 = R.id.tv_over;
                                                                                                        if (((TextView) cb.b.x(inflate, R.id.tv_over)) != null) {
                                                                                                            i8 = R.id.tv_zero;
                                                                                                            if (((TextView) cb.b.x(inflate, R.id.tv_zero)) != null) {
                                                                                                                this.Q0 = new i0((NestedScrollView) inflate, imageView, materialButton, materialCardView, constraintLayout, lineChart, composeView, textView, textView2, textView3, textView4, textView5, textView6);
                                                                                                                Dialog dialog = this.G0;
                                                                                                                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
                                                                                                                com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                                                                                                                if (bVar != null) {
                                                                                                                    bottomSheetBehavior = bVar.h();
                                                                                                                }
                                                                                                                if (bottomSheetBehavior != null) {
                                                                                                                    bottomSheetBehavior.C(3);
                                                                                                                }
                                                                                                                Object systemService = e0().getSystemService("audio");
                                                                                                                sf.j.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                                                                                                                this.f6990b1 = (AudioManager) systemService;
                                                                                                                AudioFocusRequest build = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.f6993e1).build();
                                                                                                                sf.j.e(build, "Builder(AudioManager.AUD…ner)\n            .build()");
                                                                                                                this.f6991c1 = build;
                                                                                                                Object systemService2 = e0().getSystemService("location");
                                                                                                                sf.j.d(systemService2, "null cannot be cast to non-null type android.location.LocationManager");
                                                                                                                this.T0 = (LocationManager) systemService2;
                                                                                                                this.U0 = c0(new b(this), new c.c());
                                                                                                                i0 i0Var = this.Q0;
                                                                                                                sf.j.c(i0Var);
                                                                                                                i0Var.f11710g.setContent(z.b.c(-1714853017, new h0(this), true));
                                                                                                                i0 i0Var2 = this.Q0;
                                                                                                                sf.j.c(i0Var2);
                                                                                                                LineChart lineChart2 = i0Var2.f11709f;
                                                                                                                lineChart2.setTouchEnabled(false);
                                                                                                                lineChart2.setScaleEnabled(false);
                                                                                                                lineChart2.setPinchZoom(false);
                                                                                                                lineChart2.setDoubleTapToZoomEnabled(false);
                                                                                                                lineChart2.getLegend().f14035a = false;
                                                                                                                lineChart2.l();
                                                                                                                r5.h xAxis = lineChart2.getXAxis();
                                                                                                                xAxis.f14023o = 5.0f;
                                                                                                                xAxis.f14024p = true;
                                                                                                                lineChart2.getXAxis().E = 2;
                                                                                                                lineChart2.getXAxis().f14016g = e0().getColor(R.color.chart_grid_color);
                                                                                                                lineChart2.getAxisRight().f14035a = false;
                                                                                                                r5.i axisLeft = lineChart2.getAxisLeft();
                                                                                                                axisLeft.f14033y = true;
                                                                                                                axisLeft.B = 0.0f;
                                                                                                                axisLeft.C = Math.abs(axisLeft.A - 0.0f);
                                                                                                                r5.i axisLeft2 = lineChart2.getAxisLeft();
                                                                                                                axisLeft2.f14034z = true;
                                                                                                                axisLeft2.A = 120.0f;
                                                                                                                axisLeft2.C = Math.abs(120.0f - axisLeft2.B);
                                                                                                                lineChart2.getAxisLeft().f14016g = e0().getColor(R.color.chart_grid_color);
                                                                                                                float[] fArr = {20.0f, 5.0f};
                                                                                                                lineChart2.getAxisLeft().f14028t = new DashPathEffect(fArr, 5.0f);
                                                                                                                lineChart2.getXAxis().f14028t = new DashPathEffect(fArr, 5.0f);
                                                                                                                lineChart2.getDescription().f14035a = false;
                                                                                                                i0 i0Var3 = this.Q0;
                                                                                                                sf.j.c(i0Var3);
                                                                                                                i0Var3.f11705b.setOnClickListener(new sc.b(12, this));
                                                                                                                i0 i0Var4 = this.Q0;
                                                                                                                sf.j.c(i0Var4);
                                                                                                                MaterialButton materialButton2 = i0Var4.f11706c;
                                                                                                                sf.j.e(materialButton2, "binding.btnMeasuringStop");
                                                                                                                zd.e.a(materialButton2, new f0(this));
                                                                                                                i0 i0Var5 = this.Q0;
                                                                                                                sf.j.c(i0Var5);
                                                                                                                MaterialCardView materialCardView2 = i0Var5.f11707d;
                                                                                                                sf.j.e(materialCardView2, "binding.cardInformationMeasuring");
                                                                                                                zd.e.a(materialCardView2, new md.g0(this));
                                                                                                                A0();
                                                                                                                this.V0 = zd.d.a(this);
                                                                                                                this.B0 = false;
                                                                                                                Dialog dialog2 = this.G0;
                                                                                                                if (dialog2 != null) {
                                                                                                                    dialog2.setCancelable(false);
                                                                                                                }
                                                                                                                a3.a.a(e0()).b(this.f6994f1, new IntentFilter("RECORD"));
                                                                                                                i0 i0Var6 = this.Q0;
                                                                                                                sf.j.c(i0Var6);
                                                                                                                NestedScrollView nestedScrollView = i0Var6.f11704a;
                                                                                                                sf.j.e(nestedScrollView, "binding.root");
                                                                                                                return nestedScrollView;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        super.N();
        try {
            F0();
            a3.a.a(e0()).d(this.f6994f1);
            k7.d dVar = this.f6992d1;
            if (dVar != null) {
                a aVar = this.f6995g1;
                String simpleName = n7.c.class.getSimpleName();
                if (aVar != null) {
                    u6.q.g("Listener type must not be empty", simpleName);
                    dVar.b(new i.a(aVar, simpleName), 2418).continueWith(k7.a.f10346a, z0.D);
                } else {
                    throw new NullPointerException("Listener must not be null");
                }
            }
            this.Q0 = null;
            AudioManager audioManager = this.f6990b1;
            if (audioManager != null) {
                AudioFocusRequest audioFocusRequest = this.f6991c1;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    d0().getWindow().clearFlags(128);
                    return;
                }
                sf.j.l("audioFocusRequest");
                throw null;
            }
            sf.j.l("audioManager");
            throw null;
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
    }

    public final void S() {
        this.f2062b0 = true;
    }

    public final void V() {
        this.f2062b0 = true;
        LocationManager locationManager = this.T0;
        if (locationManager != null) {
            if (!locationManager.isProviderEnabled("gps")) {
                zd.d.d(this, "GPS is disabled", "Your GPS (with high accuracy) seems to be disabled, do you want to enable it?", "Yes", "No", true, new md.e(this), new md.f(this));
            }
            cb.b.D(cb.d.I(this), (f.b) null, 0, new c(this, (jf.d<? super c>) null), 3);
            if (t1.a.a(e0(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                t1.a.a(e0(), "android.permission.ACCESS_COARSE_LOCATION");
                return;
            }
            return;
        }
        sf.j.l("locationManager");
        throw null;
    }

    public final void Z(View view) {
        sf.j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new md.g(this, (jf.d<? super md.g>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new v(this, (jf.d<? super v>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new md.w(this, (jf.d<? super md.w>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new x(this, (jf.d<? super x>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new y(this, (jf.d<? super y>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new z(this, (jf.d<? super z>) null), 3);
        B0().f7014j.e(z(), new e(new a0(this)));
        B0().f7016l.e(z(), new e(new b0(this)));
        B0().f7015k.e(z(), new e(new c0(this)));
        B0().f7013i.e(z(), new e(new md.h(this)));
        B0().f7022s.e(z(), new e(new md.l(this)));
        B0().f7024u.e(z(), new e(new md.o(this)));
        B0().f7023t.e(z(), new e(new r(this)));
        B0().f7025v.e(z(), new e(new u(this)));
    }
}
