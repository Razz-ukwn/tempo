package com.google.android.recaptcha.internal;

import androidx.fragment.app.q;

final class zzeh extends zzej {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzeh(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzef r0 = new com.google.android.recaptcha.internal.zzef
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.recaptcha.internal.zzdr.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzeh.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    public final int zza(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i8 = 0;
            int i10 = 0;
            while (i8 < zze.length()) {
                int i11 = i8 + 1;
                int i12 = i10 + 1;
                int zzb = (this.zzb.zzb(zze.charAt(i8)) << 18) | (this.zzb.zzb(zze.charAt(i11)) << 12);
                bArr[i10] = (byte) (zzb >>> 16);
                int i13 = i11 + 1;
                if (i13 < zze.length()) {
                    int i14 = i13 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zze.charAt(i13)) << 6);
                    i10 = i12 + 1;
                    bArr[i12] = (byte) ((zzb2 >>> 8) & 255);
                    if (i14 < zze.length()) {
                        bArr[i10] = (byte) ((zzb2 | this.zzb.zzb(zze.charAt(i14))) & 255);
                        i10++;
                        i8 = i14 + 1;
                    } else {
                        i8 = i14;
                    }
                } else {
                    i8 = i13;
                    i10 = i12;
                }
            }
            return i10;
        }
        throw new zzei(q.a("Invalid input length ", zze.length()));
    }

    public final void zzb(Appendable appendable, byte[] bArr, int i8, int i10) {
        int i11 = 0;
        zzdr.zzd(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 1;
            int i14 = i13 + 1;
            byte b10 = ((bArr[i11] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
            appendable.append(this.zzb.zza(b10 >>> 18));
            appendable.append(this.zzb.zza((b10 >>> 12) & 63));
            appendable.append(this.zzb.zza((b10 >>> 6) & 63));
            appendable.append(this.zzb.zza(b10 & 63));
            i11 = i14 + 1;
        }
        if (i11 < i10) {
            zzf(appendable, bArr, i11, i10 - i11);
        }
    }
}
