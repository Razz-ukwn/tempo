package w3;

import ag.d;
import ag.m;
import androidx.fragment.app.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.p000firebaseauthapi.ch;
import com.google.android.gms.internal.p000firebaseauthapi.kh;
import com.google.android.gms.internal.p000firebaseauthapi.yc;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class c implements yc {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16472a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16473b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16474c;

    public c(byte[] bArr) {
        kh.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16472a = secretKeySpec;
        if (m.y(1)) {
            Cipher cipher = (Cipher) ch.f4470b.a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] n2 = d.n(cipher.doFinal(new byte[16]));
            this.f16473b = n2;
            this.f16474c = d.n(n2);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] a(byte[] bArr, int i8) {
        byte[] bArr2;
        if (i8 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (m.y(1)) {
            Cipher cipher = (Cipher) ch.f4470b.a("AES/ECB/NoPadding");
            cipher.init(1, (SecretKey) this.f16472a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = z0.n((max - 1) * 16, 0, 16, bArr, (byte[]) this.f16473b);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    bArr2 = z0.m(copyOf, (byte[]) this.f16474c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i10 = 0; i10 < max - 1; i10++) {
                bArr3 = cipher.doFinal(z0.n(0, i10 * 16, 16, bArr3, bArr));
            }
            return Arrays.copyOf(cipher.doFinal(z0.m(bArr2, bArr3)), i8);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }

    public /* synthetic */ c(ViewPager2 viewPager2, androidx.viewpager2.widget.c cVar, RecyclerView recyclerView) {
        this.f16472a = viewPager2;
        this.f16473b = cVar;
        this.f16474c = recyclerView;
    }
}
