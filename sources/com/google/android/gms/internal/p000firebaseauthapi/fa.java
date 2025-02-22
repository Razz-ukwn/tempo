package com.google.android.gms.internal.p000firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fa  reason: invalid package */
public final class fa implements y5 {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4547b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f4548a;

    public fa() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.f4548a = instance;
        } catch (IOException | GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean b(String str) {
        fa faVar = new fa();
        synchronized (f4547b) {
            if (faVar.c(str)) {
                return false;
            }
            String a10 = kh.a(str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(a10, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return true;
        }
    }

    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    public final synchronized boolean c(String str) {
        String a10;
        a10 = kh.a(str);
        try {
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        } catch (NullPointerException unused) {
            Log.w("fa", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                Thread.sleep((long) ((int) (Math.random() * 40.0d)));
            } catch (InterruptedException unused2) {
            }
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f4548a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
            return this.f4548a.containsAlias(a10);
        }
        return this.f4548a.containsAlias(a10);
    }

    public final synchronized ea zza(String str) {
        ea eaVar;
        eaVar = new ea(kh.a(str), this.f4548a);
        byte[] a10 = jh.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, eaVar.a(eaVar.b(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return eaVar;
    }
}
