package t6;

import com.google.android.gms.internal.p000firebaseauthapi.gf;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import u6.q;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f15411a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15412b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f15413c;

    public /* synthetic */ o(boolean z10, String str, t tVar) {
        this.f15411a = z10;
        this.f15412b = str;
        this.f15413c = tVar;
    }

    public final Object call() {
        MessageDigest messageDigest;
        boolean z10 = this.f15411a;
        String str = this.f15412b;
        t tVar = this.f15413c;
        Object[] objArr = new Object[5];
        objArr[0] = true != (!z10 && x.a(str, tVar, true, false).f15398a) ? "not allowed" : "debug cert rejected";
        objArr[1] = str;
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i8++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        q.i(messageDigest);
        byte[] digest = messageDigest.digest(tVar.P());
        int length = digest.length;
        char[] cArr = new char[(length + length)];
        int i10 = 0;
        for (byte b10 : digest) {
            byte b11 = b10 & 255;
            int i11 = i10 + 1;
            char[] cArr2 = gf.M;
            cArr[i10] = cArr2[b11 >>> 4];
            cArr[i11] = cArr2[b11 & 15];
            i10 = i11 + 1;
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z10);
        objArr[4] = "12451000.false";
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
    }
}
