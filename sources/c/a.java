package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;
import sf.j;

public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static final class C0054a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f3656a;

        public C0054a(Serializable serializable) {
            this.f3656a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0054a b(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i8);
}
