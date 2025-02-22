package ab;

import db.q;
import hb.b;
import java.io.IOException;
import java.io.StringWriter;

public abstract class n {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b bVar = new b(stringWriter);
            bVar.B = true;
            q.f7484z.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
