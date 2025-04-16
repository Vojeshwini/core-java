package in.java.overriding.tiles.external79;

import in.java.overriding.tiles.internal79.*;

public class TileService {
    public void check(Tiles tile) {
        if (tile != null) {
            tile.place();
            if (tile instanceof CeramicTiles) {
                CeramicTiles ceramicTile = (CeramicTiles) tile;
                ceramicTile.polish();
            } else {
                System.err.println("polish method is not available for this Tile");
            }
        } else {
            System.err.println("tile is null");
        }
    }
}
