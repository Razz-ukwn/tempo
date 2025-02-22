package com.google.android.gms.internal.measurement;

import cb.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class u8 extends a9 {
    public u8(int i8) {
        super(i8);
    }

    public final void a() {
        if (!this.f5155d) {
            for (int i8 = 0; i8 < b(); i8++) {
                Map.Entry entry = (Map.Entry) this.f5153b.get(i8);
                if (((w6) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f5154c.isEmpty() ? b.f3882c : this.f5154c.entrySet()) {
                if (((w6) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
