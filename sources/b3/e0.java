package b3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import b1.b;
import b3.b;
import ff.m;
import org.xmlpull.v1.XmlPullParserException;
import sf.j;

public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f3041c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f3042a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f3043b;

    public static final class a {
        public static h0 a(TypedValue typedValue, h0 h0Var, h0 h0Var2, String str, String str2) {
            if (h0Var == null || h0Var == h0Var2) {
                return h0Var == null ? h0Var2 : h0Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
    }

    public e0(Context context, o0 o0Var) {
        j.f(context, "context");
        j.f(o0Var, "navigatorProvider");
        this.f3042a = context;
        this.f3043b = o0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: b3.h0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: b3.h0$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: b3.h0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: b3.h0$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: b3.h0$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: b3.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: b3.h0$f} */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:137|138|139) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:140|141|142) */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r15.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x029e, code lost:
        r3 = r15;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r14.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02a3, code lost:
        r3 = r14;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02a5, code lost:
        r3 = r13;
        r2 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x02a0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b3.i c(android.content.res.TypedArray r26, android.content.res.Resources r27, int r28) {
        /*
            r0 = r26
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = f3041c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001a:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            b3.h0$i r6 = b3.h0.f3067c
            b3.h0$c r7 = b3.h0.f3072h
            b3.h0$j r8 = b3.h0.f3076l
            b3.h0$a r9 = b3.h0.f3074j
            b3.h0$g r10 = b3.h0.f3070f
            b3.h0$e r11 = b3.h0.f3068d
            b3.h0$h r12 = b3.h0.f3069e
            b3.h0$k r13 = b3.h0.f3075k
            b3.h0$b r14 = b3.h0.f3073i
            b3.h0$d r15 = b3.h0.f3071g
            b3.h0$f r1 = b3.h0.f3066b
            java.lang.String r2 = "boolean"
            r17 = r7
            java.lang.String r7 = "integer"
            r18 = r8
            java.lang.String r8 = "float"
            r19 = r9
            java.lang.Class<android.os.Parcelable> r9 = android.os.Parcelable.class
            r20 = r10
            java.lang.Class<java.io.Serializable> r10 = java.io.Serializable.class
            r21 = 0
            if (r4 == 0) goto L_0x0179
            r22 = r11
            java.lang.String r11 = r27.getResourcePackageName(r28)
            boolean r23 = sf.j.a(r7, r4)
            if (r23 == 0) goto L_0x005c
            r23 = r3
            r3 = r1
            goto L_0x00d7
        L_0x005c:
            r23 = r3
            java.lang.String r3 = "integer[]"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x006c
            r24 = r12
            r3 = r22
            goto L_0x0181
        L_0x006c:
            java.lang.String r3 = "long"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x0079
            r3 = r12
            r24 = r3
            goto L_0x0181
        L_0x0079:
            java.lang.String r3 = "long[]"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x0087
            r24 = r12
            r3 = r20
            goto L_0x0181
        L_0x0087:
            boolean r3 = sf.j.a(r2, r4)
            if (r3 == 0) goto L_0x0092
            r24 = r12
            r3 = r14
            goto L_0x0181
        L_0x0092:
            java.lang.String r3 = "boolean[]"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x00a0
            r24 = r12
            r3 = r19
            goto L_0x0181
        L_0x00a0:
            java.lang.String r3 = "string"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x00aa
            r3 = r13
            goto L_0x00d7
        L_0x00aa:
            java.lang.String r3 = "string[]"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x00b8
            r24 = r12
            r3 = r18
            goto L_0x0181
        L_0x00b8:
            boolean r3 = sf.j.a(r8, r4)
            if (r3 == 0) goto L_0x00c0
            r3 = r15
            goto L_0x00d7
        L_0x00c0:
            java.lang.String r3 = "float[]"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x00ce
            r24 = r12
            r3 = r17
            goto L_0x0181
        L_0x00ce:
            java.lang.String r3 = "reference"
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x00db
            r3 = r6
        L_0x00d7:
            r24 = r12
            goto L_0x0181
        L_0x00db:
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00e3
            r3 = 1
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            if (r3 != 0) goto L_0x0175
            java.lang.String r3 = "."
            r24 = r12
            r12 = 0
            boolean r3 = zf.j.x0(r4, r3, r12)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r3 == 0) goto L_0x00f8
            if (r11 == 0) goto L_0x00f8
            java.lang.String r3 = r11.concat(r4)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x00f9
        L_0x00f8:
            r3 = r4
        L_0x00f9:
            java.lang.String r11 = "[]"
            r12 = 0
            boolean r11 = zf.j.r0(r4, r11, r12)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r11 == 0) goto L_0x012d
            int r11 = r3.length()     // Catch:{ ClassNotFoundException -> 0x016e }
            int r11 = r11 + -2
            java.lang.String r3 = r3.substring(r12, r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            sf.j.e(r3, r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            java.lang.Class r11 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x016e }
            boolean r16 = r9.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r16 == 0) goto L_0x0121
            b3.h0$m r3 = new b3.h0$m     // Catch:{ ClassNotFoundException -> 0x016e }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x0181
        L_0x0121:
            boolean r16 = r10.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r16 == 0) goto L_0x0157
            b3.h0$o r3 = new b3.h0$o     // Catch:{ ClassNotFoundException -> 0x016e }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x0181
        L_0x012d:
            java.lang.Class r11 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x016e }
            boolean r16 = r9.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r16 == 0) goto L_0x013d
            b3.h0$n r3 = new b3.h0$n     // Catch:{ ClassNotFoundException -> 0x016e }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x0181
        L_0x013d:
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r12 == 0) goto L_0x014b
            b3.h0$l r3 = new b3.h0$l     // Catch:{ ClassNotFoundException -> 0x016e }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x0181
        L_0x014b:
            boolean r12 = r10.isAssignableFrom(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            if (r12 == 0) goto L_0x0157
            b3.h0$p r3 = new b3.h0$p     // Catch:{ ClassNotFoundException -> 0x016e }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x016e }
            goto L_0x0181
        L_0x0157:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x016e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x016e }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x016e }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x016e }
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x016e }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x016e }
            throw r0     // Catch:{ ClassNotFoundException -> 0x016e }
        L_0x016e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0175:
            r24 = r12
            r3 = r13
            goto L_0x0181
        L_0x0179:
            r23 = r3
            r22 = r11
            r24 = r12
            r3 = r21
        L_0x0181:
            r11 = 1
            boolean r12 = r0.getValue(r11, r5)
            if (r12 == 0) goto L_0x02ae
            java.lang.String r12 = "' for "
            java.lang.String r11 = "unsupported value '"
            if (r3 != r6) goto L_0x01c8
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0194
            r12 = r0
            goto L_0x019f
        L_0x0194:
            int r0 = r5.type
            r2 = 16
            if (r0 != r2) goto L_0x01a5
            int r0 = r5.data
            if (r0 != 0) goto L_0x01a5
            r12 = 0
        L_0x019f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r12 = 1
            goto L_0x0202
        L_0x01a5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = r3.b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            r25 = r6
            int r6 = r5.resourceId
            if (r6 == 0) goto L_0x01fb
            if (r3 != 0) goto L_0x01d8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r6 = r25
            r12 = 1
            goto L_0x0203
        L_0x01d8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = r3.b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \"reference\" type to reference other resources."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01fb:
            if (r3 != r13) goto L_0x0208
            r12 = 1
            java.lang.String r0 = r0.getString(r12)
        L_0x0202:
            r6 = r3
        L_0x0203:
            r3 = r6
        L_0x0204:
            r2 = r24
            goto L_0x02b3
        L_0x0208:
            r12 = 1
            int r0 = r5.type
            r6 = 3
            if (r0 == r6) goto L_0x0282
            r6 = 4
            if (r0 == r6) goto L_0x0273
            r6 = 5
            if (r0 == r6) goto L_0x025f
            r6 = 18
            if (r0 == r6) goto L_0x024f
            r6 = 16
            if (r0 < r6) goto L_0x0239
            r2 = 31
            if (r0 > r2) goto L_0x0239
            if (r3 != r15) goto L_0x022e
            b3.h0 r0 = b3.e0.a.a(r5, r3, r15, r4, r8)
            int r2 = r5.data
            float r2 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x027f
        L_0x022e:
            b3.h0 r0 = b3.e0.a.a(r5, r3, r1, r4, r7)
            int r2 = r5.data
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x027f
        L_0x0239:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported argument type "
            r1.<init>(r2)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024f:
            b3.h0 r0 = b3.e0.a.a(r5, r3, r14, r4, r2)
            int r2 = r5.data
            if (r2 == 0) goto L_0x0259
            r2 = r12
            goto L_0x025a
        L_0x0259:
            r2 = 0
        L_0x025a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x027f
        L_0x025f:
            java.lang.String r0 = "dimension"
            b3.h0 r0 = b3.e0.a.a(r5, r3, r1, r4, r0)
            android.util.DisplayMetrics r2 = r27.getDisplayMetrics()
            float r2 = r5.getDimension(r2)
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x027f
        L_0x0273:
            b3.h0 r0 = b3.e0.a.a(r5, r3, r15, r4, r8)
            float r2 = r5.getFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x027f:
            r3 = r0
            r0 = r2
            goto L_0x0204
        L_0x0282:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r3 != 0) goto L_0x02a7
            java.lang.String r2 = "value"
            sf.j.f(r0, r2)
            r1.c(r0)     // Catch:{ IllegalArgumentException -> 0x0294 }
            r3 = r1
            goto L_0x02a7
        L_0x0294:
            r2 = r24
            r2.c(r0)     // Catch:{ IllegalArgumentException -> 0x029b }
            r3 = r2
            goto L_0x02a9
        L_0x029b:
            r15.c(r0)     // Catch:{ IllegalArgumentException -> 0x02a0 }
            r3 = r15
            goto L_0x02a9
        L_0x02a0:
            r14.c(r0)     // Catch:{ IllegalArgumentException -> 0x02a5 }
            r3 = r14
            goto L_0x02a9
        L_0x02a5:
            r3 = r13
            goto L_0x02a9
        L_0x02a7:
            r2 = r24
        L_0x02a9:
            java.lang.Object r0 = r3.c(r0)
            goto L_0x02b3
        L_0x02ae:
            r2 = r24
            r12 = 1
            r0 = r21
        L_0x02b3:
            if (r0 == 0) goto L_0x02b6
            goto L_0x02b9
        L_0x02b6:
            r0 = r21
            r12 = 0
        L_0x02b9:
            if (r3 == 0) goto L_0x02bd
            r21 = r3
        L_0x02bd:
            if (r21 != 0) goto L_0x03c9
            boolean r3 = r0 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x02c6
        L_0x02c3:
            r7 = r1
            goto L_0x03cb
        L_0x02c6:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x02ce
            r7 = r22
            goto L_0x03cb
        L_0x02ce:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x02d5
            r7 = r2
            goto L_0x03cb
        L_0x02d5:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x02dd
            r7 = r20
            goto L_0x03cb
        L_0x02dd:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x02e4
            r7 = r15
            goto L_0x03cb
        L_0x02e4:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02ec
            r7 = r17
            goto L_0x03cb
        L_0x02ec:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02f3
            r7 = r14
            goto L_0x03cb
        L_0x02f3:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02fb
            r7 = r19
            goto L_0x03cb
        L_0x02fb:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x03c7
            if (r0 != 0) goto L_0x0303
            goto L_0x03c7
        L_0x0303:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0312
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r1 = r1 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x0312
            r7 = r18
            goto L_0x03cb
        L_0x0312:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0345
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            sf.j.c(r1)
            boolean r1 = r9.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0345
            b3.h0$m r1 = new b3.h0$m
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            if (r2 == 0) goto L_0x033d
            r1.<init>(r2)
            goto L_0x02c3
        L_0x033d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>"
            r0.<init>(r1)
            throw r0
        L_0x0345:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0379
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            sf.j.c(r1)
            boolean r1 = r10.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0379
            b3.h0$o r1 = new b3.h0$o
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r2 = r2.getComponentType()
            if (r2 == 0) goto L_0x0371
            r1.<init>(r2)
            goto L_0x02c3
        L_0x0371:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>"
            r0.<init>(r1)
            throw r0
        L_0x0379:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x0388
            b3.h0$n r1 = new b3.h0$n
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c3
        L_0x0388:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x0397
            b3.h0$l r1 = new b3.h0$l
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c3
        L_0x0397:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x03a6
            b3.h0$p r1 = new b3.h0$p
            java.lang.Class r2 = r0.getClass()
            r1.<init>(r2)
            goto L_0x02c3
        L_0x03a6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Object of type "
            r2.<init>(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x03c7:
            r7 = r13
            goto L_0x03cb
        L_0x03c9:
            r7 = r21
        L_0x03cb:
            b3.i r1 = new b3.i
            r2 = r23
            r1.<init>(r7, r2, r0, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.e0.c(android.content.res.TypedArray, android.content.res.Resources, int):b3.i");
    }

    public final z a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i8) {
        int depth;
        int i10;
        Context context;
        e0 e0Var;
        int i11;
        int depth2;
        String str;
        String str2;
        String str3;
        e0 e0Var2 = this;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        int i12 = i8;
        String name = xmlResourceParser.getName();
        j.e(name, "parser.name");
        z a10 = e0Var2.f3043b.b(name).a();
        Context context2 = e0Var2.f3042a;
        a10.h(context2, attributeSet2);
        int i13 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i13 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                e0 e0Var3 = e0Var2;
            } else if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean a11 = j.a("argument", name2);
                int[] iArr = b.f2993b;
                int i14 = 0;
                if (a11) {
                    TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, iArr);
                    j.e(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        a10.C.put(string, c(obtainAttributes, resources2, i12));
                        m mVar = m.f8717a;
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if (j.a("deepLink", name2)) {
                    TypedArray obtainAttributes2 = resources2.obtainAttributes(attributeSet2, b.f2994c);
                    j.e(obtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i13);
                    String string4 = obtainAttributes2.getString(2);
                    if (((string2 == null || string2.length() == 0) ? i13 : 0) != 0) {
                        if (((string3 == null || string3.length() == 0) ? i13 : 0) != 0) {
                            if (((string4 == null || string4.length() == 0) ? i13 : 0) != 0) {
                                throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                            }
                        }
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        j.e(packageName, "context.packageName");
                        str = zf.j.v0(string2, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (((string3 == null || string3.length() == 0) ? i13 : 0) == 0) {
                        String packageName2 = context2.getPackageName();
                        j.e(packageName2, "context.packageName");
                        str2 = zf.j.v0(string3, "${applicationId}", packageName2);
                        if (str2.length() > 0) {
                            i14 = i13;
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                        }
                    } else {
                        str2 = null;
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        j.e(packageName3, "context.packageName");
                        str3 = zf.j.v0(string4, "${applicationId}", packageName3);
                    } else {
                        str3 = null;
                    }
                    a10.a(new u(str, str2, str3));
                    m mVar2 = m.f8717a;
                    obtainAttributes2.recycle();
                } else {
                    if (j.a("action", name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, b.f2992a, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        e eVar = new e(obtainStyledAttributes.getResourceId(i13, 0));
                        eVar.f3039b = new f0(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        context = context2;
                        int i15 = 1;
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        i10 = depth3;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 != i15 && ((depth2 = xmlResourceParser.getDepth()) >= depth4 || next2 != 3)) {
                                if (next2 == 2 && depth2 <= depth4 && j.a("argument", xmlResourceParser.getName())) {
                                    TypedArray obtainAttributes3 = resources2.obtainAttributes(attributeSet2, iArr);
                                    j.e(obtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                    String string5 = obtainAttributes3.getString(0);
                                    if (string5 != null) {
                                        i c3 = c(obtainAttributes3, resources2, i12);
                                        boolean z10 = c3.f3081c;
                                        if (z10 && z10) {
                                            c3.f3079a.d(bundle, string5, c3.f3082d);
                                        }
                                        m mVar3 = m.f8717a;
                                        obtainAttributes3.recycle();
                                    } else {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                }
                                i15 = 1;
                                i12 = i8;
                            }
                        }
                        if (!bundle.isEmpty()) {
                            eVar.f3040c = bundle;
                        }
                        i11 = 1;
                        if (!(a10 instanceof b.a)) {
                            if (resourceId != 0) {
                                a10.B.i(resourceId, eVar);
                                obtainStyledAttributes.recycle();
                                e0Var = this;
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                            }
                        } else {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                    } else {
                        context = context2;
                        i10 = depth3;
                        i11 = i13;
                        if (!j.a("include", name2) || !(a10 instanceof b0)) {
                            e0Var = this;
                            if (a10 instanceof b0) {
                                ((b0) a10).i(a(resources, xmlResourceParser, attributeSet, i8));
                            }
                        } else {
                            TypedArray obtainAttributes4 = resources2.obtainAttributes(attributeSet2, m9.b.f11322c);
                            j.e(obtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            e0Var = this;
                            ((b0) a10).i(e0Var.b(obtainAttributes4.getResourceId(0, 0)));
                            m mVar4 = m.f8717a;
                            obtainAttributes4.recycle();
                        }
                    }
                    e0Var2 = e0Var;
                    context2 = context;
                    depth3 = i10;
                    i13 = i11;
                    i12 = i8;
                }
            }
        }
        e0 e0Var32 = e0Var2;
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[Catch:{ Exception -> 0x0060, all -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x0060, all -> 0x005e }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b3.b0 b(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f3042a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            sf.j.e(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0060 }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x0056
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "attrs"
            sf.j.e(r2, r4)     // Catch:{ Exception -> 0x0060 }
            b3.z r2 = r6.a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0060 }
            boolean r4 = r2 instanceof b3.b0     // Catch:{ Exception -> 0x0060 }
            if (r4 == 0) goto L_0x0036
            b3.b0 r2 = (b3.b0) r2     // Catch:{ Exception -> 0x0060 }
            r1.close()
            return r2
        L_0x0036:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r2.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0060 }
            r2.append(r3)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0060 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0060 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0060 }
            throw r3     // Catch:{ Exception -> 0x0060 }
        L_0x0056:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0060 }
            throw r2     // Catch:{ Exception -> 0x0060 }
        L_0x005e:
            r7 = move-exception
            goto L_0x0088
        L_0x0060:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r4.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x005e }
            r4.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x005e }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x005e }
            r4.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x005e }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x005e }
            throw r3     // Catch:{ all -> 0x005e }
        L_0x0088:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.e0.b(int):b3.b0");
    }
}
