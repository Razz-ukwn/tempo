package com.google.android.recaptcha.internal;

import b2.c;
import com.google.android.recaptcha.internal.zzeq;
import com.google.android.recaptcha.internal.zzer;
import java.io.IOException;

public abstract class zzer<MessageType extends zzer<MessageType, BuilderType>, BuilderType extends zzeq<MessageType, BuilderType>> implements zzip {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzc(java.lang.Iterable r5, java.util.List r6) {
        /*
            byte[] r0 = com.google.android.recaptcha.internal.zzhn.zzd
            r5.getClass()
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzhx
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            if (r0 == 0) goto L_0x0055
            com.google.android.recaptcha.internal.zzhx r5 = (com.google.android.recaptcha.internal.zzhx) r5
            java.util.List r5 = r5.zzh()
            r0 = r6
            com.google.android.recaptcha.internal.zzhx r0 = (com.google.android.recaptcha.internal.zzhx) r0
            int r6 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x001e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x0045
            int r5 = r0.size()
            int r5 = r5 - r6
            java.lang.String r5 = d.a.a(r2, r5, r1)
            int r1 = r0.size()
        L_0x0037:
            int r1 = r1 + -1
            if (r1 < r6) goto L_0x003f
            r0.remove(r1)
            goto L_0x0037
        L_0x003f:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x0045:
            boolean r4 = r3 instanceof com.google.android.recaptcha.internal.zzfi
            if (r4 == 0) goto L_0x004f
            com.google.android.recaptcha.internal.zzfi r3 = (com.google.android.recaptcha.internal.zzfi) r3
            r0.zzi(r3)
            goto L_0x001e
        L_0x004f:
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L_0x001e
        L_0x0055:
            boolean r0 = r5 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x006c
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r6.size()
            int r4 = r5.size()
            int r4 = r4 + r3
            r0.ensureCapacity(r4)
        L_0x006c:
            int r0 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x0074:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x009b
            int r5 = r6.size()
            int r5 = r5 - r0
            java.lang.String r5 = d.a.a(r2, r5, r1)
            int r1 = r6.size()
        L_0x008d:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0095
            r6.remove(r1)
            goto L_0x008d
        L_0x0095:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x009b:
            r6.add(r3)
            goto L_0x0074
        L_0x009f:
            return
        L_0x00a0:
            r6.addAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzer.zzc(java.lang.Iterable, java.util.List):void");
    }

    public int zza(zzjc zzjc) {
        throw null;
    }

    public final zzfi zzb() {
        try {
            int zzn = zzn();
            zzfi zzfi = zzfi.zzb;
            byte[] bArr = new byte[zzn];
            zzft zzA = zzft.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return new zzff(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzft zzA = zzft.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
