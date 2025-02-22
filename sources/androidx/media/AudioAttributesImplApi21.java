package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2333a;

    /* renamed from: b  reason: collision with root package name */
    public int f2334b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2333a.equals(((AudioAttributesImplApi21) obj).f2333a);
    }

    public final int hashCode() {
        return this.f2333a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2333a;
    }
}
