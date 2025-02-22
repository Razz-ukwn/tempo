package xg;

import ff.m;
import java.io.IOException;
import rf.p;
import sf.k;
import sf.r;
import sf.u;
import wg.c0;

public final class h extends k implements p<Integer, Long, m> {
    public final /* synthetic */ u B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f17088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f17089b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f17090c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ wg.h f17091d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f17092e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(r rVar, long j10, u uVar, c0 c0Var, u uVar2, u uVar3) {
        super(2);
        this.f17088a = rVar;
        this.f17089b = j10;
        this.f17090c = uVar;
        this.f17091d = c0Var;
        this.f17092e = uVar2;
        this.B = uVar3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            r rVar = this.f17088a;
            if (!rVar.f14953a) {
                rVar.f14953a = true;
                if (longValue >= this.f17089b) {
                    u uVar = this.f17090c;
                    long j10 = uVar.f14956a;
                    int i8 = (j10 > 4294967295L ? 1 : (j10 == 4294967295L ? 0 : -1));
                    wg.h hVar = this.f17091d;
                    if (i8 == 0) {
                        j10 = hVar.t0();
                    }
                    uVar.f14956a = j10;
                    u uVar2 = this.f17092e;
                    long j11 = 0;
                    uVar2.f14956a = uVar2.f14956a == 4294967295L ? hVar.t0() : 0;
                    u uVar3 = this.B;
                    if (uVar3.f14956a == 4294967295L) {
                        j11 = hVar.t0();
                    }
                    uVar3.f14956a = j11;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return m.f8717a;
    }
}
