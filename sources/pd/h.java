package pd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import java.io.Serializable;
import sf.j;

public final class h implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final AudioHistory f12596a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12597b = R.id.action_historyFragment_to_historyDetailsFragment;

    public h(AudioHistory audioHistory) {
        j.f(audioHistory, "audioHistory");
        this.f12596a = audioHistory;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<AudioHistory> cls = AudioHistory.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        AudioHistory audioHistory = this.f12596a;
        if (isAssignableFrom) {
            j.d(audioHistory, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("audioHistory", audioHistory);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(audioHistory, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("audioHistory", (Serializable) audioHistory);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final int b() {
        return this.f12597b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && j.a(this.f12596a, ((h) obj).f12596a);
    }

    public final int hashCode() {
        return this.f12596a.hashCode();
    }

    public final String toString() {
        return "ActionHistoryFragmentToHistoryDetailsFragment(audioHistory=" + this.f12596a + ')';
    }
}
