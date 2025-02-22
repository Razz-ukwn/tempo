package r4;

import ag.b1;
import c2.d;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m5.a;
import p4.h;
import r4.j;

public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final d<List<Throwable>> f13991a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends l<Data, ResourceType, Transcode>> f13992b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13993c;

    public u(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f13991a = cVar;
        if (!list.isEmpty()) {
            this.f13992b = list;
            this.f13993c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w a(int i8, int i10, h hVar, e eVar, j.b bVar) {
        w wVar;
        d<List<Throwable>> dVar = this.f13991a;
        List<Throwable> b10 = dVar.b();
        b1.b(b10);
        List list = b10;
        try {
            List<? extends l<Data, ResourceType, Transcode>> list2 = this.f13992b;
            int size = list2.size();
            wVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                wVar = ((l) list2.get(i11)).a(i8, i10, hVar, eVar, bVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (s e10) {
            list.add(e10);
        } catch (Throwable th) {
            dVar.a(list);
            throw th;
        }
        if (wVar != null) {
            dVar.a(list);
            return wVar;
        }
        throw new s(this.f13993c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f13992b.toArray()) + '}';
    }
}
