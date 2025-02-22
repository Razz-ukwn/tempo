package q4;

import android.util.Log;
import c5.c;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import d5.b;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Signature;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.KeyAgreement;
import l5.a;
import p4.h;
import p4.k;
import r4.w;

public class a implements k, b, dh, ib.a {

    /* renamed from: b  reason: collision with root package name */
    public static a f12838b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12839a;

    public /* synthetic */ a(int i8) {
        this.f12839a = i8;
    }

    public static final int f(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
    }

    public static final int g(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public final boolean a(Object obj, File file, h hVar) {
        try {
            l5.a.c(((c) ((w) obj).get()).f3726a.f3731a.f3733a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        switch (this.f12839a) {
            case 6:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public final String c(com.hbb20.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.f6403c + " phone code is +" + aVar.f6402b;
    }

    public final w d(w wVar, h hVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((c) wVar.get()).f3726a.f3731a.f3733a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = l5.a.f10981a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f10984a == 0 && bVar.f10985b == bVar.f10986c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new z4.b(bArr);
    }

    public final p4.c e(h hVar) {
        return p4.c.f12454a;
    }
}
