package r4;

import android.util.Log;
import c2.d;
import com.bumptech.glide.load.data.e;
import d5.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m5.a;
import p4.h;
import p4.j;

public final class l<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f13925a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<DataType, ResourceType>> f13926b;

    /* renamed from: c  reason: collision with root package name */
    public final b<ResourceType, Transcode> f13927c;

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f13928d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13929e;

    public l(Class cls, Class cls2, Class cls3, List list, b bVar, a.c cVar) {
        this.f13925a = cls;
        this.f13926b = list;
        this.f13927c = bVar;
        this.f13928d = cVar;
        this.f13929e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: r4.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: r4.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: r4.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: r4.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: r4.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: r4.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: r4.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: r4.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: r4.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r4.w a(int r18, int r19, p4.h r20, com.bumptech.glide.load.data.e r21, r4.j.b r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            c2.d<java.util.List<java.lang.Throwable>> r8 = r7.f13928d
            java.lang.Object r1 = r8.b()
            ag.b1.b(r1)
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r9
            r4.w r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x012c }
            r8.a(r9)
            r4.j r2 = r4.j.this
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            p4.a r3 = p4.a.f12449d
            p4.a r0 = r0.f13917a
            r4.i<R> r4 = r2.f13910a
            r5 = 0
            if (r0 == r3) goto L_0x0048
            p4.l r3 = r4.f(r15)
            com.bumptech.glide.h r6 = r2.D
            int r8 = r2.H
            int r9 = r2.I
            r4.w r6 = r3.b(r6, r1, r8, r9)
            r14 = r3
            goto L_0x004a
        L_0x0048:
            r6 = r1
            r14 = r5
        L_0x004a:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x0053
            r1.c()
        L_0x0053:
            com.bumptech.glide.h r1 = r4.f13895c
            com.bumptech.glide.k r1 = r1.f4061b
            g5.d r1 = r1.f4080d
            java.lang.Class r3 = r6.d()
            p4.k r1 = r1.a(r3)
            r3 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0067
            r1 = r13
            goto L_0x0068
        L_0x0067:
            r1 = r3
        L_0x0068:
            if (r1 == 0) goto L_0x008e
            com.bumptech.glide.h r1 = r4.f13895c
            com.bumptech.glide.k r1 = r1.f4061b
            r1.getClass()
            java.lang.Class r5 = r6.d()
            g5.d r1 = r1.f4080d
            p4.k r5 = r1.a(r5)
            if (r5 == 0) goto L_0x0084
            p4.h r1 = r2.K
            p4.c r1 = r5.e(r1)
            goto L_0x0090
        L_0x0084:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Class r1 = r6.d()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            p4.c r1 = p4.c.f12456c
        L_0x0090:
            p4.f r8 = r2.T
            java.util.ArrayList r9 = r4.b()
            int r10 = r9.size()
            r11 = r3
        L_0x009b:
            if (r11 >= r10) goto L_0x00b0
            java.lang.Object r12 = r9.get(r11)
            v4.n$a r12 = (v4.n.a) r12
            p4.f r12 = r12.f16188a
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L_0x00ad
            r8 = r13
            goto L_0x00b1
        L_0x00ad:
            int r11 = r11 + 1
            goto L_0x009b
        L_0x00b0:
            r8 = r3
        L_0x00b1:
            r8 = r8 ^ r13
            r4.m r9 = r2.J
            boolean r0 = r9.d(r8, r0, r1)
            if (r0 == 0) goto L_0x0123
            if (r5 == 0) goto L_0x0115
            int r0 = r1.ordinal()
            if (r0 == 0) goto L_0x00f0
            if (r0 != r13) goto L_0x00dc
            r4.y r0 = new r4.y
            com.bumptech.glide.h r1 = r4.f13895c
            s4.b r9 = r1.f4060a
            p4.f r10 = r2.T
            p4.f r11 = r2.E
            int r12 = r2.H
            int r1 = r2.I
            p4.h r4 = r2.K
            r8 = r0
            r13 = r1
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00f9
        L_0x00dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown strategy: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f0:
            r4.f r0 = new r4.f
            p4.f r1 = r2.T
            p4.f r4 = r2.E
            r0.<init>(r1, r4)
        L_0x00f9:
            m5.a$c r1 = r4.v.f13994e
            java.lang.Object r1 = r1.b()
            r4.v r1 = (r4.v) r1
            ag.b1.b(r1)
            r1.f13998d = r3
            r3 = 1
            r1.f13997c = r3
            r1.f13996b = r6
            r4.j$c<?> r2 = r2.B
            r2.f13919a = r0
            r2.f13920b = r5
            r2.f13921c = r1
            r6 = r1
            goto L_0x0123
        L_0x0115:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Object r1 = r6.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x0123:
            d5.b<ResourceType, Transcode> r0 = r7.f13927c
            r1 = r20
            r4.w r0 = r0.d(r6, r1)
            return r0
        L_0x012c:
            r0 = move-exception
            r1 = r0
            r8.a(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.l.a(int, int, p4.h, com.bumptech.glide.load.data.e, r4.j$b):r4.w");
    }

    public final w<ResourceType> b(e<DataType> eVar, int i8, int i10, h hVar, List<Throwable> list) {
        List<? extends j<DataType, ResourceType>> list2 = this.f13926b;
        int size = list2.size();
        w<ResourceType> wVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) list2.get(i11);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    wVar = jVar.a(eVar.a(), i8, i10, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new s(this.f13929e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f13925a + ", decoders=" + this.f13926b + ", transcoder=" + this.f13927c + '}';
    }
}
