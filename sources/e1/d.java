package e1;

import java.util.ArrayList;
import sf.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f7768a;

    public d(int i8) {
        this.f7768a = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((e1.d) r4).f7768a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof e1.d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            e1.d r4 = (e1.d) r4
            int r4 = r4.f7768a
            int r1 = r3.f7768a
            if (r1 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f7768a;
    }

    public final String toString() {
        int i8 = this.f7768a;
        if (i8 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i8 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i8 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        StringBuilder sb2 = new StringBuilder("TextDecoration[");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append(", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append(String.valueOf(obj));
            }
        }
        sb3.append("");
        String sb4 = sb3.toString();
        j.e(sb4, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb2.append(sb4);
        sb2.append(']');
        return sb2.toString();
    }
}
