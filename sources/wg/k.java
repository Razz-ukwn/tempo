package wg;

import gf.q;
import gf.t;
import gf.y;
import java.util.ArrayList;
import java.util.Map;
import rf.l;
import sf.j;
import xf.b;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16773a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16774b;

    /* renamed from: c  reason: collision with root package name */
    public final z f16775c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f16776d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f16777e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f16778f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f16779g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<b<?>, Object> f16780h;

    public k(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13, Map<b<?>, ? extends Object> map) {
        j.f(map, "extras");
        this.f16773a = z10;
        this.f16774b = z11;
        this.f16775c = zVar;
        this.f16776d = l10;
        this.f16777e = l11;
        this.f16778f = l12;
        this.f16779g = l13;
        this.f16780h = y.W(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f16773a) {
            arrayList.add("isRegularFile");
        }
        if (this.f16774b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f16776d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f16777e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f16778f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f16779g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map<b<?>, Object> map = this.f16780h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return q.A0(arrayList, ", ", "FileMetadata(", ")", (l) null, 56);
    }

    public /* synthetic */ k(boolean z10, boolean z11, z zVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, zVar, l10, l11, l12, l13, t.f8979a);
    }
}
