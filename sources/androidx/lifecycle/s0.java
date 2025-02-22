package androidx.lifecycle;

import android.view.View;
import cb.c;
import cb.s;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.c7;
import com.google.android.gms.internal.p000firebaseauthapi.g7;
import com.google.android.gms.internal.p000firebaseauthapi.h7;
import com.google.android.gms.internal.p000firebaseauthapi.i7;
import com.google.android.gms.internal.p000firebaseauthapi.j7;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.google.android.gms.internal.p000firebaseauthapi.w2;
import com.quickkonnect.silencio.R;
import h0.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.LinkedHashSet;
import java.util.List;
import oa.f;
import q7.e2;
import q7.g2;
import sf.j;

public final class s0 implements s, ka, f, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ s0 f2316a = new s0();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ s0 f2317b = new s0();

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f2318c = new s0();

    public static final h0.f b(float f10, float f11, float f12, float f13, long j10) {
        float b10 = a.b(j10);
        float c3 = a.c(j10);
        long floatToIntBits = (long) Float.floatToIntBits(b10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(c3)) & 4294967295L) | (floatToIntBits << 32);
        return new h0.f(f10, f11, f12, f13, floatToIntBits2, floatToIntBits2, floatToIntBits2, floatToIntBits2);
    }

    public static final void c(View view, p pVar) {
        j.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, pVar);
    }

    public c a(nb nbVar) {
        h7 h7Var;
        ab abVar = j7.f4662a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                qd w10 = qd.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    g7 g7Var = new g7();
                    int c3 = w10.y().c();
                    if (!(c3 == 16 || c3 == 24)) {
                        if (c3 != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(c3)}));
                        }
                    }
                    g7Var.f4571a = Integer.valueOf(c3);
                    int t2 = w10.x().t();
                    if (t2 != 12) {
                        if (t2 != 16) {
                            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(t2)}));
                        }
                    }
                    g7Var.f4572b = Integer.valueOf(t2);
                    g7Var.f4573c = 16;
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                h7Var = h7.f4619d;
                            } else if (ordinal != 4) {
                                int zza = mgVar.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            }
                        }
                        h7Var = h7.f4618c;
                    } else {
                        h7Var = h7.f4617b;
                    }
                    g7Var.f4574d = h7Var;
                    i7 a10 = g7Var.a();
                    c7 c7Var = new c7();
                    c7Var.f4452a = a10;
                    c7Var.f4453b = r3.s.i(w10.y().m());
                    c7Var.f4454c = ((lb) nbVar).B;
                    return c7Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
    }

    public Object g() {
        return new LinkedHashSet();
    }

    public Object zza() {
        List list = g2.f13022a;
        return Integer.valueOf((int) aa.f5157b.zza().f());
    }
}
