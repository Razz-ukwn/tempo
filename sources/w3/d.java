package w3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class d implements RecyclerView.o {
    public final void a() {
    }

    public final void b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (nVar.width != -1 || nVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
