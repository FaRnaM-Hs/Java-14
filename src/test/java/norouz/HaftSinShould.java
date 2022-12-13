package norouz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HaftSinShould {

    @Test
    void determine_object_is_haft_sin() {
        assertHaftSinObject("Sib", "Yes");
        assertHaftSinObject("Sir", "Yes");
        assertHaftSinObject("Serke", "Yes");
        assertHaftSinObject("Senjed", "Yes");
        assertHaftSinObject("Somagh", "Yes");
        assertHaftSinObject("Samanou", "Yes");
        assertHaftSinObject("Sabze", "Yes");

        assertHaftSinObject("Mahi", "Can be");
        assertHaftSinObject("Sekke", "Can be");
        assertHaftSinObject("Ayne", "Can be");
        assertHaftSinObject("Mive", "Can be");
        assertHaftSinObject("Shirini", "Can be");
        assertHaftSinObject("Saat", "Can be");
        assertHaftSinObject("Sham", "Can be");

        assertHaftSinObject("Shovel", "No");
        assertHaftSinObject("Mobile", "No");
        assertHaftSinObject("Helicopter", "No");
        assertHaftSinObject("Any thing else...", "No");
    }

    private void assertHaftSinObject(String object, String result) {
        HaftSin haftSin = new HaftSin();

        String answer = haftSin.isHaftSin(object);

        Assertions.assertThat(answer).isEqualTo(result);
    }
}
