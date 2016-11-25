package com.chess.boaz.Engine.Classic.Board;

/* ********************************************************
 *                       Tile Notes                       *
 ******************************************************** */

/*
 * A Chess board is composed of 64 tiles
 *
 * How this'll works: This will be composed of 1 tile composed of many
 * Chess tiles, and number them from 1 to 63 to capture all 64 Chess
 *
 * Approach:
 * Polymorphic behaviour to have a common abstract tile class and subclass
 * that represents occupied and unoccupied tiles.
 *
 *
 */

public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    // Abstract because it won't be defined here but somewhere else (a subcass) .
    /* Specifies if a given tile is occupied or not. */
    public abstract boolean isTileOccupied();

    /* Get the piece of a given tile. */
    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{
        EmptyTile(int coordinate) {
            super(coordinate);
        }

        /**/
        @Override
        public boolean isTileOccupied() {
            return false;
        }

        /**/
        @Override
        public Piece getPiece() {
            return null;
        }
    }

}
