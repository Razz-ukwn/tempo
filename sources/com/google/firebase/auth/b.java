package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6323a;

    public b(FirebaseAuth firebaseAuth) {
        this.f6323a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f6323a.f6308d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a();
        }
    }
}
