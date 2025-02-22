package cb;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.je;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.v7;
import com.google.android.gms.internal.p000firebaseauthapi.w2;
import com.google.android.gms.internal.p000firebaseauthapi.w7;
import com.google.android.gms.internal.p000firebaseauthapi.z7;
import e9.c;
import i3.p;
import java.security.GeneralSecurityException;
import java.util.List;
import l0.a;
import q7.e;
import q7.e2;
import q7.g2;
import r3.s;
import sf.j;
import u6.p;
import x3.g;

public final class f implements s, ka, a, e, e2, p {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f3900a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ f f3901b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ f f3902c = new f();

    /* renamed from: d  reason: collision with root package name */
    public static final f f3903d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static x3.f f3904e;

    public /* synthetic */ f() {
    }

    public static final double c(int i8, int i10, int i11, int i12, int i13) {
        double d10 = ((double) i11) / ((double) i8);
        double d11 = ((double) i12) / ((double) i10);
        if (i13 != 0) {
            int i14 = i13 - 1;
            if (i14 == 0) {
                return Math.max(d10, d11);
            }
            if (i14 == 1) {
                return Math.min(d10, d11);
            }
            throw new ff.e();
        }
        throw null;
    }

    public static final p.a d(Context context, Class cls, String str) {
        j.f(context, "context");
        if (!(zf.j.t0(str))) {
            return new p.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final x3.f e(Context context) {
        x3.f fVar = f3904e;
        if (fVar != null) {
            return fVar;
        }
        synchronized (f3903d) {
            x3.f fVar2 = f3904e;
            if (fVar2 != null) {
                return fVar2;
            }
            Context applicationContext = context.getApplicationContext();
            g gVar = applicationContext instanceof g ? (g) applicationContext : null;
            x3.f a10 = gVar != null ? gVar.a() : c.d(context);
            f3904e = a10;
            return a10;
        }
    }

    public c a(nb nbVar) {
        w7 w7Var;
        ab abVar = z7.f5128a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                je w10 = je.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                w7Var = w7.f5044d;
                            } else if (ordinal != 4) {
                                int zza = mgVar.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            }
                        }
                        w7Var = w7.f5043c;
                    } else {
                        w7Var = w7.f5042b;
                    }
                    return v7.o(w7Var, s.i(w10.x().m()), ((lb) nbVar).B);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
    }

    public /* bridge */ /* synthetic */ Object b(h hVar) {
        return null;
    }

    public String f(String str, String str2) {
        return null;
    }

    public Object g() {
        return new r();
    }

    public Object zza() {
        List list = g2.f13022a;
        return rb.f5507b.zza().zzd();
    }

    public /* synthetic */ f(View view) {
        j.f(view, "view");
    }
}
