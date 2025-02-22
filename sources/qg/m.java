package qg;

import java.util.List;
import mg.a;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f13692e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13693f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f13694g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i8, List list) {
        super(str, true);
        this.f13692e = fVar;
        this.f13693f = i8;
        this.f13694g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            qg.f r0 = r3.f13692e
            gc.b r0 = r0.H
            java.util.List r1 = r3.f13694g
            r0.getClass()
            java.lang.String r0 = "requestHeaders"
            sf.j.f(r1, r0)
            qg.f r0 = r3.f13692e     // Catch:{ IOException -> 0x002e }
            qg.s r0 = r0.U     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f13693f     // Catch:{ IOException -> 0x002e }
            qg.b r2 = qg.b.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.q(r1, r2)     // Catch:{ IOException -> 0x002e }
            qg.f r0 = r3.f13692e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            qg.f r1 = r3.f13692e     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r1.W     // Catch:{ all -> 0x002b }
            int r2 = r3.f13693f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.m.a():long");
    }
}
