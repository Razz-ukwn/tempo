package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.m2;
import com.google.android.gms.internal.p000firebaseauthapi.p2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m2  reason: invalid package */
public class m2<MessageType extends p2<MessageType, BuilderType>, BuilderType extends m2<MessageType, BuilderType>> extends d1<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    public final p2 f4728a;

    /* renamed from: b  reason: collision with root package name */
    public p2 f4729b;

    public m2(MessageType messagetype) {
        this.f4728a = messagetype;
        if (!messagetype.k()) {
            this.f4729b = messagetype.q();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Object clone() {
        m2 m2Var = (m2) this.f4728a.n(5);
        m2Var.f4729b = i();
        return m2Var;
    }

    public final void g(p2 p2Var) {
        p2 p2Var2 = this.f4728a;
        if (!p2Var2.equals(p2Var)) {
            if (!this.f4729b.k()) {
                p2 q10 = p2Var2.q();
                w3.f5030c.a(q10.getClass()).zzg(q10, this.f4729b);
                this.f4729b = q10;
            }
            p2 p2Var3 = this.f4729b;
            w3.f5030c.a(p2Var3.getClass()).zzg(p2Var3, p2Var);
        }
    }

    public final MessageType h() {
        MessageType i8 = i();
        if (i8.j()) {
            return i8;
        }
        throw new j4();
    }

    public final MessageType i() {
        if (!this.f4729b.k()) {
            return this.f4729b;
        }
        p2 p2Var = this.f4729b;
        p2Var.getClass();
        w3.f5030c.a(p2Var.getClass()).zzf(p2Var);
        p2Var.e();
        return this.f4729b;
    }

    public final void j() {
        if (!this.f4729b.k()) {
            p2 q10 = this.f4728a.q();
            w3.f5030c.a(q10.getClass()).zzg(q10, this.f4729b);
            this.f4729b = q10;
        }
    }
}
