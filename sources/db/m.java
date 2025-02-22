package db;

import ab.a0;
import ab.i;
import db.n;
import gb.a;
import hb.b;
import java.lang.reflect.Field;

public final class m extends n.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f7434d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Field f7435e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f7436f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f7437g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f7438h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a f7439i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f7440j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, boolean z10, boolean z11, boolean z12, Field field, boolean z13, a0 a0Var, i iVar, a aVar, boolean z14) {
        super(str, z10, z11);
        this.f7434d = z12;
        this.f7435e = field;
        this.f7436f = z13;
        this.f7437g = a0Var;
        this.f7438h = iVar;
        this.f7439i = aVar;
        this.f7440j = z14;
    }

    public final void a(hb.a aVar, Object obj) {
        Object a10 = this.f7437g.a(aVar);
        if (a10 != null || !this.f7440j) {
            boolean z10 = this.f7434d;
            Field field = this.f7435e;
            if (z10) {
                n.b(obj, field);
            }
            field.set(obj, a10);
        }
    }

    public final void b(b bVar, Object obj) {
        if (this.f7449b) {
            boolean z10 = this.f7434d;
            Field field = this.f7435e;
            if (z10) {
                n.b(obj, field);
            }
            Object obj2 = field.get(obj);
            if (obj2 != obj) {
                bVar.s(this.f7448a);
                boolean z11 = this.f7436f;
                a0 a0Var = this.f7437g;
                if (!z11) {
                    a0Var = new p(this.f7438h, a0Var, this.f7439i.f8929b);
                }
                a0Var.b(bVar, obj2);
            }
        }
    }
}
