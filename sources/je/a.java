package je;

import android.os.Bundle;
import androidx.appcompat.app.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.quickkonnect.silencio.R;

public abstract class a extends c {
    public abstract void M();

    public final void N(int i8, Bundle bundle) {
        super.onCreate(bundle);
        setTheme(e.f9997e);
        setContentView(i8);
        K().x((MaterialToolbar) findViewById(R.id.toolbar));
        e.a L = L();
        if (L != null) {
            L.n(true);
        }
        setRequestedOrientation(e.f10003k);
        M();
    }
}
