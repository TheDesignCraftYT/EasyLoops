package loops;

import de.thedesigncraft.easyloops.ILoop;

public class TestLoop implements ILoop {

    @Override
    public boolean activated() {
        return false;
    }

    @Override
    public int secondsInterval() {
        return 0;
    }

    @Override
    public void execute() {

    }
}
