package androidx.media;

import t3.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f2332a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        audioAttributesCompat.f2332a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2332a;
        aVar.n(1);
        aVar.v(audioAttributesImpl);
    }
}
