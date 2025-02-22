package zg;

import ab.a0;
import ab.i;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import jg.b0;
import jg.t;
import jg.z;
import sf.j;
import wg.e;
import yg.f;

public final class b<T> implements f<T, b0> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f17983c = t.a.a("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f17984d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final i f17985a;

    /* renamed from: b  reason: collision with root package name */
    public final a0<T> f17986b;

    static {
        Pattern pattern = t.f10171d;
    }

    public b(i iVar, a0<T> a0Var) {
        this.f17985a = iVar;
        this.f17986b = a0Var;
    }

    public final Object a(Object obj) {
        e eVar = new e();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new wg.f(eVar), f17984d);
        i iVar = this.f17985a;
        if (iVar.f254h) {
            outputStreamWriter.write(")]}'\n");
        }
        hb.b bVar = new hb.b(outputStreamWriter);
        if (iVar.f256j) {
            bVar.f9295d = "  ";
            bVar.f9296e = ": ";
        }
        bVar.C = iVar.f255i;
        bVar.B = iVar.f257k;
        bVar.E = iVar.f253g;
        this.f17986b.b(bVar, obj);
        bVar.close();
        wg.i Q = eVar.Q();
        j.f(Q, "content");
        return new z(f17983c, Q);
    }
}
