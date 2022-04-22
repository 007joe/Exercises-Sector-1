package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public String getTypeOfFruit() {
        return this.typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return this.piecesOfFruitLeft;
    }

    public FruitTree (String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public boolean pickFruit (int numberOfPiecesToRemove) {
      if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
          piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
          return true;
      } else if(piecesOfFruitLeft < numberOfPiecesToRemove) {
          return false;
      }
      return false;
    }
}
