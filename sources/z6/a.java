package z6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import b7.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo b10 = c.a(context).b(64, str);
        Signature[] signatureArr = b10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i8 = 0;
            while (true) {
                if (i8 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        break;
                    }
                    i8++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(b10.signatures[0].toByteArray());
            }
        }
        return null;
    }
}
