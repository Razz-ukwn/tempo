package t6;

import android.os.RemoteException;
import android.util.Log;
import c7.a;
import c7.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import u6.m0;
import u6.n1;
import u6.q;

public abstract class t extends n1 {

    /* renamed from: c  reason: collision with root package name */
    public final int f15414c;

    public t(byte[] bArr) {
        q.a(bArr.length == 25);
        this.f15414c = Arrays.hashCode(bArr);
    }

    public static byte[] O(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] P();

    public final boolean equals(Object obj) {
        a zzd;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.zzc() != this.f15414c || (zzd = m0Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(P(), (byte[]) b.P(zzd));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15414c;
    }

    public final int zzc() {
        return this.f15414c;
    }

    public final a zzd() {
        return new b(P());
    }
}
