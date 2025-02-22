package ec;

import jf.d;
import lf.c;
import lf.e;

@e(c = "com.lassi.presentation.mediadirectory.FolderViewModel", f = "FolderViewModel.kt", l = {49, 54}, m = "checkAndInsertNewDataIntoDatabase")
public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    public g f7917a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7918b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f7919c;

    /* renamed from: d  reason: collision with root package name */
    public int f7920d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, d<? super f> dVar) {
        super(dVar);
        this.f7919c = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7918b = obj;
        this.f7920d |= Integer.MIN_VALUE;
        return g.e(this.f7919c, this);
    }
}
