package lf;

import jf.d;
import jf.e;
import jf.f;
import sf.j;

public abstract class c extends a {
    private final f _context;
    private transient d<Object> intercepted;

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this._context = fVar;
    }

    public f getContext() {
        f fVar = this._context;
        j.c(fVar);
        return fVar;
    }

    public final d<Object> intercepted() {
        d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().d(e.a.f10012a);
            if (eVar == null || (dVar = eVar.z(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    public void releaseIntercepted() {
        d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            f context = getContext();
            int i8 = e.f10011s;
            f.b d10 = context.d(e.a.f10012a);
            j.c(d10);
            ((e) d10).D(dVar);
        }
        this.intercepted = b.f11107a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
