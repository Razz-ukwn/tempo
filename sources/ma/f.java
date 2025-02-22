package ma;

import androidx.fragment.app.f1;
import androidx.fragment.app.g1;
import ja.b;
import ja.c;
import ja.d;
import ja.e;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f11354f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final c f11355g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f11356h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f11357i = new e();

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f11358a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f11359b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, ja.f<?>> f11360c;

    /* renamed from: d  reason: collision with root package name */
    public final d<Object> f11361d;

    /* renamed from: e  reason: collision with root package name */
    public final h f11362e = new h(this);

    static {
        Class<d> cls = d.class;
        f11355g = new c("key", g1.d(f1.d(cls, new a(1))));
        f11356h = new c("value", g1.d(f1.d(cls, new a(2))));
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, d dVar) {
        this.f11358a = byteArrayOutputStream;
        this.f11359b = map;
        this.f11360c = map2;
        this.f11361d = dVar;
    }

    public static int h(c cVar) {
        d dVar = (d) ((Annotation) cVar.f9896b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f11350a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final e a(c cVar, boolean z10) {
        c(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final f b(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            i((h(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f11354f);
            i(bytes.length);
            this.f11358a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object b10 : (Collection) obj) {
                b(cVar, b10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry g10 : ((Map) obj).entrySet()) {
                g(f11357i, cVar, g10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                i((h(cVar) << 3) | 1);
                this.f11358a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                i((h(cVar) << 3) | 5);
                this.f11358a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z10 || longValue != 0) {
                d dVar = (d) ((Annotation) cVar.f9896b.get(d.class));
                if (dVar != null) {
                    i(((a) dVar).f11350a << 3);
                    j(longValue);
                } else {
                    throw new b("Field has no @Protobuf config");
                }
            }
            return this;
        } else if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            i((h(cVar) << 3) | 2);
            i(bArr.length);
            this.f11358a.write(bArr);
            return this;
        } else {
            d dVar2 = this.f11359b.get(obj.getClass());
            if (dVar2 != null) {
                g(dVar2, cVar, obj, z10);
                return this;
            }
            ja.f fVar = this.f11360c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.f11362e;
                hVar.f11367a = false;
                hVar.f11369c = cVar;
                hVar.f11368b = z10;
                fVar.a(obj, hVar);
                return this;
            } else if (obj instanceof c) {
                c(cVar, ((c) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                c(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                g(this.f11361d, cVar, obj, z10);
                return this;
            }
        }
    }

    public final void c(c cVar, int i8, boolean z10) {
        if (!z10 || i8 != 0) {
            d dVar = (d) ((Annotation) cVar.f9896b.get(d.class));
            if (dVar != null) {
                i(((a) dVar).f11350a << 3);
                i(i8);
                return;
            }
            throw new b("Field has no @Protobuf config");
        }
    }

    public final e d(c cVar, Object obj) {
        b(cVar, obj, true);
        return this;
    }

    public final e e(c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) ((Annotation) cVar.f9896b.get(d.class));
            if (dVar != null) {
                i(((a) dVar).f11350a << 3);
                j(j10);
            } else {
                throw new b("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final e f(c cVar, int i8) {
        c(cVar, i8, true);
        return this;
    }

    public final void g(d dVar, c cVar, Object obj, boolean z10) {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f11358a;
            this.f11358a = bVar;
            dVar.a(obj, this);
            this.f11358a = outputStream;
            long j10 = bVar.f11351a;
            bVar.close();
            if (!z10 || j10 != 0) {
                i((h(cVar) << 3) | 2);
                j(j10);
                dVar.a(obj, this);
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(int i8) {
        while (((long) (i8 & -128)) != 0) {
            this.f11358a.write((i8 & 127) | 128);
            i8 >>>= 7;
        }
        this.f11358a.write(i8 & 127);
    }

    public final void j(long j10) {
        while ((-128 & j10) != 0) {
            this.f11358a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f11358a.write(((int) j10) & 127);
    }
}
