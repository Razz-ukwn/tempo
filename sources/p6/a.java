package p6;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import u6.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f12467a;

    @Deprecated
    /* renamed from: p6.a$a  reason: collision with other inner class name */
    public static class C0242a implements a.c {

        /* renamed from: c  reason: collision with root package name */
        public static final C0242a f12468c = new C0242a(new C0243a());

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12469a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12470b;

        @Deprecated
        /* renamed from: p6.a$a$a  reason: collision with other inner class name */
        public static class C0243a {

            /* renamed from: a  reason: collision with root package name */
            public final Boolean f12471a = Boolean.FALSE;

            /* renamed from: b  reason: collision with root package name */
            public String f12472b;

            public C0243a() {
            }

            public C0243a(C0242a aVar) {
                C0242a aVar2 = C0242a.f12468c;
                aVar.getClass();
                this.f12471a = Boolean.valueOf(aVar.f12469a);
                this.f12472b = aVar.f12470b;
            }
        }

        public C0242a(C0243a aVar) {
            this.f12469a = aVar.f12471a.booleanValue();
            this.f12470b = aVar.f12472b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0242a)) {
                return false;
            }
            C0242a aVar = (C0242a) obj;
            aVar.getClass();
            return o.a((Object) null, (Object) null) && this.f12469a == aVar.f12469a && o.a(this.f12470b, aVar.f12470b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f12469a), this.f12470b});
        }
    }

    static {
        a.f fVar = new a.f();
        new d();
        e eVar = new e();
        com.google.android.gms.common.api.a<c> aVar = b.f12473a;
        f12467a = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, fVar);
    }
}
