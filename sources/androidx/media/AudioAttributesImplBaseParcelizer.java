package androidx.media;

import t3.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2335a = aVar.j(audioAttributesImplBase.f2335a, 1);
        audioAttributesImplBase.f2336b = aVar.j(audioAttributesImplBase.f2336b, 2);
        audioAttributesImplBase.f2337c = aVar.j(audioAttributesImplBase.f2337c, 3);
        audioAttributesImplBase.f2338d = aVar.j(audioAttributesImplBase.f2338d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.s(audioAttributesImplBase.f2335a, 1);
        aVar.s(audioAttributesImplBase.f2336b, 2);
        aVar.s(audioAttributesImplBase.f2337c, 3);
        aVar.s(audioAttributesImplBase.f2338d, 4);
    }
}
