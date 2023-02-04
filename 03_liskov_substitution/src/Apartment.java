abstract sealed class Apartment permits PenthouseSuite, Studio {
    int squareFootage;

    //abstract void setSquareFootage(int sqft);
    public void setSquareFootage(int sqft) { this.squareFootage = sqft; }
}
