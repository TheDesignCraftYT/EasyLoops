package de.thedesigncraft.easyloops;

import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;

public interface ILoop {

    boolean activated();

    int secondsInterval();

    void execute();

    @NotNull
    static List<ILoop> getLoops() {
        List<ILoop> returnList = new ArrayList<>();
        new Reflections(EasyLoops.loopPackage).getSubTypesOf(ILoop.class).forEach(aClass -> {
            try {
                returnList.add(aClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
        return returnList;
    }

    @NotNull
    static List<ILoop> getActivatedLoops() {
        return getLoops().stream().filter(ILoop::activated).toList();
    }

}
