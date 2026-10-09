class AnnalynsInfiltration {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;

    public static boolean canFastAttack(boolean knightIsAwake) {
        // if(!knightIsAwake){
        // return true;
        // }
        // return false;
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // if(knightIsAwake || archerIsAwake || prisonerIsAwake){
        // return true;
        // }
        // return false;

        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // if(prisonerIsAwake && !archerIsAwake){
        // return true;
        // }
        // return false;
        return (prisonerIsAwake && !archerIsAwake);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        // boolean canFree = false;
        // if(petDogIsPresent){
        // if(!archerIsAwake){
        // canFree = true;
        // }
        // }
        // else if(!petDogIsPresent){
        // if (prisonerIsAwake && !archerIsAwake && !knightIsAwake) {
        // canFree = true;
        // }
        // }
        // return canFree;

        return (petDogIsPresent && !archerIsAwake)
                || (!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake);

    }
}
