package dc;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dc.b;
import nb.b;
import sf.j;
import sf.r;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f7501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f7502b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f7503c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b.a f7504d;

    public /* synthetic */ a(r rVar, b bVar, nb.b bVar2, b.a aVar) {
        this.f7501a = rVar;
        this.f7502b = bVar;
        this.f7503c = bVar2;
        this.f7504d = aVar;
    }

    public final void onClick(View view) {
        r rVar = this.f7501a;
        j.f(rVar, "$isSelect");
        b bVar = this.f7502b;
        j.f(bVar, "this$0");
        nb.b bVar2 = this.f7503c;
        j.f(bVar2, "$miMedia");
        b.a aVar = this.f7504d;
        j.f(aVar, "this$1");
        rb.a aVar2 = rb.a.V;
        if (aVar2.G > 1) {
            boolean z10 = !rVar.f14953a;
            rVar.f14953a = z10;
            RecyclerView.f fVar = bVar.f2459a;
            if (!z10) {
                int c3 = aVar.c();
                boolean remove = aVar2.E.remove(bVar2);
                String str = bVar.f7506e;
                if (remove) {
                    j.e(str, "logTag");
                    fVar.d((Object) null, c3, 1);
                } else {
                    j.e(str, "logTag");
                }
            } else {
                int c10 = aVar.c();
                if (aVar2.E.size() != aVar2.G) {
                    aVar2.E.add(bVar2);
                    fVar.d((Object) null, c10, 1);
                }
            }
        } else if (aVar2.E.size() != aVar2.G) {
            aVar2.E.add(0, bVar2);
        } else {
            aVar2.E.set(0, bVar2);
        }
        bVar.f7505d.invoke(aVar2.E);
    }
}
