package qd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import java.io.Serializable;
import sf.j;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final AudioHistory f13506a;

    public b(AudioHistory audioHistory) {
        this.f13506a = audioHistory;
    }

    public static final b fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(b.class.getClassLoader());
        if (bundle.containsKey("audioHistory")) {
            Class<AudioHistory> cls = AudioHistory.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                AudioHistory audioHistory = (AudioHistory) bundle.get("audioHistory");
                if (audioHistory != null) {
                    return new b(audioHistory);
                }
                throw new IllegalArgumentException("Argument \"audioHistory\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        throw new IllegalArgumentException("Required argument \"audioHistory\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f13506a, ((b) obj).f13506a);
    }

    public final int hashCode() {
        return this.f13506a.hashCode();
    }

    public final String toString() {
        return "HistoryDetailsFragmentArgs(audioHistory=" + this.f13506a + ')';
    }
}
