public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sum = 0;

        if (bigCount == 0) {
            for (int i = 0; i < smallCount; i++) {
                sum++;
                if (sum == goal) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < bigCount; i++) {
                sum += 5;
                if (sum == goal) {
                    return true;
                }
                for (int j = 0; j < smallCount; j++) {
                    sum++;
                    if (sum == goal) {
                        return true;
                    }
                }
                sum -= smallCount;
            }
        }

        return false;
    }
}
