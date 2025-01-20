import java.util.Random;

public class checkSlimechunk {
    public static boolean checkIfSlimechunk(long seed, int xPosition, int zPosition) {
        Random rnd = new Random(
                seed +
                        (int) (xPosition * xPosition * 0x4c1906) +
                        (int) (xPosition * 0x5ac0db) +
                        (int) (zPosition * zPosition) * 0x4307a7L +
                        (int) (zPosition * 0x5f24f) ^ 0x3ad8025fL);
        return rnd.nextInt(10) == 0;
    }

    public static void main(String args[]) {
        // the seed from /seed as a 64bit long literal
        long seed = 132389425772377L;
        int X = 100000;
        int Z = 100000;
        int threshold = 10;

        int x = 0, z = 0, dx = 0, dz = -1;
        int t = Math.max(X, Z);
        int maxI = t * t;

        for (int i = 0; i < maxI; i++) {
            if ((-X / 2 <= x) && (x <= X / 2) && (-Z / 2 <= z) && (z <= Z / 2)) {
                int nSlimechunks = 0;

                for (int e = 1; e <= 3; e++) {
                    if (checkIfSlimechunk(seed, x + e, z)) {
                        nSlimechunks++;
                    }
                    ;
                    if (checkIfSlimechunk(seed, x + e, z + 4)) {
                        nSlimechunks++;
                    }
                    ;
                }
                ;
                for (int s = 1; s <= 3; s++) {
                    if (checkIfSlimechunk(seed, x, z + s)) {
                        nSlimechunks++;
                    }
                    ;
                    if (checkIfSlimechunk(seed, x + 4, z + s)) {
                        nSlimechunks++;
                    }
                    ;
                }
                ;

                if (nSlimechunks >= threshold) {
                    System.out.println("Slimechunks: " + nSlimechunks + "/12 | Chunk Cords: " + x + "," + z
                            + " | Cords:" + x * 16 + "," + z * 16 + " | Nether Cords:" + x * 2 + "," + z * 2);
                }
            }

            if ((x == z) || ((x < 0) && (x == -z)) || ((x > 0) && (x == 1 - z))) {
                t = dx;
                dx = -dz;
                dz = t;
            }
            x += dx;
            z += dz;
        }
    }
}