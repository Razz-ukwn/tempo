package com.quickkonnect.silencio.ui.measure.measuring;

import ag.g0;
import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.i0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import ff.m;
import gf.q;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jf.f;
import kotlinx.coroutines.flow.y0;
import lf.i;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import yg.b0;
import zd.g;

public final class MeasuringViewModel extends zd.a {
    public float A;
    public float B;
    public ArrayList C;
    public final String D;

    /* renamed from: g  reason: collision with root package name */
    public final mc.b f7011g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f7012h = z0.a(Float.valueOf(0.0f));

    /* renamed from: i  reason: collision with root package name */
    public final v<List<Float>> f7013i;

    /* renamed from: j  reason: collision with root package name */
    public final t f7014j;

    /* renamed from: k  reason: collision with root package name */
    public final t f7015k;

    /* renamed from: l  reason: collision with root package name */
    public final t f7016l;
    public Date m;

    /* renamed from: n  reason: collision with root package name */
    public Date f7017n;

    /* renamed from: o  reason: collision with root package name */
    public final y0 f7018o;

    /* renamed from: p  reason: collision with root package name */
    public final e f7019p;

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDateFormat f7020q;

    /* renamed from: r  reason: collision with root package name */
    public final f f7021r;

    /* renamed from: s  reason: collision with root package name */
    public final v<g<StartRecordingResponseModel>> f7022s;

    /* renamed from: t  reason: collision with root package name */
    public final v<g<StopRecordingResponseModel>> f7023t;

    /* renamed from: u  reason: collision with root package name */
    public final v<g<BaseResponse>> f7024u;

    /* renamed from: v  reason: collision with root package name */
    public final v<g<StopRecordingResponseModel>> f7025v;

    /* renamed from: w  reason: collision with root package name */
    public final y0 f7026w;

    /* renamed from: x  reason: collision with root package name */
    public final y0 f7027x;

    /* renamed from: y  reason: collision with root package name */
    public final y0 f7028y;

    /* renamed from: z  reason: collision with root package name */
    public StopRecordingRequestModel f7029z;

    public static final class a extends k implements l<List<Float>, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7030a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            List<Number> list = (List) obj;
            j.e(list, "it");
            double d10 = 0.0d;
            int i8 = 0;
            for (Number floatValue : list) {
                d10 += (double) floatValue.floatValue();
                i8++;
                if (i8 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            return Double.valueOf(i8 == 0 ? Double.NaN : d10 / ((double) i8));
        }
    }

    @lf.e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$claimCoin$1", f = "MeasuringViewModel.kt", l = {458}, m = "invokeSuspend")
    public static final class b extends i implements p<g0, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7031a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MeasuringViewModel f7032b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f7033c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MeasuringViewModel measuringViewModel, float f10, jf.d<? super b> dVar) {
            super(2, dVar);
            this.f7032b = measuringViewModel;
            this.f7033c = f10;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new b(this.f7032b, this.f7033c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7031a;
            MeasuringViewModel measuringViewModel = this.f7032b;
            if (i8 == 0) {
                cb.b.J(obj);
                boolean g10 = zd.a.g(measuringViewModel);
                v<g<StopRecordingResponseModel>> vVar = measuringViewModel.f7025v;
                if (g10) {
                    androidx.activity.f.c(vVar);
                    mc.b bVar = measuringViewModel.f7011g;
                    ClaimCoinRequestModel claimCoinRequestModel = new ClaimCoinRequestModel((String) measuringViewModel.f7028y.getValue(), (String) null, (String) null, (List) null, new Double((double) this.f7033c), 14, (sf.e) null);
                    this.f7031a = 1;
                    obj = bVar.f11380a.d(claimCoinRequestModel, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    vVar.k(new g.a(measuringViewModel.f17942e.getString(R.string.no_internet)));
                    return m.f8717a;
                }
            } else if (i8 == 1) {
                try {
                    cb.b.J(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    measuringViewModel.f7025v.k(new g.a(measuringViewModel.f17942e.getString(R.string.something_went_wrong)));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            measuringViewModel.f7025v.k(measuringViewModel.f((b0) obj));
            return m.f8717a;
        }
    }

    public static final class c extends k implements l<List<Float>, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7034a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            List list = (List) obj;
            j.e(list, "it");
            return Float.valueOf(q.E0(list));
        }
    }

    public static final class d extends k implements l<List<Float>, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7035a = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            List list = (List) obj;
            j.e(list, "it");
            return Float.valueOf(q.F0(list));
        }
    }

    public static final class e implements kotlinx.coroutines.flow.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f f7036a;

        public static final class a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f7037a;

            @lf.e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$special$$inlined$map$1$2", f = "MeasuringViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$e$a$a  reason: collision with other inner class name */
            public static final class C0108a extends lf.c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f7038a;

                /* renamed from: b  reason: collision with root package name */
                public int f7039b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f7040c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0108a(a aVar, jf.d dVar) {
                    super(dVar);
                    this.f7040c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7038a = obj;
                    this.f7039b |= Integer.MIN_VALUE;
                    return this.f7040c.m((Object) null, this);
                }
            }

            public a(kotlinx.coroutines.flow.g gVar) {
                this.f7037a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r7, jf.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.e.a.C0108a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$e$a$a r0 = (com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.e.a.C0108a) r0
                    int r1 = r0.f7039b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f7039b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$e$a$a r0 = new com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$e$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f7038a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f7039b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r8)
                    goto L_0x0067
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    cb.b.J(r8)
                    java.lang.String r7 = (java.lang.String) r7
                    bh.a$a r8 = bh.a.f3654a
                    java.lang.String r2 = "=== times "
                    java.lang.String r2 = j0.t.a(r2, r7)
                    r4 = 0
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    r8.b(r2, r5)
                    r8 = 2
                    java.lang.String r7 = zf.o.a1(r8, r7)
                    java.lang.Integer r7 = zf.i.p0(r7)
                    if (r7 == 0) goto L_0x0052
                    int r7 = r7.intValue()
                    goto L_0x0053
                L_0x0052:
                    r7 = r4
                L_0x0053:
                    r8 = 20
                    if (r7 < r8) goto L_0x0058
                    r4 = r3
                L_0x0058:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                    r0.f7039b = r3
                    kotlinx.coroutines.flow.g r8 = r6.f7037a
                    java.lang.Object r7 = r8.m(r7, r0)
                    if (r7 != r1) goto L_0x0067
                    return r1
                L_0x0067:
                    ff.m r7 = ff.m.f8717a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.e.a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public e(y0 y0Var) {
            this.f7036a = y0Var;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, jf.d dVar) {
            Object a10 = this.f7036a.a(new a(gVar), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    public static final class f implements kotlinx.coroutines.flow.f<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f f7041a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MeasuringViewModel f7042b;

        public static final class a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f7043a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MeasuringViewModel f7044b;

            @lf.e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$special$$inlined$map$2$2", f = "MeasuringViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$f$a$a  reason: collision with other inner class name */
            public static final class C0109a extends lf.c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f7045a;

                /* renamed from: b  reason: collision with root package name */
                public int f7046b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f7047c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0109a(a aVar, jf.d dVar) {
                    super(dVar);
                    this.f7047c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7045a = obj;
                    this.f7046b |= Integer.MIN_VALUE;
                    return this.f7047c.m((Object) null, this);
                }
            }

            public a(kotlinx.coroutines.flow.g gVar, MeasuringViewModel measuringViewModel) {
                this.f7043a = gVar;
                this.f7044b = measuringViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r7, jf.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.f.a.C0109a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$f$a$a r0 = (com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.f.a.C0109a) r0
                    int r1 = r0.f7046b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f7046b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$f$a$a r0 = new com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$f$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f7045a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f7046b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r8)
                    goto L_0x006d
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    cb.b.J(r8)
                    java.lang.String r7 = (java.lang.String) r7
                    r8 = 2
                    java.lang.String r8 = zf.o.a1(r8, r7)
                    java.lang.Float r8 = zf.i.o0(r8)
                    r2 = 0
                    if (r8 == 0) goto L_0x0045
                    float r8 = r8.floatValue()
                    goto L_0x0046
                L_0x0045:
                    r8 = r2
                L_0x0046:
                    com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel r4 = r6.f7044b
                    float r5 = r4.A
                    float r8 = r8 * r5
                    java.lang.String r7 = zf.o.b1(r7)
                    java.lang.Float r7 = zf.i.o0(r7)
                    if (r7 == 0) goto L_0x0059
                    float r2 = r7.floatValue()
                L_0x0059:
                    float r7 = r4.B
                    float r2 = r2 * r7
                    float r2 = r2 + r8
                    java.lang.Float r7 = new java.lang.Float
                    r7.<init>(r2)
                    r0.f7046b = r3
                    kotlinx.coroutines.flow.g r8 = r6.f7043a
                    java.lang.Object r7 = r8.m(r7, r0)
                    if (r7 != r1) goto L_0x006d
                    return r1
                L_0x006d:
                    ff.m r7 = ff.m.f8717a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel.f.a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public f(y0 y0Var, MeasuringViewModel measuringViewModel) {
            this.f7041a = y0Var;
            this.f7042b = measuringViewModel;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, jf.d dVar) {
            Object a10 = this.f7041a.a(new a(gVar, this.f7042b), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringViewModel(Application application, mc.b bVar) {
        super(application);
        j.f(bVar, "measureDataSource");
        this.f7011g = bVar;
        v<List<Float>> vVar = new v<>();
        this.f7013i = vVar;
        this.f7014j = i0.a(vVar, a.f7030a);
        this.f7015k = i0.a(vVar, d.f7035a);
        this.f7016l = i0.a(vVar, c.f7034a);
        y0 a10 = z0.a("");
        this.f7018o = a10;
        this.f7019p = new e(a10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f7020q = simpleDateFormat;
        this.f7021r = new f(a10, this);
        this.f7022s = new v<>();
        this.f7023t = new v<>();
        this.f7024u = new v<>();
        this.f7025v = new v<>();
        this.f7026w = z0.a((Object) null);
        this.f7027x = z0.a((Object) null);
        this.f7028y = z0.a("");
        this.C = new ArrayList();
        this.D = "";
    }

    public final void c() {
        try {
            new File(this.D).delete();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void h(float f10) {
        cb.b.D(gc.b.o(this), (f.b) null, 0, new b(this, f10, (jf.d<? super b>) null), 3);
    }

    public final void i(float f10, List list) {
        double d10 = (double) f10;
        boolean z10 = 20.0d <= d10 && d10 <= 120.0d;
        y0 y0Var = this.f7012h;
        if (z10) {
            if (this.m == null) {
                this.m = new Date();
            }
            this.f7017n = new Date();
            v<List<Float>> vVar = this.f7013i;
            List d11 = vVar.d();
            int size = d11 != null ? d11.size() : 0;
            bh.a.f3654a.b(androidx.fragment.app.q.a("=== count ", size), new Object[0]);
            String format = this.f7020q.format(new Date(((long) size) * 1000));
            j.e(format, "format");
            this.f7018o.setValue(format);
            List d12 = vVar.d();
            if (d12 == null) {
                d12 = new ArrayList();
            }
            d12.add(Float.valueOf(f10));
            if (d12.size() <= 1200) {
                vVar.k(d12);
                y0Var.setValue(Float.valueOf(f10));
            } else {
                y0Var.setValue(Float.valueOf(0.0f));
            }
            this.C = q.P0(list);
            return;
        }
        y0Var.setValue(Float.valueOf(0.0f));
    }

    public final void j(String str, String str2, float f10) {
        j.f(str, "longitude");
        j.f(str2, "latitude");
        this.f7027x.setValue(new StartLocation("Point", cb.d.P(str, str2), Float.valueOf(f10)));
    }
}
