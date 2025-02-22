package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.g7;
import java.io.IOException;

public class c7<MessageType extends g7<MessageType, BuilderType>, BuilderType extends c7<MessageType, BuilderType>> extends y5<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    public final g7 f5178a;

    /* renamed from: b  reason: collision with root package name */
    public g7 f5179b;

    public c7(MessageType messagetype) {
        this.f5178a = messagetype;
        if (!messagetype.r()) {
            this.f5179b = (g7) messagetype.s(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: h */
    public final c7 clone() {
        c7 c7Var = (c7) this.f5178a.s(5);
        c7Var.f5179b = k();
        return c7Var;
    }

    public final void i(byte[] bArr, int i8, s6 s6Var) {
        if (!this.f5179b.r()) {
            g7 g7Var = (g7) this.f5178a.s(4);
            p8.f5471c.a(g7Var.getClass()).zzg(g7Var, this.f5179b);
            this.f5179b = g7Var;
        }
        try {
            p8.f5471c.a(this.f5179b.getClass()).d(this.f5179b, bArr, 0, i8, new c6(s6Var));
        } catch (o7 e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw o7.d();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType j() {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.g7 r0 = r3.k()
            r1 = 1
            java.lang.Object r2 = r0.s(r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r1) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            if (r2 == 0) goto L_0x0029
            com.google.android.gms.internal.measurement.p8 r1 = com.google.android.gms.internal.measurement.p8.f5471c
            java.lang.Class r2 = r0.getClass()
            com.google.android.gms.internal.measurement.s8 r1 = r1.a(r2)
            boolean r1 = r1.a(r0)
            r2 = 2
            r0.s(r2)
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            return r0
        L_0x0029:
            com.google.android.gms.internal.measurement.c9 r0 = new com.google.android.gms.internal.measurement.c9
            r1 = 0
            r0.<init>((int) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c7.j():com.google.android.gms.internal.measurement.g7");
    }

    public final MessageType k() {
        if (!this.f5179b.r()) {
            return this.f5179b;
        }
        g7 g7Var = this.f5179b;
        g7Var.getClass();
        p8.f5471c.a(g7Var.getClass()).zzf(g7Var);
        g7Var.o();
        return this.f5179b;
    }

    public final void l() {
        if (!this.f5179b.r()) {
            g7 g7Var = (g7) this.f5178a.s(4);
            p8.f5471c.a(g7Var.getClass()).zzg(g7Var, this.f5179b);
            this.f5179b = g7Var;
        }
    }
}
