package androidx.media;

import android.media.AudioAttributes;
import t3.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Object obj = audioAttributesImplApi21.f2333a;
        if (aVar.h(1)) {
            obj = aVar.k();
        }
        audioAttributesImplApi21.f2333a = (AudioAttributes) obj;
        audioAttributesImplApi21.f2334b = aVar.j(audioAttributesImplApi21.f2334b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2333a;
        aVar.n(1);
        aVar.t(audioAttributes);
        aVar.s(audioAttributesImplApi21.f2334b, 2);
    }
}
