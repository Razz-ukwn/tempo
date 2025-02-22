package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b4  reason: invalid package */
public final class b4 extends h4 {
    public b4(int i8) {
        super(i8);
    }

    public final void a() {
        if (!this.f4613d) {
            for (int i8 = 0; i8 < b(); i8++) {
                Map.Entry entry = (Map.Entry) this.f4611b.get(i8);
                if (((h2) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f4612c.isEmpty() ? g.f4558b : this.f4612c.entrySet()) {
                if (((h2) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
