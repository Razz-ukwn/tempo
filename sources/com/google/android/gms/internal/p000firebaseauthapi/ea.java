package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ea  reason: invalid package */
public final class ea implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f4518a;

    public ea(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f4518a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return c(bArr, bArr2);
            } catch (AEADBadTagException e10) {
                throw e10;
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w("ea", "encountered a potentially transient KeyStore error, will wait and retry", e11);
                try {
                    Thread.sleep((long) ((int) (Math.random() * 100.0d)));
                } catch (InterruptedException unused) {
                }
                return c(bArr, bArr2);
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w("ea", "encountered a potentially transient KeyStore error, will wait and retry", e10);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f4518a, gCMParameterSpec);
        instance.updateAAD(bArr2);
        return instance.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f4518a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
