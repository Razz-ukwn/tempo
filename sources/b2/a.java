package b2;

import android.text.SpannableStringBuilder;
import b2.j;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3000d = Character.toString(8206);

    /* renamed from: e  reason: collision with root package name */
    public static final String f3001e = Character.toString(8207);

    /* renamed from: f  reason: collision with root package name */
    public static final a f3002f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f3003g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3004a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3005b;

    /* renamed from: c  reason: collision with root package name */
    public final i f3006c;

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    public static class C0034a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f3007e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f3008a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3009b;

        /* renamed from: c  reason: collision with root package name */
        public int f3010c;

        /* renamed from: d  reason: collision with root package name */
        public char f3011d;

        static {
            for (int i8 = 0; i8 < 1792; i8++) {
                f3007e[i8] = Character.getDirectionality(i8);
            }
        }

        public C0034a(CharSequence charSequence) {
            this.f3008a = charSequence;
            this.f3009b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f3008a;
            char charAt = charSequence.charAt(this.f3010c - 1);
            this.f3011d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f3010c);
                this.f3010c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3010c--;
            char c3 = this.f3011d;
            return c3 < 1792 ? f3007e[c3] : Character.getDirectionality(c3);
        }
    }

    static {
        j.d dVar = j.f3018c;
        f3002f = new a(false, 2, dVar);
        f3003g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i8, j.d dVar) {
        this.f3004a = z10;
        this.f3005b = i8;
        this.f3006c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            b2.a$a r0 = new b2.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f3010c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        L_0x000b:
            int r4 = r0.f3010c
            int r5 = r0.f3009b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            java.lang.CharSequence r5 = r0.f3008a
            char r4 = r5.charAt(r4)
            r0.f3011d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f3010c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f3010c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f3010c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f3010c
            int r4 = r4 + r7
            r0.f3010c = r4
            char r4 = r0.f3011d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = b2.a.C0034a.f3007e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            if (r4 == r7) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006c
        L_0x005a:
            int r3 = r3 + -1
            r2 = r9
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = r7
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = r6
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006c
            goto L_0x0086
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x008a
        L_0x006c:
            r1 = r3
            goto L_0x000b
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            if (r2 == 0) goto L_0x0075
            r9 = r2
            goto L_0x008f
        L_0x0075:
            int r2 = r0.f3010c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x0088;
                case 15: goto L_0x0088;
                case 16: goto L_0x0084;
                case 17: goto L_0x0084;
                case 18: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0075
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x0084:
            if (r1 != r3) goto L_0x008c
        L_0x0086:
            r9 = r7
            goto L_0x008f
        L_0x0088:
            if (r1 != r3) goto L_0x008c
        L_0x008a:
            r9 = r6
            goto L_0x008f
        L_0x008c:
            int r3 = r3 + -1
            goto L_0x0075
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            b2.a$a r0 = new b2.a$a
            r0.<init>(r6)
            int r6 = r0.f3009b
            r0.f3010c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f3010c
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            r4 = 1
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, i iVar) {
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((j.c) iVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z10 = (this.f3005b & 2) != 0;
        String str = f3001e;
        String str2 = f3000d;
        boolean z11 = this.f3004a;
        if (z10) {
            boolean b11 = (b10 ? j.f3017b : j.f3016a).b(charSequence, charSequence.length());
            spannableStringBuilder.append((z11 || (!b11 && a(charSequence) != 1)) ? (!z11 || (b11 && a(charSequence) != -1)) ? "" : str : str2);
        }
        if (b10 != z11) {
            spannableStringBuilder.append(b10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b12 = (b10 ? j.f3017b : j.f3016a).b(charSequence, charSequence.length());
        if (!z11 && (b12 || b(charSequence) == 1)) {
            str = str2;
        } else if (!z11 || (b12 && b(charSequence) != -1)) {
            str = "";
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
