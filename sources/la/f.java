package la;

import android.util.Base64;
import android.util.JsonWriter;
import ja.b;
import ja.c;
import ja.d;
import ja.e;
import ja.g;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class f implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11051a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f11052b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f11053c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, ja.f<?>> f11054d;

    /* renamed from: e  reason: collision with root package name */
    public final d<Object> f11055e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11056f;

    public f(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f11052b = new JsonWriter(writer);
        this.f11053c = hashMap;
        this.f11054d = hashMap2;
        this.f11055e = aVar;
        this.f11056f = z10;
    }

    public final e a(c cVar, boolean z10) {
        String str = cVar.f9895a;
        i();
        JsonWriter jsonWriter = this.f11052b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z10);
        return this;
    }

    public final g b(String str) {
        i();
        this.f11052b.value(str);
        return this;
    }

    public final g c(boolean z10) {
        i();
        this.f11052b.value(z10);
        return this;
    }

    public final e d(c cVar, Object obj) {
        return h(obj, cVar.f9895a);
    }

    public final e e(c cVar, long j10) {
        String str = cVar.f9895a;
        i();
        JsonWriter jsonWriter = this.f11052b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j10);
        return this;
    }

    public final e f(c cVar, int i8) {
        String str = cVar.f9895a;
        i();
        JsonWriter jsonWriter = this.f11052b;
        jsonWriter.name(str);
        i();
        jsonWriter.value((long) i8);
        return this;
    }

    public final f g(Object obj) {
        JsonWriter jsonWriter = this.f11052b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i8 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    i();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i8 < length) {
                        jsonWriter.value((long) iArr[i8]);
                        i8++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i8 < length2) {
                        long j10 = jArr[i8];
                        i();
                        jsonWriter.value(j10);
                        i8++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i8 < length3) {
                        jsonWriter.value(dArr[i8]);
                        i8++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i8 < length4) {
                        jsonWriter.value(zArr[i8]);
                        i8++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i8 < length5) {
                        g(numberArr[i8]);
                        i8++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i8 < length6) {
                        g(objArr[i8]);
                        i8++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object g10 : (Collection) obj) {
                    g(g10);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                d dVar = this.f11053c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                ja.f fVar = this.f11054d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    i();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f11055e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final f h(Object obj, String str) {
        boolean z10 = this.f11056f;
        JsonWriter jsonWriter = this.f11052b;
        if (!z10) {
            i();
            jsonWriter.name(str);
            if (obj != null) {
                return g(obj);
            }
            jsonWriter.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            jsonWriter.name(str);
            return g(obj);
        }
    }

    public final void i() {
        if (!this.f11051a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
