package e5;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import java.util.HashSet;

@Deprecated
public final class k extends Fragment {
    public Fragment B;

    /* renamed from: a  reason: collision with root package name */
    public final a f7810a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7811b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f7812c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public m f7813d;

    /* renamed from: e  reason: collision with root package name */
    public k f7814e;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.f7810a = aVar;
    }

    public final void a(Activity activity) {
        k kVar = this.f7814e;
        if (kVar != null) {
            kVar.f7812c.remove(this);
            this.f7814e = null;
        }
        l lVar = b.b(activity).B;
        lVar.getClass();
        k d10 = lVar.d(activity.getFragmentManager());
        this.f7814e = d10;
        if (!equals(d10)) {
            this.f7814e.f7812c.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f7810a.c();
        k kVar = this.f7814e;
        if (kVar != null) {
            kVar.f7812c.remove(this);
            this.f7814e = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        k kVar = this.f7814e;
        if (kVar != null) {
            kVar.f7812c.remove(this);
            this.f7814e = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f7810a.d();
    }

    public final void onStop() {
        super.onStop();
        this.f7810a.e();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.B;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
