package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public final class a8 {

    /* renamed from: b  reason: collision with root package name */
    public static final x7 f5150b = new x7();

    /* renamed from: a  reason: collision with root package name */
    public final y7 f5151a;

    public a8() {
        g8 g8Var;
        g8[] g8VarArr = new g8[2];
        g8VarArr[0] = b7.f5165a;
        try {
            g8Var = (g8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            g8Var = f5150b;
        }
        g8VarArr[1] = g8Var;
        y7 y7Var = new y7(g8VarArr);
        Charset charset = m7.f5399a;
        this.f5151a = y7Var;
    }
}
