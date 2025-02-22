package zg;

import ab.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jg.d0;
import k7.g;
import yg.c0;
import yg.f;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final i f17982a;

    public a(i iVar) {
        this.f17982a = iVar;
    }

    public final f a(Type type) {
        gb.a aVar = new gb.a(type);
        i iVar = this.f17982a;
        return new b(iVar, iVar.c(aVar));
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        gb.a aVar = new gb.a(type);
        i iVar = this.f17982a;
        return new g((Object) iVar, (Object) iVar.c(aVar));
    }
}
