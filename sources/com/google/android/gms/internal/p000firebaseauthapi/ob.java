package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ob  reason: invalid package */
public final class ob {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4780a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4781b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4782c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f4783d;

    public ob() {
        this.f4780a = new HashMap();
        this.f4781b = new HashMap();
        this.f4782c = new HashMap();
        this.f4783d = new HashMap();
    }

    public final void a(ja jaVar) {
        pb pbVar = new pb(jaVar.f4738b, jaVar.f4737a);
        HashMap hashMap = this.f4781b;
        if (hashMap.containsKey(pbVar)) {
            ma maVar = (ma) hashMap.get(pbVar);
            if (!maVar.equals(jaVar) || !jaVar.equals(maVar)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(pbVar.toString()));
            }
            return;
        }
        hashMap.put(pbVar, jaVar);
    }

    public final void b(na naVar) {
        qb qbVar = new qb(naVar.f4778a, naVar.f4779b);
        HashMap hashMap = this.f4780a;
        if (hashMap.containsKey(qbVar)) {
            oa oaVar = (oa) hashMap.get(qbVar);
            if (!oaVar.equals(naVar) || !naVar.equals(oaVar)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(qbVar.toString()));
            }
            return;
        }
        hashMap.put(qbVar, naVar);
    }

    public final void c(ya yaVar) {
        pb pbVar = new pb(yaVar.f5133b, yaVar.f5132a);
        HashMap hashMap = this.f4783d;
        if (hashMap.containsKey(pbVar)) {
            za zaVar = (za) hashMap.get(pbVar);
            if (!zaVar.equals(yaVar) || !yaVar.equals(zaVar)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(pbVar.toString()));
            }
            return;
        }
        hashMap.put(pbVar, yaVar);
    }

    public final void d(ab abVar) {
        qb qbVar = new qb(abVar.f4428a, abVar.f4429b);
        HashMap hashMap = this.f4782c;
        if (hashMap.containsKey(qbVar)) {
            bb bbVar = (bb) hashMap.get(qbVar);
            if (!bbVar.equals(abVar) || !abVar.equals(bbVar)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(qbVar.toString()));
            }
            return;
        }
        hashMap.put(qbVar, abVar);
    }

    public ob(rb rbVar) {
        this.f4780a = new HashMap(rbVar.f4881a);
        this.f4781b = new HashMap(rbVar.f4882b);
        this.f4782c = new HashMap(rbVar.f4883c);
        this.f4783d = new HashMap(rbVar.f4884d);
    }
}
