package t5;

import java.text.DecimalFormat;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final DecimalFormat f15368a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15369b;

    public a(int i8) {
        this.f15369b = i8;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f15368a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public final String a(float f10) {
        return this.f15368a.format((double) f10);
    }
}
