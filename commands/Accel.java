package org.csc133.a2.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import org.csc133.a2.GameWorld;

public class Accel extends Command {
    private GameWorld gw;

    public Accel(GameWorld gw){
        super("Accel");
        this.gw=gw;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        gw.adjustSpeed(1);
    }
}
