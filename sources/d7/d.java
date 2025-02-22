package d7;

import com.google.android.gms.internal.p000firebaseauthapi.ch;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public final class d extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7379a;

    public /* synthetic */ d(int i8) {
        this.f7379a = i8;
    }

    public final Object initialValue() {
        switch (this.f7379a) {
            case 0:
                return 0L;
            case 1:
                try {
                    return (Cipher) ch.f4470b.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                try {
                    return (Cipher) ch.f4470b.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
