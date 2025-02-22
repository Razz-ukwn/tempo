package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x5  reason: invalid package */
public final class x5 {

    /* renamed from: a  reason: collision with root package name */
    public final wf f5074a;

    public x5(wf wfVar) {
        this.f5074a = wfVar;
    }

    public final synchronized w5 a() {
        return w5.a((ag) this.f5074a.h());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(com.google.android.gms.internal.p000firebaseauthapi.t5 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.tf r2 = r2.f4942a     // Catch:{ all -> 0x0028 }
            monitor-enter(r1)     // Catch:{ all -> 0x0028 }
            monitor-enter(r1)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.firebase-auth-api.rf r0 = com.google.android.gms.internal.p000firebaseauthapi.i6.b(r2)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.firebase-auth-api.mg r2 = r2.w()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.firebase-auth-api.yf r2 = r1.d(r0, r2)     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.firebase-auth-api.wf r0 = r1.f5074a     // Catch:{ all -> 0x0021 }
            r0.j()     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.firebase-auth-api.p2 r0 = r0.f4729b     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.firebase-auth-api.ag r0 = (com.google.android.gms.internal.p000firebaseauthapi.ag) r0     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.p000firebaseauthapi.ag.C(r0, r2)     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            goto L_0x0026
        L_0x0023:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r2     // Catch:{ all -> 0x0021 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.x5.b(com.google.android.gms.internal.firebase-auth-api.t5):void");
    }

    public final synchronized void c(int i8) {
        int i10 = 0;
        while (i10 < ((ag) this.f5074a.f4729b).t()) {
            yf w10 = ((ag) this.f5074a.f4729b).w(i10);
            if (w10.t() != i8) {
                i10++;
            } else if (w10.C() == 3) {
                wf wfVar = this.f5074a;
                wfVar.j();
                ((ag) wfVar.f4729b).zzd = i8;
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i8);
            }
        }
        throw new GeneralSecurityException("key not found: " + i8);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized com.google.android.gms.internal.p000firebaseauthapi.yf d(com.google.android.gms.internal.p000firebaseauthapi.rf r4, com.google.android.gms.internal.p000firebaseauthapi.mg r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x004a }
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.tb.a()     // Catch:{ all -> 0x0054 }
        L_0x0006:
            boolean r1 = r3.e(r0)     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0011
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.tb.a()     // Catch:{ all -> 0x0054 }
            goto L_0x0006
        L_0x0011:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.mg r1 = com.google.android.gms.internal.p000firebaseauthapi.mg.UNKNOWN_PREFIX     // Catch:{ all -> 0x004a }
            if (r5 == r1) goto L_0x004c
            com.google.android.gms.internal.firebase-auth-api.xf r1 = com.google.android.gms.internal.p000firebaseauthapi.yf.v()     // Catch:{ all -> 0x004a }
            r1.j()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.p2 r2 = r1.f4729b     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.yf r2 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r2     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.p000firebaseauthapi.yf.y(r2, r4)     // Catch:{ all -> 0x004a }
            r1.j()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.p2 r4 = r1.f4729b     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.yf r4 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r4     // Catch:{ all -> 0x004a }
            r4.zzf = r0     // Catch:{ all -> 0x004a }
            r1.j()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.p2 r4 = r1.f4729b     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.yf r4 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r4     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.p000firebaseauthapi.yf.D(r4)     // Catch:{ all -> 0x004a }
            r1.j()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.p2 r4 = r1.f4729b     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.yf r4 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r4     // Catch:{ all -> 0x004a }
            r4.zzg = r5.zza()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.p2 r4 = r1.h()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.firebase-auth-api.yf r4 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r4     // Catch:{ all -> 0x004a }
            monitor-exit(r3)
            return r4
        L_0x004a:
            r4 = move-exception
            goto L_0x0057
        L_0x004c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x004a }
            java.lang.String r5 = "unknown output prefix type"
            r4.<init>(r5)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ all -> 0x004a }
        L_0x0054:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ all -> 0x004a }
        L_0x0057:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.x5.d(com.google.android.gms.internal.firebase-auth-api.rf, com.google.android.gms.internal.firebase-auth-api.mg):com.google.android.gms.internal.firebase-auth-api.yf");
    }

    public final synchronized boolean e(int i8) {
        for (yf t2 : Collections.unmodifiableList(((ag) this.f5074a.f4729b).A())) {
            if (t2.t() == i8) {
                return true;
            }
        }
        return false;
    }
}
