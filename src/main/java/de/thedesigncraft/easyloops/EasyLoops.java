package de.thedesigncraft.easyloops;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class EasyLoops {

    public static Thread loop;
    static String loopPackage;
    @NotNull
    private static final HashMap<ILoop, Long> time = new HashMap<>();

    public EasyLoops(@NotNull String loopPackage) {
        EasyLoops.loopPackage = loopPackage;

        loop = new Thread(() -> {
            ILoop.getActivatedLoops().forEach(iLoop -> time.put(iLoop, System.currentTimeMillis()));

            while (true) {
                time.forEach((iLoop, aLong) -> {
                    int i = iLoop.secondsInterval() * 1000;
                    if (System.currentTimeMillis() >= time.get(iLoop) + i) {
                        time.replace(iLoop, time.get(iLoop), System.currentTimeMillis());
                        iLoop.execute();
                    }
                });
            }

        });

        loop.setName("de.thedesigncraft.EasyLoops");
        loop.start();

    }

    public static void shutdown() {
        if (loop != null)
            loop.interrupt();
    }

}
