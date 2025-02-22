package k3;

import android.annotation.SuppressLint;
import androidx.activity.g;
import b3.x;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import sf.j;
import zf.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f10268a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, C0188a> f10269b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f10270c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f10271d;

    /* renamed from: k3.a$a  reason: collision with other inner class name */
    public static final class C0188a {

        /* renamed from: a  reason: collision with root package name */
        public final String f10272a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10273b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10274c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10275d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10276e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10277f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10278g;

        /* renamed from: k3.a$a$a  reason: collision with other inner class name */
        public static final class C0189a {
            @SuppressLint({"SyntheticAccessor"})
            public static boolean a(String str, String str2) {
                boolean z10;
                j.f(str, "current");
                if (j.a(str, str2)) {
                    return true;
                }
                if (!(str.length() == 0)) {
                    int i8 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i8 < str.length()) {
                            char charAt = str.charAt(i8);
                            int i12 = i11 + 1;
                            if (i11 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt != '(') {
                                if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                                    break;
                                }
                            } else {
                                i10++;
                            }
                            i8++;
                            i11 = i12;
                        } else if (i10 == 0) {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return j.a(n.Z0(substring).toString(), str2);
            }
        }

        public C0188a(String str, String str2, boolean z10, int i8, String str3, int i10) {
            this.f10272a = str;
            this.f10273b = str2;
            this.f10274c = z10;
            this.f10275d = i8;
            this.f10276e = str3;
            this.f10277f = i10;
            Locale locale = Locale.US;
            j.e(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.f10278g = n.A0(upperCase, "INT") ? 3 : (n.A0(upperCase, "CHAR") || n.A0(upperCase, "CLOB") || n.A0(upperCase, "TEXT")) ? 2 : n.A0(upperCase, "BLOB") ? 5 : (n.A0(upperCase, "REAL") || n.A0(upperCase, "FLOA") || n.A0(upperCase, "DOUB")) ? 4 : 1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x005c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r9) {
            /*
                r8 = this;
                r0 = 1
                if (r8 != r9) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r9 instanceof k3.a.C0188a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                k3.a$a r9 = (k3.a.C0188a) r9
                int r1 = r9.f10275d
                int r3 = r8.f10275d
                if (r3 == r1) goto L_0x0013
                return r2
            L_0x0013:
                java.lang.String r1 = r9.f10272a
                java.lang.String r3 = r8.f10272a
                boolean r1 = sf.j.a(r3, r1)
                if (r1 != 0) goto L_0x001e
                return r2
            L_0x001e:
                boolean r1 = r8.f10274c
                boolean r3 = r9.f10274c
                if (r1 == r3) goto L_0x0025
                return r2
            L_0x0025:
                int r1 = r9.f10277f
                java.lang.String r3 = r9.f10276e
                r4 = 2
                java.lang.String r5 = r8.f10276e
                int r6 = r8.f10277f
                if (r6 != r0) goto L_0x003b
                if (r1 != r4) goto L_0x003b
                if (r5 == 0) goto L_0x003b
                boolean r7 = k3.a.C0188a.C0189a.a(r5, r3)
                if (r7 != 0) goto L_0x003b
                return r2
            L_0x003b:
                if (r6 != r4) goto L_0x0048
                if (r1 != r0) goto L_0x0048
                if (r3 == 0) goto L_0x0048
                boolean r4 = k3.a.C0188a.C0189a.a(r3, r5)
                if (r4 != 0) goto L_0x0048
                return r2
            L_0x0048:
                if (r6 == 0) goto L_0x005d
                if (r6 != r1) goto L_0x005d
                if (r5 == 0) goto L_0x0055
                boolean r1 = k3.a.C0188a.C0189a.a(r5, r3)
                if (r1 != 0) goto L_0x0059
                goto L_0x0057
            L_0x0055:
                if (r3 == 0) goto L_0x0059
            L_0x0057:
                r1 = r0
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                if (r1 == 0) goto L_0x005d
                return r2
            L_0x005d:
                int r1 = r8.f10278g
                int r9 = r9.f10278g
                if (r1 != r9) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r0 = r2
            L_0x0065:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.a.C0188a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (((((this.f10272a.hashCode() * 31) + this.f10278g) * 31) + (this.f10274c ? 1231 : 1237)) * 31) + this.f10275d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f10272a);
            sb2.append("', type='");
            sb2.append(this.f10273b);
            sb2.append("', affinity='");
            sb2.append(this.f10278g);
            sb2.append("', notNull=");
            sb2.append(this.f10274c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f10275d);
            sb2.append(", defaultValue='");
            String str = this.f10276e;
            if (str == null) {
                str = "undefined";
            }
            return g.a(sb2, str, "'}");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f10279a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10280b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10281c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f10282d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f10283e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            j.f(list, "columnNames");
            j.f(list2, "referenceColumnNames");
            this.f10279a = str;
            this.f10280b = str2;
            this.f10281c = str3;
            this.f10282d = list;
            this.f10283e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.f10279a, bVar.f10279a) && j.a(this.f10280b, bVar.f10280b) && j.a(this.f10281c, bVar.f10281c) && j.a(this.f10282d, bVar.f10282d)) {
                return j.a(this.f10283e, bVar.f10283e);
            }
            return false;
        }

        public final int hashCode() {
            int a10 = x.a(this.f10281c, x.a(this.f10280b, this.f10279a.hashCode() * 31, 31), 31);
            return this.f10283e.hashCode() + ((this.f10282d.hashCode() + a10) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f10279a + "', onDelete='" + this.f10280b + " +', onUpdate='" + this.f10281c + "', columnNames=" + this.f10282d + ", referenceColumnNames=" + this.f10283e + '}';
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f10284a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10285b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10286c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10287d;

        public c(String str, int i8, int i10, String str2) {
            this.f10284a = i8;
            this.f10285b = i10;
            this.f10286c = str;
            this.f10287d = str2;
        }

        public final int compareTo(Object obj) {
            c cVar = (c) obj;
            j.f(cVar, "other");
            int i8 = this.f10284a - cVar.f10284a;
            return i8 == 0 ? this.f10285b - cVar.f10285b : i8;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f10288a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10289b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f10290c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f10291d;

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            j.f(list, "columns");
            j.f(list2, "orders");
            this.f10288a = str;
            this.f10289b = z10;
            this.f10290c = list;
            this.f10291d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add("ASC");
                }
                arrayList = arrayList2;
            }
            this.f10291d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            d dVar;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d) || this.f10289b != (dVar = (d) obj).f10289b || !j.a(this.f10290c, dVar.f10290c) || !j.a(this.f10291d, dVar.f10291d)) {
                return false;
            }
            String str = this.f10288a;
            boolean x02 = zf.j.x0(str, "index_", false);
            String str2 = dVar.f10288a;
            return x02 ? zf.j.x0(str2, "index_", false) : j.a(str, str2);
        }

        public final int hashCode() {
            String str = this.f10288a;
            int hashCode = zf.j.x0(str, "index_", false) ? -1184239155 : str.hashCode();
            return this.f10291d.hashCode() + ((this.f10290c.hashCode() + (((hashCode * 31) + (this.f10289b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f10288a + "', unique=" + this.f10289b + ", columns=" + this.f10290c + ", orders=" + this.f10291d + "'}";
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f10268a = str;
        this.f10269b = map;
        this.f10270c = abstractSet;
        this.f10271d = abstractSet2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0317 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x031c A[SYNTHETIC, Splitter:B:99:0x031c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final k3.a a(n3.c r31, java.lang.String r32) {
        /*
            r0 = r31
            r1 = r32
            java.lang.String r2 = "seq"
            java.lang.String r3 = "id"
            java.lang.String r4 = "type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "PRAGMA table_info(`"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = "`)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.e(r5)
            int r7 = r5.getColumnCount()     // Catch:{ all -> 0x035e }
            java.lang.String r8 = "name"
            r11 = 0
            if (r7 > 0) goto L_0x0030
            gf.t r4 = gf.t.f8979a     // Catch:{ all -> 0x035e }
            e9.c.c(r5, r11)
            goto L_0x0097
        L_0x0030:
            int r7 = r5.getColumnIndex(r8)     // Catch:{ all -> 0x035e }
            int r12 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x035e }
            java.lang.String r13 = "notnull"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x035e }
            java.lang.String r14 = "pk"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x035e }
            java.lang.String r15 = "dflt_value"
            int r15 = r5.getColumnIndex(r15)     // Catch:{ all -> 0x035e }
            hf.b r9 = new hf.b     // Catch:{ all -> 0x035e }
            r9.<init>()     // Catch:{ all -> 0x035e }
        L_0x004f:
            boolean r17 = r5.moveToNext()     // Catch:{ all -> 0x035e }
            if (r17 == 0) goto L_0x008c
            java.lang.String r11 = r5.getString(r7)     // Catch:{ all -> 0x035e }
            java.lang.String r10 = r5.getString(r12)     // Catch:{ all -> 0x035e }
            int r18 = r5.getInt(r13)     // Catch:{ all -> 0x035e }
            if (r18 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            int r22 = r5.getInt(r14)     // Catch:{ all -> 0x035e }
            java.lang.String r23 = r5.getString(r15)     // Catch:{ all -> 0x035e }
            sf.j.e(r11, r8)     // Catch:{ all -> 0x035e }
            r25 = r7
            k3.a$a r7 = new k3.a$a     // Catch:{ all -> 0x035e }
            sf.j.e(r10, r4)     // Catch:{ all -> 0x035e }
            r24 = 2
            r18 = r7
            r19 = r11
            r20 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x035e }
            r9.put(r11, r7)     // Catch:{ all -> 0x035e }
            r7 = r25
            r11 = 0
            goto L_0x004f
        L_0x008c:
            r9.b()     // Catch:{ all -> 0x035e }
            r4 = 1
            r9.H = r4     // Catch:{ all -> 0x035e }
            r4 = 0
            e9.c.c(r5, r4)
            r4 = r9
        L_0x0097:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "PRAGMA foreign_key_list(`"
            r5.<init>(r7)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.e(r5)
            int r7 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0355 }
            int r9 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0355 }
            java.lang.String r10 = "table"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ all -> 0x0355 }
            java.lang.String r11 = "on_delete"
            int r11 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0355 }
            java.lang.String r12 = "on_update"
            int r12 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0355 }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0355 }
            int r2 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0355 }
            java.lang.String r13 = "from"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x0355 }
            java.lang.String r14 = "to"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x0355 }
            hf.a r15 = new hf.a     // Catch:{ all -> 0x0355 }
            r15.<init>()     // Catch:{ all -> 0x0355 }
        L_0x00df:
            boolean r18 = r5.moveToNext()     // Catch:{ all -> 0x0355 }
            if (r18 == 0) goto L_0x0120
            r18 = r4
            k3.a$c r4 = new k3.a$c     // Catch:{ all -> 0x0355 }
            r19 = r8
            int r8 = r5.getInt(r3)     // Catch:{ all -> 0x0355 }
            r20 = r3
            int r3 = r5.getInt(r2)     // Catch:{ all -> 0x0355 }
            r21 = r2
            java.lang.String r2 = r5.getString(r13)     // Catch:{ all -> 0x0355 }
            r22 = r13
            java.lang.String r13 = "cursor.getString(fromColumnIndex)"
            sf.j.e(r2, r13)     // Catch:{ all -> 0x0355 }
            java.lang.String r13 = r5.getString(r14)     // Catch:{ all -> 0x0355 }
            r23 = r14
            java.lang.String r14 = "cursor.getString(toColumnIndex)"
            sf.j.e(r13, r14)     // Catch:{ all -> 0x0355 }
            r4.<init>(r2, r8, r3, r13)     // Catch:{ all -> 0x0355 }
            r15.add(r4)     // Catch:{ all -> 0x0355 }
            r4 = r18
            r8 = r19
            r3 = r20
            r2 = r21
            r13 = r22
            r14 = r23
            goto L_0x00df
        L_0x0120:
            r18 = r4
            r19 = r8
            cb.d.p(r15)     // Catch:{ all -> 0x0355 }
            int r2 = r15.a()     // Catch:{ all -> 0x0355 }
            r3 = 1
            if (r2 > r3) goto L_0x0134
            java.util.List r2 = gf.q.O0(r15)     // Catch:{ all -> 0x0355 }
            r4 = 0
            goto L_0x0149
        L_0x0134:
            r4 = 0
            java.lang.Comparable[] r2 = new java.lang.Comparable[r4]     // Catch:{ all -> 0x0355 }
            java.lang.Object[] r2 = r15.toArray(r2)     // Catch:{ all -> 0x0355 }
            r3 = r2
            java.lang.Comparable[] r3 = (java.lang.Comparable[]) r3     // Catch:{ all -> 0x0355 }
            int r8 = r3.length     // Catch:{ all -> 0x0355 }
            r13 = 1
            if (r8 <= r13) goto L_0x0145
            java.util.Arrays.sort(r3)     // Catch:{ all -> 0x0355 }
        L_0x0145:
            java.util.List r2 = gf.l.R(r2)     // Catch:{ all -> 0x0355 }
        L_0x0149:
            r3 = -1
            r5.moveToPosition(r3)     // Catch:{ all -> 0x0355 }
            hf.f r8 = new hf.f     // Catch:{ all -> 0x0355 }
            r8.<init>()     // Catch:{ all -> 0x0355 }
        L_0x0152:
            boolean r13 = r5.moveToNext()     // Catch:{ all -> 0x0355 }
            if (r13 == 0) goto L_0x01ef
            int r13 = r5.getInt(r9)     // Catch:{ all -> 0x0355 }
            if (r13 == 0) goto L_0x015f
            goto L_0x0152
        L_0x015f:
            int r13 = r5.getInt(r7)     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0355 }
            r14.<init>()     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0355 }
            r15.<init>()     // Catch:{ all -> 0x0355 }
            r16 = r2
            java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x0355 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0355 }
            r4.<init>()     // Catch:{ all -> 0x0355 }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x0355 }
        L_0x017a:
            boolean r21 = r16.hasNext()     // Catch:{ all -> 0x0355 }
            if (r21 == 0) goto L_0x0199
            java.lang.Object r3 = r16.next()     // Catch:{ all -> 0x0355 }
            r22 = r2
            r2 = r3
            k3.a$c r2 = (k3.a.c) r2     // Catch:{ all -> 0x0355 }
            int r2 = r2.f10284a     // Catch:{ all -> 0x0355 }
            if (r2 != r13) goto L_0x018f
            r2 = 1
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            if (r2 == 0) goto L_0x0195
            r4.add(r3)     // Catch:{ all -> 0x0355 }
        L_0x0195:
            r2 = r22
            r3 = -1
            goto L_0x017a
        L_0x0199:
            r22 = r2
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0355 }
        L_0x019f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0355 }
            if (r3 == 0) goto L_0x01b6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0355 }
            k3.a$c r3 = (k3.a.c) r3     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = r3.f10286c     // Catch:{ all -> 0x0355 }
            r14.add(r4)     // Catch:{ all -> 0x0355 }
            java.lang.String r3 = r3.f10287d     // Catch:{ all -> 0x0355 }
            r15.add(r3)     // Catch:{ all -> 0x0355 }
            goto L_0x019f
        L_0x01b6:
            k3.a$b r2 = new k3.a$b     // Catch:{ all -> 0x0355 }
            java.lang.String r3 = r5.getString(r10)     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = "cursor.getString(tableColumnIndex)"
            sf.j.e(r3, r4)     // Catch:{ all -> 0x0355 }
            java.lang.String r4 = r5.getString(r11)     // Catch:{ all -> 0x0355 }
            java.lang.String r13 = "cursor.getString(onDeleteColumnIndex)"
            sf.j.e(r4, r13)     // Catch:{ all -> 0x0355 }
            java.lang.String r13 = r5.getString(r12)     // Catch:{ all -> 0x0355 }
            r16 = r7
            java.lang.String r7 = "cursor.getString(onUpdateColumnIndex)"
            sf.j.e(r13, r7)     // Catch:{ all -> 0x0355 }
            r25 = r2
            r26 = r3
            r27 = r4
            r28 = r13
            r29 = r14
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0355 }
            r8.add(r2)     // Catch:{ all -> 0x0355 }
            r7 = r16
            r2 = r22
            r3 = -1
            r4 = 0
            goto L_0x0152
        L_0x01ef:
            e9.c.b(r8)     // Catch:{ all -> 0x0355 }
            r2 = 0
            e9.c.c(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PRAGMA index_list(`"
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.database.Cursor r2 = r0.e(r2)
            r3 = r19
            int r4 = r2.getColumnIndex(r3)     // Catch:{ all -> 0x034c }
            java.lang.String r5 = "origin"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ all -> 0x034c }
            java.lang.String r7 = "unique"
            int r7 = r2.getColumnIndex(r7)     // Catch:{ all -> 0x034c }
            r9 = -1
            if (r4 == r9) goto L_0x033f
            if (r5 == r9) goto L_0x033f
            if (r7 != r9) goto L_0x0226
            goto L_0x033f
        L_0x0226:
            hf.f r9 = new hf.f     // Catch:{ all -> 0x034c }
            r9.<init>()     // Catch:{ all -> 0x034c }
        L_0x022b:
            boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x034c }
            if (r10 == 0) goto L_0x0336
            java.lang.String r10 = r2.getString(r5)     // Catch:{ all -> 0x034c }
            java.lang.String r11 = "c"
            boolean r10 = sf.j.a(r11, r10)     // Catch:{ all -> 0x034c }
            if (r10 != 0) goto L_0x023e
            goto L_0x022b
        L_0x023e:
            java.lang.String r10 = r2.getString(r4)     // Catch:{ all -> 0x034c }
            int r11 = r2.getInt(r7)     // Catch:{ all -> 0x034c }
            r12 = 1
            if (r11 != r12) goto L_0x024b
            r11 = r12
            goto L_0x024c
        L_0x024b:
            r11 = 0
        L_0x024c:
            sf.j.e(r10, r3)     // Catch:{ all -> 0x034c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x034c }
            java.lang.String r14 = "PRAGMA index_xinfo(`"
            r13.<init>(r14)     // Catch:{ all -> 0x034c }
            r13.append(r10)     // Catch:{ all -> 0x034c }
            r13.append(r6)     // Catch:{ all -> 0x034c }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x034c }
            android.database.Cursor r13 = r0.e(r13)     // Catch:{ all -> 0x034c }
            java.lang.String r14 = "seqno"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ all -> 0x032d }
            java.lang.String r15 = "cid"
            int r15 = r13.getColumnIndex(r15)     // Catch:{ all -> 0x032d }
            int r12 = r13.getColumnIndex(r3)     // Catch:{ all -> 0x032d }
            java.lang.String r0 = "desc"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x032d }
            r19 = r3
            r3 = -1
            if (r14 == r3) goto L_0x0308
            if (r15 == r3) goto L_0x0308
            if (r12 == r3) goto L_0x0308
            if (r0 != r3) goto L_0x0287
            goto L_0x0308
        L_0x0287:
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ all -> 0x032d }
            r3.<init>()     // Catch:{ all -> 0x032d }
            r16 = r4
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x032d }
            r4.<init>()     // Catch:{ all -> 0x032d }
        L_0x0293:
            boolean r22 = r13.moveToNext()     // Catch:{ all -> 0x032d }
            if (r22 == 0) goto L_0x02d9
            int r22 = r13.getInt(r15)     // Catch:{ all -> 0x032d }
            if (r22 >= 0) goto L_0x02a0
            goto L_0x0293
        L_0x02a0:
            int r22 = r13.getInt(r14)     // Catch:{ all -> 0x032d }
            r23 = r5
            java.lang.String r5 = r13.getString(r12)     // Catch:{ all -> 0x032d }
            int r24 = r13.getInt(r0)     // Catch:{ all -> 0x032d }
            if (r24 <= 0) goto L_0x02b3
            java.lang.String r24 = "DESC"
            goto L_0x02b5
        L_0x02b3:
            java.lang.String r24 = "ASC"
        L_0x02b5:
            r25 = r0
            r0 = r24
            r24 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x032d }
            r26 = r7
            java.lang.String r7 = "columnName"
            sf.j.e(r5, r7)     // Catch:{ all -> 0x032d }
            r3.put(r6, r5)     // Catch:{ all -> 0x032d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x032d }
            r4.put(r5, r0)     // Catch:{ all -> 0x032d }
            r5 = r23
            r6 = r24
            r0 = r25
            r7 = r26
            goto L_0x0293
        L_0x02d9:
            r23 = r5
            r24 = r6
            r26 = r7
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x032d }
            java.lang.String r3 = "columnsMap.values"
            sf.j.e(r0, r3)     // Catch:{ all -> 0x032d }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x032d }
            java.util.List r0 = gf.q.O0(r0)     // Catch:{ all -> 0x032d }
            java.util.Collection r3 = r4.values()     // Catch:{ all -> 0x032d }
            java.lang.String r4 = "ordersMap.values"
            sf.j.e(r3, r4)     // Catch:{ all -> 0x032d }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x032d }
            java.util.List r3 = gf.q.O0(r3)     // Catch:{ all -> 0x032d }
            k3.a$d r4 = new k3.a$d     // Catch:{ all -> 0x032d }
            r4.<init>(r10, r11, r0, r3)     // Catch:{ all -> 0x032d }
            r0 = 0
            e9.c.c(r13, r0)     // Catch:{ all -> 0x034c }
            r0 = 0
            goto L_0x0315
        L_0x0308:
            r16 = r4
            r23 = r5
            r24 = r6
            r26 = r7
            r0 = 0
            e9.c.c(r13, r0)     // Catch:{ all -> 0x034c }
            r4 = r0
        L_0x0315:
            if (r4 != 0) goto L_0x031c
            e9.c.c(r2, r0)
            r11 = 0
            goto L_0x0344
        L_0x031c:
            r9.add(r4)     // Catch:{ all -> 0x034c }
            r0 = r31
            r4 = r16
            r3 = r19
            r5 = r23
            r6 = r24
            r7 = r26
            goto L_0x022b
        L_0x032d:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0330 }
        L_0x0330:
            r0 = move-exception
            r3 = r0
            e9.c.c(r13, r1)     // Catch:{ all -> 0x034c }
            throw r3     // Catch:{ all -> 0x034c }
        L_0x0336:
            e9.c.b(r9)     // Catch:{ all -> 0x034c }
            r0 = 0
            e9.c.c(r2, r0)
            r11 = r9
            goto L_0x0344
        L_0x033f:
            r0 = 0
            e9.c.c(r2, r0)
            r11 = r0
        L_0x0344:
            k3.a r0 = new k3.a
            r4 = r18
            r0.<init>(r1, r4, r8, r11)
            return r0
        L_0x034c:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x034f }
        L_0x034f:
            r0 = move-exception
            r3 = r0
            e9.c.c(r2, r1)
            throw r3
        L_0x0355:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0358 }
        L_0x0358:
            r0 = move-exception
            r2 = r0
            e9.c.c(r5, r1)
            throw r2
        L_0x035e:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0361 }
        L_0x0361:
            r0 = move-exception
            r2 = r0
            e9.c.c(r5, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.a(n3.c, java.lang.String):k3.a");
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(this.f10268a, aVar.f10268a) || !j.a(this.f10269b, aVar.f10269b) || !j.a(this.f10270c, aVar.f10270c)) {
            return false;
        }
        Set<d> set2 = this.f10271d;
        if (set2 == null || (set = aVar.f10271d) == null) {
            return true;
        }
        return j.a(set2, set);
    }

    public final int hashCode() {
        int hashCode = this.f10269b.hashCode();
        return this.f10270c.hashCode() + ((hashCode + (this.f10268a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f10268a + "', columns=" + this.f10269b + ", foreignKeys=" + this.f10270c + ", indices=" + this.f10271d + '}';
    }
}
