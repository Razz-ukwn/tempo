package i9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import j9.g;
import j9.p;
import j9.q;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressLint({"RestrictedApi"})
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final g f9628c = new g("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    public final p f9629a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9630b;

    public i(Context context) {
        int length;
        String str;
        this.f9630b = context.getPackageName();
        g gVar = q.f9894a;
        boolean z10 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    g gVar2 = q.f9894a;
                    gVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", g.b(gVar2.f9871a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        byte[] byteArray = signatureArr[i8].toByteArray();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(byteArray);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z10 = true;
                        } else {
                            i8++;
                        }
                    }
                    z10 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z10) {
            this.f9629a = new p(context, f9628c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
        }
    }
}
