package a1;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.n0;
import sf.j;

public final class a implements p<C0003a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15a = new a();

    /* renamed from: a1.a$a  reason: collision with other inner class name */
    public static final class C0003a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f16a;

        /* renamed from: b  reason: collision with root package name */
        public final f0 f17b;

        public C0003a(a0 a0Var, f0 f0Var) {
            j.f(a0Var, "service");
            this.f16a = a0Var;
            this.f17b = f0Var;
        }

        public final z a() {
            a0 a0Var = this.f16a;
            z zVar = a0Var instanceof z ? (z) a0Var : null;
            if (zVar != null) {
                return zVar;
            }
            throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?".toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0111  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0168  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x016e  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x00eb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final a1.u b(android.view.inputmethod.EditorInfo r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "outAttrs"
                sf.j.f(r0, r1)
                r1 = r17
                a1.f0 r2 = r1.f17b
                r2.getClass()
                a1.h r3 = r2.f34f
                java.lang.String r4 = "imeOptions"
                sf.j.f(r3, r4)
                a1.y r4 = r2.f33e
                java.lang.String r5 = "textFieldValue"
                sf.j.f(r4, r5)
                int r5 = r3.f42e
                r7 = 1
                if (r5 != r7) goto L_0x0023
                r8 = r7
                goto L_0x0024
            L_0x0023:
                r8 = 0
            L_0x0024:
                boolean r9 = r3.f38a
                r10 = 4
                r11 = 7
                r12 = 5
                r13 = 6
                r14 = 3
                r15 = 2
                if (r8 == 0) goto L_0x0035
                if (r9 == 0) goto L_0x0032
                goto L_0x0072
            L_0x0032:
                r8 = 0
                goto L_0x0073
            L_0x0035:
                if (r5 != 0) goto L_0x0039
                r8 = r7
                goto L_0x003a
            L_0x0039:
                r8 = 0
            L_0x003a:
                if (r8 == 0) goto L_0x003e
                r8 = r7
                goto L_0x0073
            L_0x003e:
                if (r5 != r15) goto L_0x0042
                r8 = r7
                goto L_0x0043
            L_0x0042:
                r8 = 0
            L_0x0043:
                if (r8 == 0) goto L_0x0047
                r8 = r15
                goto L_0x0073
            L_0x0047:
                if (r5 != r13) goto L_0x004b
                r8 = r7
                goto L_0x004c
            L_0x004b:
                r8 = 0
            L_0x004c:
                if (r8 == 0) goto L_0x0050
                r8 = r12
                goto L_0x0073
            L_0x0050:
                if (r5 != r12) goto L_0x0054
                r8 = r7
                goto L_0x0055
            L_0x0054:
                r8 = 0
            L_0x0055:
                if (r8 == 0) goto L_0x0059
                r8 = r11
                goto L_0x0073
            L_0x0059:
                if (r5 != r14) goto L_0x005d
                r8 = r7
                goto L_0x005e
            L_0x005d:
                r8 = 0
            L_0x005e:
                if (r8 == 0) goto L_0x0062
                r8 = r14
                goto L_0x0073
            L_0x0062:
                if (r5 != r10) goto L_0x0066
                r8 = r7
                goto L_0x0067
            L_0x0066:
                r8 = 0
            L_0x0067:
                if (r8 == 0) goto L_0x006b
                r8 = r10
                goto L_0x0073
            L_0x006b:
                if (r5 != r11) goto L_0x006f
                r8 = r7
                goto L_0x0070
            L_0x006f:
                r8 = 0
            L_0x0070:
                if (r8 == 0) goto L_0x0196
            L_0x0072:
                r8 = r13
            L_0x0073:
                r0.imeOptions = r8
                int r6 = r3.f41d
                if (r6 != r7) goto L_0x007c
                r16 = r7
                goto L_0x007e
            L_0x007c:
                r16 = 0
            L_0x007e:
                if (r16 == 0) goto L_0x0084
                r0.inputType = r7
                goto L_0x00e9
            L_0x0084:
                if (r6 != r15) goto L_0x0089
                r16 = r7
                goto L_0x008b
            L_0x0089:
                r16 = 0
            L_0x008b:
                if (r16 == 0) goto L_0x0096
                r0.inputType = r7
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r6 | r8
                r0.imeOptions = r6
                goto L_0x00e9
            L_0x0096:
                if (r6 != r14) goto L_0x009a
                r8 = r7
                goto L_0x009b
            L_0x009a:
                r8 = 0
            L_0x009b:
                if (r8 == 0) goto L_0x00a0
                r0.inputType = r15
                goto L_0x00e9
            L_0x00a0:
                if (r6 != r10) goto L_0x00a4
                r8 = r7
                goto L_0x00a5
            L_0x00a4:
                r8 = 0
            L_0x00a5:
                if (r8 == 0) goto L_0x00aa
                r0.inputType = r14
                goto L_0x00e9
            L_0x00aa:
                if (r6 != r12) goto L_0x00ae
                r8 = r7
                goto L_0x00af
            L_0x00ae:
                r8 = 0
            L_0x00af:
                if (r8 == 0) goto L_0x00b6
                r6 = 17
                r0.inputType = r6
                goto L_0x00e9
            L_0x00b6:
                if (r6 != r13) goto L_0x00ba
                r8 = r7
                goto L_0x00bb
            L_0x00ba:
                r8 = 0
            L_0x00bb:
                if (r8 == 0) goto L_0x00c2
                r6 = 33
                r0.inputType = r6
                goto L_0x00e9
            L_0x00c2:
                if (r6 != r11) goto L_0x00c6
                r8 = r7
                goto L_0x00c7
            L_0x00c6:
                r8 = 0
            L_0x00c7:
                if (r8 == 0) goto L_0x00ce
                r6 = 129(0x81, float:1.81E-43)
                r0.inputType = r6
                goto L_0x00e9
            L_0x00ce:
                r8 = 8
                if (r6 != r8) goto L_0x00d4
                r8 = r7
                goto L_0x00d5
            L_0x00d4:
                r8 = 0
            L_0x00d5:
                if (r8 == 0) goto L_0x00dc
                r6 = 18
                r0.inputType = r6
                goto L_0x00e9
            L_0x00dc:
                r8 = 9
                if (r6 != r8) goto L_0x00e2
                r6 = r7
                goto L_0x00e3
            L_0x00e2:
                r6 = 0
            L_0x00e3:
                if (r6 == 0) goto L_0x018a
                r6 = 8194(0x2002, float:1.1482E-41)
                r0.inputType = r6
            L_0x00e9:
                if (r9 != 0) goto L_0x0109
                int r6 = r0.inputType
                r8 = r6 & 1
                if (r8 != r7) goto L_0x00f3
                r8 = r7
                goto L_0x00f4
            L_0x00f3:
                r8 = 0
            L_0x00f4:
                if (r8 == 0) goto L_0x0109
                r8 = 131072(0x20000, float:1.83671E-40)
                r6 = r6 | r8
                r0.inputType = r6
                if (r5 != r7) goto L_0x00ff
                r5 = r7
                goto L_0x0100
            L_0x00ff:
                r5 = 0
            L_0x0100:
                if (r5 == 0) goto L_0x0109
                int r5 = r0.imeOptions
                r6 = 1073741824(0x40000000, float:2.0)
                r5 = r5 | r6
                r0.imeOptions = r5
            L_0x0109:
                int r5 = r0.inputType
                r6 = r5 & 1
                if (r6 != r7) goto L_0x0111
                r6 = r7
                goto L_0x0112
            L_0x0111:
                r6 = 0
            L_0x0112:
                boolean r8 = r3.f40c
                if (r6 == 0) goto L_0x0145
                int r3 = r3.f39b
                if (r3 != r7) goto L_0x011c
                r6 = r7
                goto L_0x011d
            L_0x011c:
                r6 = 0
            L_0x011d:
                if (r6 == 0) goto L_0x0124
                r3 = r5 | 4096(0x1000, float:5.74E-42)
                r0.inputType = r3
                goto L_0x013b
            L_0x0124:
                if (r3 != r15) goto L_0x0128
                r6 = r7
                goto L_0x0129
            L_0x0128:
                r6 = 0
            L_0x0129:
                if (r6 == 0) goto L_0x0130
                r3 = r5 | 8192(0x2000, float:1.14794E-41)
                r0.inputType = r3
                goto L_0x013b
            L_0x0130:
                if (r3 != r14) goto L_0x0134
                r3 = r7
                goto L_0x0135
            L_0x0134:
                r3 = 0
            L_0x0135:
                if (r3 == 0) goto L_0x013b
                r3 = r5 | 16384(0x4000, float:2.2959E-41)
                r0.inputType = r3
            L_0x013b:
                if (r8 == 0) goto L_0x0145
                int r3 = r0.inputType
                r5 = 32768(0x8000, float:4.5918E-41)
                r3 = r3 | r5
                r0.inputType = r3
            L_0x0145:
                int r3 = x0.h.f16907c
                long r5 = r4.f68b
                r3 = 32
                long r9 = r5 >> r3
                int r3 = (int) r9
                r0.initialSelStart = r3
                int r3 = x0.h.a(r5)
                r0.initialSelEnd = r3
                x0.a r3 = r4.f67a
                java.lang.String r3 = r3.f16819a
                g2.a.a(r0, r3)
                int r3 = r0.imeOptions
                r5 = 33554432(0x2000000, float:9.403955E-38)
                r3 = r3 | r5
                r0.imeOptions = r3
                androidx.emoji2.text.f r3 = androidx.emoji2.text.f.f1823k
                if (r3 == 0) goto L_0x016a
                r6 = r7
                goto L_0x016b
            L_0x016a:
                r6 = 0
            L_0x016b:
                if (r6 != 0) goto L_0x016e
                goto L_0x0175
            L_0x016e:
                androidx.emoji2.text.f r3 = androidx.emoji2.text.f.a()
                r3.h(r0)
            L_0x0175:
                a1.c0 r0 = new a1.c0
                r0.<init>(r2)
                a1.u r3 = new a1.u
                r3.<init>(r4, r0, r8)
                java.util.ArrayList r0 = r2.f35g
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r0.add(r2)
                return r3
            L_0x018a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Invalid Keyboard Type"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0196:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "invalid ImeAction"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.a.C0003a.b(android.view.inputmethod.EditorInfo):a1.u");
        }
    }

    public final C0003a a(AndroidComposeView androidComposeView, n nVar) {
        j.f(nVar, "platformTextInput");
        j.f(androidComposeView, "view");
        f0 f0Var = new f0(androidComposeView, nVar);
        return new C0003a((a0) n0.f1355a.invoke(f0Var), f0Var);
    }
}
