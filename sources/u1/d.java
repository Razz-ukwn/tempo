package u1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.compose.ui.platform.b3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    public static class a {
        public static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final C0288d[] f15658a;

        public c(C0288d[] dVarArr) {
            this.f15658a = dVarArr;
        }
    }

    /* renamed from: u1.d$d  reason: collision with other inner class name */
    public static final class C0288d {

        /* renamed from: a  reason: collision with root package name */
        public final String f15659a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15660b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f15661c;

        /* renamed from: d  reason: collision with root package name */
        public final String f15662d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15663e;

        /* renamed from: f  reason: collision with root package name */
        public final int f15664f;

        public C0288d(int i8, int i10, int i11, String str, String str2, boolean z10) {
            this.f15659a = str;
            this.f15660b = i8;
            this.f15661c = z10;
            this.f15662d = str2;
            this.f15663e = i10;
            this.f15664f = i11;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final z1.e f15665a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15666b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15667c;

        /* renamed from: d  reason: collision with root package name */
        public final String f15668d;

        public e(z1.e eVar, int i8, int i10, String str) {
            this.f15665a = eVar;
            this.f15667c = i8;
            this.f15666b = i10;
            this.f15668d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b3.D);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b3.E);
                                int i8 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i8 = 1;
                                }
                                int i10 = obtainAttributes2.getInt(i8, 400);
                                boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i11 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i11 = 3;
                                }
                                int i12 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i12 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i12);
                                int i13 = obtainAttributes2.getInt(i11, 0);
                                int i14 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i14, 0);
                                String string6 = obtainAttributes2.getString(i14);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new C0288d(i10, i13, resourceId2, string6, string5, z10));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new c((C0288d[]) arrayList.toArray(new C0288d[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new z1.e(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i8) {
        if (i8 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i8);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }
}
