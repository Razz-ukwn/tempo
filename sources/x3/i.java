package x3;

import android.graphics.Bitmap;
import coil.request.RequestDelegate;
import h4.h;
import jf.d;
import lf.c;
import lf.e;

@e(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {169, 180, 184}, m = "executeMain")
public final class i extends c {
    public /* synthetic */ Object B;
    public final /* synthetic */ h C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public h f16944a;

    /* renamed from: b  reason: collision with root package name */
    public RequestDelegate f16945b;

    /* renamed from: c  reason: collision with root package name */
    public h f16946c;

    /* renamed from: d  reason: collision with root package name */
    public b f16947d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f16948e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar, d<? super i> dVar) {
        super(dVar);
        this.C = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return h.c(this.C, (h) null, this);
    }
}
