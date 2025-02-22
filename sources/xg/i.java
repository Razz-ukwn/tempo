package xg;

import ff.m;
import java.io.IOException;
import rf.p;
import sf.k;
import sf.v;
import wg.c0;
import wg.h;

public final class i extends k implements p<Integer, Long, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f17093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v<Long> f17094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v<Long> f17095c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v<Long> f17096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(c0 c0Var, v vVar, v vVar2, v vVar3) {
        super(2);
        this.f17093a = c0Var;
        this.f17094b = vVar;
        this.f17095c = vVar2;
        this.f17096d = vVar3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j10 = 1;
            if (longValue >= 1) {
                h hVar = this.f17093a;
                byte readByte = hVar.readByte() & 255;
                boolean z10 = true;
                boolean z11 = (readByte & 1) == 1;
                boolean z12 = (readByte & 2) == 2;
                if ((readByte & 4) != 4) {
                    z10 = false;
                }
                if (z11) {
                    j10 = 5;
                }
                if (z12) {
                    j10 += 4;
                }
                if (z10) {
                    j10 += 4;
                }
                if (longValue >= j10) {
                    if (z11) {
                        this.f17094b.f14957a = Long.valueOf(((long) hVar.l0()) * 1000);
                    }
                    if (z12) {
                        this.f17095c.f14957a = Long.valueOf(((long) hVar.l0()) * 1000);
                    }
                    if (z10) {
                        this.f17096d.f14957a = Long.valueOf(((long) hVar.l0()) * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return m.f8717a;
    }
}
