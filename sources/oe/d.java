package oe;

import java.util.Comparator;
import java.util.List;
import lf.c;
import lf.e;
import sf.v;

@e(c = "droidninja.filepicker.viewmodels.VMDocPicker", f = "VMDocPicker.kt", l = {38}, m = "queryDocs")
public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f12323a;

    /* renamed from: b  reason: collision with root package name */
    public int f12324b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f12325c;

    /* renamed from: d  reason: collision with root package name */
    public List f12326d;

    /* renamed from: e  reason: collision with root package name */
    public v f12327e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar, jf.d dVar) {
        super(dVar);
        this.f12325c = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f12323a = obj;
        this.f12324b |= Integer.MIN_VALUE;
        return this.f12325c.g((List) null, (Comparator) null, this);
    }
}
