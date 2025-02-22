package e4;

import android.net.Uri;
import h4.l;
import java.nio.ByteBuffer;
import sf.j;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7804a;

    public /* synthetic */ a(int i8) {
        this.f7804a = i8;
    }

    public final Object a(Object obj, l lVar) {
        switch (this.f7804a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            default:
                Uri parse = Uri.parse((String) obj);
                j.e(parse, "parse(this)");
                return parse;
        }
    }
}
