package com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import ff.m;
import gf.q;
import gf.s;
import java.util.ArrayList;
import java.util.Collection;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.y0;
import lf.c;
import lf.e;
import mc.b;
import sf.j;
import zd.g;

public final class ClaimCoinSourceIndoorViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final b f6949g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6950h = z0.a(s.f8978a);

    /* renamed from: i  reason: collision with root package name */
    public final y0 f6951i;

    /* renamed from: j  reason: collision with root package name */
    public final a f6952j;

    /* renamed from: k  reason: collision with root package name */
    public final v<g<StopRecordingResponseModel>> f6953k;

    public static final class a implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6954a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinSourceIndoorViewModel f6955b;

        /* renamed from: com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$a$a  reason: collision with other inner class name */
        public static final class C0104a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f6956a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ClaimCoinSourceIndoorViewModel f6957b;

            @e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$special$$inlined$map$1$2", f = "ClaimCoinSourceIndoorViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C0105a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f6958a;

                /* renamed from: b  reason: collision with root package name */
                public int f6959b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0104a f6960c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0105a(C0104a aVar, d dVar) {
                    super(dVar);
                    this.f6960c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f6958a = obj;
                    this.f6959b |= Integer.MIN_VALUE;
                    return this.f6960c.m((Object) null, this);
                }
            }

            public C0104a(kotlinx.coroutines.flow.g gVar, ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel) {
                this.f6956a = gVar;
                this.f6957b = claimCoinSourceIndoorViewModel;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r8, jf.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel.a.C0104a.C0105a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$a$a$a r0 = (com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel.a.C0104a.C0105a) r0
                    int r1 = r0.f6959b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f6959b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$a$a$a r0 = new com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f6958a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f6959b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r9)
                    goto L_0x0083
                L_0x0027:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x002f:
                    cb.b.J(r9)
                    java.lang.String r8 = (java.lang.String) r8
                    com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel r9 = r7.f6957b
                    kotlinx.coroutines.flow.y0 r2 = r9.f6950h
                    java.lang.Object r2 = r2.getValue()
                    java.util.Collection r2 = (java.util.Collection) r2
                    java.util.ArrayList r2 = gf.q.P0(r2)
                    int r4 = r8.length()
                    r5 = 0
                    if (r4 != 0) goto L_0x004b
                    r4 = r3
                    goto L_0x004c
                L_0x004b:
                    r4 = r5
                L_0x004c:
                    java.lang.String r6 = "Other"
                    if (r4 == 0) goto L_0x0059
                    boolean r4 = r2.contains(r6)
                    if (r4 == 0) goto L_0x0059
                    r2.remove(r6)
                L_0x0059:
                    int r8 = r8.length()
                    if (r8 <= 0) goto L_0x0060
                    r5 = r3
                L_0x0060:
                    if (r5 == 0) goto L_0x006b
                    boolean r8 = r2.contains(r6)
                    if (r8 != 0) goto L_0x006b
                    r2.add(r6)
                L_0x006b:
                    kotlinx.coroutines.flow.y0 r8 = r9.f6950h
                    r8.setValue(r2)
                    boolean r8 = r2.contains(r6)
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                    r0.f6959b = r3
                    kotlinx.coroutines.flow.g r9 = r7.f6956a
                    java.lang.Object r8 = r9.m(r8, r0)
                    if (r8 != r1) goto L_0x0083
                    return r1
                L_0x0083:
                    ff.m r8 = ff.m.f8717a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel.a.C0104a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public a(y0 y0Var, ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel) {
            this.f6954a = y0Var;
            this.f6955b = claimCoinSourceIndoorViewModel;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, d dVar) {
            Object a10 = this.f6954a.a(new C0104a(gVar, this.f6955b), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClaimCoinSourceIndoorViewModel(Application application, b bVar) {
        super(application);
        j.f(bVar, "measureDataSource");
        this.f6949g = bVar;
        y0 a10 = z0.a("");
        this.f6951i = a10;
        this.f6952j = new a(a10, this);
        this.f6953k = new v<>();
    }

    public final void h(String str) {
        j.f(str, "text");
        y0 y0Var = this.f6950h;
        ArrayList P0 = q.P0((Collection) y0Var.getValue());
        if (P0.contains(str)) {
            P0.remove(str);
        } else {
            P0.add(str);
        }
        y0Var.setValue(P0);
    }
}
