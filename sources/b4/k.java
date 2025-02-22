package b4;

import ag.m;
import ag.v1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import b4.h;
import d2.f1;
import gf.q;
import h4.l;
import java.io.File;
import jf.d;
import m4.c;
import org.xmlpull.v1.XmlPullParserException;
import s3.g;
import sf.j;
import u1.f;
import wg.c0;
import zf.i;
import zf.n;

public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3243a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3244b;

    public static final class a implements h.a<Uri> {
        public final h a(Object obj, l lVar) {
            Uri uri = (Uri) obj;
            if (!j.a(uri.getScheme(), "android.resource")) {
                return null;
            }
            return new k(uri, lVar);
        }
    }

    public k(Uri uri, l lVar) {
        this.f3243a = uri;
        this.f3244b = lVar;
    }

    public final Object a(d<? super g> dVar) {
        Integer p02;
        BitmapDrawable bitmapDrawable;
        Uri uri = this.f3243a;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z10 = true;
            if (!(!zf.j.t0(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) q.C0(uri.getPathSegments());
                if (str == null || (p02 = i.p0(str)) == null) {
                    throw new IllegalStateException("Invalid android.resource URI: " + uri);
                }
                int intValue = p02.intValue();
                l lVar = this.f3244b;
                Context context = lVar.f9195a;
                Resources resources = j.a(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String b10 = c.b(MimeTypeMap.getSingleton(), charSequence.subSequence(n.I0(charSequence, '/', 0, 6), charSequence.length()).toString());
                if (j.a(b10, "text/xml")) {
                    if (j.a(authority, context.getPackageName())) {
                        bitmapDrawable = m.e(context, intValue);
                    } else {
                        XmlResourceParser xml = resources.getXml(intValue);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next == 2) {
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal<TypedValue> threadLocal = f.f15671a;
                            Drawable a10 = f.a.a(resources, intValue, theme);
                            if (a10 != null) {
                                bitmapDrawable = a10;
                            } else {
                                throw new IllegalStateException(androidx.fragment.app.q.a("Invalid resource ID: ", intValue).toString());
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found.");
                        }
                    }
                    if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof g)) {
                        z10 = false;
                    }
                    if (z10) {
                        bitmapDrawable = new BitmapDrawable(context.getResources(), v1.h(bitmapDrawable, lVar.f9196b, lVar.f9198d, lVar.f9199e, lVar.f9200f));
                    }
                    return new f(bitmapDrawable, z10, 3);
                }
                TypedValue typedValue2 = new TypedValue();
                c0 j10 = f1.j(f1.J(resources.openRawResource(intValue, typedValue2)));
                y3.l lVar2 = new y3.l(typedValue2.density);
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                return new l(new y3.m(j10, cacheDir, lVar2), b10, 3);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
