package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import va.b;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6322a;

    public a(FirebaseAuth firebaseAuth, b bVar) {
        this.f6322a = firebaseAuth;
    }

    public final void run() {
        FirebaseAuth firebaseAuth = this.f6322a;
        Iterator it = firebaseAuth.f6307c.iterator();
        while (it.hasNext()) {
            ((s9.a) it.next()).a();
        }
        Iterator it2 = firebaseAuth.f6306b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a();
        }
    }
}
