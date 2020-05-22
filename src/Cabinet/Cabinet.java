package Cabinet;

import Thing.Thing;

public class Cabinet {
    private Thing topShelf;
    private Thing middleShelf;
    private Thing bottomShelf;


    public Thing whatIsOn(String shelfName) {

        switch (shelfName) {
            case "topShelf":
                if (topShelf == null) {
                    return null;
                }else return topShelf;

            case "middleShelf":
                if (middleShelf == null) {
                    return null;
                }else return middleShelf;
            case "bottomShelf":
                if (bottomShelf == null) {
                    return null;
                }else return bottomShelf;
            default:
                return null;
        }

    }



    public void put(String shelfName, Thing thing) {
        switch (shelfName) {
            case "topShelf":
                topShelf = thing;
            case "middleShelf":
                middleShelf = thing;
            case "bottomShelf":
                bottomShelf = thing;
            default:
                break;
        }
    }

    public Thing take(String shelfName) {
        if (shelfName.equals("topShelf")) {
            System.out.println(topShelf.getName());
            topShelf = null;
            return topShelf;
        } else if (shelfName.equals("middleShelf")) {
            System.out.println(middleShelf.getName());
            middleShelf = null;
            return middleShelf;
        } else if (shelfName.equals("bottomShelf")) {
            System.out.println(bottomShelf.getName());
            bottomShelf = null;
            return bottomShelf;
        } else
            return null;
    }
}
