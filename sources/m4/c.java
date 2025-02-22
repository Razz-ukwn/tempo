package m4;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import ff.e;
import i4.a;
import java.io.Closeable;
import jg.q;
import q.g;
import zf.j;
import zf.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f11189a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f11190b = Bitmap.Config.HARDWARE;

    /* renamed from: c  reason: collision with root package name */
    public static final q f11191c = new q.a().c();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11192a;

        static {
            int[] iArr = new int[g.d(4).length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            f11192a = iArr2;
            int[] iArr3 = new int[g.d(2).length];
            iArr3[0] = 1;
            iArr3[1] = 2;
        }
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || j.t0(str)) {
            return null;
        }
        String Y0 = n.Y0(n.Y0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(n.W0(n.W0(Y0, '/', Y0), '.', ""));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: h4.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final h4.q c(android.view.View r4) {
        /*
            r0 = 2131296632(0x7f090178, float:1.8211186E38)
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof h4.q
            r3 = 0
            if (r2 == 0) goto L_0x000f
            h4.q r1 = (h4.q) r1
            goto L_0x0010
        L_0x000f:
            r1 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0032
            monitor-enter(r4)
            java.lang.Object r1 = r4.getTag(r0)     // Catch:{ all -> 0x002f }
            boolean r2 = r1 instanceof h4.q     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001e
            r3 = r1
            h4.q r3 = (h4.q) r3     // Catch:{ all -> 0x002f }
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r1 = r3
            goto L_0x002d
        L_0x0022:
            h4.q r1 = new h4.q     // Catch:{ all -> 0x002f }
            r1.<init>(r4)     // Catch:{ all -> 0x002f }
            r4.addOnAttachStateChangeListener(r1)     // Catch:{ all -> 0x002f }
            r4.setTag(r0, r1)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r4)
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c.c(android.view.View):h4.q");
    }

    public static final int d(i4.a aVar, int i8) {
        if (aVar instanceof a.C0176a) {
            return ((a.C0176a) aVar).f9566a;
        }
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 == 0) {
                return Integer.MIN_VALUE;
            }
            if (i10 == 1) {
                return Integer.MAX_VALUE;
            }
            throw new e();
        }
        throw null;
    }
}
