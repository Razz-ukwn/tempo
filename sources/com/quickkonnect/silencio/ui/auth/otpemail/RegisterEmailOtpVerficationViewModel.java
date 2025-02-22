package com.quickkonnect.silencio.ui.auth.otpemail;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.y0;
import lf.c;
import lf.e;
import sf.j;
import zd.g;

public final class RegisterEmailOtpVerficationViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6819g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f6820h;

    /* renamed from: i  reason: collision with root package name */
    public final a f6821i;

    /* renamed from: j  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f6822j = new v<>();

    /* renamed from: k  reason: collision with root package name */
    public final v<g<BaseResponse>> f6823k = new v<>();

    public static final class a implements f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f6824a;

        /* renamed from: com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$a$a  reason: collision with other inner class name */
        public static final class C0094a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f6825a;

            @e(c = "com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$special$$inlined$map$1$2", f = "RegisterEmailOtpVerficationViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C0095a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f6826a;

                /* renamed from: b  reason: collision with root package name */
                public int f6827b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0094a f6828c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0095a(C0094a aVar, d dVar) {
                    super(dVar);
                    this.f6828c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f6826a = obj;
                    this.f6827b |= Integer.MIN_VALUE;
                    return this.f6828c.m((Object) null, this);
                }
            }

            public C0094a(kotlinx.coroutines.flow.g gVar) {
                this.f6825a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel.a.C0094a.C0095a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$a$a$a r0 = (com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel.a.C0094a.C0095a) r0
                    int r1 = r0.f6827b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f6827b = r1
                    goto L_0x0018
                L_0x0013:
                    com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$a$a$a r0 = new com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f6826a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f6827b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r6)
                    goto L_0x004c
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    cb.b.J(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    int r5 = r5.length()
                    if (r5 <= 0) goto L_0x003c
                    r5 = r3
                    goto L_0x003d
                L_0x003c:
                    r5 = 0
                L_0x003d:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f6827b = r3
                    kotlinx.coroutines.flow.g r6 = r4.f6825a
                    java.lang.Object r5 = r6.m(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    ff.m r5 = ff.m.f8717a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel.a.C0094a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public a(y0 y0Var) {
            this.f6824a = y0Var;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, d dVar) {
            Object a10 = this.f6824a.a(new C0094a(gVar), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterEmailOtpVerficationViewModel(Application application, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        this.f6819g = aVar;
        y0 a10 = z0.a("");
        this.f6820h = a10;
        this.f6821i = new a(a10);
    }
}
