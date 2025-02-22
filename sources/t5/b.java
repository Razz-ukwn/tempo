package t5;

import java.text.DecimalFormat;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public DecimalFormat f15370a;

    public b(int i8) {
        b(i8);
    }

    public final String a(float f10) {
        return this.f15370a.format((double) f10);
    }

    public final void b(int i8) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f15370a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
