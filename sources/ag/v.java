package ag;

import ff.m;
import java.util.concurrent.CancellationException;
import rf.l;
import sf.j;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f492a;

    /* renamed from: b  reason: collision with root package name */
    public final i f493b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, m> f494c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f495d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f496e;

    public v(Object obj, i iVar, l<? super Throwable, m> lVar, Object obj2, Throwable th) {
        this.f492a = obj;
        this.f493b = iVar;
        this.f494c = lVar;
        this.f495d = obj2;
        this.f496e = th;
    }

    public static v a(v vVar, i iVar, CancellationException cancellationException, int i8) {
        Object obj = null;
        Object obj2 = (i8 & 1) != 0 ? vVar.f492a : null;
        if ((i8 & 2) != 0) {
            iVar = vVar.f493b;
        }
        i iVar2 = iVar;
        l<Throwable, m> lVar = (i8 & 4) != 0 ? vVar.f494c : null;
        if ((i8 & 8) != 0) {
            obj = vVar.f495d;
        }
        Object obj3 = obj;
        Throwable th = cancellationException;
        if ((i8 & 16) != 0) {
            th = vVar.f496e;
        }
        vVar.getClass();
        return new v(obj2, iVar2, lVar, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return j.a(this.f492a, vVar.f492a) && j.a(this.f493b, vVar.f493b) && j.a(this.f494c, vVar.f494c) && j.a(this.f495d, vVar.f495d) && j.a(this.f496e, vVar.f496e);
    }

    public final int hashCode() {
        int i8 = 0;
        Object obj = this.f492a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f493b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l<Throwable, m> lVar = this.f494c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f495d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f496e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return hashCode4 + i8;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f492a + ", cancelHandler=" + this.f493b + ", onCancellation=" + this.f494c + ", idempotentResume=" + this.f495d + ", cancelCause=" + this.f496e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, i iVar, l lVar, Object obj2, CancellationException cancellationException, int i8) {
        this(obj, (i8 & 2) != 0 ? null : iVar, (i8 & 4) != 0 ? null : lVar, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : cancellationException);
    }
}
