package com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor;

import android.app.Application;
import androidx.fragment.app.z0;
import ff.m;
import gf.s;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.c;
import lf.e;
import mc.b;
import sf.j;

public final class ClaimCoinPlaceOutdoorViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final y0 f6931g = z0.a(s.f8978a);

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6932h;

    /* renamed from: i  reason: collision with root package name */
    public final a f6933i;

    public static final class a implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6934a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinPlaceOutdoorViewModel f6935b;

        /* renamed from: com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$a$a  reason: collision with other inner class name */
        public static final class C0102a<T> implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f6936a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ClaimCoinPlaceOutdoorViewModel f6937b;

            @e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$special$$inlined$map$1$2", f = "ClaimCoinPlaceOutdoorViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C0103a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f6938a;

                /* renamed from: b  reason: collision with root package name */
                public int f6939b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0102a f6940c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0103a(C0102a aVar, d dVar) {
                    super(dVar);
                    this.f6940c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f6938a = obj;
                    this.f6939b |= Integer.MIN_VALUE;
                    return this.f6940c.m((Object) null, this);
                }
            }

            public C0102a(g gVar, ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel) {
                this.f6936a = gVar;
                this.f6937b = claimCoinPlaceOutdoorViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r7, jf.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel.a.C0102a.C0103a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$a$a$a r0 = (com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel.a.C0102a.C0103a) r0
                    int r1 = r0.f6939b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f6939b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$a$a$a r0 = new com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f6938a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f6939b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r8)
                    goto L_0x007c
                L_0x0027:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x002f:
                    cb.b.J(r8)
                    java.lang.String r7 = (java.lang.String) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    int r2 = r7.length()
                    r4 = 0
                    if (r2 != 0) goto L_0x0042
                    r2 = r3
                    goto L_0x0043
                L_0x0042:
                    r2 = r4
                L_0x0043:
                    java.lang.String r5 = "Other"
                    if (r2 == 0) goto L_0x0050
                    boolean r2 = r8.contains(r5)
                    if (r2 == 0) goto L_0x0050
                    r8.remove(r5)
                L_0x0050:
                    int r7 = r7.length()
                    if (r7 <= 0) goto L_0x0057
                    r4 = r3
                L_0x0057:
                    if (r4 == 0) goto L_0x0062
                    boolean r7 = r8.contains(r5)
                    if (r7 != 0) goto L_0x0062
                    r8.add(r5)
                L_0x0062:
                    com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel r7 = r6.f6937b
                    kotlinx.coroutines.flow.y0 r7 = r7.f6931g
                    r7.setValue(r8)
                    boolean r7 = r8.contains(r5)
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                    r0.f6939b = r3
                    kotlinx.coroutines.flow.g r8 = r6.f6936a
                    java.lang.Object r7 = r8.m(r7, r0)
                    if (r7 != r1) goto L_0x007c
                    return r1
                L_0x007c:
                    ff.m r7 = ff.m.f8717a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorViewModel.a.C0102a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public a(y0 y0Var, ClaimCoinPlaceOutdoorViewModel claimCoinPlaceOutdoorViewModel) {
            this.f6934a = y0Var;
            this.f6935b = claimCoinPlaceOutdoorViewModel;
        }

        public final Object a(g gVar, d dVar) {
            Object a10 = this.f6934a.a(new C0102a(gVar, this.f6935b), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClaimCoinPlaceOutdoorViewModel(Application application, b bVar) {
        super(application);
        j.f(bVar, "measureDataSource");
        y0 a10 = z0.a("");
        this.f6932h = a10;
        this.f6933i = new a(a10, this);
    }

    public final void h(String str) {
        j.f(str, "text");
        this.f6931g.setValue(cb.d.O(str));
    }
}
