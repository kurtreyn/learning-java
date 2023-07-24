package com.examples;

public enum Cerials {
    CAPTAIN_CRUNCH(10),
    CHEERIOS(5),
    COCOA_PUFFS(8),
    CORN_FLAKES(3);

    final int levelOfDeliciousness;

    Cerials(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
