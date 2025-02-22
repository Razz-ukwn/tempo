package d2;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.activity.g;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f7199a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f7200a;

        public a(ClipData clipData, int i8) {
            this.f7200a = new ContentInfo.Builder(clipData, i8);
        }

        public final void a(Uri uri) {
            this.f7200a.setLinkUri(uri);
        }

        public final void b(int i8) {
            this.f7200a.setFlags(i8);
        }

        public final f build() {
            return new f(new d(this.f7200a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f7200a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i8);

        f build();

        void setExtras(Bundle bundle);
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f7201a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7202b;

        /* renamed from: c  reason: collision with root package name */
        public int f7203c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f7204d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f7205e;

        public c(ClipData clipData, int i8) {
            this.f7201a = clipData;
            this.f7202b = i8;
        }

        public final void a(Uri uri) {
            this.f7204d = uri;
        }

        public final void b(int i8) {
            this.f7203c = i8;
        }

        public final f build() {
            return new f(new C0113f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f7205e = bundle;
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f7206a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f7206a = contentInfo;
        }

        public final ClipData a() {
            return this.f7206a.getClip();
        }

        public final int b() {
            return this.f7206a.getFlags();
        }

        public final ContentInfo c() {
            return this.f7206a;
        }

        public final int d() {
            return this.f7206a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f7206a + "}";
        }
    }

    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* renamed from: d2.f$f  reason: collision with other inner class name */
    public static final class C0113f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f7207a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7208b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7209c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f7210d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f7211e;

        public C0113f(c cVar) {
            ClipData clipData = cVar.f7201a;
            clipData.getClass();
            this.f7207a = clipData;
            int i8 = cVar.f7202b;
            if (i8 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i8 <= 5) {
                this.f7208b = i8;
                int i10 = cVar.f7203c;
                if ((i10 & 1) == i10) {
                    this.f7209c = i10;
                    this.f7210d = cVar.f7204d;
                    this.f7211e = cVar.f7205e;
                    return;
                }
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public final ClipData a() {
            return this.f7207a;
        }

        public final int b() {
            return this.f7209c;
        }

        public final ContentInfo c() {
            return null;
        }

        public final int d() {
            return this.f7208b;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f7207a.getDescription());
            sb2.append(", source=");
            int i8 = this.f7208b;
            sb2.append(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? String.valueOf(i8) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb2.append(", flags=");
            int i10 = this.f7209c;
            sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
            String str2 = "";
            Uri uri = this.f7210d;
            if (uri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f7211e != null) {
                str2 = ", hasExtras";
            }
            return g.a(sb2, str2, "}");
        }
    }

    public f(e eVar) {
        this.f7199a = eVar;
    }

    public final String toString() {
        return this.f7199a.toString();
    }
}
