package com.google.android.recaptcha.internal;

import androidx.fragment.app.q;
import java.math.RoundingMode;

class zzej extends zzek {
    final zzef zzb;
    final Character zzc;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzej(com.google.android.recaptcha.internal.zzef r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0017
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzd(r2)
            if (r4 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r4 = r0
            goto L_0x0018
        L_0x0017:
            r4 = r1
        L_0x0018:
            if (r4 == 0) goto L_0x001d
            r3.zzc = r5
            return
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.recaptcha.internal.zzdu.zza(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzej.<init>(com.google.android.recaptcha.internal.zzef, java.lang.Character):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzej) {
            zzej zzej = (zzej) obj;
            if (this.zzb.equals(zzej.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzej.zzc;
                if (ch != ch2) {
                    return ch != null && ch.equals(ch2);
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public int zza(byte[] bArr, CharSequence charSequence) {
        zzef zzef;
        bArr.getClass();
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i8 = 0;
            int i10 = 0;
            while (i8 < zze.length()) {
                long j10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    zzef = this.zzb;
                    if (i11 >= zzef.zzc) {
                        break;
                    }
                    j10 <<= zzef.zzb;
                    if (i8 + i11 < zze.length()) {
                        j10 |= (long) this.zzb.zzb(zze.charAt(i12 + i8));
                        i12++;
                    }
                    i11++;
                }
                int i13 = zzef.zzd;
                int i14 = i13 * 8;
                int i15 = i12 * zzef.zzb;
                int i16 = (i13 - 1) * 8;
                while (i16 >= i14 - i15) {
                    bArr[i10] = (byte) ((int) ((j10 >>> i16) & 255));
                    i16 -= 8;
                    i10++;
                }
                i8 += this.zzb.zzc;
            }
            return i10;
        }
        throw new zzei(q.a("Invalid input length ", zze.length()));
    }

    public void zzb(Appendable appendable, byte[] bArr, int i8, int i10) {
        int i11 = 0;
        zzdr.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            zzf(appendable, bArr, i11, Math.min(this.zzb.zzd, i10 - i11));
            i11 += this.zzb.zzd;
        }
    }

    public final int zzc(int i8) {
        return (int) (((((long) this.zzb.zzb) * ((long) i8)) + 7) / 8);
    }

    public final int zzd(int i8) {
        zzef zzef = this.zzb;
        return zzem.zza(i8, zzef.zzd, RoundingMode.CEILING) * zzef.zzc;
    }

    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i8, int i10) {
        zzdr.zzd(i8, i8 + i10, bArr.length);
        int i11 = 0;
        zzdr.zza(i10 <= this.zzb.zzd);
        long j10 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j10 = (j10 | ((long) (bArr[i8 + i12] & 255))) << 8;
        }
        int i13 = ((i10 + 1) * 8) - this.zzb.zzb;
        while (i11 < i10 * 8) {
            zzef zzef = this.zzb;
            appendable.append(zzef.zza(zzef.zza & ((int) (j10 >>> (i13 - i11)))));
            i11 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i11 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i11 += this.zzb.zzb;
            }
        }
    }

    public zzej(String str, String str2, Character ch) {
        this(new zzef(str, str2.toCharArray()), ch);
    }
}
