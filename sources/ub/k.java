package ub;

import com.lassi.presentation.cameraview.controls.g;
import tb.c;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f15973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f15974b;

    public k(g gVar, c cVar) {
        this.f15974b = gVar;
        this.f15973a = cVar;
    }

    public final void run() {
        g gVar = this.f15974b;
        if (gVar.v()) {
            gVar.k();
        } else {
            gVar.f6480d = this.f15973a;
        }
    }
}
